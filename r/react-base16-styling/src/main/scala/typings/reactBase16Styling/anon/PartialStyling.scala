package typings.reactBase16Styling.anon

import typings.csstype.mod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-base16-styling.react-base16-styling/lib/types.Styling> */
@js.native
trait PartialStyling extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[Properties[String | Double]] = js.native
}
object PartialStyling {
  
  @scala.inline
  def apply(): PartialStyling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyling]
  }
  
  @scala.inline
  implicit class PartialStylingOps[Self <: PartialStyling] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setStyle(value: Properties[String | Double]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
