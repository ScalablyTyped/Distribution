package typings
package slateDashIrcLib.slateDashIrcMod.IRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataEvent extends js.Object {
  var command: java.lang.String
  var params: java.lang.String
  var prefix: java.lang.String
  var string: java.lang.String
  var trailing: java.lang.String
}

object DataEvent {
  @scala.inline
  def apply(
    command: java.lang.String,
    params: java.lang.String,
    prefix: java.lang.String,
    string: java.lang.String,
    trailing: java.lang.String
  ): DataEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("string")(string)
    __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[DataEvent]
  }
}

