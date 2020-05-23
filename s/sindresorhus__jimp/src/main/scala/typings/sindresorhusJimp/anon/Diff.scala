package typings.sindresorhusJimp.anon

import typings.sindresorhusJimp.Jimp.Jimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diff extends js.Object {
  var diff: Jimp
  var percent: Double
}

object Diff {
  @scala.inline
  def apply(diff: Jimp, percent: Double): Diff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
}

