package typings.stamplayJsSdk

import typings.stamplayJsSdk.Stamplay.StamplayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Stamplay extends js.Object {
    def Cobject(`object`: String): StamplayObject = js.native
    def User(): StamplayObject = js.native
    def init(appId: String): Unit = js.native
  }
  
}

