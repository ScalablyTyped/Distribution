package typings
package proxyDashListsLib.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-lists", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addSource(name: java.lang.String, source: proxyDashListsLib.proxyDashListsMod.AddSource): scala.Unit = js.native
  def getProxies(): proxyDashListsLib.proxyDashListsMod.GetProxiesEventEmitter = js.native
  def getProxies(options: stdLib.Partial[proxyDashListsLib.proxyDashListsMod.Options]): proxyDashListsLib.proxyDashListsMod.GetProxiesEventEmitter = js.native
  def getProxiesFromSource(name: java.lang.String): proxyDashListsLib.proxyDashListsMod.GetProxiesEventEmitter = js.native
  def getProxiesFromSource(name: java.lang.String, options: proxyDashListsLib.proxyDashListsMod.Options): proxyDashListsLib.proxyDashListsMod.GetProxiesEventEmitter = js.native
  def listSources(): js.Array[proxyDashListsLib.proxyDashListsMod.Source] = js.native
  def listSources(options: proxyDashListsLib.proxyDashListsMod.ListSourcesOptions): js.Array[proxyDashListsLib.proxyDashListsMod.Source] = js.native
}

