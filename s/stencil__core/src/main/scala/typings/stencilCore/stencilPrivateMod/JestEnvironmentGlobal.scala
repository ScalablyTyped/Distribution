package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.stencilCore.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JestEnvironmentGlobal extends StObject {
  
  var Context: Any
  
  def __CLOSE_OPEN_PAGES__(): js.Promise[Any]
  
  def __NEW_TEST_PAGE__(): js.Promise[Any]
  
  var currentSpec: js.UndefOr[Description] = js.undefined
  
  var env: StringDictionary[String]
  
  var h: Any
  
  def loadTestWindow(testWindow: Any): js.Promise[Unit]
  
  var resourcesUrl: String
  
  var screenshotDescriptions: Set[String]
}
object JestEnvironmentGlobal {
  
  inline def apply(
    Context: Any,
    __CLOSE_OPEN_PAGES__ : () => js.Promise[Any],
    __NEW_TEST_PAGE__ : () => js.Promise[Any],
    env: StringDictionary[String],
    h: Any,
    loadTestWindow: Any => js.Promise[Unit],
    resourcesUrl: String,
    screenshotDescriptions: Set[String]
  ): JestEnvironmentGlobal = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], __CLOSE_OPEN_PAGES__ = js.Any.fromFunction0(__CLOSE_OPEN_PAGES__), __NEW_TEST_PAGE__ = js.Any.fromFunction0(__NEW_TEST_PAGE__), env = env.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], loadTestWindow = js.Any.fromFunction1(loadTestWindow), resourcesUrl = resourcesUrl.asInstanceOf[js.Any], screenshotDescriptions = screenshotDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestEnvironmentGlobal]
  }
  
  extension [Self <: JestEnvironmentGlobal](x: Self) {
    
    inline def setContext(value: Any): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setCurrentSpec(value: Description): Self = StObject.set(x, "currentSpec", value.asInstanceOf[js.Any])
    
    inline def setCurrentSpecUndefined: Self = StObject.set(x, "currentSpec", js.undefined)
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setH(value: Any): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setLoadTestWindow(value: Any => js.Promise[Unit]): Self = StObject.set(x, "loadTestWindow", js.Any.fromFunction1(value))
    
    inline def setResourcesUrl(value: String): Self = StObject.set(x, "resourcesUrl", value.asInstanceOf[js.Any])
    
    inline def setScreenshotDescriptions(value: Set[String]): Self = StObject.set(x, "screenshotDescriptions", value.asInstanceOf[js.Any])
    
    inline def set__CLOSE_OPEN_PAGES__(value: () => js.Promise[Any]): Self = StObject.set(x, "__CLOSE_OPEN_PAGES__", js.Any.fromFunction0(value))
    
    inline def set__NEW_TEST_PAGE__(value: () => js.Promise[Any]): Self = StObject.set(x, "__NEW_TEST_PAGE__", js.Any.fromFunction0(value))
  }
}
