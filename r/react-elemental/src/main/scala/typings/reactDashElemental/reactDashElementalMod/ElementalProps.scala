package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.ReactNode
import typings.reactDashElemental.Anon_Primary
import typings.reactDashElemental.Anon_PrimaryPrimaryDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementalProps extends js.Object {
  val children: ReactNode
  val colorOpts: js.UndefOr[Anon_PrimaryPrimaryDark] = js.undefined
  val fontOpts: js.UndefOr[Anon_Primary] = js.undefined
}

object ElementalProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    colorOpts: Anon_PrimaryPrimaryDark = null,
    fontOpts: Anon_Primary = null
  ): ElementalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (colorOpts != null) __obj.updateDynamic("colorOpts")(colorOpts)
    if (fontOpts != null) __obj.updateDynamic("fontOpts")(fontOpts)
    __obj.asInstanceOf[ElementalProps]
  }
}

