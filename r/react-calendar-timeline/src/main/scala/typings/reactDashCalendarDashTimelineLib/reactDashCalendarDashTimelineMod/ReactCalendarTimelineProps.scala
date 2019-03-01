package typings
package reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCalendarTimelineProps extends js.Object {
  var canChangeGroup: js.UndefOr[scala.Boolean] = js.undefined
  var canMove: js.UndefOr[scala.Boolean] = js.undefined
  var canResize: js.UndefOr[
    scala.Boolean | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.left | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.right | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.both
  ] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var clickTolerance: js.UndefOr[scala.Double] = js.undefined
  var defaultTimeEnd: js.UndefOr[js.Any] = js.undefined
  var defaultTimeStart: js.UndefOr[js.Any] = js.undefined
  var dragSnap: js.UndefOr[scala.Double] = js.undefined
  var groupRenderer: js.UndefOr[
    js.Function1[
      /* props */ reactDashCalendarDashTimelineLib.Anon_Group, 
      reactLib.reactMod.ReactNs.ReactElement[js.Object]
    ]
  ] = js.undefined
  var groups: js.Array[TimelineGroup]
  var headerLabelFormats: js.UndefOr[TimelineHeaderLabelFormat] = js.undefined
  var headerLabelGroupHeight: js.UndefOr[scala.Double] = js.undefined
  var headerLabelHeight: js.UndefOr[scala.Double] = js.undefined
  var headerRef: js.UndefOr[js.Any] = js.undefined
  var itemHeightRatio: js.UndefOr[scala.Double] = js.undefined
  var itemRenderer: js.UndefOr[
    js.Function1[
      /* props */ reactDashCalendarDashTimelineLib.Anon_Context, 
      reactLib.reactMod.ReactNs.ReactElement[js.Object]
    ]
  ] = js.undefined
  var itemTouchSendsClick: js.UndefOr[scala.Boolean] = js.undefined
  var items: js.Array[TimelineItem]
  var keys: js.UndefOr[reactDashCalendarDashTimelineLib.Anon_GroupIdKey] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minResizeWidth: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var minimumWidthForItemContentVisibility: js.UndefOr[scala.Double] = js.undefined
  var moveResizeValidator: js.UndefOr[
    js.Function4[
      /* action */ reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.move | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.resize, 
      /* itemId */ scala.Double, 
      /* time */ scala.Double, 
      /* resizeEdge */ reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.left | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.right, 
      _
    ]
  ] = js.undefined
  var onBoundsChange: js.UndefOr[
    js.Function2[/* canvasTimeStart */ scala.Double, /* canvasTimeEnd */ scala.Double, _]
  ] = js.undefined
  var onCanvasClick: js.UndefOr[
    js.Function3[/* groupId */ scala.Double, /* time */ scala.Double, /* e */ js.Any, _]
  ] = js.undefined
  var onCanvasContextMenu: js.UndefOr[
    js.Function3[/* group */ TimelineGroup, /* time */ scala.Double, /* e */ js.Any, _]
  ] = js.undefined
  var onCanvasDoubleClick: js.UndefOr[
    js.Function3[/* group */ TimelineGroup, /* time */ scala.Double, /* e */ js.Any, _]
  ] = js.undefined
  var onItemClick: js.UndefOr[
    js.Function3[/* itemId */ scala.Double, /* e */ js.Any, /* time */ scala.Double, _]
  ] = js.undefined
  var onItemDoubleClick: js.UndefOr[
    js.Function3[/* itemId */ scala.Double, /* e */ js.Any, /* time */ scala.Double, _]
  ] = js.undefined
  var onItemMove: js.UndefOr[
    js.Function3[
      /* itemId */ scala.Double, 
      /* dragTime */ scala.Double, 
      /* newGroupOrder */ scala.Double, 
      _
    ]
  ] = js.undefined
  var onItemResize: js.UndefOr[
    js.Function3[
      /* itemId */ scala.Double, 
      /* newResizeEnd */ scala.Double, 
      /* edge */ reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.left | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.right, 
      _
    ]
  ] = js.undefined
  var onItemSelect: js.UndefOr[
    js.Function3[/* itemId */ scala.Double, /* e */ js.Any, /* time */ scala.Double, _]
  ] = js.undefined
  var onTimeChange: js.UndefOr[
    js.Function3[
      /* visibleTimeStart */ scala.Double, 
      /* visibleTimeEnd */ scala.Double, 
      /* updateScrollCanvas */ js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit], 
      _
    ]
  ] = js.undefined
  var onTimeInit: js.UndefOr[
    js.Function2[/* canvasTimeStart */ scala.Double, /* canvasTimeEnd */ scala.Double, _]
  ] = js.undefined
  var onZoom: js.UndefOr[js.Function1[/* timelineContext */ TimelineContext, _]] = js.undefined
  var rightSidebarContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var rightSidebarWidth: js.UndefOr[scala.Double] = js.undefined
  var selected: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var showCursorLine: js.UndefOr[scala.Boolean] = js.undefined
  var sidebarContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var sidebarWidth: js.UndefOr[scala.Double] = js.undefined
  var stackItems: js.UndefOr[scala.Boolean] = js.undefined
  var stickyHeader: js.UndefOr[scala.Boolean] = js.undefined
  var stickyOffset: js.UndefOr[scala.Double] = js.undefined
  var subHeaderLabelFormats: js.UndefOr[TimelineHeaderLabelFormat] = js.undefined
  var timeSteps: js.UndefOr[TimelineTimeSteps] = js.undefined
  var traditionalZoom: js.UndefOr[scala.Boolean] = js.undefined
  var useResizeHandle: js.UndefOr[scala.Boolean] = js.undefined
  var visibleTimeEnd: js.UndefOr[js.Any] = js.undefined
  var visibleTimeStart: js.UndefOr[js.Any] = js.undefined
}

object ReactCalendarTimelineProps {
  @scala.inline
  def apply(
    groups: js.Array[TimelineGroup],
    items: js.Array[TimelineItem],
    canChangeGroup: js.UndefOr[scala.Boolean] = js.undefined,
    canMove: js.UndefOr[scala.Boolean] = js.undefined,
    canResize: scala.Boolean | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.left | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.right | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.both = null,
    children: js.Any = null,
    clickTolerance: scala.Int | scala.Double = null,
    defaultTimeEnd: js.Any = null,
    defaultTimeStart: js.Any = null,
    dragSnap: scala.Int | scala.Double = null,
    groupRenderer: js.Function1[
      /* props */ reactDashCalendarDashTimelineLib.Anon_Group, 
      reactLib.reactMod.ReactNs.ReactElement[js.Object]
    ] = null,
    headerLabelFormats: TimelineHeaderLabelFormat = null,
    headerLabelGroupHeight: scala.Int | scala.Double = null,
    headerLabelHeight: scala.Int | scala.Double = null,
    headerRef: js.Any = null,
    itemHeightRatio: scala.Int | scala.Double = null,
    itemRenderer: js.Function1[
      /* props */ reactDashCalendarDashTimelineLib.Anon_Context, 
      reactLib.reactMod.ReactNs.ReactElement[js.Object]
    ] = null,
    itemTouchSendsClick: js.UndefOr[scala.Boolean] = js.undefined,
    keys: reactDashCalendarDashTimelineLib.Anon_GroupIdKey = null,
    lineHeight: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minResizeWidth: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    minimumWidthForItemContentVisibility: scala.Int | scala.Double = null,
    moveResizeValidator: js.Function4[
      /* action */ reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.move | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.resize, 
      /* itemId */ scala.Double, 
      /* time */ scala.Double, 
      /* resizeEdge */ reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.left | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.right, 
      _
    ] = null,
    onBoundsChange: js.Function2[/* canvasTimeStart */ scala.Double, /* canvasTimeEnd */ scala.Double, _] = null,
    onCanvasClick: js.Function3[/* groupId */ scala.Double, /* time */ scala.Double, /* e */ js.Any, _] = null,
    onCanvasContextMenu: js.Function3[/* group */ TimelineGroup, /* time */ scala.Double, /* e */ js.Any, _] = null,
    onCanvasDoubleClick: js.Function3[/* group */ TimelineGroup, /* time */ scala.Double, /* e */ js.Any, _] = null,
    onItemClick: js.Function3[/* itemId */ scala.Double, /* e */ js.Any, /* time */ scala.Double, _] = null,
    onItemDoubleClick: js.Function3[/* itemId */ scala.Double, /* e */ js.Any, /* time */ scala.Double, _] = null,
    onItemMove: js.Function3[
      /* itemId */ scala.Double, 
      /* dragTime */ scala.Double, 
      /* newGroupOrder */ scala.Double, 
      _
    ] = null,
    onItemResize: js.Function3[
      /* itemId */ scala.Double, 
      /* newResizeEnd */ scala.Double, 
      /* edge */ reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.left | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.right, 
      _
    ] = null,
    onItemSelect: js.Function3[/* itemId */ scala.Double, /* e */ js.Any, /* time */ scala.Double, _] = null,
    onTimeChange: js.Function3[
      /* visibleTimeStart */ scala.Double, 
      /* visibleTimeEnd */ scala.Double, 
      /* updateScrollCanvas */ js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit], 
      _
    ] = null,
    onTimeInit: js.Function2[/* canvasTimeStart */ scala.Double, /* canvasTimeEnd */ scala.Double, _] = null,
    onZoom: js.Function1[/* timelineContext */ TimelineContext, _] = null,
    rightSidebarContent: reactLib.reactMod.ReactNs.ReactNode = null,
    rightSidebarWidth: scala.Int | scala.Double = null,
    selected: js.Array[scala.Double] = null,
    showCursorLine: js.UndefOr[scala.Boolean] = js.undefined,
    sidebarContent: reactLib.reactMod.ReactNs.ReactNode = null,
    sidebarWidth: scala.Int | scala.Double = null,
    stackItems: js.UndefOr[scala.Boolean] = js.undefined,
    stickyHeader: js.UndefOr[scala.Boolean] = js.undefined,
    stickyOffset: scala.Int | scala.Double = null,
    subHeaderLabelFormats: TimelineHeaderLabelFormat = null,
    timeSteps: TimelineTimeSteps = null,
    traditionalZoom: js.UndefOr[scala.Boolean] = js.undefined,
    useResizeHandle: js.UndefOr[scala.Boolean] = js.undefined,
    visibleTimeEnd: js.Any = null,
    visibleTimeStart: js.Any = null
  ): ReactCalendarTimelineProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("items")(items)
    if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup)
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove)
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (clickTolerance != null) __obj.updateDynamic("clickTolerance")(clickTolerance.asInstanceOf[js.Any])
    if (defaultTimeEnd != null) __obj.updateDynamic("defaultTimeEnd")(defaultTimeEnd)
    if (defaultTimeStart != null) __obj.updateDynamic("defaultTimeStart")(defaultTimeStart)
    if (dragSnap != null) __obj.updateDynamic("dragSnap")(dragSnap.asInstanceOf[js.Any])
    if (groupRenderer != null) __obj.updateDynamic("groupRenderer")(groupRenderer)
    if (headerLabelFormats != null) __obj.updateDynamic("headerLabelFormats")(headerLabelFormats)
    if (headerLabelGroupHeight != null) __obj.updateDynamic("headerLabelGroupHeight")(headerLabelGroupHeight.asInstanceOf[js.Any])
    if (headerLabelHeight != null) __obj.updateDynamic("headerLabelHeight")(headerLabelHeight.asInstanceOf[js.Any])
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef)
    if (itemHeightRatio != null) __obj.updateDynamic("itemHeightRatio")(itemHeightRatio.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(itemRenderer)
    if (!js.isUndefined(itemTouchSendsClick)) __obj.updateDynamic("itemTouchSendsClick")(itemTouchSendsClick)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResizeWidth != null) __obj.updateDynamic("minResizeWidth")(minResizeWidth.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (minimumWidthForItemContentVisibility != null) __obj.updateDynamic("minimumWidthForItemContentVisibility")(minimumWidthForItemContentVisibility.asInstanceOf[js.Any])
    if (moveResizeValidator != null) __obj.updateDynamic("moveResizeValidator")(moveResizeValidator)
    if (onBoundsChange != null) __obj.updateDynamic("onBoundsChange")(onBoundsChange)
    if (onCanvasClick != null) __obj.updateDynamic("onCanvasClick")(onCanvasClick)
    if (onCanvasContextMenu != null) __obj.updateDynamic("onCanvasContextMenu")(onCanvasContextMenu)
    if (onCanvasDoubleClick != null) __obj.updateDynamic("onCanvasDoubleClick")(onCanvasDoubleClick)
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(onItemClick)
    if (onItemDoubleClick != null) __obj.updateDynamic("onItemDoubleClick")(onItemDoubleClick)
    if (onItemMove != null) __obj.updateDynamic("onItemMove")(onItemMove)
    if (onItemResize != null) __obj.updateDynamic("onItemResize")(onItemResize)
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(onItemSelect)
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(onTimeChange)
    if (onTimeInit != null) __obj.updateDynamic("onTimeInit")(onTimeInit)
    if (onZoom != null) __obj.updateDynamic("onZoom")(onZoom)
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

