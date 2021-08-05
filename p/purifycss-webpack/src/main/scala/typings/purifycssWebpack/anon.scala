package typings.purifycssWebpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Info extends StObject {
    
    var info: js.UndefOr[Boolean] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var output: js.UndefOr[String | Boolean] = js.undefined
    
    var rejected: js.UndefOr[Boolean] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Info {
    
    inline def apply(): Info = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setOutput(value: String | Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setRejected(value: Boolean): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
}
