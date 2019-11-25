package typings.reactDashNative

import typings.reactDashNative.reactDashNativeMod.SectionListData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Section[ItemT] extends js.Object {
  var section: SectionListData[ItemT]
}

object Anon_Section {
  @scala.inline
  def apply[ItemT](section: SectionListData[ItemT]): Anon_Section[ItemT] = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Section[ItemT]]
  }
}

