package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/github/Github.GithubPickerStylesProps> */
trait PartialGithubPickerStyles extends StObject {
  
  var card: js.UndefOr[CSSProperties] = js.undefined
  
  var triangle: js.UndefOr[CSSProperties] = js.undefined
  
  var triangleShadow: js.UndefOr[CSSProperties] = js.undefined
}
object PartialGithubPickerStyles {
  
  inline def apply(): PartialGithubPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGithubPickerStyles]
  }
  
  extension [Self <: PartialGithubPickerStyles](x: Self) {
    
    inline def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
    
    inline def setTriangleShadow(value: CSSProperties): Self = StObject.set(x, "triangleShadow", value.asInstanceOf[js.Any])
    
    inline def setTriangleShadowUndefined: Self = StObject.set(x, "triangleShadow", js.undefined)
    
    inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
  }
}
