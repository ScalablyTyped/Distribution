package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Rule extends StObject {
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
}
object S3Rule {
  
  inline def apply(): S3Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Rule]
  }
  
  extension [Self <: S3Rule](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
