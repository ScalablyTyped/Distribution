package typings.rebass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SxProps extends js.Object {
  /**
    * The sx prop lets you style elements inline, using values from your theme.
    */
  var sx: js.UndefOr[SxStyleProp] = js.undefined
}

object SxProps {
  @scala.inline
  def apply(sx: js.UndefOr[Null | SxStyleProp] = js.undefined): SxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sx)) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SxProps]
  }
}

