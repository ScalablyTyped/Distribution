package typings
package soapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  val TNS_PREFIX: soapLib.soapLibStrings.__tns__ = js.native
  def findPrefix(xmlnsMapping: js.Any, nsURI: js.Any): java.lang.String = js.native
  def passwordDigest(nonce: java.lang.String, created: java.lang.String, password: java.lang.String): java.lang.String = js.native
  def splitQName[T](nsName: T): soapLib.Anon_Name[T] | soapLib.Anon_NamePrefix = js.native
}

