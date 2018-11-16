package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sigma extends js.Object {
  var cameras: js.Array[Camera] = js.native
  var graph: Graph = js.native
  var renderers: js.Array[Renderer] = js.native
  def addRenderer(): Renderer = js.native
  def addRenderer(configs: RendererConfigs): Renderer = js.native
  def bind(event: java.lang.String, callback: js.Function1[/* e */ js.Any, scala.Unit]): scala.Unit = js.native
  // forceAtlas2 layout
  def configForceAtlas2(configs: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def isForceAtlas2Running(): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def killForceAtlas2(): scala.Unit = js.native
  def killRenderer(renderer: java.lang.String): Sigma = js.native
  def killRenderer(renderer: Renderer): Sigma = js.native
  def refresh(): scala.Unit = js.native
  def settings(key: java.lang.String): js.Any = js.native
  def settings(settings: Settings): scala.Unit = js.native
  def startForceAtlas2(): scala.Unit = js.native
  def startForceAtlas2(configs: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def stopForceAtlas2(): scala.Unit = js.native
}

