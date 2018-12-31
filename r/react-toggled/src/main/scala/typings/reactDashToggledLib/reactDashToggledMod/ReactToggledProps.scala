package typings
package reactDashToggledLib.reactDashToggledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactToggledProps extends js.Object {
  val defaultOn: js.UndefOr[scala.Boolean] = js.undefined
  val on: js.UndefOr[scala.Boolean] = js.undefined
  val onToggle: js.UndefOr[
    js.Function2[/* on */ scala.Boolean, /* object */ TogglerStateAndHelpers, scala.Unit]
  ] = js.undefined
  def children(options: TogglerStateAndHelpers): reactLib.reactMod.ReactNs.ReactNode
}

