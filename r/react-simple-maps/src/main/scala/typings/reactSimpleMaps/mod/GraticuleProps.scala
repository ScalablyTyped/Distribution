package typings.reactSimpleMaps.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.SVGAttributes
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraticuleProps
  extends SVGAttributes[SVGPathElement]
     with ClassAttributes[SVGPathElement] {
  /**
    * @default [10, 10]
    */
  var step: js.UndefOr[Point] = js.native
}

object GraticuleProps {
  @scala.inline
  def apply(): GraticuleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraticuleProps]
  }
  @scala.inline
  implicit class GraticulePropsOps[Self <: GraticuleProps] (val x: Self) extends AnyVal {
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
    def setStep(value: Point): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

