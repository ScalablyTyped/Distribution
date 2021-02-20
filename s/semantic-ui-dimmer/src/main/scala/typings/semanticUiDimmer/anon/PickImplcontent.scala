package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, 'content'> */
@js.native
trait PickImplcontent extends StObject {
  
  var content: String = js.native
}
object PickImplcontent {
  
  @scala.inline
  def apply(content: String): PickImplcontent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontent]
  }
  
  @scala.inline
  implicit class PickImplcontentMutableBuilder[Self <: PickImplcontent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
