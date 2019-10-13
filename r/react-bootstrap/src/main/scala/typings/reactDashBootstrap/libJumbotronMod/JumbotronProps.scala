package typings.reactDashBootstrap.libJumbotronMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
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
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumbotronProps]
  }
}

