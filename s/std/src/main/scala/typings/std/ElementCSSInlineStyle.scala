package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementCSSInlineStyle extends StObject {
  
  /* standard dom */
  val attributeStyleMap: StylePropertyMap
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style) */
  /* standard dom */
  val style: CSSStyleDeclaration
}
object ElementCSSInlineStyle {
  
  inline def apply(attributeStyleMap: StylePropertyMap, style: CSSStyleDeclaration): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(attributeStyleMap = attributeStyleMap.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementCSSInlineStyle] (val x: Self) extends AnyVal {
    
    inline def setAttributeStyleMap(value: StylePropertyMap): Self = StObject.set(x, "attributeStyleMap", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
