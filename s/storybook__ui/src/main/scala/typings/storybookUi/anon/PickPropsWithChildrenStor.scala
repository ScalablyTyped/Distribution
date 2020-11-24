package typings.storybookUi.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.PropsWithChildren<@storybook/components.@storybook/components/dist/brand/StorybookLogo.StorybookLogoProps>, 'children' | 'alt'> */
@js.native
trait PickPropsWithChildrenStor extends js.Object {
  
  var alt: String = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
}
object PickPropsWithChildrenStor {
  
  @scala.inline
  def apply(alt: String): PickPropsWithChildrenStor = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsWithChildrenStor]
  }
  
  @scala.inline
  implicit class PickPropsWithChildrenStorOps[Self <: PickPropsWithChildrenStor] (val x: Self) extends AnyVal {
    
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
