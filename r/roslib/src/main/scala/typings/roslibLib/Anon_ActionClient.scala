package typings
package roslibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionClient extends js.Object {
  var actionClient: roslibLib.roslibMod.ActionClient
  var goalMessage: js.Any
}

object Anon_ActionClient {
  @scala.inline
  def apply(actionClient: roslibLib.roslibMod.ActionClient, goalMessage: js.Any): Anon_ActionClient = {
    val __obj = js.Dynamic.literal(actionClient = actionClient, goalMessage = goalMessage)
  
    __obj.asInstanceOf[Anon_ActionClient]
  }
}

