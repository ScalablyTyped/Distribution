package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskProps
  extends TransformProps
     with FillProps
     with StrokeProps
     with ClipProps
     with VectorEffectProps
     with ResponderProps
     with TouchableProps
     with DefinitionProps
     with CommonMarkerProps
     with CommonMaskProps {
  
  var height: js.UndefOr[NumberProp] = js.native
  
  var maskContentUnits: js.UndefOr[TMaskUnits] = js.native
  
  var maskTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.native
  
  var maskUnits: js.UndefOr[TMaskUnits] = js.native
  
  var width: js.UndefOr[NumberProp] = js.native
  
  @JSName("x")
  var x_MaskProps: js.UndefOr[NumberProp] = js.native
  
  @JSName("y")
  var y_MaskProps: js.UndefOr[NumberProp] = js.native
}
object MaskProps {
  
  @scala.inline
  def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  
  @scala.inline
  implicit class MaskPropsOps[Self <: MaskProps] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: NumberProp): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaskContentUnits(value: TMaskUnits): Self = this.set("maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskContentUnits: Self = this.set("maskContentUnits", js.undefined)
    
    @scala.inline
    def setMaskTransform(value: ColumnMajorTransformMatrix | String): Self = this.set("maskTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskTransform: Self = this.set("maskTransform", js.undefined)
    
    @scala.inline
    def setMaskUnits(value: TMaskUnits): Self = this.set("maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskUnits: Self = this.set("maskUnits", js.undefined)
    
    @scala.inline
    def setWidth(value: NumberProp): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: NumberProp): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: NumberProp): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
