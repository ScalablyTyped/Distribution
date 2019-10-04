package typings.reactDashCalendarDashTimeline

import typings.react.reactMod.HTMLAttributes
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.MarkerProps
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.ReactCalendarTimelineProps
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineGroupBase
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineItemBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashCalendarDashTimelineProps {
  type CursorMarkerProps = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.CursorMarkerProps
  type CustomHeaderProps[Data] = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.CustomHeaderProps[Data]
  @scala.inline
  def CustomMarkerProps: MarkerProps.type = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.MarkerProps
  type CustomMarkerProps = MarkerProps
  @scala.inline
  def DateHeaderProps: typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeaderProps.type = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeaderProps
  type DateHeaderProps[Data] = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.DateHeaderProps[Data]
  @scala.inline
  def ReactDashCalendarDashTimelineProps: ReactCalendarTimelineProps.type = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.ReactCalendarTimelineProps
  type ReactDashCalendarDashTimelineProps[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] = ReactCalendarTimelineProps[CustomItem, CustomGroup]
  @scala.inline
  def SidebarHeaderProps: typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeaderProps.type = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeaderProps
  type SidebarHeaderProps[Data] = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.SidebarHeaderProps[Data]
  @scala.inline
  def TimelineHeaderProps: typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineHeaderProps.type = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineHeaderProps
  type TimelineHeaderProps = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TimelineHeaderProps
  @scala.inline
  def TimelineHeadersProps: HTMLAttributes.type = typings.react.reactMod.HTMLAttributes
  type TimelineHeadersProps[T] = HTMLAttributes[T]
  @scala.inline
  def TodayMarkerProps: typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TodayMarkerProps.type = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TodayMarkerProps
  type TodayMarkerProps = typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod.TodayMarkerProps
}

