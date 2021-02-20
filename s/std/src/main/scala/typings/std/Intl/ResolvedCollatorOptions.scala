package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedCollatorOptions extends StObject {
  
  var caseFirst: String = js.native
  
  var collation: String = js.native
  
  var ignorePunctuation: Boolean = js.native
  
  var locale: String = js.native
  
  var numeric: Boolean = js.native
  
  var sensitivity: String = js.native
  
  var usage: String = js.native
}
object ResolvedCollatorOptions {
  
  @scala.inline
  def apply(
    caseFirst: String,
    collation: String,
    ignorePunctuation: Boolean,
    locale: String,
    numeric: Boolean,
    sensitivity: String,
    usage: String
  ): ResolvedCollatorOptions = {
    val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedCollatorOptions]
  }
  
  @scala.inline
  implicit class ResolvedCollatorOptionsMutableBuilder[Self <: ResolvedCollatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseFirst(value: String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePunctuation(value: Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivity(value: String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
