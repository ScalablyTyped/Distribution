package typings.reactColor.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/github/Github.GithubPickerStylesProps> */
@js.native
trait PartialGithubPickerStyles extends StObject {
  
  var card: js.UndefOr[CSSProperties] = js.native
  
  var triangle: js.UndefOr[CSSProperties] = js.native
  
  var triangleShadow: js.UndefOr[CSSProperties] = js.native
}
object PartialGithubPickerStyles {
  
  @scala.inline
  def apply(): PartialGithubPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGithubPickerStyles]
  }
  
  @scala.inline
  implicit class PartialGithubPickerStylesMutableBuilder[Self <: PartialGithubPickerStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleShadow(value: CSSProperties): Self = StObject.set(x, "triangleShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleShadowUndefined: Self = StObject.set(x, "triangleShadow", js.undefined)
    
    @scala.inline
    def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
  }
}
