package typings
package sendgridLib.sendgridMod.SendGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendGrid extends js.Object {
  def API(request: sendgridLib.sendgridMod.SendGridNs.RestNs.Request): js.Promise[sendgridLib.sendgridMod.SendGridNs.RestNs.Response] = js.native
  def API(
    request: sendgridLib.sendgridMod.SendGridNs.RestNs.Request,
    callback: js.Function2[
      /* err */ sendgridLib.sendgridMod.SendGridNs.HelpersNs.ErrorNs.SendGridError, 
      /* response */ sendgridLib.sendgridMod.SendGridNs.RestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def emptyRequest(): sendgridLib.sendgridMod.SendGridNs.RestNs.Request = js.native
  def emptyRequest(data: sendgridLib.sendgridMod.SendGridNs.RestNs.Request): sendgridLib.sendgridMod.SendGridNs.RestNs.Request = js.native
}

