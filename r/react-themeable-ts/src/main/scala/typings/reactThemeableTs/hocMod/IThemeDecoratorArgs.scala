package typings.reactThemeableTs.hocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeDecoratorArgs extends js.Object {
  
  var contextPath: js.UndefOr[String | js.Array[String]] = js.native
  
  var memoizeeOpts: js.UndefOr[js.Any] = js.native
  
  var themeKey: js.UndefOr[String] = js.native
  
  var themeProp: js.UndefOr[String] = js.native
}
object IThemeDecoratorArgs {
  
  @scala.inline
  def apply(): IThemeDecoratorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemeDecoratorArgs]
  }
  
  @scala.inline
  implicit class IThemeDecoratorArgsOps[Self <: IThemeDecoratorArgs] (val x: Self) extends AnyVal {
    
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
    def setContextPathVarargs(value: String*): Self = this.set("contextPath", js.Array(value :_*))
    
    @scala.inline
    def setContextPath(value: String | js.Array[String]): Self = this.set("contextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextPath: Self = this.set("contextPath", js.undefined)
    
    @scala.inline
    def setMemoizeeOpts(value: js.Any): Self = this.set("memoizeeOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoizeeOpts: Self = this.set("memoizeeOpts", js.undefined)
    
    @scala.inline
    def setThemeKey(value: String): Self = this.set("themeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeKey: Self = this.set("themeKey", js.undefined)
    
    @scala.inline
    def setThemeProp(value: String): Self = this.set("themeProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeProp: Self = this.set("themeProp", js.undefined)
  }
}
