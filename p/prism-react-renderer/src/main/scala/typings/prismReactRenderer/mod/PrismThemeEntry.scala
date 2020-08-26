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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class PrismThemeEntryOps[Self <: PrismThemeEntry] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontStyle(value: normal | italic): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setTextDecorationLine(value: none | underline | `line-through` | (`underline line-through`)): Self = this.set("textDecorationLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecorationLine: Self = this.set("textDecorationLine", js.undefined)
  }
  
}

