package typings.reactDashBootstrap.libMediaMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProps
  extends AllHTMLAttributes[Media]
     with ClassAttributes[Media] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object MediaProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Media] = null,
    ClassAttributes: ClassAttributes[Media] = null,
    componentClass: ReactType[_] = null
  ): MediaProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProps]
  }
}

