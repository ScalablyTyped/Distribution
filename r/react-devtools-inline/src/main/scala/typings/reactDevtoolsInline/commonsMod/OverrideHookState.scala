package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideHookState
  extends StObject
     with OverrideValue {
  
  var hookID: Double
}
object OverrideHookState {
  
  inline def apply(hookID: Double, id: Double, path: js.Array[String | Double], rendererID: RendererID, value: Any): OverrideHookState = {
    val __obj = js.Dynamic.literal(hookID = hookID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideHookState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverrideHookState] (val x: Self) extends AnyVal {
    
    inline def setHookID(value: Double): Self = StObject.set(x, "hookID", value.asInstanceOf[js.Any])
  }
}
