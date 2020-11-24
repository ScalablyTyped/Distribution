package typings.reactCalendarTimeline.mod

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.reactCalendarTimeline.reactCalendarTimelineBooleans.`false`
import typings.reactCalendarTimeline.reactCalendarTimelineBooleans.`true`
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.both
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.right
import typings.std.Date
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCalendarTimelineProps[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] extends js.Object {
  
  var canChangeGroup: js.UndefOr[Boolean] = js.native
  
  var canMove: js.UndefOr[Boolean] = js.native
  
  var canResize: js.UndefOr[`false` | `true` | left | right | both] = js.native
  
  var clickTolerance: js.UndefOr[Double] = js.native
  
  var defaultTimeEnd: js.UndefOr[Date | Moment] = js.native
  
  var defaultTimeStart: js.UndefOr[Date | Moment] = js.native
  
  var dragSnap: js.UndefOr[Double] = js.native
  
  var groupRenderer: js.UndefOr[
    js.Function1[/* props */ ReactCalendarGroupRendererProps[CustomGroup], ReactNode]
  ] = js.native
  
  var groups: js.Array[CustomGroup] = js.native
  
  // Fields that are in propTypes but not documented
  var headerRef: js.UndefOr[Ref[_]] = js.native
  
  var horizontalLineClassNamesForGroup: js.UndefOr[js.Function1[/* group */ CustomGroup, js.Array[String]]] = js.native
  
  var itemHeightRatio: js.UndefOr[Double] = js.native
  
  var itemRenderer: js.UndefOr[js.Function1[/* props */ ReactCalendarItemRendererProps[CustomItem], ReactNode]] = js.native
  
  var itemTouchSendsClick: js.UndefOr[Boolean] = js.native
  
  var items: js.Array[CustomItem] = js.native
  
  var keys: js.UndefOr[TimelineKeys] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minResizeWidth: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var moveResizeValidator: js.UndefOr[
    js.Function4[
      /* action */ move | resize, 
      /* itemId */ Id, 
      /* time */ Double, 
      /* resizeEdge */ left | right, 
      Double
    ]
  ] = js.native
  
  var onBoundsChange: js.UndefOr[js.Function2[/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double, _]] = js.native
  
  var onCanvasClick: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      scala.Unit
    ]
  ] = js.native
  
  var onCanvasContextMenu: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      scala.Unit
    ]
  ] = js.native
  
  var onCanvasDoubleClick: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      scala.Unit
    ]
  ] = js.native
  
  var onItemClick: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double, scala.Unit]
  ] = js.native
  
  var onItemContextMenu: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double, scala.Unit]
  ] = js.native
  
  var onItemDeselect: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], scala.Unit]] = js.native
  
  var onItemDoubleClick: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double, scala.Unit]
  ] = js.native
  
  var onItemDrag: js.UndefOr[
    js.Function1[/* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize, scala.Unit]
  ] = js.native
  
  var onItemMove: js.UndefOr[
    js.Function3[/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double, scala.Unit]
  ] = js.native
  
  var onItemResize: js.UndefOr[
    js.Function3[/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right, scala.Unit]
  ] = js.native
  
  var onItemSelect: js.UndefOr[js.Function3[/* itemId */ Id, /* e */ js.Any, /* time */ Double, scala.Unit]] = js.native
  
  var onTimeChange: js.UndefOr[
    js.Function3[
      /* visibleTimeStart */ Double, 
      /* visibleTimeEnd */ Double, 
      /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit], 
      _
    ]
  ] = js.native
  
  var onZoom: js.UndefOr[js.Function1[/* timelineContext */ TimelineContext, scala.Unit]] = js.native
  
  var resizeDetector: js.UndefOr[js.Function1[/* containerResizeDetector */ js.Any, scala.Unit]] = js.native
  
  var rightSidebarContent: js.UndefOr[ReactNode] = js.native
  
  var rightSidebarWidth: js.UndefOr[Double] = js.native
  
  var scrollRef: js.UndefOr[Ref[_]] = js.native
  
  var selected: js.UndefOr[js.Array[Double]] = js.native
  
  var sidebarContent: js.UndefOr[ReactNode] = js.native
  
  var sidebarWidth: js.UndefOr[Double] = js.native
  
  var stackItems: js.UndefOr[Boolean] = js.native
  
  var timeSteps: js.UndefOr[TimelineTimeSteps] = js.native
  
  var traditionalZoom: js.UndefOr[Boolean] = js.native
  
  var useResizeHandle: js.UndefOr[Boolean] = js.native
  
  var verticalLineClassNamesForTime: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, js.UndefOr[js.Array[String]]]] = js.native
  
  var visibleTimeEnd: js.UndefOr[Date | Moment | Double] = js.native
  
  var visibleTimeStart: js.UndefOr[Date | Moment | Double] = js.native
}
object ReactCalendarTimelineProps {
  
  @scala.inline
  def apply[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */](groups: js.Array[CustomGroup], items: js.Array[CustomItem]): ReactCalendarTimelineProps[CustomItem, CustomGroup] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarTimelineProps[CustomItem, CustomGroup]]
  }
  
  @scala.inline
  implicit class ReactCalendarTimelinePropsOps[Self <: ReactCalendarTimelineProps[_, _], CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] (val x: Self with (ReactCalendarTimelineProps[CustomItem, CustomGroup])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupsVarargs(value: CustomGroup*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[CustomGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: CustomItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[CustomItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanChangeGroup(value: Boolean): Self = this.set("canChangeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanChangeGroup: Self = this.set("canChangeGroup", js.undefined)
    
    @scala.inline
    def setCanMove(value: Boolean): Self = this.set("canMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMove: Self = this.set("canMove", js.undefined)
    
    @scala.inline
    def setCanResize(value: `false` | `true` | left | right | both): Self = this.set("canResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanResize: Self = this.set("canResize", js.undefined)
    
    @scala.inline
    def setClickTolerance(value: Double): Self = this.set("clickTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickTolerance: Self = this.set("clickTolerance", js.undefined)
    
    @scala.inline
    def setDefaultTimeEnd(value: Date | Moment): Self = this.set("defaultTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTimeEnd: Self = this.set("defaultTimeEnd", js.undefined)
    
    @scala.inline
    def setDefaultTimeStart(value: Date | Moment): Self = this.set("defaultTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTimeStart: Self = this.set("defaultTimeStart", js.undefined)
    
    @scala.inline
    def setDragSnap(value: Double): Self = this.set("dragSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragSnap: Self = this.set("dragSnap", js.undefined)
    
    @scala.inline
    def setGroupRenderer(value: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => ReactNode): Self = this.set("groupRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGroupRenderer: Self = this.set("groupRenderer", js.undefined)
    
    @scala.inline
    def setHeaderRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = this.set("headerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRef(value: Ref[_]): Self = this.set("headerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRef: Self = this.set("headerRef", js.undefined)
    
    @scala.inline
    def setHeaderRefNull: Self = this.set("headerRef", null)
    
    @scala.inline
    def setHorizontalLineClassNamesForGroup(value: /* group */ CustomGroup => js.Array[String]): Self = this.set("horizontalLineClassNamesForGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHorizontalLineClassNamesForGroup: Self = this.set("horizontalLineClassNamesForGroup", js.undefined)
    
    @scala.inline
    def setItemHeightRatio(value: Double): Self = this.set("itemHeightRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeightRatio: Self = this.set("itemHeightRatio", js.undefined)
    
    @scala.inline
    def setItemRenderer(value: /* props */ ReactCalendarItemRendererProps[CustomItem] => ReactNode): Self = this.set("itemRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemRenderer: Self = this.set("itemRenderer", js.undefined)
    
    @scala.inline
    def setItemTouchSendsClick(value: Boolean): Self = this.set("itemTouchSendsClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTouchSendsClick: Self = this.set("itemTouchSendsClick", js.undefined)
    
    @scala.inline
    def setKeys(value: TimelineKeys): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinResizeWidth(value: Double): Self = this.set("minResizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinResizeWidth: Self = this.set("minResizeWidth", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setMoveResizeValidator(
      value: (/* action */ move | resize, /* itemId */ Id, /* time */ Double, /* resizeEdge */ left | right) => Double
    ): Self = this.set("moveResizeValidator", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteMoveResizeValidator: Self = this.set("moveResizeValidator", js.undefined)
    
    @scala.inline
    def setOnBoundsChange(value: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => _): Self = this.set("onBoundsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBoundsChange: Self = this.set("onBoundsChange", js.undefined)
    
    @scala.inline
    def setOnCanvasClick(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Element, Event]) => scala.Unit): Self = this.set("onCanvasClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCanvasClick: Self = this.set("onCanvasClick", js.undefined)
    
    @scala.inline
    def setOnCanvasContextMenu(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Element, Event]) => scala.Unit): Self = this.set("onCanvasContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCanvasContextMenu: Self = this.set("onCanvasContextMenu", js.undefined)
    
    @scala.inline
    def setOnCanvasDoubleClick(value: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Element, Event]) => scala.Unit): Self = this.set("onCanvasDoubleClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCanvasDoubleClick: Self = this.set("onCanvasDoubleClick", js.undefined)
    
    @scala.inline
    def setOnItemClick(value: (/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double) => scala.Unit): Self = this.set("onItemClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnItemContextMenu(value: (/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double) => scala.Unit): Self = this.set("onItemContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemContextMenu: Self = this.set("onItemContextMenu", js.undefined)
    
    @scala.inline
    def setOnItemDeselect(value: /* e */ SyntheticEvent[Element, Event] => scala.Unit): Self = this.set("onItemDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemDeselect: Self = this.set("onItemDeselect", js.undefined)
    
    @scala.inline
    def setOnItemDoubleClick(value: (/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double) => scala.Unit): Self = this.set("onItemDoubleClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemDoubleClick: Self = this.set("onItemDoubleClick", js.undefined)
    
    @scala.inline
    def setOnItemDrag(value: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => scala.Unit): Self = this.set("onItemDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemDrag: Self = this.set("onItemDrag", js.undefined)
    
    @scala.inline
    def setOnItemMove(value: (/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double) => scala.Unit): Self = this.set("onItemMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemMove: Self = this.set("onItemMove", js.undefined)
    
    @scala.inline
    def setOnItemResize(value: (/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right) => scala.Unit): Self = this.set("onItemResize", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemResize: Self = this.set("onItemResize", js.undefined)
    
    @scala.inline
    def setOnItemSelect(value: (/* itemId */ Id, /* e */ js.Any, /* time */ Double) => scala.Unit): Self = this.set("onItemSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemSelect: Self = this.set("onItemSelect", js.undefined)
    
    @scala.inline
    def setOnTimeChange(
      value: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit]) => _
    ): Self = this.set("onTimeChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTimeChange: Self = this.set("onTimeChange", js.undefined)
    
    @scala.inline
    def setOnZoom(value: /* timelineContext */ TimelineContext => scala.Unit): Self = this.set("onZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoom: Self = this.set("onZoom", js.undefined)
    
    @scala.inline
    def setResizeDetector(value: /* containerResizeDetector */ js.Any => scala.Unit): Self = this.set("resizeDetector", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeDetector: Self = this.set("resizeDetector", js.undefined)
    
    @scala.inline
    def setRightSidebarContent(value: ReactNode): Self = this.set("rightSidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSidebarContent: Self = this.set("rightSidebarContent", js.undefined)
    
    @scala.inline
    def setRightSidebarWidth(value: Double): Self = this.set("rightSidebarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSidebarWidth: Self = this.set("rightSidebarWidth", js.undefined)
    
    @scala.inline
    def setScrollRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = this.set("scrollRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollRef(value: Ref[_]): Self = this.set("scrollRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollRef: Self = this.set("scrollRef", js.undefined)
    
    @scala.inline
    def setScrollRefNull: Self = this.set("scrollRef", null)
    
    @scala.inline
    def setSelectedVarargs(value: Double*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[Double]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSidebarContent(value: ReactNode): Self = this.set("sidebarContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSidebarContent: Self = this.set("sidebarContent", js.undefined)
    
    @scala.inline
    def setSidebarWidth(value: Double): Self = this.set("sidebarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSidebarWidth: Self = this.set("sidebarWidth", js.undefined)
    
    @scala.inline
    def setStackItems(value: Boolean): Self = this.set("stackItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackItems: Self = this.set("stackItems", js.undefined)
    
    @scala.inline
    def setTimeSteps(value: TimelineTimeSteps): Self = this.set("timeSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSteps: Self = this.set("timeSteps", js.undefined)
    
    @scala.inline
    def setTraditionalZoom(value: Boolean): Self = this.set("traditionalZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraditionalZoom: Self = this.set("traditionalZoom", js.undefined)
    
    @scala.inline
    def setUseResizeHandle(value: Boolean): Self = this.set("useResizeHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseResizeHandle: Self = this.set("useResizeHandle", js.undefined)
    
    @scala.inline
    def setVerticalLineClassNamesForTime(value: (/* start */ Double, /* end */ Double) => js.UndefOr[js.Array[String]]): Self = this.set("verticalLineClassNamesForTime", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteVerticalLineClassNamesForTime: Self = this.set("verticalLineClassNamesForTime", js.undefined)
    
    @scala.inline
    def setVisibleTimeEnd(value: Date | Moment | Double): Self = this.set("visibleTimeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleTimeEnd: Self = this.set("visibleTimeEnd", js.undefined)
    
    @scala.inline
    def setVisibleTimeStart(value: Date | Moment | Double): Self = this.set("visibleTimeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleTimeStart: Self = this.set("visibleTimeStart", js.undefined)
  }
}
