package typings.reactBase16Styling.anon

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base16Themes extends js.Object {
  
  var base16Themes: js.UndefOr[StringDictionary[Base16Theme]] = js.native
  
  var defaultBase16: js.UndefOr[Base16Theme] = js.native
}
object Base16Themes {
  
  @scala.inline
  def apply(): Base16Themes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base16Themes]
  }
  
  @scala.inline
  implicit class Base16ThemesOps[Self <: Base16Themes] (val x: Self) extends AnyVal {
    
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
    def setBase16Themes(value: StringDictionary[Base16Theme]): Self = this.set("base16Themes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase16Themes: Self = this.set("base16Themes", js.undefined)
    
    @scala.inline
    def setDefaultBase16(value: Base16Theme): Self = this.set("defaultBase16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBase16: Self = this.set("defaultBase16", js.undefined)
  }
}
