package typings.sendgrid.sendgridMod.SendGrid

import typings.sendgrid.sendgridMod.SendGrid.Helpers.Error.SendGridError
import typings.sendgrid.sendgridMod.SendGrid.Rest.Request
import typings.sendgrid.sendgridMod.SendGrid.Rest.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendGrid extends js.Object {
  def API(request: Request): js.Promise[Response] = js.native
  def API(request: Request, callback: js.Function2[/* err */ SendGridError, /* response */ Response, Unit]): Unit = js.native
  def emptyRequest(): Request = js.native
  def emptyRequest(data: Request): Request = js.native
}

