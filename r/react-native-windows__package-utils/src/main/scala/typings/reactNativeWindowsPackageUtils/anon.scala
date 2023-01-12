package typings.reactNativeWindowsPackageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait SearchPath extends StObject {
    
    var searchPath: js.UndefOr[String] = js.undefined
  }
  object SearchPath {
    
    inline def apply(): SearchPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchPath] (val x: Self) extends AnyVal {
      
      inline def setSearchPath(value: String): Self = StObject.set(x, "searchPath", value.asInstanceOf[js.Any])
      
      inline def setSearchPathUndefined: Self = StObject.set(x, "searchPath", js.undefined)
    }
  }
}
