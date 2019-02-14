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
      reactLib.reactMod.ReactNs.ReactElement
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
      reactLib.reactMod.ReactNs.ReactElement
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

