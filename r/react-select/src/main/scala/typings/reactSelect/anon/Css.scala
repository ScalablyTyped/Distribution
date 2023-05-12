package typings.reactSelect.anon

import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  var className: String
  
  var css: CSSObjectWithLabel
}
object Css {
  
  inline def apply(className: String, css: CSSObjectWithLabel): Css = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCss(value: CSSObjectWithLabel): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
  }
}
