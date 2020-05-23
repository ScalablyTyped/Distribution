package typings.reactElemental.mod

import typings.react.mod.ReactNode
import typings.reactElemental.anon.Primary
import typings.reactElemental.anon.PrimaryDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementalProps extends js.Object {
  val children: ReactNode
  val colorOpts: js.UndefOr[PrimaryDark] = js.undefined
  val fontOpts: js.UndefOr[Primary] = js.undefined
}

object ElementalProps {
  @scala.inline
  def apply(children: ReactNode = null, colorOpts: PrimaryDark = null, fontOpts: Primary = null): ElementalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (colorOpts != null) __obj.updateDynamic("colorOpts")(colorOpts.asInstanceOf[js.Any])
    if (fontOpts != null) __obj.updateDynamic("fontOpts")(fontOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementalProps]
  }
}

