package typings.semanticUiNag.anon

import typings.semanticUiNag.SemanticUI.Nag.AnimationSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'animation'> */
trait PickImplanimation extends StObject {
  
  var animation: AnimationSettings
}
object PickImplanimation {
  
  inline def apply(animation: AnimationSettings): PickImplanimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimation]
  }
  
  extension [Self <: PickImplanimation](x: Self) {
    
    inline def setAnimation(value: AnimationSettings): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
  }
}
