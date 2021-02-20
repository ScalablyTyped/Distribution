package typings.semanticUiNag.anon

import typings.semanticUiNag.SemanticUI.Nag.AnimationSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'animation'> */
@js.native
trait PickImplanimation extends StObject {
  
  var animation: AnimationSettings = js.native
}
object PickImplanimation {
  
  @scala.inline
  def apply(animation: AnimationSettings): PickImplanimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimation]
  }
  
  @scala.inline
  implicit class PickImplanimationMutableBuilder[Self <: PickImplanimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: AnimationSettings): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
  }
}
