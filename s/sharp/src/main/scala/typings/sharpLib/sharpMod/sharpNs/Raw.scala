package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Raw extends js.Object {
  var channels: sharpLib.sharpLibNumbers.`1` | sharpLib.sharpLibNumbers.`2` | sharpLib.sharpLibNumbers.`3` | sharpLib.sharpLibNumbers.`4`
  var height: scala.Double
  var width: scala.Double
}

object Raw {
  @scala.inline
  def apply(
    channels: sharpLib.sharpLibNumbers.`1` | sharpLib.sharpLibNumbers.`2` | sharpLib.sharpLibNumbers.`3` | sharpLib.sharpLibNumbers.`4`,
    height: scala.Double,
    width: scala.Double
  ): Raw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Raw]
  }
}

