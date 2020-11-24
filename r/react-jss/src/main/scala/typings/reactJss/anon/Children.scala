package typings.reactJss.anon

import typings.jss.mod.CreateGenerateIdOptions
import typings.jss.mod.GenerateId
import typings.jss.mod.Jss
import typings.jss.mod.Rule
import typings.jss.mod.SheetsRegistry
import typings.jss.mod.StyleSheet
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var children: ReactNode = js.native
  
  var classNamePrefix: js.UndefOr[String] = js.native
  
  var disableStylesGeneration: js.UndefOr[Boolean] = js.native
  
  var generateId: js.UndefOr[GenerateId] = js.native
  
  var id: js.UndefOr[CreateGenerateIdOptions] = js.native
  
  var jss: js.UndefOr[Jss] = js.native
  
  var registry: js.UndefOr[SheetsRegistry] = js.native
}
object Children {
  
  @scala.inline
  def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassNamePrefix(value: String): Self = this.set("classNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNamePrefix: Self = this.set("classNamePrefix", js.undefined)
    
    @scala.inline
    def setDisableStylesGeneration(value: Boolean): Self = this.set("disableStylesGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStylesGeneration: Self = this.set("disableStylesGeneration", js.undefined)
    
    @scala.inline
    def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = this.set("generateId", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGenerateId: Self = this.set("generateId", js.undefined)
    
    @scala.inline
    def setId(value: CreateGenerateIdOptions): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setJss(value: Jss): Self = this.set("jss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJss: Self = this.set("jss", js.undefined)
    
    @scala.inline
    def setRegistry(value: SheetsRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
  }
}
