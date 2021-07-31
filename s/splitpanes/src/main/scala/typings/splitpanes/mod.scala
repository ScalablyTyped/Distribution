package typings.splitpanes

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("splitpanes", JSImport.Default)
  @js.native
  val default: splitPanesConstructor = js.native
  
  @JSImport("splitpanes", "splitPanes")
  @js.native
  val splitPanes: splitPanesConstructor = js.native
  
  type _To = splitPanesConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: splitPanesConstructor = default
  
  trait containerTypes extends StObject {
    
    var offsetLeft: Null | Double
    
    var offsetTop: Null | Double
    
    var vnode: js.Any
  }
  object containerTypes {
    
    @scala.inline
    def apply(vnode: js.Any): containerTypes = {
      val __obj = js.Dynamic.literal(vnode = vnode.asInstanceOf[js.Any], offsetLeft = null, offsetTop = null)
      __obj.asInstanceOf[containerTypes]
    }
    
    @scala.inline
    implicit class containerTypesMutableBuilder[Self <: containerTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetLeftNull: Self = StObject.set(x, "offsetLeft", null)
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTopNull: Self = StObject.set(x, "offsetTop", null)
      
      @scala.inline
      def setVnode(value: js.Any): Self = StObject.set(x, "vnode", value.asInstanceOf[js.Any])
    }
  }
  
  trait positionTypes extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object positionTypes {
    
    @scala.inline
    def apply(x: Double, y: Double): positionTypes = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[positionTypes]
    }
    
    @scala.inline
    implicit class positionTypesMutableBuilder[Self <: positionTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait splitPanesComputed extends StObject {
    
    def defaultWidth(): Double
  }
  object splitPanesComputed {
    
    @scala.inline
    def apply(defaultWidth: () => Double): splitPanesComputed = {
      val __obj = js.Dynamic.literal(defaultWidth = js.Any.fromFunction0(defaultWidth))
      __obj.asInstanceOf[splitPanesComputed]
    }
    
    @scala.inline
    implicit class splitPanesComputedMutableBuilder[Self <: splitPanesComputed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultWidth(value: () => Double): Self = StObject.set(x, "defaultWidth", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait splitPanesConstructor
    extends StObject
       with VueConstructor[Vue] {
    
    def beforeDestroy(): Unit = js.native
    
    def beforeUpdate(): Unit = js.native
    
    var computed: splitPanesComputed = js.native
    
    def data(): splitPanesData = js.native
    
    var methods: splitPanesMethods = js.native
    
    def mounted(): Unit = js.native
    
    var props: splitPanesProps = js.native
    
    def render(createEl: js.Any): js.Any = js.native
    
    var watch: splitPanesWatch = js.native
  }
  
  trait splitPanesData extends StObject {
    
    var container: containerTypes
    
    var panes: js.Array[js.Any]
    
    var slotsCopy: String
    
    var slotsCount: Double
    
    // Detect double click on touch devices.
    var splitterTaps: splitterTapsTypes
    
    var splitters: js.Array[js.Any]
    
    var touch: touchTypes
    
    var vnodes: js.Array[js.Any]
  }
  object splitPanesData {
    
    @scala.inline
    def apply(
      container: containerTypes,
      panes: js.Array[js.Any],
      slotsCopy: String,
      slotsCount: Double,
      splitterTaps: splitterTapsTypes,
      splitters: js.Array[js.Any],
      touch: touchTypes,
      vnodes: js.Array[js.Any]
    ): splitPanesData = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any], slotsCopy = slotsCopy.asInstanceOf[js.Any], slotsCount = slotsCount.asInstanceOf[js.Any], splitterTaps = splitterTaps.asInstanceOf[js.Any], splitters = splitters.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], vnodes = vnodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[splitPanesData]
    }
    
    @scala.inline
    implicit class splitPanesDataMutableBuilder[Self <: splitPanesData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: containerTypes): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanes(value: js.Array[js.Any]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanesVarargs(value: js.Any*): Self = StObject.set(x, "panes", js.Array(value :_*))
      
      @scala.inline
      def setSlotsCopy(value: String): Self = StObject.set(x, "slotsCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsCount(value: Double): Self = StObject.set(x, "slotsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitterTaps(value: splitterTapsTypes): Self = StObject.set(x, "splitterTaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitters(value: js.Array[js.Any]): Self = StObject.set(x, "splitters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplittersVarargs(value: js.Any*): Self = StObject.set(x, "splitters", js.Array(value :_*))
      
      @scala.inline
      def setTouch(value: touchTypes): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVnodes(value: js.Array[js.Any]): Self = StObject.set(x, "vnodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVnodesVarargs(value: js.Any*): Self = StObject.set(x, "vnodes", js.Array(value :_*))
    }
  }
  
  trait splitPanesMethods extends StObject {
    
    def bindEvents(): Unit
    
    def calculatePanesSize(drag: js.Object): Boolean | Unit
    
    def doPushOtherPanes(sums: js.Object, dragPercentage: Double): js.Any
    
    def findNextExpandedPane(splitterIndex: Double): js.Object
    
    def findPrevExpandedPane(splitterIndex: Double): js.Object
    
    def getCurrentDragPercentage(drag: js.Object): Double
    
    def getCurrentMouseDrag(e: Event): positionTypes
    
    def onMouseDown(e: Event, splitterIndex: Double): Unit
    
    def onMouseMove(e: Event): Unit
    
    def onMouseUp(): Unit
    
    def onSplitterClick(e: Event, splitterIndex: Double): Unit
    
    def onSplitterDblClick(e: Event, splitterIndex: Double): Unit
    
    def sumNextPanesSize(splitterIndex: Double): js.Object
    
    def sumPrevPanesSize(splitterIndex: Double): js.Object
  }
  object splitPanesMethods {
    
    @scala.inline
    def apply(
      bindEvents: () => Unit,
      calculatePanesSize: js.Object => Boolean | Unit,
      doPushOtherPanes: (js.Object, Double) => js.Any,
      findNextExpandedPane: Double => js.Object,
      findPrevExpandedPane: Double => js.Object,
      getCurrentDragPercentage: js.Object => Double,
      getCurrentMouseDrag: Event => positionTypes,
      onMouseDown: (Event, Double) => Unit,
      onMouseMove: Event => Unit,
      onMouseUp: () => Unit,
      onSplitterClick: (Event, Double) => Unit,
      onSplitterDblClick: (Event, Double) => Unit,
      sumNextPanesSize: Double => js.Object,
      sumPrevPanesSize: Double => js.Object
    ): splitPanesMethods = {
      val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), calculatePanesSize = js.Any.fromFunction1(calculatePanesSize), doPushOtherPanes = js.Any.fromFunction2(doPushOtherPanes), findNextExpandedPane = js.Any.fromFunction1(findNextExpandedPane), findPrevExpandedPane = js.Any.fromFunction1(findPrevExpandedPane), getCurrentDragPercentage = js.Any.fromFunction1(getCurrentDragPercentage), getCurrentMouseDrag = js.Any.fromFunction1(getCurrentMouseDrag), onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp), onSplitterClick = js.Any.fromFunction2(onSplitterClick), onSplitterDblClick = js.Any.fromFunction2(onSplitterDblClick), sumNextPanesSize = js.Any.fromFunction1(sumNextPanesSize), sumPrevPanesSize = js.Any.fromFunction1(sumPrevPanesSize))
      __obj.asInstanceOf[splitPanesMethods]
    }
    
    @scala.inline
    implicit class splitPanesMethodsMutableBuilder[Self <: splitPanesMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindEvents(value: () => Unit): Self = StObject.set(x, "bindEvents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCalculatePanesSize(value: js.Object => Boolean | Unit): Self = StObject.set(x, "calculatePanesSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoPushOtherPanes(value: (js.Object, Double) => js.Any): Self = StObject.set(x, "doPushOtherPanes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindNextExpandedPane(value: Double => js.Object): Self = StObject.set(x, "findNextExpandedPane", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindPrevExpandedPane(value: Double => js.Object): Self = StObject.set(x, "findPrevExpandedPane", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCurrentDragPercentage(value: js.Object => Double): Self = StObject.set(x, "getCurrentDragPercentage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCurrentMouseDrag(value: Event => positionTypes): Self = StObject.set(x, "getCurrentMouseDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDown(value: (Event, Double) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseMove(value: Event => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUp(value: () => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSplitterClick(value: (Event, Double) => Unit): Self = StObject.set(x, "onSplitterClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSplitterDblClick(value: (Event, Double) => Unit): Self = StObject.set(x, "onSplitterDblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSumNextPanesSize(value: Double => js.Object): Self = StObject.set(x, "sumNextPanesSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSumPrevPanesSize(value: Double => js.Object): Self = StObject.set(x, "sumPrevPanesSize", js.Any.fromFunction1(value))
    }
  }
  
  trait splitPanesProps extends StObject {
    
    // 支持添加 true
    var dblClickSplitter: Boolean
    
    // 是否监控插槽 false
    var horizontal: Boolean
    
    // 是否水平 false
    var pushOtherPanes: Boolean
    
    var watchSlots: Boolean
  }
  object splitPanesProps {
    
    @scala.inline
    def apply(dblClickSplitter: Boolean, horizontal: Boolean, pushOtherPanes: Boolean, watchSlots: Boolean): splitPanesProps = {
      val __obj = js.Dynamic.literal(dblClickSplitter = dblClickSplitter.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], pushOtherPanes = pushOtherPanes.asInstanceOf[js.Any], watchSlots = watchSlots.asInstanceOf[js.Any])
      __obj.asInstanceOf[splitPanesProps]
    }
    
    @scala.inline
    implicit class splitPanesPropsMutableBuilder[Self <: splitPanesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDblClickSplitter(value: Boolean): Self = StObject.set(x, "dblClickSplitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushOtherPanes(value: Boolean): Self = StObject.set(x, "pushOtherPanes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchSlots(value: Boolean): Self = StObject.set(x, "watchSlots", value.asInstanceOf[js.Any])
    }
  }
  
  trait splitPanesWatch extends StObject {
    
    def defaultPercent(`val`: js.Any): Unit
  }
  object splitPanesWatch {
    
    @scala.inline
    def apply(defaultPercent: js.Any => Unit): splitPanesWatch = {
      val __obj = js.Dynamic.literal(defaultPercent = js.Any.fromFunction1(defaultPercent))
      __obj.asInstanceOf[splitPanesWatch]
    }
    
    @scala.inline
    implicit class splitPanesWatchMutableBuilder[Self <: splitPanesWatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultPercent(value: js.Any => Unit): Self = StObject.set(x, "defaultPercent", js.Any.fromFunction1(value))
    }
  }
  
  trait splitterTapsTypes extends StObject {
    
    var splitter: Null | Double
    
    var timeoutId: Null | js.Object
  }
  object splitterTapsTypes {
    
    @scala.inline
    def apply(): splitterTapsTypes = {
      val __obj = js.Dynamic.literal(splitter = null, timeoutId = null)
      __obj.asInstanceOf[splitterTapsTypes]
    }
    
    @scala.inline
    implicit class splitterTapsTypesMutableBuilder[Self <: splitterTapsTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSplitter(value: Double): Self = StObject.set(x, "splitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitterNull: Self = StObject.set(x, "splitter", null)
      
      @scala.inline
      def setTimeoutId(value: js.Object): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutIdNull: Self = StObject.set(x, "timeoutId", null)
    }
  }
  
  trait touchTypes extends StObject {
    
    var activeSplitter: Null | Double
    
    var dragging: Boolean
    
    var mouseDown: Boolean
  }
  object touchTypes {
    
    @scala.inline
    def apply(dragging: Boolean, mouseDown: Boolean): touchTypes = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], mouseDown = mouseDown.asInstanceOf[js.Any], activeSplitter = null)
      __obj.asInstanceOf[touchTypes]
    }
    
    @scala.inline
    implicit class touchTypesMutableBuilder[Self <: touchTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveSplitter(value: Double): Self = StObject.set(x, "activeSplitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSplitterNull: Self = StObject.set(x, "activeSplitter", null)
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseDown(value: Boolean): Self = StObject.set(x, "mouseDown", value.asInstanceOf[js.Any])
    }
  }
}
