package typings.reactDashBootstrap.libMediaHeadingMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaHeadingProps extends HTMLProps[MediaHeading] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object MediaHeadingProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[MediaHeading] = null, componentClass: ReactType[_] = null): MediaHeadingProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaHeadingProps]
  }
}

