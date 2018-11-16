package typings
package proxyDashListsLib.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-lists", JSImport.Namespace)
@js.native
object proxyDashListsModMembers extends js.Object {
  def addSource(name: java.lang.String, source: AddSource): scala.Unit = js.native
  def getProxies(): GetProxiesEventEmitter = js.native
  def getProxies(options: stdLib.Partial[Options]): GetProxiesEventEmitter = js.native
  def getProxiesFromSource(name: java.lang.String): GetProxiesEventEmitter = js.native
  def getProxiesFromSource(name: java.lang.String, options: Options): GetProxiesEventEmitter = js.native
  def listSources(): js.Array[Source] = js.native
  def listSources(options: ListSourcesOptions): js.Array[Source] = js.native
}

