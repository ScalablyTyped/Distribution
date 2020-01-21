package typings.sharp.mod

import typings.sharp.sharpNumbers.`1`
import typings.sharp.sharpNumbers.`2`
import typings.sharp.sharpNumbers.`3`
import typings.sharp.sharpNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Raw extends js.Object {
  var channels: `1` | `2` | `3` | `4`
  var height: Double
  var width: Double
}

object Raw {
  @scala.inline
  def apply(channels: `1` | `2` | `3` | `4`, height: Double, width: Double): Raw = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Raw]
  }
}

