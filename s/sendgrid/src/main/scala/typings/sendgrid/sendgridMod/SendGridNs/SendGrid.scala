package typings.sendgrid.sendgridMod.SendGridNs

import typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.ErrorNs.SendGridError
import typings.sendgrid.sendgridMod.SendGridNs.RestNs.Request
import typings.sendgrid.sendgridMod.SendGridNs.RestNs.Response
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

