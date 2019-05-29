package typings
package sendgridLib.sendgridMod.SendGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendGridConstructor extends js.Object {
  var mail: sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs.Helper = js.native
  def apply(apiKey: java.lang.String): SendGrid = js.native
  def apply(apiKey: java.lang.String, host: java.lang.String): SendGrid = js.native
  def apply(
    apiKey: java.lang.String,
    host: java.lang.String,
    globalHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): SendGrid = js.native
}

