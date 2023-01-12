package typings.reactRelay.relayHooksEntryPointTypesMod

import typings.reactRelay.relayHooksHelpersMod.GetEntryPointParamsFromEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  entryPoint :TEntryPoint,   entryPointParams :react-relay.react-relay/relay-hooks/helpers.GetEntryPointParamsFromEntryPoint<TEntryPoint>}> */
trait ThinNestedEntryPointParams[TEntryPoint] extends StObject {
  
  val entryPoint: TEntryPoint
  
  val entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
}
object ThinNestedEntryPointParams {
  
  inline def apply[TEntryPoint](entryPoint: TEntryPoint, entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]): ThinNestedEntryPointParams[TEntryPoint] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinNestedEntryPointParams[TEntryPoint]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThinNestedEntryPointParams[?], TEntryPoint] (val x: Self & ThinNestedEntryPointParams[TEntryPoint]) extends AnyVal {
    
    inline def setEntryPoint(value: TEntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointParams(value: GetEntryPointParamsFromEntryPoint[TEntryPoint]): Self = StObject.set(x, "entryPointParams", value.asInstanceOf[js.Any])
  }
}
