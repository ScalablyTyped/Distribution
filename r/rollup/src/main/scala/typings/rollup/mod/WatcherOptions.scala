package typings.rollup.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherOptions extends StObject {
  
  var buildDelay: js.UndefOr[Double] = js.undefined
  
  var chokidar: js.UndefOr[ChokidarOptions] = js.undefined
  
  var clearScreen: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  
  var skipWrite: js.UndefOr[Boolean] = js.undefined
}
object WatcherOptions {
  
  @scala.inline
  def apply(): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherOptions]
  }
  
  @scala.inline
  implicit class WatcherOptionsMutableBuilder[Self <: WatcherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildDelay(value: Double): Self = StObject.set(x, "buildDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildDelayUndefined: Self = StObject.set(x, "buildDelay", js.undefined)
    
    @scala.inline
    def setChokidar(value: ChokidarOptions): Self = StObject.set(x, "chokidar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChokidarUndefined: Self = StObject.set(x, "chokidar", js.undefined)
    
    @scala.inline
    def setClearScreen(value: Boolean): Self = StObject.set(x, "clearScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearScreenUndefined: Self = StObject.set(x, "clearScreen", js.undefined)
    
    @scala.inline
    def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setSkipWrite(value: Boolean): Self = StObject.set(x, "skipWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipWriteUndefined: Self = StObject.set(x, "skipWrite", js.undefined)
  }
}
