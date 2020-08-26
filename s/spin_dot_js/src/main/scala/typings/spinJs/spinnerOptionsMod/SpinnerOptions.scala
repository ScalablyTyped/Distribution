package typings.spinJs.spinnerOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerOptions extends js.Object {
  /**
    * The animation name used for the spinner lines. Defaults to 'spinner-line-fade-default'.
    */
  var animation: js.UndefOr[String] = js.native
  /**
    * The CSS class to assign to the spinner
    */
  var className: js.UndefOr[String] = js.native
  /**
    * A CSS color string, or array of strings to set the line color
    */
  var color: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Corner roundness (0..1)
    */
  var corners: js.UndefOr[Double] = js.native
  /**
    * 1: clockwise, -1: counterclockwise
    */
  var direction: js.UndefOr[Double] = js.native
  /**
    * A CSS color string, or array of strings to set the color that lines will fade to.
    * Defaults to transparent.
    */
  var fadeColor: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Left position relative to parent (defaults to 50%)
    */
  var left: js.UndefOr[String] = js.native
  /**
    * The length of each line
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The number of lines to draw
    */
  var lines: js.UndefOr[Double] = js.native
  /**
    * Element positioning
    */
  var position: js.UndefOr[String] = js.native
  /**
    * The radius of the inner circle
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * The rotation offset
    */
  var rotate: js.UndefOr[Double] = js.native
  /**
    * Scales overall size of the spinner
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * Whether to render the default shadow (boolean).
    * A string can be used to set a custom box-shadow value.
    */
  var shadow: js.UndefOr[Boolean | String] = js.native
  /**
    * Rounds per second
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * Top position relative to parent (defaults to 50%)
    */
  var top: js.UndefOr[String] = js.native
  /**
    * The line thickness
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The z-index (defaults to 2000000000)
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object SpinnerOptions {
  @scala.inline
  def apply(): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerOptions]
  }
  @scala.inline
  implicit class SpinnerOptionsOps[Self <: SpinnerOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: String | js.Array[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCorners(value: Double): Self = this.set("corners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorners: Self = this.set("corners", js.undefined)
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFadeColorVarargs(value: String*): Self = this.set("fadeColor", js.Array(value :_*))
    @scala.inline
    def setFadeColor(value: String | js.Array[String]): Self = this.set("fadeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeColor: Self = this.set("fadeColor", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setShadow(value: Boolean | String): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

