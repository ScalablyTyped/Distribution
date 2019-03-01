package typings
package proxyDashListsLib.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSource extends js.Object {
  var homeUrl: java.lang.String
  def getProxies(options: InternalOptions): GetProxiesEventEmitter
}

object AddSource {
  @scala.inline
  def apply(getProxies: js.Function1[InternalOptions, GetProxiesEventEmitter], homeUrl: java.lang.String): AddSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getProxies")(getProxies)
    __obj.updateDynamic("homeUrl")(homeUrl)
    __obj.asInstanceOf[AddSource]
  }
}

