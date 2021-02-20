package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prismReactRenderer.prismReactRendererStrings.`100`
import typings.prismReactRenderer.prismReactRendererStrings.`200`
import typings.prismReactRenderer.prismReactRendererStrings.`300`
import typings.prismReactRenderer.prismReactRendererStrings.`400`
import typings.prismReactRenderer.prismReactRendererStrings.`500`
import typings.prismReactRenderer.prismReactRendererStrings.`600`
import typings.prismReactRenderer.prismReactRendererStrings.`700`
import typings.prismReactRenderer.prismReactRendererStrings.`800`
import typings.prismReactRenderer.prismReactRendererStrings.`900`
import typings.prismReactRenderer.prismReactRendererStrings.`line-through`
import typings.prismReactRenderer.prismReactRendererStrings.`underline line-through`
import typings.prismReactRenderer.prismReactRendererStrings.bold
import typings.prismReactRenderer.prismReactRendererStrings.italic
import typings.prismReactRenderer.prismReactRendererStrings.none
import typings.prismReactRenderer.prismReactRendererStrings.normal
import typings.prismReactRenderer.prismReactRendererStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrismThemeEntry extends /* styleKey */ StringDictionary[String | Double | Unit] {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var fontStyle: js.UndefOr[normal | italic] = js.native
  
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.native
}
object PrismThemeEntry {
  
  @scala.inline
  def apply(): PrismThemeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrismThemeEntry]
  }
  
  @scala.inline
  implicit class PrismThemeEntryMutableBuilder[Self <: PrismThemeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setTextDecorationLine(value: none | underline | `line-through` | (`underline line-through`)): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
  }
}
