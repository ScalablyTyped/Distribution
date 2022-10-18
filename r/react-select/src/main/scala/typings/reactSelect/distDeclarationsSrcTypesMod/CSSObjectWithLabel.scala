package typings.reactSelect.distDeclarationsSrcTypesMod

import typings.emotionSerialize.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSObjectWithLabel
  extends StObject
     with CSSObject {
  
  var label: js.UndefOr[String] = js.undefined
}
object CSSObjectWithLabel {
  
  inline def apply(): CSSObjectWithLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObjectWithLabel]
  }
  
  extension [Self <: CSSObjectWithLabel](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
