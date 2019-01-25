package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rn-fetch-blob", "RNFetchBlobSession")
@js.native
class RNFetchBlobSession protected () extends js.Object {
  def this(name: java.lang.String, list: js.Array[java.lang.String]) = this()
  var name: java.lang.String = js.native
  def add(path: java.lang.String): RNFetchBlobSession = js.native
  def dispose(): js.Promise[scala.Unit] = js.native
  def list(): js.Array[java.lang.String] = js.native
  def remove(path: java.lang.String): RNFetchBlobSession = js.native
}

@JSImport("rn-fetch-blob", "RNFetchBlobSession")
@js.native
object RNFetchBlobSession extends js.Object {
  def getSession(name: java.lang.String): js.Any = js.native
  def removeSession(name: java.lang.String): scala.Unit = js.native
  def setSession(name: java.lang.String): scala.Unit = js.native
}

