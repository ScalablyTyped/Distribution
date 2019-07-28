package typings.proxyDashLists.proxyDashListsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-lists", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addSource(name: String, source: AddSource): Unit = js.native
  def getProxies(): GetProxiesEventEmitter = js.native
  def getProxies(options: Partial[Options]): GetProxiesEventEmitter = js.native
  def getProxiesFromSource(name: String): GetProxiesEventEmitter = js.native
  def getProxiesFromSource(name: String, options: Options): GetProxiesEventEmitter = js.native
  def listSources(): js.Array[Source] = js.native
  def listSources(options: ListSourcesOptions): js.Array[Source] = js.native
}

