package typings.scrollmagic.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrollmagic", "Controller")
@js.native
class Controller () extends StObject {
  def this(options: ControllerConstructorOptions) = this()
  
  /* Control Methods */
  def addScene(newScene: Scene): Controller = js.native
  
  def destroy(resetScenes: Boolean): Unit = js.native
  
  def enabled(): Boolean = js.native
  /* Getters/Setters */
  def enabled(newState: Boolean): Controller = js.native
  
  def info(): ControllerInfo | Double | String | Boolean | Element | Null = js.native
  def info(about: InfoOption): ControllerInfo | Double | String | Boolean | Element | Null = js.native
  
  def loglevel(): LogLevel = js.native
  def loglevel(newLogLevel: LogLevel): Controller = js.native
  
  def removeScene(newScene: Scene): Controller = js.native
  
  def scrollPos(): Double = js.native
  def scrollPos(calcFn: js.Function0[Double]): Controller = js.native
  
  def scrollTo(scrollTarget: ScrollTarget): Controller = js.native
  def scrollTo(scrollTarget: ScrollTarget, additionalParameter: js.Array[_]): Controller = js.native
  
  def update(): Controller = js.native
  def update(immediately: Boolean): Controller = js.native
  
  def updateScene(scene: Scene): Controller = js.native
  def updateScene(scene: Scene, immediately: Boolean): Controller = js.native
}
