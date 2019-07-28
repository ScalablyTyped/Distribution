package typings.reactDashBootstrap.libJumbotronMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumbotronProps extends HTMLProps[Jumbotron] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object JumbotronProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[Jumbotron] = null, componentClass: ReactType[_] = null): JumbotronProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumbotronProps]
  }
}

