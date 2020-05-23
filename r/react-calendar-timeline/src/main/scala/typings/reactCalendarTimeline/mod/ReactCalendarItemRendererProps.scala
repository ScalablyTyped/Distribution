package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCalendarItemRendererProps[CustomItem /* <: TimelineItemBase[_] */] extends js.Object {
  var item: CustomItem = js.native
  var itemContext: ItemContext = js.native
  def getItemProps(props: GetItemsProps): Key = js.native
  def getResizeProps(): ItemRendererGetResizePropsReturnType = js.native
  def getResizeProps(propsOverride: GetResizeProps): ItemRendererGetResizePropsReturnType = js.native
}

