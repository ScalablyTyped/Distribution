package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.reactDashCalendarDashTimeline.Anon_Context
import typings.reactDashCalendarDashTimeline.Anon_Group
import typings.reactDashCalendarDashTimeline.Anon_GroupIdKey
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.both
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.move
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.resize
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCalendarTimelineProps extends js.Object {
  var canChangeGroup: js.UndefOr[Boolean] = js.undefined
  var canMove: js.UndefOr[Boolean] = js.undefined
  var canResize: js.UndefOr[Boolean | left | right | both] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var defaultTimeEnd: js.UndefOr[js.Any] = js.undefined
  var defaultTimeStart: js.UndefOr[js.Any] = js.undefined
  var dragSnap: js.UndefOr[Double] = js.undefined
  var groupRenderer: js.UndefOr[js.Function1[/* props */ Anon_Group, ReactElement]] = js.undefined
  var groups: js.Array[TimelineGroup]
  var headerLabelFormats: js.UndefOr[TimelineHeaderLabelFormat] = js.undefined
  var headerLabelGroupHeight: js.UndefOr[Double] = js.undefined
  var headerLabelHeight: js.UndefOr[Double] = js.undefined
  var headerRef: js.UndefOr[js.Any] = js.undefined
  var itemHeightRatio: js.UndefOr[Double] = js.undefined
  var itemRenderer: js.UndefOr[js.Function1[/* props */ Anon_Context, ReactElement]] = js.undefined
  var itemTouchSendsClick: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[TimelineItem]
  var keys: js.UndefOr[Anon_GroupIdKey] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResizeWidth: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var minimumWidthForItemContentVisibility: js.UndefOr[Double] = js.undefined
  var moveResizeValidator: js.UndefOr[
    js.Function4[
      /* action */ move | resize, 
      /* itemId */ Double, 
      /* time */ Double, 
      /* resizeEdge */ left | right, 
      _
    ]
  ] = js.undefined
  var onBoundsChange: js.UndefOr[js.Function2[/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double, _]] = js.undefined
  var onCanvasClick: js.UndefOr[js.Function3[/* groupId */ Double, /* time */ Double, /* e */ js.Any, _]] = js.undefined
  var onCanvasContextMenu: js.UndefOr[js.Function3[/* group */ TimelineGroup, /* time */ Double, /* e */ js.Any, _]] = js.undefined
  var onCanvasDoubleClick: js.UndefOr[js.Function3[/* group */ TimelineGroup, /* time */ Double, /* e */ js.Any, _]] = js.undefined
  var onItemClick: js.UndefOr[js.Function3[/* itemId */ Double, /* e */ js.Any, /* time */ Double, _]] = js.undefined
  var onItemDoubleClick: js.UndefOr[js.Function3[/* itemId */ Double, /* e */ js.Any, /* time */ Double, _]] = js.undefined
  var onItemMove: js.UndefOr[
    js.Function3[/* itemId */ Double, /* dragTime */ Double, /* newGroupOrder */ Double, _]
  ] = js.undefined
  var onItemResize: js.UndefOr[
    js.Function3[/* itemId */ Double, /* newResizeEnd */ Double, /* edge */ left | right, _]
  ] = js.undefined
  var onItemSelect: js.UndefOr[js.Function3[/* itemId */ Double, /* e */ js.Any, /* time */ Double, _]] = js.undefined
  var onTimeChange: js.UndefOr[
    js.Function3[
      /* visibleTimeStart */ Double, 
      /* visibleTimeEnd */ Double, 
      /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, Unit], 
      _
    ]
  ] = js.undefined
  var onTimeInit: js.UndefOr[js.Function2[/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double, _]] = js.undefined
  var onZoom: js.UndefOr[js.Function1[/* timelineContext */ TimelineContext, _]] = js.undefined
  var rightSidebarContent: js.UndefOr[ReactNode] = js.undefined
  var rightSidebarWidth: js.UndefOr[Double] = js.undefined
  var selected: js.UndefOr[js.Array[Double]] = js.undefined
  var showCursorLine: js.UndefOr[Boolean] = js.undefined
  var sidebarContent: js.UndefOr[ReactNode] = js.undefined
  var sidebarWidth: js.UndefOr[Double] = js.undefined
  var stackItems: js.UndefOr[Boolean] = js.undefined
  var stickyHeader: js.UndefOr[Boolean] = js.undefined
  var stickyOffset: js.UndefOr[Double] = js.undefined
  var subHeaderLabelFormats: js.UndefOr[TimelineHeaderLabelFormat] = js.undefined
  var timeSteps: js.UndefOr[TimelineTimeSteps] = js.undefined
  var traditionalZoom: js.UndefOr[Boolean] = js.undefined
  var useResizeHandle: js.UndefOr[Boolean] = js.undefined
  var visibleTimeEnd: js.UndefOr[js.Any] = js.undefined
  var visibleTimeStart: js.UndefOr[js.Any] = js.undefined
}

object ReactCalendarTimelineProps {
  @scala.inline
  def apply(
    groups: js.Array[TimelineGroup],
    items: js.Array[TimelineItem],
    canChangeGroup: js.UndefOr[Boolean] = js.undefined,
    canMove: js.UndefOr[Boolean] = js.undefined,
    canResize: Boolean | left | right | both = null,
    children: js.Any = null,
    clickTolerance: Int | Double = null,
    defaultTimeEnd: js.Any = null,
    defaultTimeStart: js.Any = null,
    dragSnap: Int | Double = null,
    groupRenderer: /* props */ Anon_Group => ReactElement = null,
    headerLabelFormats: TimelineHeaderLabelFormat = null,
    headerLabelGroupHeight: Int | Double = null,
    headerLabelHeight: Int | Double = null,
    headerRef: js.Any = null,
    itemHeightRatio: Int | Double = null,
    itemRenderer: /* props */ Anon_Context => ReactElement = null,
    itemTouchSendsClick: js.UndefOr[Boolean] = js.undefined,
    keys: Anon_GroupIdKey = null,
    lineHeight: Int | Double = null,
    maxZoom: Int | Double = null,
    minResizeWidth: Int | Double = null,
    minZoom: Int | Double = null,
    minimumWidthForItemContentVisibility: Int | Double = null,
    moveResizeValidator: (/* action */ move | resize, /* itemId */ Double, /* time */ Double, /* resizeEdge */ left | right) => _ = null,
    onBoundsChange: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => _ = null,
    onCanvasClick: (/* groupId */ Double, /* time */ Double, /* e */ js.Any) => _ = null,
    onCanvasContextMenu: (/* group */ TimelineGroup, /* time */ Double, /* e */ js.Any) => _ = null,
    onCanvasDoubleClick: (/* group */ TimelineGroup, /* time */ Double, /* e */ js.Any) => _ = null,
    onItemClick: (/* itemId */ Double, /* e */ js.Any, /* time */ Double) => _ = null,
    onItemDoubleClick: (/* itemId */ Double, /* e */ js.Any, /* time */ Double) => _ = null,
    onItemMove: (/* itemId */ Double, /* dragTime */ Double, /* newGroupOrder */ Double) => _ = null,
    onItemResize: (/* itemId */ Double, /* newResizeEnd */ Double, /* edge */ left | right) => _ = null,
    onItemSelect: (/* itemId */ Double, /* e */ js.Any, /* time */ Double) => _ = null,
    onTimeChange: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, Unit]) => _ = null,
    onTimeInit: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => _ = null,
    onZoom: /* timelineContext */ TimelineContext => _ = null,
    rightSidebarContent: ReactNode = null,
    rightSidebarWidth: Int | Double = null,
    selected: js.Array[Double] = null,
    showCursorLine: js.UndefOr[Boolean] = js.undefined,
    sidebarContent: ReactNode = null,
    sidebarWidth: Int | Double = null,
    stackItems: js.UndefOr[Boolean] = js.undefined,
    stickyHeader: js.UndefOr[Boolean] = js.undefined,
    stickyOffset: Int | Double = null,
    subHeaderLabelFormats: TimelineHeaderLabelFormat = null,
    timeSteps: TimelineTimeSteps = null,
    traditionalZoom: js.UndefOr[Boolean] = js.undefined,
    useResizeHandle: js.UndefOr[Boolean] = js.undefined,
    visibleTimeEnd: js.Any = null,
    visibleTimeStart: js.Any = null
  ): ReactCalendarTimelineProps = {
    val __obj = js.Dynamic.literal(groups = groups, items = items)
    if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup)
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove)
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (clickTolerance != null) __obj.updateDynamic("clickTolerance")(clickTolerance.asInstanceOf[js.Any])
    if (defaultTimeEnd != null) __obj.updateDynamic("defaultTimeEnd")(defaultTimeEnd)
    if (defaultTimeStart != null) __obj.updateDynamic("defaultTimeStart")(defaultTimeStart)
    if (dragSnap != null) __obj.updateDynamic("dragSnap")(dragSnap.asInstanceOf[js.Any])
    if (groupRenderer != null) __obj.updateDynamic("groupRenderer")(js.Any.fromFunction1(groupRenderer))
    if (headerLabelFormats != null) __obj.updateDynamic("headerLabelFormats")(headerLabelFormats)
    if (headerLabelGroupHeight != null) __obj.updateDynamic("headerLabelGroupHeight")(headerLabelGroupHeight.asInstanceOf[js.Any])
    if (headerLabelHeight != null) __obj.updateDynamic("headerLabelHeight")(headerLabelHeight.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef)
    if (itemHeightRatio != null) __obj.updateDynamic("itemHeightRatio")(itemHeightRatio.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction1(itemRenderer))
    if (!js.isUndefined(itemTouchSendsClick)) __obj.updateDynamic("itemTouchSendsClick")(itemTouchSendsClick)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResizeWidth != null) __obj.updateDynamic("minResizeWidth")(minResizeWidth.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (minimumWidthForItemContentVisibility != null) __obj.updateDynamic("minimumWidthForItemContentVisibility")(minimumWidthForItemContentVisibility.asInstanceOf[js.Any])
    if (moveResizeValidator != null) __obj.updateDynamic("moveResizeValidator")(js.Any.fromFunction4(moveResizeValidator))
    if (onBoundsChange != null) __obj.updateDynamic("onBoundsChange")(js.Any.fromFunction2(onBoundsChange))
    if (onCanvasClick != null) __obj.updateDynamic("onCanvasClick")(js.Any.fromFunction3(onCanvasClick))
    if (onCanvasContextMenu != null) __obj.updateDynamic("onCanvasContextMenu")(js.Any.fromFunction3(onCanvasContextMenu))
    if (onCanvasDoubleClick != null) __obj.updateDynamic("onCanvasDoubleClick")(js.Any.fromFunction3(onCanvasDoubleClick))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction3(onItemClick))
    if (onItemDoubleClick != null) __obj.updateDynamic("onItemDoubleClick")(js.Any.fromFunction3(onItemDoubleClick))
    if (onItemMove != null) __obj.updateDynamic("onItemMove")(js.Any.fromFunction3(onItemMove))
    if (onItemResize != null) __obj.updateDynamic("onItemResize")(js.Any.fromFunction3(onItemResize))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction3(onItemSelect))
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(js.Any.fromFunction3(onTimeChange))
    if (onTimeInit != null) __obj.updateDynamic("onTimeInit")(js.Any.fromFunction2(onTimeInit))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1(onZoom))
    if (rightSidebarContent != null) __obj.updateDynamic("rightSidebarContent")(rightSidebarContent.asInstanceOf[js.Any])
    if (rightSidebarWidth != null) __obj.updateDynamic("rightSidebarWidth")(rightSidebarWidth.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showCursorLine)) __obj.updateDynamic("showCursorLine")(showCursorLine)
    if (sidebarContent != null) __obj.updateDynamic("sidebarContent")(sidebarContent.asInstanceOf[js.Any])
    if (sidebarWidth != null) __obj.updateDynamic("sidebarWidth")(sidebarWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(stackItems)) __obj.updateDynamic("stackItems")(stackItems)
    if (!js.isUndefined(stickyHeader)) __obj.updateDynamic("stickyHeader")(stickyHeader)
    if (stickyOffset != null) __obj.updateDynamic("stickyOffset")(stickyOffset.asInstanceOf[js.Any])
    if (subHeaderLabelFormats != null) __obj.updateDynamic("subHeaderLabelFormats")(subHeaderLabelFormats)
    if (timeSteps != null) __obj.updateDynamic("timeSteps")(timeSteps)
    if (!js.isUndefined(traditionalZoom)) __obj.updateDynamic("traditionalZoom")(traditionalZoom)
    if (!js.isUndefined(useResizeHandle)) __obj.updateDynamic("useResizeHandle")(useResizeHandle)
    if (visibleTimeEnd != null) __obj.updateDynamic("visibleTimeEnd")(visibleTimeEnd)
    if (visibleTimeStart != null) __obj.updateDynamic("visibleTimeStart")(visibleTimeStart)
    __obj.asInstanceOf[ReactCalendarTimelineProps]
  }
}

