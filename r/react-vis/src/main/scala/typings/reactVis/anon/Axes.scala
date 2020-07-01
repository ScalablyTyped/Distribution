package typings.reactVis.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axes extends js.Object {
  var axes: js.UndefOr[CSSProperties] = js.undefined
  var labels: js.UndefOr[CSSProperties] = js.undefined
  var polygons: js.UndefOr[CSSProperties] = js.undefined
}

object Axes {
  @scala.inline
  def apply(axes: CSSProperties = null, labels: CSSProperties = null, polygons: CSSProperties = null): Axes = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (polygons != null) __obj.updateDynamic("polygons")(polygons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axes]
  }
}

