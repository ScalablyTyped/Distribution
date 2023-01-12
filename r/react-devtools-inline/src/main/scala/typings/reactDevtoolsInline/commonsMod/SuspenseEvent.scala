package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.rejected
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.resolved
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.suspense
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.unresolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseEvent
  extends StObject
     with BaseReactEvent {
  
  var depth: Double
  
  var duration: Double | Null
  
  val id: String
  
  val phase: Phase | Null
  
  var promiseName: String | Null
  
  var resolution: rejected | resolved | unresolved
  
  val `type`: suspense
}
object SuspenseEvent {
  
  inline def apply(depth: Double, id: String, resolution: rejected | resolved | unresolved, timestamp: Milliseconds): SuspenseEvent = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], duration = null, phase = null, promiseName = null, warning = null)
    __obj.updateDynamic("type")("suspense")
    __obj.asInstanceOf[SuspenseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuspenseEvent] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: Phase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseNull: Self = StObject.set(x, "phase", null)
    
    inline def setPromiseName(value: String): Self = StObject.set(x, "promiseName", value.asInstanceOf[js.Any])
    
    inline def setPromiseNameNull: Self = StObject.set(x, "promiseName", null)
    
    inline def setResolution(value: rejected | resolved | unresolved): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setType(value: suspense): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
