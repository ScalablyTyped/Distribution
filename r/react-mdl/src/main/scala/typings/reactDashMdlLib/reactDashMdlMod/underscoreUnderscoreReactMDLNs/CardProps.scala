package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any]
     with ShadowedComponent

object CardProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    ShadowedComponent: ShadowedComponent = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, ShadowedComponent)
    __obj.asInstanceOf[CardProps]
  }
}

