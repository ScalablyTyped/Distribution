package typings.std.global

import typings.std.RequestInfo
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("fetch")
@js.native
object fetch extends js.Object {
  def apply(input: RequestInfo): js.Promise[typings.std.Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
}

