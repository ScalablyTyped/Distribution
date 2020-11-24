package typings.reactMdIcon.iconProviderMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconProviderProps extends ConfigurableIcons {
  
  /**
    * The children that should inherit the icon provider context. This is
    * required since this component is pretty much worthless to use if you don't
    * inherit the overridden icons.
    */
  var children: ReactNode = js.native
}
object IconProviderProps {
  
  @scala.inline
  def apply(): IconProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconProviderProps]
  }
  
  @scala.inline
  implicit class IconProviderPropsOps[Self <: IconProviderProps] (val x: Self) extends AnyVal {
    
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
  }
}
