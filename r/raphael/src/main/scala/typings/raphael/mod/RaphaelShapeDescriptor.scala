package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<raphael.raphael.RaphaelAttributes> */
@js.native
trait RaphaelShapeDescriptor extends js.Object {
  
  var `arrow-end`: js.UndefOr[String] = js.native
  
  var `clip-rect`: js.UndefOr[String] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var cx: js.UndefOr[Double] = js.native
  
  var cy: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var `fill-opacity`: js.UndefOr[Double] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var `font-family`: js.UndefOr[String] = js.native
  
  var `font-size`: js.UndefOr[Double | String] = js.native
  
  var `font-weight`: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var r: js.UndefOr[Double] = js.native
  
  var rx: js.UndefOr[Double] = js.native
  
  var ry: js.UndefOr[Double] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var `stroke-dasharray`: js.UndefOr[RaphaelDashArrayType] = js.native
  
  var `stroke-linecap`: js.UndefOr[RaphaelLineCapType] = js.native
  
  var `stroke-linejoin`: js.UndefOr[RaphaelLineJoinType] = js.native
  
  var `stroke-miterlimit`: js.UndefOr[Double] = js.native
  
  var `stroke-opacity`: js.UndefOr[Double] = js.native
  
  var `stroke-width`: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `text-anchor`: js.UndefOr[RaphaelTextAnchorType] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var transform: js.UndefOr[String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]] = js.native
  
  /** Type of the shape, e.g. `circle` or `rect`. Could also be a custom plugin shape. */
  var `type`: RaphaelShapeType | String = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object RaphaelShapeDescriptor {
  
  @scala.inline
  def apply(`type`: RaphaelShapeType | String): RaphaelShapeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelShapeDescriptor]
  }
  
  @scala.inline
  implicit class RaphaelShapeDescriptorOps[Self <: RaphaelShapeDescriptor] (val x: Self) extends AnyVal {
    
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
    def setType(value: RaphaelShapeType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setArrow-end`(value: String): Self = this.set("arrow-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteArrow-end`: Self = this.set("arrow-end", js.undefined)
    
    @scala.inline
    def `setClip-rect`(value: String): Self = this.set("clip-rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteClip-rect`: Self = this.set("clip-rect", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def `setFill-opacity`(value: Double): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: Double | String): Self = this.set("font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: String): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def `setStroke-dasharray`(value: RaphaelDashArrayType): Self = this.set("stroke-dasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-dasharray`: Self = this.set("stroke-dasharray", js.undefined)
    
    @scala.inline
    def `setStroke-linecap`(value: RaphaelLineCapType): Self = this.set("stroke-linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-linecap`: Self = this.set("stroke-linecap", js.undefined)
    
    @scala.inline
    def `setStroke-linejoin`(value: RaphaelLineJoinType): Self = this.set("stroke-linejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-linejoin`: Self = this.set("stroke-linejoin", js.undefined)
    
    @scala.inline
    def `setStroke-miterlimit`(value: Double): Self = this.set("stroke-miterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-miterlimit`: Self = this.set("stroke-miterlimit", js.undefined)
    
    @scala.inline
    def `setStroke-opacity`(value: Double): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-opacity`: Self = this.set("stroke-opacity", js.undefined)
    
    @scala.inline
    def `setStroke-width`(value: Double): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def `setText-anchor`(value: RaphaelTextAnchorType): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: RaphaelTransformSegment*): Self = this.set("transform", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
