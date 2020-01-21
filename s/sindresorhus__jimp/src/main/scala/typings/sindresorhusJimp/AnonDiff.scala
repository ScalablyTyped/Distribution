package typings.sindresorhusJimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiff extends js.Object {
  var diff: typings.sindresorhusJimp.Jimp.Jimp
  var percent: Double
}

object AnonDiff {
  @scala.inline
  def apply(diff: typings.sindresorhusJimp.Jimp.Jimp, percent: Double): AnonDiff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDiff]
  }
}

