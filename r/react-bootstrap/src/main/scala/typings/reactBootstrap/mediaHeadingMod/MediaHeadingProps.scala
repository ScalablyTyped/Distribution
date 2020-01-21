package typings.reactBootstrap.mediaHeadingMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaHeadingProps
  extends AllHTMLAttributes[MediaHeading]
     with ClassAttributes[MediaHeading] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object MediaHeadingProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[MediaHeading] = null,
    ClassAttributes: ClassAttributes[MediaHeading] = null,
    componentClass: ReactType[_] = null
  ): MediaHeadingProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaHeadingProps]
  }
}

