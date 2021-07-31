package typings.simonwepSelectionJs

import typings.simonwepSelectionJs.anon.Added
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.`class`
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.beforestart
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.boundaries
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.disableTouch
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.frame
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.manualScrollSpeed
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.mode
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.move
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.scrollSpeedDivider
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.selectables
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.selectionAreaContainer
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.singleClick
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.start
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.startThreshold
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.startareas
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.stop
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.tapMode
import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Node
import typings.std.Record
import typings.std.TouchEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@simonwep/selection-js", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Selection {
    def this(options: SelectionOptions) = this()
  }
  @JSImport("@simonwep/selection-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def create(options: SelectionOptions): Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Selection]
  
  /* static member */
  @JSImport("@simonwep/selection-js", "utils")
  @js.native
  def utils: SelectionUtils = js.native
  @scala.inline
  def utils_=(x: SelectionUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@simonwep/selection-js", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  type ElementList = HTMLCollection | HTMLElement | js.Array[HTMLElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.simonwepSelectionJs.simonwepSelectionJsStrings.touch
    - typings.simonwepSelectionJs.simonwepSelectionJsStrings.center
    - typings.simonwepSelectionJs.simonwepSelectionJsStrings.cover
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def center: typings.simonwepSelectionJs.simonwepSelectionJsStrings.center = "center".asInstanceOf[typings.simonwepSelectionJs.simonwepSelectionJsStrings.center]
    
    @scala.inline
    def cover: typings.simonwepSelectionJs.simonwepSelectionJsStrings.cover = "cover".asInstanceOf[typings.simonwepSelectionJs.simonwepSelectionJsStrings.cover]
    
    @scala.inline
    def touch: typings.simonwepSelectionJs.simonwepSelectionJsStrings.touch = "touch".asInstanceOf[typings.simonwepSelectionJs.simonwepSelectionJsStrings.touch]
  }
  
  @js.native
  trait Selection extends StObject {
    
    def cancel(): Unit = js.native
    def cancel(keepEvent: Boolean): Unit = js.native
    
    def clearSelection(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def getSelection(): js.Array[Element] = js.native
    
    def keepSelection(): Unit = js.native
    
    def off[E /* <: /* keyof @simonwep/selection-js.@simonwep/selection-js.SelectionEvents */ beforestart | start | move | stop */](
      ev: E,
      cb: /* import warning: importer.ImportType#apply Failed type conversion: @simonwep/selection-js.@simonwep/selection-js.SelectionEvents[E] */ js.Any
    ): this.type = js.native
    
    def on[E /* <: /* keyof @simonwep/selection-js.@simonwep/selection-js.SelectionEvents */ beforestart | start | move | stop */](
      ev: E,
      cb: /* import warning: importer.ImportType#apply Failed type conversion: @simonwep/selection-js.@simonwep/selection-js.SelectionEvents[E] */ js.Any
    ): this.type = js.native
    
    @JSName("option")
    def option_boundaries(name: boundaries): js.UndefOr[js.Array[String]] = js.native
    @JSName("option")
    def option_boundaries(name: boundaries, value: js.UndefOr[js.Array[String]]): js.UndefOr[js.Array[String]] = js.native
    @JSName("option")
    def option_class(name: `class`): js.UndefOr[String] = js.native
    @JSName("option")
    def option_class(name: `class`, value: js.UndefOr[String]): js.UndefOr[String] = js.native
    @JSName("option")
    def option_disableTouch(name: disableTouch): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_disableTouch(name: disableTouch, value: js.UndefOr[Boolean]): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_frame(name: frame): js.UndefOr[Node] = js.native
    @JSName("option")
    def option_frame(name: frame, value: js.UndefOr[Node]): js.UndefOr[Node] = js.native
    @JSName("option")
    def option_manualScrollSpeed(name: manualScrollSpeed): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_manualScrollSpeed(name: manualScrollSpeed, value: js.UndefOr[Double]): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_mode(name: mode): js.UndefOr[Mode] = js.native
    @JSName("option")
    def option_mode(name: mode, value: js.UndefOr[Mode]): js.UndefOr[Mode] = js.native
    @JSName("option")
    def option_scrollSpeedDivider(name: scrollSpeedDivider): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_scrollSpeedDivider(name: scrollSpeedDivider, value: js.UndefOr[Double]): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_selectables(name: selectables): js.UndefOr[js.Array[String]] = js.native
    @JSName("option")
    def option_selectables(name: selectables, value: js.UndefOr[js.Array[String]]): js.UndefOr[js.Array[String]] = js.native
    @JSName("option")
    def option_selectionAreaContainer(name: selectionAreaContainer): js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
    @JSName("option")
    def option_selectionAreaContainer(
      name: selectionAreaContainer,
      value: js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])]
    ): js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
    @JSName("option")
    def option_singleClick(name: singleClick): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_singleClick(name: singleClick, value: js.UndefOr[Boolean]): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_startThreshold(name: startThreshold): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_startThreshold(name: startThreshold, value: js.UndefOr[Double]): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_startareas(name: startareas): js.UndefOr[js.Array[String]] = js.native
    @JSName("option")
    def option_startareas(name: startareas, value: js.UndefOr[js.Array[String]]): js.UndefOr[js.Array[String]] = js.native
    @JSName("option")
    def option_tapMode(name: tapMode): js.UndefOr[TapMode] = js.native
    @JSName("option")
    def option_tapMode(name: tapMode, value: js.UndefOr[TapMode]): js.UndefOr[TapMode] = js.native
    
    def removeFromSelection(el: Element): Unit = js.native
    
    def resolveSelectables(): Unit = js.native
    
    @JSName("select")
    def select_0(
      query: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(selector : string | std.HTMLElement | std.ReadonlyArray<string | std.HTMLElement>): std.Array<std.Element>>[0] */ js.Any
    ): this.type = js.native
    
    def trigger(evt: UIEvent): Unit = js.native
    def trigger(evt: UIEvent, silent: Boolean): Unit = js.native
  }
  
  trait SelectionEvent extends StObject {
    
    var area: Element
    
    var changed: Added
    
    var inst: Selection
    
    var oe: MouseEvent | TouchEvent
    
    var selected: js.Array[Element]
  }
  object SelectionEvent {
    
    @scala.inline
    def apply(
      area: Element,
      changed: Added,
      inst: Selection,
      oe: MouseEvent | TouchEvent,
      selected: js.Array[Element]
    ): SelectionEvent = {
      val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], inst = inst.asInstanceOf[js.Any], oe = oe.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionEvent]
    }
    
    @scala.inline
    implicit class SelectionEventMutableBuilder[Self <: SelectionEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea(value: Element): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChanged(value: Added): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInst(value: Selection): Self = StObject.set(x, "inst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOe(value: MouseEvent | TouchEvent): Self = StObject.set(x, "oe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: js.Array[Element]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedVarargs(value: Element*): Self = StObject.set(x, "selected", js.Array(value :_*))
    }
  }
  
  trait SelectionEvents extends StObject {
    
    def beforestart(e: SelectionEvent): Boolean
    
    def move(e: SelectionEvent): Unit
    
    def start(e: SelectionEvent): Unit
    
    def stop(e: SelectionEvent): Unit
  }
  object SelectionEvents {
    
    @scala.inline
    def apply(
      beforestart: SelectionEvent => Boolean,
      move: SelectionEvent => Unit,
      start: SelectionEvent => Unit,
      stop: SelectionEvent => Unit
    ): SelectionEvents = {
      val __obj = js.Dynamic.literal(beforestart = js.Any.fromFunction1(beforestart), move = js.Any.fromFunction1(move), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
      __obj.asInstanceOf[SelectionEvents]
    }
    
    @scala.inline
    implicit class SelectionEventsMutableBuilder[Self <: SelectionEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforestart(value: SelectionEvent => Boolean): Self = StObject.set(x, "beforestart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMove(value: SelectionEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: SelectionEvent => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStop(value: SelectionEvent => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    }
  }
  
  trait SelectionOptions extends StObject {
    
    var boundaries: js.UndefOr[js.Array[String]] = js.undefined
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var disableTouch: js.UndefOr[Boolean] = js.undefined
    
    var frame: js.UndefOr[Node] = js.undefined
    
    var manualScrollSpeed: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var scrollSpeedDivider: js.UndefOr[Double] = js.undefined
    
    var selectables: js.UndefOr[js.Array[String]] = js.undefined
    
    var selectionAreaContainer: js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.undefined
    
    var singleClick: js.UndefOr[Boolean] = js.undefined
    
    var startThreshold: js.UndefOr[Double] = js.undefined
    
    var startareas: js.UndefOr[js.Array[String]] = js.undefined
    
    var tapMode: js.UndefOr[TapMode] = js.undefined
  }
  object SelectionOptions {
    
    @scala.inline
    def apply(): SelectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionOptions]
    }
    
    @scala.inline
    implicit class SelectionOptionsMutableBuilder[Self <: SelectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundaries(value: js.Array[String]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundariesUndefined: Self = StObject.set(x, "boundaries", js.undefined)
      
      @scala.inline
      def setBoundariesVarargs(value: String*): Self = StObject.set(x, "boundaries", js.Array(value :_*))
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
      
      @scala.inline
      def setFrame(value: Node): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setManualScrollSpeed(value: Double): Self = StObject.set(x, "manualScrollSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualScrollSpeedUndefined: Self = StObject.set(x, "manualScrollSpeed", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setScrollSpeedDivider(value: Double): Self = StObject.set(x, "scrollSpeedDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSpeedDividerUndefined: Self = StObject.set(x, "scrollSpeedDivider", js.undefined)
      
      @scala.inline
      def setSelectables(value: js.Array[String]): Self = StObject.set(x, "selectables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectablesUndefined: Self = StObject.set(x, "selectables", js.undefined)
      
      @scala.inline
      def setSelectablesVarargs(value: String*): Self = StObject.set(x, "selectables", js.Array(value :_*))
      
      @scala.inline
      def setSelectionAreaContainer(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = StObject.set(x, "selectionAreaContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionAreaContainerUndefined: Self = StObject.set(x, "selectionAreaContainer", js.undefined)
      
      @scala.inline
      def setSelectionAreaContainerVarargs(value: (String | HTMLElement)*): Self = StObject.set(x, "selectionAreaContainer", js.Array(value :_*))
      
      @scala.inline
      def setSingleClick(value: Boolean): Self = StObject.set(x, "singleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleClickUndefined: Self = StObject.set(x, "singleClick", js.undefined)
      
      @scala.inline
      def setStartThreshold(value: Double): Self = StObject.set(x, "startThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartThresholdUndefined: Self = StObject.set(x, "startThreshold", js.undefined)
      
      @scala.inline
      def setStartareas(value: js.Array[String]): Self = StObject.set(x, "startareas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartareasUndefined: Self = StObject.set(x, "startareas", js.undefined)
      
      @scala.inline
      def setStartareasVarargs(value: String*): Self = StObject.set(x, "startareas", js.Array(value :_*))
      
      @scala.inline
      def setTapMode(value: TapMode): Self = StObject.set(x, "tapMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTapModeUndefined: Self = StObject.set(x, "tapMode", js.undefined)
    }
  }
  
  @js.native
  trait SelectionUtils extends StObject {
    
    def css(el: Element, attr: String, `val`: String): js.Any = js.native
    def css(el: Element, attr: String, `val`: Double): js.Any = js.native
    def css(el: Element, attr: Record[String, String | Double]): js.Any = js.native
    
    def eventPath(evt: Event): js.Array[EventTarget] = js.native
    
    def intersects(a: Element, b: Element, mode: Mode): Boolean = js.native
    
    def off(el: ElementList, events: String, fn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
    def off(
      el: ElementList,
      events: String,
      fn: js.Function1[/* ev */ Event, Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    def off(el: ElementList, events: js.Array[String], fn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
    def off(
      el: ElementList,
      events: js.Array[String],
      fn: js.Function1[/* ev */ Event, Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def on(el: ElementList, events: String, fn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
    def on(
      el: ElementList,
      events: String,
      fn: js.Function1[/* ev */ Event, Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    def on(el: ElementList, events: js.Array[String], fn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
    def on(
      el: ElementList,
      events: js.Array[String],
      fn: js.Function1[/* ev */ Event, Unit],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def removeElement(arr: js.Array[Element], el: Element): Unit = js.native
    
    def selectAll(selector: String): js.Array[Element] = js.native
    def selectAll(selector: js.Array[String | HTMLElement]): js.Array[Element] = js.native
    def selectAll(selector: HTMLElement): js.Array[Element] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simonwepSelectionJs.simonwepSelectionJsStrings.touch
    - typings.simonwepSelectionJs.simonwepSelectionJsStrings.native
  */
  trait TapMode extends StObject
  object TapMode {
    
    @scala.inline
    def native: typings.simonwepSelectionJs.simonwepSelectionJsStrings.native = "native".asInstanceOf[typings.simonwepSelectionJs.simonwepSelectionJsStrings.native]
    
    @scala.inline
    def touch: typings.simonwepSelectionJs.simonwepSelectionJsStrings.touch = "touch".asInstanceOf[typings.simonwepSelectionJs.simonwepSelectionJsStrings.touch]
  }
}
