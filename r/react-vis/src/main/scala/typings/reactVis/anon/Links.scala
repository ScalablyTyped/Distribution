package typings.reactVis.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Links extends js.Object {
  var labels: js.UndefOr[CSSProperties] = js.undefined
  var links: js.UndefOr[CSSProperties] = js.undefined
  var rects: js.UndefOr[CSSProperties] = js.undefined
}

object Links {
  @scala.inline
  def apply(labels: CSSProperties = null, links: CSSProperties = null, rects: CSSProperties = null): Links = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (rects != null) __obj.updateDynamic("rects")(rects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
}

