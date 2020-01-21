package typings.reactCalendarTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CursorMarkerProps = typings.std.Omit[
    typings.reactCalendarTimeline.mod.MarkerProps, 
    typings.reactCalendarTimeline.reactCalendarTimelineStrings.date
  ]
  type GetItemsProps = typings.std.Partial[
    typings.std.Omit[
      typings.reactCalendarTimeline.mod.ItemRendererGetItemPropsReturnType, 
      typings.reactCalendarTimeline.reactCalendarTimelineStrings.key | typings.reactCalendarTimeline.reactCalendarTimelineStrings.ref
    ]
  ]
  type Id = scala.Double | java.lang.String
  type ReactCalendarTimeline[CustomItem /* <: typings.reactCalendarTimeline.mod.TimelineItemBase[_] */, CustomGroup /* <: typings.reactCalendarTimeline.mod.TimelineGroupBase */] = typings.react.mod.Component[
    typings.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup], 
    js.Object, 
    js.Any
  ]
  type TimelineGroup[CustomGroupFields] = typings.reactCalendarTimeline.mod.TimelineGroupBase with CustomGroupFields
  type TimelineItem[CustomItemFields, DateType] = typings.reactCalendarTimeline.mod.TimelineItemBase[DateType] with CustomItemFields
}
