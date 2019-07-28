package typings.restify

import typings.bunyan.bunyanMod.Serializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Clientreq extends js.Object {
  @JSName("client_req")
  var client_req_Original: Serializer = js.native
  @JSName("client_res")
  var client_res_Original: Serializer = js.native
  @JSName("err")
  var err_Original: Serializer = js.native
  @JSName("req")
  var req_Original: Serializer = js.native
  @JSName("res")
  var res_Original: Serializer = js.native
  def client_req(input: js.Any): js.Any = js.native
  def client_res(input: js.Any): js.Any = js.native
  def err(input: js.Any): js.Any = js.native
  def req(input: js.Any): js.Any = js.native
  def res(input: js.Any): js.Any = js.native
}

