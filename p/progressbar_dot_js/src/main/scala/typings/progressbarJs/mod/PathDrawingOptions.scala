package typings.progressbarJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for path drawing
  */
@js.native
trait PathDrawingOptions extends AnimationOptions {
  
  /**
    * Stroke color.
    * @default '#3a3a3a'
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Fill color for the shape. If null, no fill.
    * @default null
    */
  var fill: js.UndefOr[String | Null] = js.native
  
  /**
    * Width of the stroke.
    * Unit is percentage of SVG canvas' size.
    * @desc In Line shape, you should control
    * the stroke width by setting container's height.
    * WARNING: IE doesn't support values over 6, see this bug:
    * @see {@link https://github.com/kimmobrunfeldt/progressbar.js/issues/79}
    * @default 1.0
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  
  /**
    * Inline CSS styles for the created SVG element
    * Set `null` to disable all default styles.
    * You can disable individual defaults by setting them to `null`
    * If you specify anything in this object, none of the default styles apply
    * @default null
    */
  var svgStyle: js.UndefOr[SvgInlineStyle | Null] = js.native
  
  /**
    *  Text element is a <p> element appended to container
    * You can add CSS rules for the text element with the className
    * NOTE: When text is set, 'position: relative' will be set to the container for centering.
    * You can also prevent all default inline styles with 'text.style: null'
    * @default null
    */
  var text: js.UndefOr[TextOptions | Null] = js.native
  
  /**
    * If trail options are not defined, trail won't be drawn
    * Color for lighter trail stroke underneath the actual progress path.
    * @default '#eee'
    */
  var trailColor: js.UndefOr[String] = js.native
  
  /**
    * Width of the trail stroke.
    * Trail is always centered relative to actual progress path.
    * @default 1.0
    */
  var trailWidth: js.UndefOr[Double] = js.native
  
  /**
    * If true, some useful console.warn calls will be done if it seems
    * that progressbar is used incorrectly
    * @default false
    */
  var warnings: js.UndefOr[Boolean] = js.native
}
object PathDrawingOptions {
  
  @scala.inline
  def apply(): PathDrawingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathDrawingOptions]
  }
  
  @scala.inline
  implicit class PathDrawingOptionsOps[Self <: PathDrawingOptions] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillNull: Self = this.set("fill", null)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: SvgInlineStyle): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    
    @scala.inline
    def setSvgStyleNull: Self = this.set("svgStyle", null)
    
    @scala.inline
    def setText(value: TextOptions): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    
    @scala.inline
    def setTrailColor(value: String): Self = this.set("trailColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailColor: Self = this.set("trailColor", js.undefined)
    
    @scala.inline
    def setTrailWidth(value: Double): Self = this.set("trailWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailWidth: Self = this.set("trailWidth", js.undefined)
    
    @scala.inline
    def setWarnings(value: Boolean): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
