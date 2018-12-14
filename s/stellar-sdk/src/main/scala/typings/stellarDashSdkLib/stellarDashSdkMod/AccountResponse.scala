package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "AccountResponse")
@js.native
class AccountResponse protected () extends AccountRecord {
  def this(response: AccountRecord) = this()
  /* CompleteClass */
  override var _links: org.scalablytyped.runtime.StringDictionary[RecordLink] = js.native
  @JSName("_links")
  var _links_AccountResponse: org.scalablytyped.runtime.StringDictionary[stellarDashSdkLib.Anon_Href] = js.native
  def accountId(): java.lang.String = js.native
  def incrementSequenceNumber(): scala.Unit = js.native
  def sequenceNumber(): java.lang.String = js.native
}

