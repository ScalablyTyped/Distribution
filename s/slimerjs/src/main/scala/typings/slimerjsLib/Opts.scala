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
    val __obj = js.Dynamic.literal(charset = charset, mode = mode, nobuffer = nobuffer)
  
    __obj.asInstanceOf[Opts]
  }
}

