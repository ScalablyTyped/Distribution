package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sigma extends StObject {
  
  def addRenderer(): Renderer = js.native
  def addRenderer(configs: RendererConfigs): Renderer = js.native
  
  def bind(event: String, callback: js.Function1[/* e */ Any, Unit]): Unit = js.native
  
  var cameras: js.Array[Camera] = js.native
  
  // forceAtlas2 layout
  def configForceAtlas2(configs: StringDictionary[Any]): Unit = js.native
  
  var graph: Graph = js.native
  
  def isForceAtlas2Running(): Boolean = js.native
  
  def kill(): Unit = js.native
  
  def killForceAtlas2(): Unit = js.native
  
  def killRenderer(renderer: String): Sigma = js.native
  def killRenderer(renderer: Renderer): Sigma = js.native
  
  def refresh(): Unit = js.native
  
  var renderers: js.Array[Renderer] = js.native
  
  def settings(key: String): Any = js.native
  def settings(settings: Settings): Unit = js.native
  
  def startForceAtlas2(): Unit = js.native
  def startForceAtlas2(configs: StringDictionary[Any]): Unit = js.native
  
  def stopForceAtlas2(): Unit = js.native
}
