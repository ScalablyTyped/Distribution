package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def defaultHeaderFormats: typings.reactCalendarTimeline.mod.LabelFormat = typings.reactCalendarTimeline.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultHeaderFormats").asInstanceOf[typings.reactCalendarTimeline.mod.LabelFormat]

@scala.inline
def defaultKeys: typings.reactCalendarTimeline.mod.TimelineKeys = typings.reactCalendarTimeline.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultKeys").asInstanceOf[typings.reactCalendarTimeline.mod.TimelineKeys]

@scala.inline
def defaultTimeSteps: typings.reactCalendarTimeline.mod.TimelineTimeSteps = typings.reactCalendarTimeline.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTimeSteps").asInstanceOf[typings.reactCalendarTimeline.mod.TimelineTimeSteps]

type Id = scala.Double | java.lang.String

type ReactCalendarTimeline[CustomItem /* <: typings.reactCalendarTimeline.mod.TimelineItemBase[js.Any] */, CustomGroup /* <: typings.reactCalendarTimeline.mod.TimelineGroupBase */] = typings.react.mod.Component[
typings.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup], 
js.Object, 
js.Any]

type TimelineGroup[CustomGroupFields] = typings.reactCalendarTimeline.mod.TimelineGroupBase & CustomGroupFields

type TimelineHeaderProps = typings.reactCalendarTimeline.mod.TimelineHeadersProps

type TimelineItem[CustomItemFields, DateType] = typings.reactCalendarTimeline.mod.TimelineItemBase[DateType] & CustomItemFields
