package typings.reactNative.mod.StyleSheet

import typings.reactNative.reactNativeNumbers.`0`
import typings.reactNative.reactNativeStrings.absolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsoluteFillStyle extends js.Object {
  var bottom: `0` = js.native
  var left: `0` = js.native
  var position: absolute = js.native
  var right: `0` = js.native
  var top: `0` = js.native
}

object AbsoluteFillStyle {
  @scala.inline
  def apply(bottom: `0`, left: `0`, position: absolute, right: `0`, top: `0`): AbsoluteFillStyle = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsoluteFillStyle]
  }
  @scala.inline
  implicit class AbsoluteFillStyleOps[Self <: AbsoluteFillStyle] (val x: Self) extends AnyVal {
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
    def setBottom(value: `0`): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: `0`): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: absolute): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: `0`): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: `0`): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

