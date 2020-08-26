package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOutputProps
  extends /* otherProps */ StringDictionary[js.Any] {
  var className: String = js.native
  var key: js.UndefOr[Key] = js.native
  var style: js.UndefOr[StyleObj] = js.native
}

object LineOutputProps {
  @scala.inline
  def apply(className: String): LineOutputProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOutputProps]
  }
  @scala.inline
  implicit class LineOutputPropsOps[Self <: LineOutputProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setStyle(value: StyleObj): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

