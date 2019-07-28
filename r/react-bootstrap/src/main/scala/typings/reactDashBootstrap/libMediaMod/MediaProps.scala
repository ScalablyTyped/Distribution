package typings.reactDashBootstrap.libMediaMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProps extends HTMLProps[Media] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object MediaProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[Media] = null, componentClass: ReactType[_] = null): MediaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProps]
  }
}

