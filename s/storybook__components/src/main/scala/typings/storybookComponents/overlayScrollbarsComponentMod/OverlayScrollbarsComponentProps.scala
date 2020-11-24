package typings.storybookComponents.overlayScrollbarsComponentMod

import typings.overlayscrollbars.mod.Extensions
import typings.overlayscrollbars.mod.Options
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayScrollbarsComponentProps extends HTMLAttributes[HTMLDivElement] {
  
  @JSName("children")
  var children_OverlayScrollbarsComponentProps: js.UndefOr[js.Any] = js.native
  
  var extensions: js.UndefOr[Extensions] = js.native
  
  var options: js.UndefOr[Options] = js.native
}
object OverlayScrollbarsComponentProps {
  
  @scala.inline
  def apply(): OverlayScrollbarsComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayScrollbarsComponentProps]
  }
  
  @scala.inline
  implicit class OverlayScrollbarsComponentPropsOps[Self <: OverlayScrollbarsComponentProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: Extensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
