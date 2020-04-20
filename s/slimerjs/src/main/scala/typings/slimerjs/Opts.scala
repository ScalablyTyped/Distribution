package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  var charset: String
  var mode: String
  var nobuffer: Boolean
}

object Opts {
  @scala.inline
  def apply(charset: String, mode: String, nobuffer: Boolean): Opts = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nobuffer = nobuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
}

