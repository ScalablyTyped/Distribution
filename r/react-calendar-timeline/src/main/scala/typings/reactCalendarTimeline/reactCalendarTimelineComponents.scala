package typings.reactCalendarTimeline

import typings.react.mod.ComponentType
import typings.reactCalendarTimeline.mod.TimelineGroupBase
import typings.reactCalendarTimeline.mod.TimelineItemBase
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactCalendarTimelineComponents extends reactCalendarTimelineProps {
  @scala.inline
  def CursorMarker: ComponentType[CursorMarkerProps] = js.constructorOf[typings.reactCalendarTimeline.mod.CursorMarker].asInstanceOf[typings.react.mod.ComponentType[CursorMarkerProps]]
  @scala.inline
  def CustomHeader[Data]: ComponentType[CustomHeaderProps[Data]] = js.constructorOf[typings.reactCalendarTimeline.mod.CustomHeader[Data]].asInstanceOf[typings.react.mod.ComponentType[CustomHeaderProps[Data]]]
  @scala.inline
  def CustomMarker: ComponentType[CustomMarkerProps] = js.constructorOf[typings.reactCalendarTimeline.mod.CustomMarker].asInstanceOf[typings.react.mod.ComponentType[CustomMarkerProps]]
  @scala.inline
  def DateHeader[Data]: ComponentType[DateHeaderProps[Data]] = js.constructorOf[typings.reactCalendarTimeline.mod.DateHeader[Data]].asInstanceOf[typings.react.mod.ComponentType[DateHeaderProps[Data]]]
  @scala.inline
  def ReactCalendarTimeline[CustomItem /* <: TimelineItemBase[js.Any] */, CustomGroup /* <: TimelineGroupBase */]: ComponentType[ReactCalendarTimelineProps[CustomItem, CustomGroup]] = js.constructorOf[typings.reactCalendarTimeline.mod.default[CustomItem, CustomGroup]].asInstanceOf[typings.react.mod.ComponentType[ReactCalendarTimelineProps[CustomItem, CustomGroup]]]
  @scala.inline
  def SidebarHeader[Data]: ComponentType[SidebarHeaderProps[Data]] = js.constructorOf[typings.reactCalendarTimeline.mod.SidebarHeader[Data]].asInstanceOf[typings.react.mod.ComponentType[SidebarHeaderProps[Data]]]
  @scala.inline
  def TimelineHeader: ComponentType[TimelineHeaderProps] = js.constructorOf[typings.reactCalendarTimeline.mod.TimelineHeader].asInstanceOf[typings.react.mod.ComponentType[TimelineHeaderProps]]
  @scala.inline
  def TimelineHeaders: ComponentType[TimelineHeadersProps[Element]] = js.constructorOf[typings.reactCalendarTimeline.mod.TimelineHeaders].asInstanceOf[typings.react.mod.ComponentType[TimelineHeadersProps[typings.std.Element]]]
  @scala.inline
  def TimelineMarkers: ComponentType[js.Object] = js.constructorOf[typings.reactCalendarTimeline.mod.TimelineMarkers].asInstanceOf[typings.react.mod.ComponentType[js.Object]]
  @scala.inline
  def TodayMarker: ComponentType[TodayMarkerProps] = js.constructorOf[typings.reactCalendarTimeline.mod.TodayMarker].asInstanceOf[typings.react.mod.ComponentType[TodayMarkerProps]]
}

