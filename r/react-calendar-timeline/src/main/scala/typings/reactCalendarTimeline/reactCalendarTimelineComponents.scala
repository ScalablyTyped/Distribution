package typings.reactCalendarTimeline

import typings.react.mod.ComponentType
import typings.reactCalendarTimeline.mod.TimelineGroupBase
import typings.reactCalendarTimeline.mod.TimelineItemBase
import typings.reactCalendarTimeline.mod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactCalendarTimelineComponents extends reactCalendarTimelineProps {
  @scala.inline
  def CursorMarker: ComponentType[CursorMarkerProps] = js.constructorOf[typings.reactCalendarTimeline.mod.CursorMarker].asInstanceOf[ComponentType[CursorMarkerProps]]
  @scala.inline
  def CustomHeader[Data]: ComponentType[CustomHeaderProps[Data]] = js.constructorOf[typings.reactCalendarTimeline.mod.CustomHeader[Data]].asInstanceOf[ComponentType[CustomHeaderProps[Data]]]
  @scala.inline
  def CustomMarker: ComponentType[CustomMarkerProps] = js.constructorOf[typings.reactCalendarTimeline.mod.CustomMarker].asInstanceOf[ComponentType[CustomMarkerProps]]
  @scala.inline
  def DateHeader[Data]: ComponentType[DateHeaderProps[Data]] = js.constructorOf[typings.reactCalendarTimeline.mod.DateHeader[Data]].asInstanceOf[ComponentType[DateHeaderProps[Data]]]
  @scala.inline
  def ReactCalendarTimeline[CustomItem /* <: TimelineItemBase[js.Any] */, CustomGroup /* <: TimelineGroupBase */]: ComponentType[ReactCalendarTimelineProps[CustomItem, CustomGroup]] = (js.constructorOf[default[CustomItem, CustomGroup]]).asInstanceOf[ComponentType[ReactCalendarTimelineProps[CustomItem, CustomGroup]]]
  @scala.inline
  def SidebarHeader[Data]: ComponentType[SidebarHeaderProps[Data]] = js.constructorOf[typings.reactCalendarTimeline.mod.SidebarHeader[Data]].asInstanceOf[ComponentType[SidebarHeaderProps[Data]]]
  @scala.inline
  def TimelineHeader: ComponentType[TimelineHeaderProps] = js.constructorOf[typings.reactCalendarTimeline.mod.TimelineHeader].asInstanceOf[ComponentType[TimelineHeaderProps]]
  @scala.inline
  def TimelineHeaders: ComponentType[TimelineHeadersProps[Element]] = js.constructorOf[typings.reactCalendarTimeline.mod.TimelineHeaders].asInstanceOf[ComponentType[TimelineHeadersProps[Element]]]
  @scala.inline
  def TimelineMarkers: ComponentType[js.Object] = js.constructorOf[typings.reactCalendarTimeline.mod.TimelineMarkers].asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def TodayMarker: ComponentType[TodayMarkerProps] = js.constructorOf[typings.reactCalendarTimeline.mod.TodayMarker].asInstanceOf[ComponentType[TodayMarkerProps]]
}

