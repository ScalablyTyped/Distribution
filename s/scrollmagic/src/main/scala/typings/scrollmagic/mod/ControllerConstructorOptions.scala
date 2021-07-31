package typings.scrollmagic.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControllerConstructorOptions extends StObject {
  
  var container: js.UndefOr[String | Element] = js.undefined
  
  var globalSceneOptions: js.UndefOr[SceneConstructorOptions] = js.undefined
  
  var loglevel: js.UndefOr[Double] = js.undefined
  
  var refreshInterval: js.UndefOr[Double] = js.undefined
  
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object ControllerConstructorOptions {
  
  @scala.inline
  def apply(): ControllerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControllerConstructorOptions]
  }
  
  @scala.inline
  implicit class ControllerConstructorOptionsMutableBuilder[Self <: ControllerConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: String | Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setGlobalSceneOptions(value: SceneConstructorOptions): Self = StObject.set(x, "globalSceneOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSceneOptionsUndefined: Self = StObject.set(x, "globalSceneOptions", js.undefined)
    
    @scala.inline
    def setLoglevel(value: Double): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
    
    @scala.inline
    def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
