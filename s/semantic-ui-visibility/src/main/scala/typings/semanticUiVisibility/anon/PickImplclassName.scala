package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'className'> */
@js.native
trait PickImplclassName extends js.Object {
  var className: ClassNameSettings = js.native
}

object PickImplclassName {
  @scala.inline
  def apply(className: ClassNameSettings): PickImplclassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclassName]
  }
  @scala.inline
  implicit class PickImplclassNameOps[Self <: PickImplclassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
  }
  
}

