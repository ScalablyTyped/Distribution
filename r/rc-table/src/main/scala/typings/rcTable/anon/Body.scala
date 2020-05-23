package typings.rcTable.anon

import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: MutableRefObject[HTMLDivElement]
}

object Body {
  @scala.inline
  def apply(body: MutableRefObject[HTMLDivElement]): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

