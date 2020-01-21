package typings.stellarSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  @js.native
  class Config () extends js.Object
  
  /* static members */
  @js.native
  object Config extends js.Object {
    def getTimeout(): Double = js.native
    def isAllowHttp(): Boolean = js.native
    def setAllowHttp(value: Boolean): Unit = js.native
    def setDefault(): Unit = js.native
    def setTimeout(value: Double): Unit = js.native
  }
  
}

