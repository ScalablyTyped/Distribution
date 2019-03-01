package typings
package reactDashBootstrapLib.libJumbotronMod.JumbotronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumbotronProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libJumbotronMod.Jumbotron] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object JumbotronProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libJumbotronMod.Jumbotron] = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): JumbotronProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumbotronProps]
  }
}

