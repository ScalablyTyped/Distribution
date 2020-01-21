package typings.stellarBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Account")
@js.native
class Account protected () extends js.Object {
  def this(accountId: String, sequence: String) = this()
  def accountId(): String = js.native
  def incrementSequenceNumber(): Unit = js.native
  def sequenceNumber(): String = js.native
}

