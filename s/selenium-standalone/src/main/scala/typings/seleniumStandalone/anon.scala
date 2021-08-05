package typings.seleniumStandalone

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictx
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var installPath: String
  }
  object Dictx {
    
    inline def apply(installPath: String): Dictx = {
      val __obj = js.Dynamic.literal(installPath = installPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx]
    }
    
    extension [Self <: Dictx](x: Self) {
      
      inline def setInstallPath(value: String): Self = StObject.set(x, "installPath", value.asInstanceOf[js.Any])
    }
  }
}
