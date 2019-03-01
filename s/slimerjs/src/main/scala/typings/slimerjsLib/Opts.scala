package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  var charset: java.lang.String
  var mode: java.lang.String
  var nobuffer: scala.Boolean
}

object Opts {
  @scala.inline
  def apply(charset: java.lang.String, mode: java.lang.String, nobuffer: scala.Boolean): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charset")(charset)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("nobuffer")(nobuffer)
    __obj.asInstanceOf[Opts]
  }
}

