package typings.senchaTouch.Ext.draw.sprite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IText
  extends StObject
     with ISprite {
  
  /** [Config Option] (String) */
  var font: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Number) */
  var fontSize: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var fontStyle: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var fontVariant: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_IText: js.UndefOr[
    js.Function2[/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], js.Any]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var textAlign: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var textBaseline: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.undefined
}
object IText {
  
  @scala.inline
  def apply(): IText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IText]
  }
  
  @scala.inline
  implicit class ITextMutableBuilder[Self <: IText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: js.Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setRender(value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
