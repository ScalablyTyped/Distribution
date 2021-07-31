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
    
    @scala.inline
    def apply(common: js.Any): DictenvName = {
      val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictenvName]
    }
    
    @scala.inline
    implicit class DictenvNameMutableBuilder[Self <: DictenvName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommon(value: js.Any): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceEnv(value: String): Self = StObject.set(x, "forceEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceEnvUndefined: Self = StObject.set(x, "forceEnv", js.undefined)
    }
  }
}
