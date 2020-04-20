package typings.stringReplaceWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var replacements: js.Array[ReplacementItem]
}

object Options {
  @scala.inline
  def apply(replacements: js.Array[ReplacementItem]): Options = {
    val __obj = js.Dynamic.literal(replacements = replacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

