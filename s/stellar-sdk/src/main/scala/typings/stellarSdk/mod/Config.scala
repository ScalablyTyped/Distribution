package typings.stellarSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Config")
@js.native
class Config ()
  extends typings.stellarSdk.configMod.Config
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
