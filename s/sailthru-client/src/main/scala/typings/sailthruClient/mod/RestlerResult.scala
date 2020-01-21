package typings.sailthruClient.mod

import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestlerResult extends js.Object {
  def on(
    eventName: String,
    listener: js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]
  ): RestlerResult
}

object RestlerResult {
  @scala.inline
  def apply(
    on: (String, js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]) => RestlerResult
  ): RestlerResult = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[RestlerResult]
  }
}

