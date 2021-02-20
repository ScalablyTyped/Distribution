package typings.sendgrid.mod.SendGrid

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.mod.SendGrid.Helpers.Mail.Helper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendGridConstructor extends StObject {
  
  def apply(apiKey: String): typings.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: js.UndefOr[scala.Nothing], globalHeaders: StringDictionary[String]): typings.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: String): typings.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: String, globalHeaders: StringDictionary[String]): typings.sendgrid.mod.SendGrid.SendGrid = js.native
  
  var mail: Helper = js.native
}
