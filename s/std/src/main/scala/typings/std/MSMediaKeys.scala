package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSMediaKeys extends js.Object {
  val keySystem: java.lang.String = js.native
  def createSession(`type`: java.lang.String, initData: Uint8Array): MSMediaKeySession = js.native
  def createSession(`type`: java.lang.String, initData: Uint8Array, cdmData: Uint8Array): MSMediaKeySession = js.native
}

