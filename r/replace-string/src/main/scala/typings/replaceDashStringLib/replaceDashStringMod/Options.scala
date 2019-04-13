package typings
package replaceDashStringLib.replaceDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fromIndex: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(fromIndex: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fromIndex != null) __obj.updateDynamic("fromIndex")(fromIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

