package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementalProps extends js.Object {
  val children: reactLib.reactMod.ReactNode
  val colorOpts: js.UndefOr[reactDashElementalLib.Anon_PrimaryPrimaryDark] = js.undefined
  val fontOpts: js.UndefOr[reactDashElementalLib.Anon_Primary] = js.undefined
}

object ElementalProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    colorOpts: reactDashElementalLib.Anon_PrimaryPrimaryDark = null,
    fontOpts: reactDashElementalLib.Anon_Primary = null
  ): ElementalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (colorOpts != null) __obj.updateDynamic("colorOpts")(colorOpts)
    if (fontOpts != null) __obj.updateDynamic("fontOpts")(fontOpts)
    __obj.asInstanceOf[ElementalProps]
  }
}

