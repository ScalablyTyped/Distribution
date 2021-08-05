package typings.settings

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictenvName
    extends StObject
       with // error is thrown if 'common' object is not provided
  /* envName */ StringDictionary[js.Any] {
    
    var common: js.Any
    
    var forceEnv: js.UndefOr[String] = js.undefined
  }
  object DictenvName {
    
    inline def apply(common: js.Any): DictenvName = {
      val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictenvName]
    }
    
    extension [Self <: DictenvName](x: Self) {
      
      inline def setCommon(value: js.Any): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setForceEnv(value: String): Self = StObject.set(x, "forceEnv", value.asInstanceOf[js.Any])
      
      inline def setForceEnvUndefined: Self = StObject.set(x, "forceEnv", js.undefined)
    }
  }
}
