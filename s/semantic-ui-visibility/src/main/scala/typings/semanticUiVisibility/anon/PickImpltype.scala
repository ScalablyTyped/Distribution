package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'type'> */
@js.native
trait PickImpltype extends StObject {
  
  var `type`: `false` | image | fixed = js.native
}
object PickImpltype {
  
  @scala.inline
  def apply(`type`: `false` | image | fixed): PickImpltype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltype]
  }
  
  @scala.inline
  implicit class PickImpltypeMutableBuilder[Self <: PickImpltype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `false` | image | fixed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
