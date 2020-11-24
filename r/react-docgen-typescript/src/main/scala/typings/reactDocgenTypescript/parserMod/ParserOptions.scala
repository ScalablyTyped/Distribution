package typings.reactDocgenTypescript.parserMod

import typings.reactDocgenTypescript.reactDocgenTypescriptBooleans.`false`
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends js.Object {
  
  var componentNameResolver: js.UndefOr[ComponentNameResolver] = js.native
  
  var propFilter: js.UndefOr[StaticPropFilter | PropFilter] = js.native
  
  var savePropValueAsString: js.UndefOr[Boolean] = js.native
  
  var shouldExtractLiteralValuesFromEnum: js.UndefOr[Boolean] = js.native
  
  var shouldExtractValuesFromUnion: js.UndefOr[Boolean] = js.native
  
  var shouldRemoveUndefinedFromOptional: js.UndefOr[Boolean] = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
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
    def setComponentNameResolver(value: (/* exp */ Symbol, /* source */ SourceFile) => js.UndefOr[String | Null | `false`]): Self = this.set("componentNameResolver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComponentNameResolver: Self = this.set("componentNameResolver", js.undefined)
    
    @scala.inline
    def setPropFilterFunction2(value: (/* props */ PropItem, /* component */ Component) => Boolean): Self = this.set("propFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPropFilter(value: StaticPropFilter | PropFilter): Self = this.set("propFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropFilter: Self = this.set("propFilter", js.undefined)
    
    @scala.inline
    def setSavePropValueAsString(value: Boolean): Self = this.set("savePropValueAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavePropValueAsString: Self = this.set("savePropValueAsString", js.undefined)
    
    @scala.inline
    def setShouldExtractLiteralValuesFromEnum(value: Boolean): Self = this.set("shouldExtractLiteralValuesFromEnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldExtractLiteralValuesFromEnum: Self = this.set("shouldExtractLiteralValuesFromEnum", js.undefined)
    
    @scala.inline
    def setShouldExtractValuesFromUnion(value: Boolean): Self = this.set("shouldExtractValuesFromUnion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldExtractValuesFromUnion: Self = this.set("shouldExtractValuesFromUnion", js.undefined)
    
    @scala.inline
    def setShouldRemoveUndefinedFromOptional(value: Boolean): Self = this.set("shouldRemoveUndefinedFromOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRemoveUndefinedFromOptional: Self = this.set("shouldRemoveUndefinedFromOptional", js.undefined)
  }
}
