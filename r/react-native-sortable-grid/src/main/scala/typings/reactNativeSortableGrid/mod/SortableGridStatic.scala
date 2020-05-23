package typings.reactNativeSortableGrid.mod

import typings.react.mod.ClassicComponentClass
import typings.reactNativeSortableGrid.anon.DeleteModeOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableGridStatic extends ClassicComponentClass[SortableGridProps] {
  /**
    * Calling this will toggle item deletion mode on/off.
    */
  def toggleDeleteMode(): DeleteModeOn = js.native
}

