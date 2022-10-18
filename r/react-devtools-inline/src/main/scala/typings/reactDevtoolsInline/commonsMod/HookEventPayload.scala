package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.anon.Id
import typings.reactDevtoolsInline.anon.Renderer
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookEventPayload extends StObject {
  
  var fastRefreshScheduled: Unit
  
  var operations: js.Array[Double]
  
  var `react-devtools`: Any
  
  var renderer: Id
  
  var `renderer-attached`: Renderer
  
  var shutdown: Unit
  
  /** value: nodes */
  var traceUpdates: Set[NativeType]
  
  /** Value: id */
  var `unsupported-renderer-version`: Double
}
object HookEventPayload {
  
  inline def apply(
    fastRefreshScheduled: Unit,
    operations: js.Array[Double],
    `react-devtools`: Any,
    renderer: Id,
    `renderer-attached`: Renderer,
    shutdown: Unit,
    traceUpdates: Set[NativeType],
    `unsupported-renderer-version`: Double
  ): HookEventPayload = {
    val __obj = js.Dynamic.literal(fastRefreshScheduled = fastRefreshScheduled.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], shutdown = shutdown.asInstanceOf[js.Any], traceUpdates = traceUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("react-devtools")(`react-devtools`.asInstanceOf[js.Any])
    __obj.updateDynamic("renderer-attached")(`renderer-attached`.asInstanceOf[js.Any])
    __obj.updateDynamic("unsupported-renderer-version")(`unsupported-renderer-version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookEventPayload]
  }
  
  extension [Self <: HookEventPayload](x: Self) {
    
    inline def setFastRefreshScheduled(value: Unit): Self = StObject.set(x, "fastRefreshScheduled", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: js.Array[Double]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: Double*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def `setReact-devtools`(value: Any): Self = StObject.set(x, "react-devtools", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Id): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def `setRenderer-attached`(value: Renderer): Self = StObject.set(x, "renderer-attached", value.asInstanceOf[js.Any])
    
    inline def setShutdown(value: Unit): Self = StObject.set(x, "shutdown", value.asInstanceOf[js.Any])
    
    inline def setTraceUpdates(value: Set[NativeType]): Self = StObject.set(x, "traceUpdates", value.asInstanceOf[js.Any])
    
    inline def `setUnsupported-renderer-version`(value: Double): Self = StObject.set(x, "unsupported-renderer-version", value.asInstanceOf[js.Any])
  }
}
