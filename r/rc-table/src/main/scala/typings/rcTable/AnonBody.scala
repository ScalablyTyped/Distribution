package typings.rcTable

import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: MutableRefObject[HTMLDivElement]
}

object AnonBody {
  @scala.inline
  def apply(body: MutableRefObject[HTMLDivElement]): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

