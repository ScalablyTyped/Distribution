package typings.reactDashCalendarDashTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCalendarDashTimelineMod {
  import typings.react.reactMod.Component
  import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.date
  import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.key
  import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.ref
  import typings.std.Omit
  import typings.std.Partial

  type CursorMarkerProps = Omit[MarkerProps, date]
  type GetItemsProps = Partial[Omit[ItemRendererGetItemPropsReturnType, key | ref]]
  type Id = Double | String
  type ReactCalendarTimeline[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] = Component[ReactCalendarTimelineProps[CustomItem, CustomGroup], js.Object, js.Any]
  type TimelineGroup[CustomGroupFields] = TimelineGroupBase with CustomGroupFields
  type TimelineItem[CustomItemFields, DateType] = TimelineItemBase[DateType] with CustomItemFields
}
