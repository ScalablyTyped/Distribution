package typings.soap

import typings.soap.soapStrings.__tns__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val TNS_PREFIX: __tns__ = js.native
  def findPrefix(xmlnsMapping: js.Any, nsURI: js.Any): String = js.native
  def passwordDigest(nonce: String, created: String, password: String): String = js.native
  def splitQName[T](nsName: T): AnonName[T] | AnonNamePrefix = js.native
}

