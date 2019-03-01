package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var onPostChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var tabbarId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(
    index: scala.Int | scala.Double = null,
    modifier: java.lang.String = null,
    onPostChange: js.Function0[scala.Unit] = null,
    tabbarId: java.lang.String = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(onPostChange)
    if (tabbarId != null) __obj.updateDynamic("tabbarId")(tabbarId)
    __obj.asInstanceOf[Anon_Index]
  }
}

