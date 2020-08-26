package typings.reactNativeDrawerLayout.anon

import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.left
import typings.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Left extends js.Object {
  var Left: left = js.native
  var Right: right = js.native
}

object Left {
  @scala.inline
  def apply(Left: left, Right: right): Left = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  @scala.inline
  implicit class LeftOps[Self <: Left] (val x: Self) extends AnyVal {
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
    def setLeft(value: left): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: right): Self = this.set("Right", value.asInstanceOf[js.Any])
  }
  
}

