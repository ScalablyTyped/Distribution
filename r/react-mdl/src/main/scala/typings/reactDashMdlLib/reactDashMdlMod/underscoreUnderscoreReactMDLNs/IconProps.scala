package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
  @JSName("name")
  var name_IconProps: java.lang.String
}

object IconProps {
  @scala.inline
  def apply(name: java.lang.String, HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null): IconProps = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    __obj.asInstanceOf[IconProps]
  }
}

