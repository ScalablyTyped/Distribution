package typings.sendgrid.mod.SendGrid

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.mod.SendGrid.Helpers.Mail.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendGridConstructor extends js.Object {
  var mail: Helper = js.native
  def apply(apiKey: String): typings.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: String): typings.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: String, globalHeaders: StringDictionary[String]): typings.sendgrid.mod.SendGrid.SendGrid = js.native
}

