package typings.snsValidator.mod

import typings.std.RegExp
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
class ^ () extends MessageValidator {
  def this(hostPattern: RegExp) = this()
  def this(hostPattern: js.UndefOr[scala.Nothing], encoding: String) = this()
  def this(hostPattern: RegExp, encoding: String) = this()
}

