package typings.sendgrid.sendgridMod.SendGridNs

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendGridConstructor extends js.Object {
  var mail: Helper = js.native
  def apply(apiKey: String): SendGrid = js.native
  def apply(apiKey: String, host: String): SendGrid = js.native
  def apply(apiKey: String, host: String, globalHeaders: StringDictionary[String]): SendGrid = js.native
}

