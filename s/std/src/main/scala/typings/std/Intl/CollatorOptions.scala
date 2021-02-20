package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollatorOptions extends StObject {
  
  var caseFirst: js.UndefOr[String] = js.native
  
  var ignorePunctuation: js.UndefOr[Boolean] = js.native
  
  var localeMatcher: js.UndefOr[String] = js.native
  
  var numeric: js.UndefOr[Boolean] = js.native
  
  var sensitivity: js.UndefOr[String] = js.native
  
  var usage: js.UndefOr[String] = js.native
}
object CollatorOptions {
  
  @scala.inline
  def apply(): CollatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollatorOptions]
  }
  
  @scala.inline
  implicit class CollatorOptionsMutableBuilder[Self <: CollatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseFirst(value: String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    @scala.inline
    def setIgnorePunctuation(value: Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    @scala.inline
    def setSensitivity(value: String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
