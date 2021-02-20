package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'looping'> */
@js.native
trait PickImpllooping extends StObject {
  
  var looping: String = js.native
}
object PickImpllooping {
  
  @scala.inline
  def apply(looping: String): PickImpllooping = {
    val __obj = js.Dynamic.literal(looping = looping.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllooping]
  }
  
  @scala.inline
  implicit class PickImplloopingMutableBuilder[Self <: PickImpllooping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLooping(value: String): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
  }
}
