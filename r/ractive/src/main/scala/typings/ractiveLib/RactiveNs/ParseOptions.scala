package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var preserveWhitespace: scala.Boolean
  var sanitize: js.Any
}

object ParseOptions {
  @scala.inline
  def apply(preserveWhitespace: scala.Boolean, sanitize: js.Any): ParseOptions = {
    val __obj = js.Dynamic.literal(preserveWhitespace = preserveWhitespace, sanitize = sanitize)
  
    __obj.asInstanceOf[ParseOptions]
  }
}

