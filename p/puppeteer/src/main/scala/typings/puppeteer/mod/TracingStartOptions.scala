package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracingStartOptions extends StObject {
  
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var screenshots: js.UndefOr[Boolean] = js.native
}
object TracingStartOptions {
  
  @scala.inline
  def apply(): TracingStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingStartOptions]
  }
  
  @scala.inline
  implicit class TracingStartOptionsMutableBuilder[Self <: TracingStartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setScreenshots(value: Boolean): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
  }
}
