package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autocomplete extends StObject {
  
  var autocomplete: String
  
  var lang: Cancel
  
  var onCancel: js.Any
  
  var onChange: js.Any
  
  var onClear: js.Any
  
  var onSubmit: js.Any
  
  var placeholder: String
  
  var searchName: String
}
object Autocomplete {
  
  inline def apply(
    autocomplete: String,
    lang: Cancel,
    onCancel: js.Any,
    onChange: js.Any,
    onClear: js.Any,
    onSubmit: js.Any,
    placeholder: String,
    searchName: String
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClear = onClear.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], searchName = searchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autocomplete]
  }
  
  extension [Self <: Autocomplete](x: Self) {
    
    inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setLang(value: Cancel): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setOnCancel(value: js.Any): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: js.Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnClear(value: js.Any): Self = StObject.set(x, "onClear", value.asInstanceOf[js.Any])
    
    inline def setOnSubmit(value: js.Any): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setSearchName(value: String): Self = StObject.set(x, "searchName", value.asInstanceOf[js.Any])
  }
}
