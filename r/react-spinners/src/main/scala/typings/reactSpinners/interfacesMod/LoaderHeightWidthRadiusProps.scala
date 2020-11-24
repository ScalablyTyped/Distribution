package typings.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderHeightWidthRadiusProps extends LoaderHeightWidthProps {
  
  var margin: js.UndefOr[LengthType] = js.native
  
  var radius: js.UndefOr[LengthType] = js.native
}
object LoaderHeightWidthRadiusProps {
  
  @scala.inline
  def apply(): LoaderHeightWidthRadiusProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderHeightWidthRadiusProps]
  }
  
  @scala.inline
  implicit class LoaderHeightWidthRadiusPropsOps[Self <: LoaderHeightWidthRadiusProps] (val x: Self) extends AnyVal {
    
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
    def setMargin(value: LengthType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setRadius(value: LengthType): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
