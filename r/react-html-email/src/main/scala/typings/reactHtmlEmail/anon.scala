package typings.reactHtmlEmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Platforms extends StObject {
    
    var platforms: js.UndefOr[js.Array[String]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
  }
  object Platforms {
    
    inline def apply(): Platforms = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Platforms]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Platforms] (val x: Self) extends AnyVal {
      
      inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
      
      inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
