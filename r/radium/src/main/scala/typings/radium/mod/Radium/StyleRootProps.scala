package typings.radium.mod.Radium

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleRootProps
  extends AllHTMLAttributes[StyleRoot]
     with ClassAttributes[StyleRoot] {
  
  var radiumConfig: js.UndefOr[RadiumConfig] = js.native
}
object StyleRootProps {
  
  @scala.inline
  def apply(): StyleRootProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleRootProps]
  }
  
  @scala.inline
  implicit class StyleRootPropsOps[Self <: StyleRootProps] (val x: Self) extends AnyVal {
    
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
    def setRadiumConfig(value: RadiumConfig): Self = this.set("radiumConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiumConfig: Self = this.set("radiumConfig", js.undefined)
  }
}
