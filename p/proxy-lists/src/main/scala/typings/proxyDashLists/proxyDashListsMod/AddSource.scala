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
    val __obj = js.Dynamic.literal(getProxies = js.Any.fromFunction1(getProxies), homeUrl = homeUrl)
  
    __obj.asInstanceOf[AddSource]
  }
}

