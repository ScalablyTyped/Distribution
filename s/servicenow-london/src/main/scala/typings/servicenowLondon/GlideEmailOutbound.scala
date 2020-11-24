package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideEmailOutbound extends js.Object {
  
  /**
    * Adds the address to either the cc or bcc list.
    *
    * @param type Either cc or bcc, determines the list to which the address is added.
    * @param address The recipient's email address.
    * @example
    *
    * email.addAddress('cc', 'joe.employee@something.com');
    */
  def addAddress(`type`: String, address: String): Unit = js.native
  /**
    * Adds the recipient to either the cc or bcc list, but uses the display name instead of the
    * address when showing the recipient.
    *
    * @param type Either cc or bcc, determines the list to which the address is added.
    * @param address The recipient's email address.
    * @param displayName The name to be shown instead of the email address.
    * @example
    *
    * email.addAddress('bcc', 'joe.employee@something.com', 'dudley rocks');
    */
  def addAddress(`type`: String, address: String, displayName: String): Unit = js.native
  
  /**
    * Returns the email's subject line.
    *
    * @returns The email's subject line.
    * @example
    *
    * var subject = email.getSubject();
    */
  def getSubject(): String = js.native
  
  /**
    * Returns the email's watermark.
    */
  def getWatermark(): String = js.native
  
  /**
    * Sets the body of the email.
    *
    * @param bodyText The body of the email.
    * @example
    *
    * email.setBody('Dear Sir, ...');
    */
  def setBody(bodyText: String): Unit = js.native
  
  /**
    * Sets the sender's address.
    *
    * @param address The sender's email address.
    * @example
    *
    * email.setFrom('joe.employee@something.com');
    */
  def setFrom(address: String): Unit = js.native
  
  /**
    * Sets the reply to address.
    *
    * @param address The reply to email address.
    * @example
    *
    * email.setReplyTo('joe.employee@something.com');
    */
  def setReplyTo(address: String): Unit = js.native
  
  /**
    * Sets the email's subject line.
    *
    * @param subject Text for the subject line.
    * @example
    *
    * email.setSubject('Important Issues to discuss');
    */
  def setSubject(subject: String): Unit = js.native
}
