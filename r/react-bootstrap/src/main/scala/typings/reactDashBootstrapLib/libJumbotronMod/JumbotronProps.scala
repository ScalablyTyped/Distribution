package typings
package reactDashBootstrapLib.libJumbotronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumbotronProps
  extends reactLib.reactMod.HTMLProps[Jumbotron] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object JumbotronProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Jumbotron] = null,
    componentClass: reactLib.reactMod.ReactType[_] = null
  ): JumbotronProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumbotronProps]
  }
}

