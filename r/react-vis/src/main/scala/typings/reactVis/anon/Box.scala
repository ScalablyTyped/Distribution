package typings.reactVis.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box extends js.Object {
  var box: js.UndefOr[CSSProperties] = js.native
  var line: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[CSSProperties] = js.native
}

object Box {
  @scala.inline
  def apply(): Box = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Box]
  }
  @scala.inline
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
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
    def setBox(value: CSSProperties): Self = this.set("box", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    @scala.inline
    def setLine(value: CSSProperties): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setTitle(value: CSSProperties): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

