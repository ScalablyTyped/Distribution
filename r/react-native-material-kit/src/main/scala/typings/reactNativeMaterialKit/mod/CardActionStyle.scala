package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.dashed
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.dotted
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardActionStyle extends js.Object {
  
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.native
  
  var borderTopColor: js.UndefOr[String] = js.native
  
  var borderTopWidth: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Double] = js.native
}
object CardActionStyle {
  
  @scala.inline
  def apply(): CardActionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardActionStyle]
  }
  
  @scala.inline
  implicit class CardActionStyleOps[Self <: CardActionStyle] (val x: Self) extends AnyVal {
    
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
    def setBorderStyle(value: solid | dotted | dashed): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    
    @scala.inline
    def setBorderTopColor(value: String): Self = this.set("borderTopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopColor: Self = this.set("borderTopColor", js.undefined)
    
    @scala.inline
    def setBorderTopWidth(value: Double): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopWidth: Self = this.set("borderTopWidth", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
}
