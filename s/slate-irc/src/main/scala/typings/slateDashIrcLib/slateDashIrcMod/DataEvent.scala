package typings
package slateDashIrcLib.slateDashIrcMod

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
    val __obj = js.Dynamic.literal(command = command, params = params, prefix = prefix, string = string, trailing = trailing)
  
    __obj.asInstanceOf[DataEvent]
  }
}

