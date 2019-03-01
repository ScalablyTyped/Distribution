package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Section[ItemT] extends js.Object {
  var section: reactDashNativeLib.reactDashNativeMod.SectionListData[ItemT]
}

object Anon_Section {
  @scala.inline
  def apply[ItemT](section: reactDashNativeLib.reactDashNativeMod.SectionListData[ItemT]): Anon_Section[ItemT] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("section")(section)
    __obj.asInstanceOf[Anon_Section[ItemT]]
  }
}

