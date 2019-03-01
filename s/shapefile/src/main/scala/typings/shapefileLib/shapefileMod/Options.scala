package typings
package shapefileLib.shapefileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(encoding: java.lang.String = null, highWaterMark: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

