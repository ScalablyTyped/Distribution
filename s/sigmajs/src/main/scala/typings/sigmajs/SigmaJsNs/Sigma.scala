package typings.sigmajs.SigmaJsNs

import org.scalablytyped.runtime.StringDictionary
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
  def bind(event: String, callback: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  // forceAtlas2 layout
  def configForceAtlas2(configs: StringDictionary[js.Any]): Unit = js.native
  def isForceAtlas2Running(): Boolean = js.native
  def kill(): Unit = js.native
  def killForceAtlas2(): Unit = js.native
  def killRenderer(renderer: String): Sigma = js.native
  def killRenderer(renderer: Renderer): Sigma = js.native
  def refresh(): Unit = js.native
  def settings(key: String): js.Any = js.native
  def settings(settings: Settings): Unit = js.native
  def startForceAtlas2(): Unit = js.native
  def startForceAtlas2(configs: StringDictionary[js.Any]): Unit = js.native
  def stopForceAtlas2(): Unit = js.native
}

