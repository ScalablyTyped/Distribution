package typings.proxyDashLists.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSource extends js.Object {
  var homeUrl: String
  def getProxies(options: InternalOptions): GetProxiesEventEmitter
}

object AddSource {
  @scala.inline
  def apply(getProxies: InternalOptions => GetProxiesEventEmitter, homeUrl: String): AddSource = {
    val __obj = js.Dynamic.literal(getProxies = js.Any.fromFunction1(getProxies), homeUrl = homeUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddSource]
  }
}

@JSImport("proxy-lists", "addSource")
@js.native
object addSource extends js.Object {
  def apply(name: String, source: AddSource): Unit = js.native
}

