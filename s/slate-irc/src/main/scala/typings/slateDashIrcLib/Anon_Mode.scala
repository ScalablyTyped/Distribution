package typings
package slateDashIrcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: java.lang.String
  var name: java.lang.String
}

object Anon_Mode {
  @scala.inline
  def apply(mode: java.lang.String, name: java.lang.String): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Mode]
  }
}

