package typings.reactBootstrap.glyphiconMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlyphiconProps
  extends AllHTMLAttributes[Glyphicon]
     with ClassAttributes[Glyphicon] {
  
  // Optional
  var bsClass: js.UndefOr[String] = js.native
  
  // Required
  var glyph: String = js.native
}
object GlyphiconProps {
  
  @scala.inline
  def apply(glyph: String): GlyphiconProps = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphiconProps]
  }
  
  @scala.inline
  implicit class GlyphiconPropsOps[Self <: GlyphiconProps] (val x: Self) extends AnyVal {
    
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
    def setGlyph(value: String): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
  }
}
