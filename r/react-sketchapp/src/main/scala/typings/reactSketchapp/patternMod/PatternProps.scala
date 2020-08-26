package typings.reactSketchapp.patternMod

import typings.react.mod.ReactNode
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typings.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
  var patternContentUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.native
  var patternTransform: js.UndefOr[String] = js.native
  var patternUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.native
  var x1: js.UndefOr[NumberProp] = js.native
  var x2: js.UndefOr[NumberProp] = js.native
  var y1: js.UndefOr[NumberProp] = js.native
  var y2: js.UndefOr[NumberProp] = js.native
}

object PatternProps {
  @scala.inline
  def apply(): PatternProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternProps]
  }
  @scala.inline
  implicit class PatternPropsOps[Self <: PatternProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setPatternContentUnits(value: userSpaceOnUse | objectBoundingBox): Self = this.set("patternContentUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternContentUnits: Self = this.set("patternContentUnits", js.undefined)
    @scala.inline
    def setPatternTransform(value: String): Self = this.set("patternTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternTransform: Self = this.set("patternTransform", js.undefined)
    @scala.inline
    def setPatternUnits(value: userSpaceOnUse | objectBoundingBox): Self = this.set("patternUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternUnits: Self = this.set("patternUnits", js.undefined)
    @scala.inline
    def setX1(value: NumberProp): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    @scala.inline
    def setX2(value: NumberProp): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    @scala.inline
    def setY1(value: NumberProp): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    @scala.inline
    def setY2(value: NumberProp): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
  
}

