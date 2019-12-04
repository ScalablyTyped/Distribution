package typings.atStorybookComponents.distIconSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgProps extends js.Object {
  var `inline`: js.UndefOr[Boolean] = js.undefined
}

object SvgProps {
  @scala.inline
  def apply(`inline`: js.UndefOr[Boolean] = js.undefined): SvgProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgProps]
  }
}

