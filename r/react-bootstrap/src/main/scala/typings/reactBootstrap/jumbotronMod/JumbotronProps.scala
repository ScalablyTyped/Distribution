package typings.reactBootstrap.jumbotronMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumbotronProps
  extends AllHTMLAttributes[Jumbotron]
     with ClassAttributes[Jumbotron] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object JumbotronProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Jumbotron] = null,
    ClassAttributes: ClassAttributes[Jumbotron] = null,
    componentClass: ReactType[_] = null
  ): JumbotronProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumbotronProps]
  }
}

