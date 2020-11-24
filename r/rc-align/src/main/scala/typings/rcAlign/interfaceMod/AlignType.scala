package typings.rcAlign.interfaceMod

import typings.rcAlign.anon.AdjustX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignType extends js.Object {
  
  /**
    * offset source node by offset[0] in x and offset[1] in y.
    * If offset contains percentage string value, it is relative to sourceNode region.
    */
  var offset: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * If adjustX field is true, will adjust source node in x direction if source node is invisible.
    * If adjustY field is true, will adjust source node in y direction if source node is invisible.
    */
  var overflow: js.UndefOr[AdjustX] = js.native
  
  /**
    * move point of source node to align with point of target node.
    * Such as ['tr','cc'], align top right point of source node with center point of target node.
    * Point can be 't'(top), 'b'(bottom), 'c'(center), 'l'(left), 'r'(right) */
  var points: js.UndefOr[js.Array[AlignPoint]] = js.native
  
  /**
    * offset target node by offset[0] in x and offset[1] in y.
    * If targetOffset contains percentage string value, it is relative to targetNode region.
    */
  var targetOffset: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Whether use css bottom instead of top to position
    */
  var useCssBottom: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether use css right instead of left to position
    */
  var useCssRight: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether use css transform instead of left/top/right/bottom to position if browser supports.
    * Defaults to false.
    */
  var useCssTransform: js.UndefOr[Boolean] = js.native
}
object AlignType {
  
  @scala.inline
  def apply(): AlignType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignType]
  }
  
  @scala.inline
  implicit class AlignTypeOps[Self <: AlignType] (val x: Self) extends AnyVal {
    
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
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOverflow(value: AdjustX): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AlignPoint*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[AlignPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setTargetOffsetVarargs(value: Double*): Self = this.set("targetOffset", js.Array(value :_*))
    
    @scala.inline
    def setTargetOffset(value: js.Array[Double]): Self = this.set("targetOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOffset: Self = this.set("targetOffset", js.undefined)
    
    @scala.inline
    def setUseCssBottom(value: Boolean): Self = this.set("useCssBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCssBottom: Self = this.set("useCssBottom", js.undefined)
    
    @scala.inline
    def setUseCssRight(value: Boolean): Self = this.set("useCssRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCssRight: Self = this.set("useCssRight", js.undefined)
    
    @scala.inline
    def setUseCssTransform(value: Boolean): Self = this.set("useCssTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCssTransform: Self = this.set("useCssTransform", js.undefined)
  }
}
