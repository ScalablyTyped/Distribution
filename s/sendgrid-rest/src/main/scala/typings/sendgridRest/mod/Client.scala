package typings.sendgridRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sendgrid-rest", "Client")
@js.native
class Client protected () extends js.Object {
  def this(globalRequest: Request_) = this()
  /**
    * API is the main interface to the API.
    */
  def API(endpointRequest: Request_, callback: js.Function1[/* response */ Response, Unit]): Unit = js.native
  /**
    *  utility function to create an empty request object
    */
  def emptyRequest(): Request_ = js.native
}

