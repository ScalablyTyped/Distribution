package typings.readPkgUp

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cwd extends StObject {
    
    /**
    	The directory to start looking for a package.json file.
    	@default process.cwd()
    	*/
    var cwd: js.UndefOr[URL | String] = js.undefined
  }
  object Cwd {
    
    inline def apply(): Cwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cwd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: URL | String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
}
