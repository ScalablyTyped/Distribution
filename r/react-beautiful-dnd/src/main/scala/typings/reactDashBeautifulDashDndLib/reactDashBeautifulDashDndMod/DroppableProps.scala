package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DroppableProps extends js.Object {
  var direction: js.UndefOr[
    reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.vertical | reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.horizontal
  ] = js.undefined
  var droppableId: DroppableId
  var ignoreContainerClipping: js.UndefOr[scala.Boolean] = js.undefined
  var isDropDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[TypeId] = js.undefined
  def children(provided: DroppableProvided, snapshot: DroppableStateSnapshot): reactLib.reactMod.ReactNs.ReactElement[_]
}

