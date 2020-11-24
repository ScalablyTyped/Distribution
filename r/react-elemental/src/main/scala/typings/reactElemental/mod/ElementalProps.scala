package typings.reactElemental.mod

import typings.react.mod.ReactNode
import typings.reactElemental.anon.Primary
import typings.reactElemental.anon.PrimaryDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementalProps extends js.Object {
  
  val children: ReactNode = js.native
  
  val colorOpts: js.UndefOr[PrimaryDark] = js.native
  
  val fontOpts: js.UndefOr[Primary] = js.native
}
object ElementalProps {
  
  @scala.inline
  def apply(): ElementalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementalProps]
  }
  
  @scala.inline
  implicit class ElementalPropsOps[Self <: ElementalProps] (val x: Self) extends AnyVal {
    
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
    def setColorOpts(value: PrimaryDark): Self = this.set("colorOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorOpts: Self = this.set("colorOpts", js.undefined)
    
    @scala.inline
    def setFontOpts(value: Primary): Self = this.set("fontOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontOpts: Self = this.set("fontOpts", js.undefined)
  }
}
