package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestingRunOptions extends StObject {
  
  var e2e: js.UndefOr[Boolean] = js.undefined
  
  var screenshot: js.UndefOr[Boolean] = js.undefined
  
  var spec: js.UndefOr[Boolean] = js.undefined
  
  var updateScreenshot: js.UndefOr[Boolean] = js.undefined
}
object TestingRunOptions {
  
  inline def apply(): TestingRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingRunOptions]
  }
  
  extension [Self <: TestingRunOptions](x: Self) {
    
    inline def setE2e(value: Boolean): Self = StObject.set(x, "e2e", value.asInstanceOf[js.Any])
    
    inline def setE2eUndefined: Self = StObject.set(x, "e2e", js.undefined)
    
    inline def setScreenshot(value: Boolean): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
    
    inline def setSpec(value: Boolean): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setUpdateScreenshot(value: Boolean): Self = StObject.set(x, "updateScreenshot", value.asInstanceOf[js.Any])
    
    inline def setUpdateScreenshotUndefined: Self = StObject.set(x, "updateScreenshot", js.undefined)
  }
}
