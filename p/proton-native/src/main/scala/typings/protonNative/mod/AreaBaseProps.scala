package typings.protonNative.mod

import typings.protonNative.protonNativeStrings.bevel
import typings.protonNative.protonNativeStrings.flat
import typings.protonNative.protonNativeStrings.miter
import typings.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaBaseProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The fill color for the component.
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * The opacity of the fill (between 0 and 1). Gets multiplied with the fill colors alpha value.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * The stroke (line) color for the component.
    */
  var stroke: js.UndefOr[String] = js.native
  var strokeLinecap: js.UndefOr[flat | round | bevel] = js.native
  var strokeLinejoin: js.UndefOr[miter | round | bevel] = js.native
  /**
    * How far to extend the stroke at a sharp corner when using `strokeLinejoin='miter'`
    * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-miterlimit
    * for a more detailed explanation.
    */
  var strokeMiterlimit: js.UndefOr[Double] = js.native
  /**
    * The opacity of the stroke (between 0 and 1). Gets multiplied with the stroke colors alpha value.
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  /**
    * List of transformations to apply to the component (are quite similar to SVG transformations). Example for multiple transformations: `transform="translate(100, 100) rotate(90)"`.
    *
    * All x and y coordinates specified in a transformation are relative _to the component itself_, meaning that `translate(-50%, 0)` will translate the component by 50% of it's own width to left.
    */
  var transform: js.UndefOr[String] = js.native
}

object AreaBaseProps {
  @scala.inline
  def apply(): AreaBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaBaseProps]
  }
  @scala.inline
  implicit class AreaBasePropsOps[Self <: AreaBaseProps] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: flat | round | bevel): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeLinejoin(value: miter | round | bevel): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    @scala.inline
    def setStrokeMiterlimit(value: Double): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

