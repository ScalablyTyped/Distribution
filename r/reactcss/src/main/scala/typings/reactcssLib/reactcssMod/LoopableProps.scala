package typings
package reactcssLib.reactcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoopableProps
  extends reactLib.reactMod.Props[js.Any] {
  var even: js.UndefOr[scala.Boolean] = js.undefined
  var `first-child`: js.UndefOr[scala.Boolean] = js.undefined
  var `last-child`: js.UndefOr[scala.Boolean] = js.undefined
  var `nth-child`: scala.Double
  var odd: js.UndefOr[scala.Boolean] = js.undefined
}

object LoopableProps {
  @scala.inline
  def apply(
    `nth-child`: scala.Double,
    children: reactLib.reactMod.ReactNode = null,
    even: js.UndefOr[scala.Boolean] = js.undefined,
    `first-child`: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    `last-child`: js.UndefOr[scala.Boolean] = js.undefined,
    odd: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.LegacyRef[js.Any] = null
  ): LoopableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nth-child")(`nth-child`)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(even)) __obj.updateDynamic("even")(even)
    if (!js.isUndefined(`first-child`)) __obj.updateDynamic("first-child")(`first-child`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(`last-child`)) __obj.updateDynamic("last-child")(`last-child`)
    if (!js.isUndefined(odd)) __obj.updateDynamic("odd")(odd)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopableProps]
  }
}

