package typings.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Config")
@js.native
class Config ()
  extends typings.stellarDashSdk.libConfigMod.Config

/* static members */
@JSImport("stellar-sdk", "Config")
@js.native
object Config extends js.Object {
  def getTimeout(): Double = js.native
  def isAllowHttp(): Boolean = js.native
  def setAllowHttp(value: Boolean): Unit = js.native
  def setDefault(): Unit = js.native
  def setTimeout(value: Double): Unit = js.native
}

