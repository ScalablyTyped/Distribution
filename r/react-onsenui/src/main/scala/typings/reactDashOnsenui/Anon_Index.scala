package typings.reactDashOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tabbarId: js.UndefOr[String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(
    index: Int | Double = null,
    modifier: String = null,
    onPostChange: () => Unit = null,
    tabbarId: String = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(js.Any.fromFunction0(onPostChange))
    if (tabbarId != null) __obj.updateDynamic("tabbarId")(tabbarId)
    __obj.asInstanceOf[Anon_Index]
  }
}

