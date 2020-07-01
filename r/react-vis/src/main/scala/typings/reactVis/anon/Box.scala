package typings.reactVis.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var box: js.UndefOr[CSSProperties] = js.undefined
  var line: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[CSSProperties] = js.undefined
}

object Box {
  @scala.inline
  def apply(box: CSSProperties = null, line: CSSProperties = null, title: CSSProperties = null): Box = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
}

