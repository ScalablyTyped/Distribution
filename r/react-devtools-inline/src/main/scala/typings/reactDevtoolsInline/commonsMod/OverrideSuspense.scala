package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideSuspense
  extends StObject
     with ElementAndRendererID {
  
  var forceFallback: Boolean
}
object OverrideSuspense {
  
  inline def apply(forceFallback: Boolean, id: Double, rendererID: RendererID): OverrideSuspense = {
    val __obj = js.Dynamic.literal(forceFallback = forceFallback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideSuspense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverrideSuspense] (val x: Self) extends AnyVal {
    
    inline def setForceFallback(value: Boolean): Self = StObject.set(x, "forceFallback", value.asInstanceOf[js.Any])
  }
}
