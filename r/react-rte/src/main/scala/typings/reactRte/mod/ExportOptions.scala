package typings.reactRte.mod

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportOptions extends js.Object {
  
  var blockRenderers: js.UndefOr[StringDictionary[BlockRenderer]] = js.native
  
  var blockStyleFn: js.UndefOr[BlockStyleFn] = js.native
  
  var entityStyleFn: js.UndefOr[EntityStyleFn] = js.native
  
  var inlineStyles: js.UndefOr[StringDictionary[RenderConfig]] = js.native
}
object ExportOptions {
  
  @scala.inline
  def apply(): ExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOptions]
  }
  
  @scala.inline
  implicit class ExportOptionsOps[Self <: ExportOptions] (val x: Self) extends AnyVal {
    
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
    def setBlockRenderers(value: StringDictionary[BlockRenderer]): Self = this.set("blockRenderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockRenderers: Self = this.set("blockRenderers", js.undefined)
    
    @scala.inline
    def setBlockStyleFn(value: /* block */ ContentBlock => RenderConfig): Self = this.set("blockStyleFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlockStyleFn: Self = this.set("blockStyleFn", js.undefined)
    
    @scala.inline
    def setEntityStyleFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any => RenderConfig
    ): Self = this.set("entityStyleFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEntityStyleFn: Self = this.set("entityStyleFn", js.undefined)
    
    @scala.inline
    def setInlineStyles(value: StringDictionary[RenderConfig]): Self = this.set("inlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineStyles: Self = this.set("inlineStyles", js.undefined)
  }
}
