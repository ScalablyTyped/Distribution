package typings.reactNative.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppConfig extends StObject {
  
  var appKey: String = js.native
  
  var component: js.UndefOr[ComponentProvider] = js.native
  
  var run: js.UndefOr[Runnable] = js.native
}
object AppConfig {
  
  @scala.inline
  def apply(appKey: String): AppConfig = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppConfig]
  }
  
  @scala.inline
  implicit class AppConfigMutableBuilder[Self <: AppConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: () => ComponentType[js.Any]): Self = StObject.set(x, "component", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setRun(value: /* appParameters */ js.Any => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
