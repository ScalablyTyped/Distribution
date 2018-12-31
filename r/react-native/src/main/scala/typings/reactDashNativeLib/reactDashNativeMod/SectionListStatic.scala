package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionListStatic[SectionT]
  extends reactLib.reactMod.ReactNs.ComponentClass[SectionListProps[SectionT], reactLib.reactMod.ReactNs.ComponentState] {
  /**
    * Scrolls to the item at the specified sectionIndex and itemIndex (within the section)
    * positioned in the viewable area such that viewPosition 0 places it at the top
    * (and may be covered by a sticky header), 1 at the bottom, and 0.5 centered in the middle.
    */
  var scrollToLocation: js.UndefOr[js.Function1[/* params */ SectionListScrollParams, scala.Unit]] = js.native
}

