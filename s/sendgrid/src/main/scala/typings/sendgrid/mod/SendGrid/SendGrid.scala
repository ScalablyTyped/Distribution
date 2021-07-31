package typings.sendgrid.mod.SendGrid

import typings.sendgrid.mod.SendGrid.Helpers.Error.SendGridError
import typings.sendgrid.mod.SendGrid.Rest.Request
import typings.sendgrid.mod.SendGrid.Rest.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendGrid extends StObject {
  
  def API(request: Request): js.Promise[Response] = js.native
  def API(request: Request, callback: js.Function2[/* err */ SendGridError, /* response */ Response, Unit]): Unit = js.native
  
  def emptyRequest(): Request = js.native
  def emptyRequest(data: Request): Request = js.native
}
