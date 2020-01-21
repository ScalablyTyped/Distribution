package typings.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSource_ extends js.Object {
  var homeUrl: String
  def getProxies(options: InternalOptions): GetProxiesEventEmitter
}

object AddSource_ {
  @scala.inline
  def apply(getProxies: InternalOptions => GetProxiesEventEmitter, homeUrl: String): AddSource_ = {
    val __obj = js.Dynamic.literal(getProxies = js.Any.fromFunction1(getProxies), homeUrl = homeUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddSource_]
  }
}

