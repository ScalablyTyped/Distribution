package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherOptions extends StObject {
  
  var buildDelay: js.UndefOr[Double] = js.undefined
  
  var chokidar: js.UndefOr[ChokidarOptions] = js.undefined
  
  var clearScreen: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  var skipWrite: js.UndefOr[Boolean] = js.undefined
}
object WatcherOptions {
  
  inline def apply(): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherOptions] (val x: Self) extends AnyVal {
    
    inline def setBuildDelay(value: Double): Self = StObject.set(x, "buildDelay", value.asInstanceOf[js.Any])
    
    inline def setBuildDelayUndefined: Self = StObject.set(x, "buildDelay", js.undefined)
    
    inline def setChokidar(value: ChokidarOptions): Self = StObject.set(x, "chokidar", value.asInstanceOf[js.Any])
    
    inline def setChokidarUndefined: Self = StObject.set(x, "chokidar", js.undefined)
    
    inline def setClearScreen(value: Boolean): Self = StObject.set(x, "clearScreen", value.asInstanceOf[js.Any])
    
    inline def setClearScreenUndefined: Self = StObject.set(x, "clearScreen", js.undefined)
    
    inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setSkipWrite(value: Boolean): Self = StObject.set(x, "skipWrite", value.asInstanceOf[js.Any])
    
    inline def setSkipWriteUndefined: Self = StObject.set(x, "skipWrite", js.undefined)
  }
}
