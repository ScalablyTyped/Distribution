package typings.reactNativeWindows.glyphPropsMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlyphProps extends ViewProps {
  
  var colorEnabled: js.UndefOr[Boolean] = js.native
  
  var emSize: js.UndefOr[Double] = js.native
  
  var fontUri: String = js.native
  
  var glyph: String = js.native
  
  @JSName("style")
  var style_GlyphProps: js.UndefOr[StyleProp[GlyphStyle]] = js.native
}
object GlyphProps {
  
  @scala.inline
  def apply(fontUri: String, glyph: String): GlyphProps = {
    val __obj = js.Dynamic.literal(fontUri = fontUri.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphProps]
  }
  
  @scala.inline
  implicit class GlyphPropsOps[Self <: GlyphProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFontUri(value: String): Self = this.set("fontUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyph(value: String): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorEnabled(value: Boolean): Self = this.set("colorEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorEnabled: Self = this.set("colorEnabled", js.undefined)
    
    @scala.inline
    def setEmSize(value: Double): Self = this.set("emSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmSize: Self = this.set("emSize", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[GlyphStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
