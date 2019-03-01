package typings
package snsDashValidatorLib.snsDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sns-validator", JSImport.Namespace)
@js.native
/**
  * Create a new MessageValidator
  * @param hostPattern - A pattern used to validate that a message's certificate originates from a trusted domain. Default: `/^sns\.[a-zA-Z0-9\-]{3,}\.amazonaws\.com(\.cn)?$/`
  * @param encoding - The encoding of the messages being signed. Default is `utf8`
  */
class namespaced () extends MessageValidator {
  def this(hostPattern: stdLib.RegExp) = this()
  def this(hostPattern: stdLib.RegExp, encoding: java.lang.String) = this()
}

