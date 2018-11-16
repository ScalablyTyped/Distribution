package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Account")
@js.native
class Account protected () extends js.Object {
  def this(accountId: java.lang.String, sequence: java.lang.String) = this()
  def accountId(): java.lang.String = js.native
  def incrementSequenceNumber(): scala.Unit = js.native
  def sequenceNumber(): java.lang.String = js.native
}

