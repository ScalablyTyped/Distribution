package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityDetails extends js.Object {
  /** A string with the name of issuer of the certificate. (e.g. "Let's Encrypt Authority X3"). */
  def issuer(): java.lang.String
  /** String with the security protocol (e.g. TLS 1.2). */
  def protocol(): java.lang.String
  /** Name of the subject to which the certificate was issued to (e.g. "www.example.com"). */
  def subjectName(): java.lang.String
  /** Timestamp stating the start of validity of the certificate. */
  def validFrom(): scala.Double
  /** Timestamp stating the end of validity of the certificate. */
  def validTo(): scala.Double
}

object SecurityDetails {
  @scala.inline
  def apply(
    issuer: () => java.lang.String,
    protocol: () => java.lang.String,
    subjectName: () => java.lang.String,
    validFrom: () => scala.Double,
    validTo: () => scala.Double
  ): SecurityDetails = {
    val __obj = js.Dynamic.literal(issuer = js.Any.fromFunction0(issuer), protocol = js.Any.fromFunction0(protocol), subjectName = js.Any.fromFunction0(subjectName), validFrom = js.Any.fromFunction0(validFrom), validTo = js.Any.fromFunction0(validTo))
  
    __obj.asInstanceOf[SecurityDetails]
  }
}

