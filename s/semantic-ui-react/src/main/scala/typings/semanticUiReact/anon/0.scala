package typings.semanticUiReact.anon

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.ShorthandRenderFunction
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[TProps /* <: Record[String, _] */] extends js.Object {
  
  // Not all TProps can have `children`, without this condition it will match to "any"
  var children: js.UndefOr[
    (ShorthandRenderFunction[ElementType[TProps], TProps]) | (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any)
  ] = js.native
}
object `0` {
  
  @scala.inline
  def apply[TProps /* <: Record[String, _] */](): `0`[TProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[TProps]]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], TProps /* <: Record[String, _] */] (val x: Self with `0`[TProps]) extends AnyVal {
    
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
    def setChildrenFunction2(value: (ElementType[TProps], TProps) => ReactNode): Self = this.set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildren(
      value: (ShorthandRenderFunction[ElementType[TProps], TProps]) | (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any)
    ): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
