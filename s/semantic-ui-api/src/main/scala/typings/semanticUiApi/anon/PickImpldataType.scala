package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiStrings.html
import typings.semanticUiApi.semanticUiApiStrings.json
import typings.semanticUiApi.semanticUiApiStrings.jsonp
import typings.semanticUiApi.semanticUiApiStrings.script
import typings.semanticUiApi.semanticUiApiStrings.text
import typings.semanticUiApi.semanticUiApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'dataType'> */
trait PickImpldataType extends StObject {
  
  var dataType: xml | json | jsonp | script | html | text
}
object PickImpldataType {
  
  inline def apply(dataType: xml | json | jsonp | script | html | text): PickImpldataType = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldataType]
  }
  
  extension [Self <: PickImpldataType](x: Self) {
    
    inline def setDataType(value: xml | json | jsonp | script | html | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
  }
}
