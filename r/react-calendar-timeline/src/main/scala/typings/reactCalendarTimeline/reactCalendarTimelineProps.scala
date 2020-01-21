package typings.reactCalendarTimeline

import typings.react.mod.HTMLAttributes
import typings.reactCalendarTimeline.mod.MarkerProps
import typings.reactCalendarTimeline.mod.TimelineGroupBase
import typings.reactCalendarTimeline.mod.TimelineItemBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactCalendarTimelineProps {
  type CursorMarkerProps = typings.reactCalendarTimeline.mod.CursorMarkerProps
  type CustomHeaderProps[Data] = typings.reactCalendarTimeline.mod.CustomHeaderProps[Data]
  @scala.inline
  def CustomMarkerProps: MarkerProps.type = typings.reactCalendarTimeline.mod.MarkerProps
  type CustomMarkerProps = MarkerProps
  @scala.inline
  def DateHeaderProps: typings.reactCalendarTimeline.mod.DateHeaderProps.type = typings.reactCalendarTimeline.mod.DateHeaderProps
  type DateHeaderProps[Data] = typings.reactCalendarTimeline.mod.DateHeaderProps[Data]
  @scala.inline
  def ReactCalendarTimelineProps: typings.reactCalendarTimeline.mod.ReactCalendarTimelineProps.type = typings.reactCalendarTimeline.mod.ReactCalendarTimelineProps
  type ReactCalendarTimelineProps[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] = typings.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup]
  @scala.inline
  def SidebarHeaderProps: typings.reactCalendarTimeline.mod.SidebarHeaderProps.type = typings.reactCalendarTimeline.mod.SidebarHeaderProps
  type SidebarHeaderProps[Data] = typings.reactCalendarTimeline.mod.SidebarHeaderProps[Data]
  @scala.inline
  def TimelineHeaderProps: typings.reactCalendarTimeline.mod.TimelineHeaderProps.type = typings.reactCalendarTimeline.mod.TimelineHeaderProps
  type TimelineHeaderProps = typings.reactCalendarTimeline.mod.TimelineHeaderProps
  @scala.inline
  def TimelineHeadersProps: HTMLAttributes.type = typings.react.mod.HTMLAttributes
  type TimelineHeadersProps[T] = HTMLAttributes[T]
  @scala.inline
  def TodayMarkerProps: typings.reactCalendarTimeline.mod.TodayMarkerProps.type = typings.reactCalendarTimeline.mod.TodayMarkerProps
  type TodayMarkerProps = typings.reactCalendarTimeline.mod.TodayMarkerProps
}

