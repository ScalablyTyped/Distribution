package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollatorOptions extends StObject {
  
  var caseFirst: js.UndefOr[String] = js.undefined
  
  var ignorePunctuation: js.UndefOr[Boolean] = js.undefined
  
  var localeMatcher: js.UndefOr[String] = js.undefined
  
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  var sensitivity: js.UndefOr[String] = js.undefined
  
  var usage: js.UndefOr[String] = js.undefined
}
object CollatorOptions {
  
  inline def apply(): CollatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollatorOptions]
  }
  
  extension [Self <: CollatorOptions](x: Self) {
    
    inline def setCaseFirst(value: String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    inline def setIgnorePunctuation(value: Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
    
    inline def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
    
    inline def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setSensitivity(value: String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
