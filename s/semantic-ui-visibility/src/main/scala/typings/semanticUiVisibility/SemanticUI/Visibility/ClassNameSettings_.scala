package typings.semanticUiVisibility.SemanticUI.Visibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings.Param */
@js.native
trait ClassNameSettings_ extends js.Object {
  var fixed: String with js.UndefOr[String] = js.native
}

object ClassNameSettings_ {
  @scala.inline
  def apply(fixed: String with js.UndefOr[String]): ClassNameSettings_ = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameSettings_]
  }
  @scala.inline
  implicit class ClassNameSettings_Ops[Self <: ClassNameSettings_] (val x: Self) extends AnyVal {
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
    def setFixed(value: String with js.UndefOr[String]): Self = this.set("fixed", value.asInstanceOf[js.Any])
  }
  
}

