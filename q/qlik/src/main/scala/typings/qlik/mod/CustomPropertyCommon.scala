package typings.qlik.mod

import typings.qlik.qlikStrings.array
import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.integer
import typings.qlik.qlikStrings.items
import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyCommon extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[Boolean | ShowFunction] = js.undefined
  
  var `type`: js.UndefOr[string | integer | number | array | boolean | items] = js.undefined
}
object CustomPropertyCommon {
  
  @scala.inline
  def apply(): CustomPropertyCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyCommon]
  }
  
  @scala.inline
  implicit class CustomPropertyCommonMutableBuilder[Self <: CustomPropertyCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean | ShowFunction): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFunction3(
      value: (/* layout */ Layout, /* cls */ js.Any, /* obj */ js.Any) => Boolean | (js.Function1[/* measure */ NxMeasure, Boolean])
    ): Self = StObject.set(x, "show", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setType(value: string | integer | number | array | boolean | items): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
