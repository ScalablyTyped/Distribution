package typings.sortablejs

import typings.sortablejs.anon.Get
import typings.sortablejs.anon.Index
import typings.sortablejs.anon.X
import typings.sortablejs.pluginsMod.AutoScrollOptions
import typings.sortablejs.pluginsMod.AutoScrollPlugin
import typings.sortablejs.pluginsMod.MultiDragOptions
import typings.sortablejs.pluginsMod.MultiDragPlugin
import typings.sortablejs.pluginsMod.OnSpillOptions
import typings.sortablejs.pluginsMod.OnSpillPlugin
import typings.sortablejs.pluginsMod.SortablePlugin
import typings.sortablejs.pluginsMod.SwapOptions
import typings.sortablejs.pluginsMod.SwapPlugin
import typings.sortablejs.sortablejsInts.`-1`
import typings.sortablejs.sortablejsInts.`1`
import typings.sortablejs.sortablejsStrings.animation
import typings.sortablejs.sortablejsStrings.bubbleScroll
import typings.sortablejs.sortablejsStrings.chosenClass
import typings.sortablejs.sortablejsStrings.clone
import typings.sortablejs.sortablejsStrings.continue
import typings.sortablejs.sortablejsStrings.dataIdAttr
import typings.sortablejs.sortablejsStrings.delay
import typings.sortablejs.sortablejsStrings.delayOnTouchOnly
import typings.sortablejs.sortablejsStrings.direction
import typings.sortablejs.sortablejsStrings.disabled
import typings.sortablejs.sortablejsStrings.dragClass
import typings.sortablejs.sortablejsStrings.draggable
import typings.sortablejs.sortablejsStrings.dragoverBubble
import typings.sortablejs.sortablejsStrings.dropBubble
import typings.sortablejs.sortablejsStrings.easing
import typings.sortablejs.sortablejsStrings.emptyInsertThreshold
import typings.sortablejs.sortablejsStrings.fallbackClass
import typings.sortablejs.sortablejsStrings.fallbackOffset
import typings.sortablejs.sortablejsStrings.fallbackOnBody
import typings.sortablejs.sortablejsStrings.fallbackTolerance
import typings.sortablejs.sortablejsStrings.filter
import typings.sortablejs.sortablejsStrings.forceFallback
import typings.sortablejs.sortablejsStrings.ghostClass
import typings.sortablejs.sortablejsStrings.group
import typings.sortablejs.sortablejsStrings.handle
import typings.sortablejs.sortablejsStrings.ignore
import typings.sortablejs.sortablejsStrings.invertSwap
import typings.sortablejs.sortablejsStrings.invertedSwapThreshold
import typings.sortablejs.sortablejsStrings.multiDrag
import typings.sortablejs.sortablejsStrings.multiDragKey
import typings.sortablejs.sortablejsStrings.onAdd
import typings.sortablejs.sortablejsStrings.onChange
import typings.sortablejs.sortablejsStrings.onChoose
import typings.sortablejs.sortablejsStrings.onClone
import typings.sortablejs.sortablejsStrings.onDeselect
import typings.sortablejs.sortablejsStrings.onEnd
import typings.sortablejs.sortablejsStrings.onFilter
import typings.sortablejs.sortablejsStrings.onMove
import typings.sortablejs.sortablejsStrings.onRemove
import typings.sortablejs.sortablejsStrings.onSelect
import typings.sortablejs.sortablejsStrings.onSort
import typings.sortablejs.sortablejsStrings.onSpill
import typings.sortablejs.sortablejsStrings.onStart
import typings.sortablejs.sortablejsStrings.onUnchoose
import typings.sortablejs.sortablejsStrings.onUpdate
import typings.sortablejs.sortablejsStrings.preventOnFilter
import typings.sortablejs.sortablejsStrings.removeCloneOnHide
import typings.sortablejs.sortablejsStrings.removeOnSpill
import typings.sortablejs.sortablejsStrings.revertOnSpill
import typings.sortablejs.sortablejsStrings.scroll
import typings.sortablejs.sortablejsStrings.scrollFn
import typings.sortablejs.sortablejsStrings.scrollSensitivity
import typings.sortablejs.sortablejsStrings.scrollSpeed
import typings.sortablejs.sortablejsStrings.selectedClass
import typings.sortablejs.sortablejsStrings.setData
import typings.sortablejs.sortablejsStrings.sort
import typings.sortablejs.sortablejsStrings.store
import typings.sortablejs.sortablejsStrings.swap
import typings.sortablejs.sortablejsStrings.swapClass
import typings.sortablejs.sortablejsStrings.swapThreshold
import typings.sortablejs.sortablejsStrings.touchStartThreshold
import typings.std.CSSStyleDeclaration
import typings.std.DataTransfer
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sortablejs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Sortable {
    /**
      * Sortable's main constructor.
      * @param element Any variety of HTMLElement.
      * @param options Sortable options object.
      */
    def this(element: HTMLElement, options: Options) = this()
  }
  @JSImport("sortablejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sortablejs", "AutoScroll")
  @js.native
  open class AutoScroll () extends AutoScrollPlugin
  
  @JSImport("sortablejs", "MultiDrag")
  @js.native
  open class MultiDrag () extends MultiDragPlugin
  
  @JSImport("sortablejs", "OnSpill")
  @js.native
  open class OnSpill () extends OnSpillPlugin
  
  @JSImport("sortablejs", "Plugin")
  @js.native
  open class Plugin () extends SortablePlugin
  
  @JSImport("sortablejs", "Swap")
  @js.native
  open class Swap () extends SwapPlugin
  
  /* static member */
  @JSImport("sortablejs", "active")
  @js.native
  def active: Sortable | Null = js.native
  inline def active_=(x: Sortable | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
  
  /** The clone element. */
  /* static member */
  @JSImport("sortablejs", "clone")
  @js.native
  def clone_ : HTMLElement | Null = js.native
  
  inline def clone__=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clone")(x.asInstanceOf[js.Any])
  
  /**
    * Creation of new instances.
    * @param element Any variety of HTMLElement.
    * @param options Sortable options object.
    */
  /* static member */
  inline def create(element: HTMLElement): Sortable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[Sortable]
  inline def create(element: HTMLElement, options: Options): Sortable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sortable]
  
  /** The element being dragged. */
  /* static member */
  @JSImport("sortablejs", "dragged")
  @js.native
  def dragged: HTMLElement | Null = js.native
  inline def dragged_=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragged")(x.asInstanceOf[js.Any])
  
  /** Get the Sortable instance on an element. */
  /* static member */
  inline def get(element: HTMLElement): js.UndefOr[Sortable] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Sortable]]
  
  /** The ghost element.*/
  /* static member */
  @JSImport("sortablejs", "ghost")
  @js.native
  def ghost: HTMLElement | Null = js.native
  inline def ghost_=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ghost")(x.asInstanceOf[js.Any])
  
  /**
    * Mounts a plugin to Sortable
    * @param sortablePlugin a sortable plugin.
    *
    * @example
    *
    * Sortable.mount(new MultiDrag(), new AutoScroll())
    */
  /* static member */
  inline def mount(sortablePlugins: SortablePlugin*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(sortablePlugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("sortablejs", "utils")
  @js.native
  def utils: Utils_ = js.native
  inline def utils_=(x: Utils_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
  
  /** Get the Sortable version */
  /* static member */
  @JSImport("sortablejs", "version")
  @js.native
  val version: String = js.native
  
  trait DOMRect extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object DOMRect {
    
    inline def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): DOMRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMRect]
    }
    
    extension [Self <: DOMRect](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sortablejs.sortablejsStrings.vertical
    - typings.sortablejs.sortablejsStrings.horizontal
  */
  trait Direction extends StObject
  object Direction {
    
    inline def horizontal: typings.sortablejs.sortablejsStrings.horizontal = "horizontal".asInstanceOf[typings.sortablejs.sortablejsStrings.horizontal]
    
    inline def vertical: typings.sortablejs.sortablejsStrings.vertical = "vertical".asInstanceOf[typings.sortablejs.sortablejsStrings.vertical]
  }
  
  trait GroupOptions extends StObject {
    
    /**
      * a canonical version of pull, created by Sortable
      */
    var checkPull: js.UndefOr[
        js.Function4[
          /* sortable */ Sortable, 
          /* activeSortable */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          Boolean | String | js.Array[String]
        ]
      ] = js.undefined
    
    /**
      * a canonical version of put, created by Sortable
      */
    var checkPut: js.UndefOr[
        js.Function4[
          /* sortable */ Sortable, 
          /* activeSortable */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          Boolean | String | clone | js.Array[String]
        ]
      ] = js.undefined
    
    /**
      * group name
      */
    var name: String
    
    /**
      * ability to move from the list. clone — copy the item, rather than move.
      */
    var pull: js.UndefOr[
        PullResult | (js.Function4[
          /* to */ Sortable, 
          /* from */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          PullResult
        ])
      ] = js.undefined
    
    /**
      * whether elements can be added from other lists, or an array of group names from which elements can be taken.
      */
    var put: js.UndefOr[
        PutResult | (js.Function4[
          /* to */ Sortable, 
          /* from */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          PutResult
        ])
      ] = js.undefined
    
    /**
      * revert cloned element to initial position after moving to a another list.
      */
    var revertClone: js.UndefOr[Boolean] = js.undefined
  }
  object GroupOptions {
    
    inline def apply(name: String): GroupOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupOptions]
    }
    
    extension [Self <: GroupOptions](x: Self) {
      
      inline def setCheckPull(
        value: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | js.Array[String]
      ): Self = StObject.set(x, "checkPull", js.Any.fromFunction4(value))
      
      inline def setCheckPullUndefined: Self = StObject.set(x, "checkPull", js.undefined)
      
      inline def setCheckPut(
        value: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | clone | js.Array[String]
      ): Self = StObject.set(x, "checkPut", js.Any.fromFunction4(value))
      
      inline def setCheckPutUndefined: Self = StObject.set(x, "checkPut", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPull(
        value: PullResult | (js.Function4[
              /* to */ Sortable, 
              /* from */ Sortable, 
              /* dragEl */ HTMLElement, 
              /* event */ SortableEvent, 
              PullResult
            ])
      ): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullFunction4(
        value: (/* to */ Sortable, /* from */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => PullResult
      ): Self = StObject.set(x, "pull", js.Any.fromFunction4(value))
      
      inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      inline def setPullVarargs(value: String*): Self = StObject.set(x, "pull", js.Array(value*))
      
      inline def setPut(
        value: PutResult | (js.Function4[
              /* to */ Sortable, 
              /* from */ Sortable, 
              /* dragEl */ HTMLElement, 
              /* event */ SortableEvent, 
              PutResult
            ])
      ): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setPutFunction4(
        value: (/* to */ Sortable, /* from */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => PutResult
      ): Self = StObject.set(x, "put", js.Any.fromFunction4(value))
      
      inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      inline def setPutVarargs(value: String*): Self = StObject.set(x, "put", js.Array(value*))
      
      inline def setRevertClone(value: Boolean): Self = StObject.set(x, "revertClone", value.asInstanceOf[js.Any])
      
      inline def setRevertCloneUndefined: Self = StObject.set(x, "revertClone", js.undefined)
    }
  }
  
  @js.native
  trait MoveEvent
    extends StObject
       with Event {
    
    var dragged: HTMLElement = js.native
    
    var draggedRect: DOMRect = js.native
    
    var from: HTMLElement = js.native
    
    /**
      * element on which have guided
      */
    var related: HTMLElement = js.native
    
    var relatedRect: DOMRect = js.native
    
    var to: HTMLElement = js.native
    
    var willInsertAfter: js.UndefOr[Boolean] = js.native
  }
  
  trait Options
    extends StObject
       with SortableOptions
       with AutoScrollOptions
       with MultiDragOptions
       with OnSpillOptions
       with SwapOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  type PullResult = js.Array[String] | Boolean | clone
  
  type PutResult = js.Array[String] | Boolean
  
  @js.native
  trait Sortable extends StObject {
    
    /**
      * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
      * @param element an HTMLElement or selector string.
      * @param selector default: `options.draggable`
      */
    def closest(element: HTMLElement): HTMLElement | Null = js.native
    def closest(element: HTMLElement, selector: String): HTMLElement | Null = js.native
    
    /**
      * Removes the sortable functionality completely.
      */
    def destroy(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    def option(
      name: onMove,
      value: js.Function2[/* evt */ MoveEvent, /* originalEvent */ Event, Boolean | `-1` | `1` | Unit]
    ): Unit = js.native
    def option(
      name: scrollFn,
      value: js.ThisFunction5[
          /* this */ typings.sortablejs.mod.^, 
          /* offsetX */ Double, 
          /* offsetY */ Double, 
          /* originalEvent */ Event, 
          /* touchEvt */ TouchEvent, 
          /* hoverTargetEl */ HTMLElement, 
          continue | Unit
        ]
    ): Unit = js.native
    @JSName("option")
    def option_animation(name: animation): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_animation(name: animation, value: Double): Unit = js.native
    /**
      * Options getter/setter
      * @param name a Sortable.Options property.
      * @param value a value.
      */
    @JSName("option")
    def option_animation_Unit(name: animation): Unit = js.native
    @JSName("option")
    def option_bubbleScroll(name: bubbleScroll): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_bubbleScroll(name: bubbleScroll, value: Boolean): Unit = js.native
    @JSName("option")
    def option_bubbleScroll_Unit(name: bubbleScroll): Unit = js.native
    @JSName("option")
    def option_chosenClass(name: chosenClass): js.UndefOr[String] = js.native
    @JSName("option")
    def option_chosenClass(name: chosenClass, value: String): Unit = js.native
    @JSName("option")
    def option_chosenClass_Unit(name: chosenClass): Unit = js.native
    @JSName("option")
    def option_dataIdAttr(name: dataIdAttr): js.UndefOr[String] = js.native
    @JSName("option")
    def option_dataIdAttr(name: dataIdAttr, value: String): Unit = js.native
    @JSName("option")
    def option_dataIdAttr_Unit(name: dataIdAttr): Unit = js.native
    @JSName("option")
    def option_delay(name: delay): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_delay(name: delay, value: Double): Unit = js.native
    @JSName("option")
    def option_delayOnTouchOnly(name: delayOnTouchOnly): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_delayOnTouchOnly(name: delayOnTouchOnly, value: Boolean): Unit = js.native
    @JSName("option")
    def option_delayOnTouchOnly_Unit(name: delayOnTouchOnly): Unit = js.native
    @JSName("option")
    def option_delay_Unit(name: delay): Unit = js.native
    @JSName("option")
    def option_direction(name: direction): js.UndefOr[
        (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
      ] = js.native
    @JSName("option")
    def option_direction(
      name: direction,
      value: js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]
    ): Unit = js.native
    @JSName("option")
    def option_direction(name: direction, value: Direction): Unit = js.native
    @JSName("option")
    def option_direction_Unit(name: direction): Unit = js.native
    @JSName("option")
    def option_disabled(name: disabled): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_disabled(name: disabled, value: Boolean): Unit = js.native
    @JSName("option")
    def option_disabled_Unit(name: disabled): Unit = js.native
    @JSName("option")
    def option_dragClass(name: dragClass): js.UndefOr[String] = js.native
    @JSName("option")
    def option_dragClass(name: dragClass, value: String): Unit = js.native
    @JSName("option")
    def option_dragClass_Unit(name: dragClass): Unit = js.native
    @JSName("option")
    def option_draggable(name: draggable): js.UndefOr[String] = js.native
    @JSName("option")
    def option_draggable(name: draggable, value: String): Unit = js.native
    @JSName("option")
    def option_draggable_Unit(name: draggable): Unit = js.native
    @JSName("option")
    def option_dragoverBubble(name: dragoverBubble): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_dragoverBubble(name: dragoverBubble, value: Boolean): Unit = js.native
    @JSName("option")
    def option_dragoverBubble_Unit(name: dragoverBubble): Unit = js.native
    @JSName("option")
    def option_dropBubble(name: dropBubble): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_dropBubble(name: dropBubble, value: Boolean): Unit = js.native
    @JSName("option")
    def option_dropBubble_Unit(name: dropBubble): Unit = js.native
    @JSName("option")
    def option_easing(name: easing): js.UndefOr[String] = js.native
    @JSName("option")
    def option_easing(name: easing, value: String): Unit = js.native
    @JSName("option")
    def option_easing_Unit(name: easing): Unit = js.native
    @JSName("option")
    def option_emptyInsertThreshold(name: emptyInsertThreshold): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_emptyInsertThreshold(name: emptyInsertThreshold, value: Double): Unit = js.native
    @JSName("option")
    def option_emptyInsertThreshold_Unit(name: emptyInsertThreshold): Unit = js.native
    @JSName("option")
    def option_fallbackClass(name: fallbackClass): js.UndefOr[String] = js.native
    @JSName("option")
    def option_fallbackClass(name: fallbackClass, value: String): Unit = js.native
    @JSName("option")
    def option_fallbackClass_Unit(name: fallbackClass): Unit = js.native
    @JSName("option")
    def option_fallbackOffset(name: fallbackOffset): js.UndefOr[X] = js.native
    @JSName("option")
    def option_fallbackOffset(name: fallbackOffset, value: X): Unit = js.native
    @JSName("option")
    def option_fallbackOffset_Unit(name: fallbackOffset): Unit = js.native
    @JSName("option")
    def option_fallbackOnBody(name: fallbackOnBody): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_fallbackOnBody(name: fallbackOnBody, value: Boolean): Unit = js.native
    @JSName("option")
    def option_fallbackOnBody_Unit(name: fallbackOnBody): Unit = js.native
    @JSName("option")
    def option_fallbackTolerance(name: fallbackTolerance): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_fallbackTolerance(name: fallbackTolerance, value: Double): Unit = js.native
    @JSName("option")
    def option_fallbackTolerance_Unit(name: fallbackTolerance): Unit = js.native
    @JSName("option")
    def option_filter(name: filter): js.UndefOr[
        String | (js.ThisFunction3[
          /* this */ this.type, 
          /* event */ Event | TouchEvent, 
          /* target */ HTMLElement, 
          /* sortable */ this.type, 
          Boolean
        ])
      ] = js.native
    @JSName("option")
    def option_filter(name: filter, value: String): Unit = js.native
    @JSName("option")
    def option_filter(
      name: filter,
      value: js.ThisFunction3[
          /* this */ this.type, 
          /* event */ Event | TouchEvent, 
          /* target */ HTMLElement, 
          /* sortable */ this.type, 
          Boolean
        ]
    ): Unit = js.native
    @JSName("option")
    def option_filter_Unit(name: filter): Unit = js.native
    @JSName("option")
    def option_forceFallback(name: forceFallback): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_forceFallback(name: forceFallback, value: Boolean): Unit = js.native
    @JSName("option")
    def option_forceFallback_Unit(name: forceFallback): Unit = js.native
    @JSName("option")
    def option_ghostClass(name: ghostClass): js.UndefOr[String] = js.native
    @JSName("option")
    def option_ghostClass(name: ghostClass, value: String): Unit = js.native
    @JSName("option")
    def option_ghostClass_Unit(name: ghostClass): Unit = js.native
    @JSName("option")
    def option_group(name: group): js.UndefOr[String | GroupOptions] = js.native
    @JSName("option")
    def option_group(name: group, value: String): Unit = js.native
    @JSName("option")
    def option_group(name: group, value: GroupOptions): Unit = js.native
    @JSName("option")
    def option_group_Unit(name: group): Unit = js.native
    @JSName("option")
    def option_handle(name: handle): js.UndefOr[String] = js.native
    @JSName("option")
    def option_handle(name: handle, value: String): Unit = js.native
    @JSName("option")
    def option_handle_Unit(name: handle): Unit = js.native
    @JSName("option")
    def option_ignore(name: ignore): js.UndefOr[String] = js.native
    @JSName("option")
    def option_ignore(name: ignore, value: String): Unit = js.native
    @JSName("option")
    def option_ignore_Unit(name: ignore): Unit = js.native
    @JSName("option")
    def option_invertSwap(name: invertSwap): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_invertSwap(name: invertSwap, value: Boolean): Unit = js.native
    @JSName("option")
    def option_invertSwap_Unit(name: invertSwap): Unit = js.native
    @JSName("option")
    def option_invertedSwapThreshold(name: invertedSwapThreshold): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_invertedSwapThreshold(name: invertedSwapThreshold, value: Double): Unit = js.native
    @JSName("option")
    def option_invertedSwapThreshold_Unit(name: invertedSwapThreshold): Unit = js.native
    @JSName("option")
    def option_multiDrag(name: multiDrag): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_multiDrag(name: multiDrag, value: Boolean): Unit = js.native
    @JSName("option")
    def option_multiDragKey(name: multiDragKey): js.UndefOr[Null] = js.native
    @JSName("option")
    def option_multiDragKey_Unit(name: multiDragKey): Unit = js.native
    @JSName("option")
    def option_multiDrag_Unit(name: multiDrag): Unit = js.native
    @JSName("option")
    def option_onAdd(name: onAdd): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onAdd(name: onAdd, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onAdd_Unit(name: onAdd): Unit = js.native
    @JSName("option")
    def option_onChange(name: onChange): js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onChange(name: onChange, value: js.Function1[/* evt */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onChange_Unit(name: onChange): Unit = js.native
    @JSName("option")
    def option_onChoose(name: onChoose): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onChoose(name: onChoose, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onChoose_Unit(name: onChoose): Unit = js.native
    @JSName("option")
    def option_onClone(name: onClone): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onClone(name: onClone, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onClone_Unit(name: onClone): Unit = js.native
    @JSName("option")
    def option_onDeselect(name: onDeselect): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onDeselect(name: onDeselect, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onDeselect_Unit(name: onDeselect): Unit = js.native
    @JSName("option")
    def option_onEnd(name: onEnd): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onEnd(name: onEnd, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onEnd_Unit(name: onEnd): Unit = js.native
    @JSName("option")
    def option_onFilter(name: onFilter): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onFilter(name: onFilter, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onFilter_Unit(name: onFilter): Unit = js.native
    @JSName("option")
    def option_onMove(name: onMove): js.UndefOr[
        js.Function2[/* evt */ MoveEvent, /* originalEvent */ Event, Boolean | `-1` | `1` | Unit]
      ] = js.native
    @JSName("option")
    def option_onMove_Unit(name: onMove): Unit = js.native
    @JSName("option")
    def option_onRemove(name: onRemove): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onRemove(name: onRemove, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onRemove_Unit(name: onRemove): Unit = js.native
    @JSName("option")
    def option_onSelect(name: onSelect): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onSelect(name: onSelect, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onSelect_Unit(name: onSelect): Unit = js.native
    @JSName("option")
    def option_onSort(name: onSort): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onSort(name: onSort, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onSort_Unit(name: onSort): Unit = js.native
    @JSName("option")
    def option_onSpill(name: onSpill): js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onSpill(name: onSpill, value: js.Function1[/* evt */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onSpill_Unit(name: onSpill): Unit = js.native
    @JSName("option")
    def option_onStart(name: onStart): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onStart(name: onStart, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onStart_Unit(name: onStart): Unit = js.native
    @JSName("option")
    def option_onUnchoose(name: onUnchoose): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onUnchoose(name: onUnchoose, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onUnchoose_Unit(name: onUnchoose): Unit = js.native
    @JSName("option")
    def option_onUpdate(name: onUpdate): js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    @JSName("option")
    def option_onUpdate(name: onUpdate, value: js.Function1[/* event */ SortableEvent, Unit]): Unit = js.native
    @JSName("option")
    def option_onUpdate_Unit(name: onUpdate): Unit = js.native
    @JSName("option")
    def option_preventOnFilter(name: preventOnFilter): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_preventOnFilter(name: preventOnFilter, value: Boolean): Unit = js.native
    @JSName("option")
    def option_preventOnFilter_Unit(name: preventOnFilter): Unit = js.native
    @JSName("option")
    def option_removeCloneOnHide(name: removeCloneOnHide): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_removeCloneOnHide(name: removeCloneOnHide, value: Boolean): Unit = js.native
    @JSName("option")
    def option_removeCloneOnHide_Unit(name: removeCloneOnHide): Unit = js.native
    @JSName("option")
    def option_removeOnSpill(name: removeOnSpill): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_removeOnSpill(name: removeOnSpill, value: Boolean): Unit = js.native
    @JSName("option")
    def option_removeOnSpill_Unit(name: removeOnSpill): Unit = js.native
    @JSName("option")
    def option_revertOnSpill(name: revertOnSpill): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_revertOnSpill(name: revertOnSpill, value: Boolean): Unit = js.native
    @JSName("option")
    def option_revertOnSpill_Unit(name: revertOnSpill): Unit = js.native
    @JSName("option")
    def option_scroll(name: scroll): js.UndefOr[Boolean | HTMLElement] = js.native
    @JSName("option")
    def option_scroll(name: scroll, value: Boolean): Unit = js.native
    @JSName("option")
    def option_scroll(name: scroll, value: HTMLElement): Unit = js.native
    @JSName("option")
    def option_scrollFn(name: scrollFn): js.UndefOr[
        js.ThisFunction5[
          /* this */ typings.sortablejs.mod.^, 
          /* offsetX */ Double, 
          /* offsetY */ Double, 
          /* originalEvent */ Event, 
          /* touchEvt */ TouchEvent, 
          /* hoverTargetEl */ HTMLElement, 
          continue | Unit
        ]
      ] = js.native
    @JSName("option")
    def option_scrollFn_Unit(name: scrollFn): Unit = js.native
    @JSName("option")
    def option_scrollSensitivity(name: scrollSensitivity): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_scrollSensitivity(name: scrollSensitivity, value: Double): Unit = js.native
    @JSName("option")
    def option_scrollSensitivity_Unit(name: scrollSensitivity): Unit = js.native
    @JSName("option")
    def option_scrollSpeed(name: scrollSpeed): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_scrollSpeed(name: scrollSpeed, value: Double): Unit = js.native
    @JSName("option")
    def option_scrollSpeed_Unit(name: scrollSpeed): Unit = js.native
    @JSName("option")
    def option_scroll_Unit(name: scroll): Unit = js.native
    @JSName("option")
    def option_selectedClass(name: selectedClass): js.UndefOr[String] = js.native
    @JSName("option")
    def option_selectedClass(name: selectedClass, value: String): Unit = js.native
    @JSName("option")
    def option_selectedClass_Unit(name: selectedClass): Unit = js.native
    @JSName("option")
    def option_setData(name: setData): js.UndefOr[
        js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
      ] = js.native
    @JSName("option")
    def option_setData(
      name: setData,
      value: js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
    ): Unit = js.native
    @JSName("option")
    def option_setData_Unit(name: setData): Unit = js.native
    @JSName("option")
    def option_sort(name: sort): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_sort(name: sort, value: Boolean): Unit = js.native
    @JSName("option")
    def option_sort_Unit(name: sort): Unit = js.native
    @JSName("option")
    def option_store(name: store): js.UndefOr[Get] = js.native
    @JSName("option")
    def option_store(name: store, value: Get): Unit = js.native
    @JSName("option")
    def option_store_Unit(name: store): Unit = js.native
    @JSName("option")
    def option_swap(name: swap): js.UndefOr[Boolean] = js.native
    @JSName("option")
    def option_swap(name: swap, value: Boolean): Unit = js.native
    @JSName("option")
    def option_swapClass(name: swapClass): js.UndefOr[String] = js.native
    @JSName("option")
    def option_swapClass(name: swapClass, value: String): Unit = js.native
    @JSName("option")
    def option_swapClass_Unit(name: swapClass): Unit = js.native
    @JSName("option")
    def option_swapThreshold(name: swapThreshold): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_swapThreshold(name: swapThreshold, value: Double): Unit = js.native
    @JSName("option")
    def option_swapThreshold_Unit(name: swapThreshold): Unit = js.native
    @JSName("option")
    def option_swap_Unit(name: swap): Unit = js.native
    @JSName("option")
    def option_touchStartThreshold(name: touchStartThreshold): js.UndefOr[Double] = js.native
    @JSName("option")
    def option_touchStartThreshold(name: touchStartThreshold, value: Double): Unit = js.native
    @JSName("option")
    def option_touchStartThreshold_Unit(name: touchStartThreshold): Unit = js.native
    
    var options: Options = js.native
    
    /**
      * Saving and restoring of the sort.
      */
    def save(): Unit = js.native
    
    /**
      * Sorts the elements according to the array.
      * @param order an array of strings to sort.
      * @param useAnimation default: false.
      */
    def sort(order: js.Array[String]): Unit = js.native
    def sort(order: js.Array[String], useAnimation: Boolean): Unit = js.native
    
    /**
      * Serializes the sortable's item data-id's (dataIdAttr option) into an array of string.
      */
    def toArray(): js.Array[String] = js.native
  }
  
  @js.native
  trait SortableEvent
    extends StObject
       with Event {
    
    @JSName("clone")
    var clone_FSortableEvent: HTMLElement = js.native
    
    /**
      * previous list
      */
    var from: HTMLElement = js.native
    
    /**
      * dragged element
      */
    var item: HTMLElement = js.native
    
    /**
      * dragged elements
      */
    var items: js.Array[HTMLElement] = js.native
    
    /**
      * New index within parent, only counting draggable elements
      */
    var newDraggableIndex: js.UndefOr[Double] = js.native
    
    /**
      * new index within parent
      */
    var newIndex: js.UndefOr[Double] = js.native
    
    /**
      * When MultiDrag is used to sort, this holds a HTMLElement and newIndex for each item.
      *
      * `oldIndicies[number]` is directly related to `newIndicies[number]`
      *
      * If MultiDrag is not used to sort, this array will be empty.
      */
    var newIndicies: js.Array[Index] = js.native
    
    /**
      * Old index within parent, only counting draggable elements
      */
    var oldDraggableIndex: js.UndefOr[Double] = js.native
    
    /**
      * old index within parent
      */
    var oldIndex: js.UndefOr[Double] = js.native
    
    /**
      * When MultiDrag is used to sort, this holds a HTMLElement and oldIndex for each item selected.
      *
      * `oldIndicies[number]` is directly related to `newIndicies[number]`
      *
      * If MultiDrag is not used to sort, this array will be empty.
      */
    var oldIndicies: js.Array[Index] = js.native
    
    /**
      * Pull mode if dragging into another sortable
      */
    var pullMode: js.UndefOr[clone | Boolean] = js.native
    
    /** When Swap is used to sort, this will contain the dragging item that was dropped on.*/
    var swapItem: HTMLElement | Null = js.native
    
    @JSName("target")
    var target_SortableEvent: HTMLElement = js.native
    
    /**
      * list, in which moved element.
      */
    var to: HTMLElement = js.native
  }
  
  trait SortableOptions extends StObject {
    
    /**
      * ms, animation speed moving items when sorting, `0` — without animation
      */
    var animation: js.UndefOr[Double] = js.undefined
    
    /**
      * Class name for the chosen item
      */
    var chosenClass: js.UndefOr[String] = js.undefined
    
    var dataIdAttr: js.UndefOr[String] = js.undefined
    
    /**
      * time in milliseconds to define when the sorting should start
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Only delay if user is using touch
      */
    var delayOnTouchOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Direction of Sortable
      * (will be detected automatically if not given)
      */
    var direction: js.UndefOr[
        (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
      ] = js.undefined
    
    /**
      * Disables the sortable if set to true.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Class name for the dragging item
      */
    var dragClass: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies which items inside the element should be draggable
      */
    var draggable: js.UndefOr[String] = js.undefined
    
    var dragoverBubble: js.UndefOr[Boolean] = js.undefined
    
    var dropBubble: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Easing for animation. Defaults to null.
      *
      * See https://easings.net/ for examples.
      *
      * For other possible values, see
      * https://www.w3schools.com/cssref/css3_pr_animation-timing-function.asp
      *
      * @example
      *
      * // CSS functions
      * | 'steps(int, start | end)'
      * | 'cubic-bezier(n, n, n, n)'
      *
      * // CSS values
      * | 'linear'
      * | 'ease'
      * | 'ease-in'
      * | 'ease-out'
      * | 'ease-in-out'
      * | 'step-start'
      * | 'step-end'
      * | 'initial'
      * | 'inherit'
      */
    var easing: js.UndefOr[String] = js.undefined
    
    /**
      * distance mouse must be from empty sortable
      * to insert drag element into it
      */
    var emptyInsertThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Class name for the cloned DOM Element when using forceFallback
      */
    var fallbackClass: js.UndefOr[String] = js.undefined
    
    var fallbackOffset: js.UndefOr[X] = js.undefined
    
    /**
      * Appends the cloned DOM Element into the Document's Body
      */
    var fallbackOnBody: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify in pixels how far the mouse should move before it's considered as a drag.
      */
    var fallbackTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * Selectors that do not lead to dragging (String or Function)
      */
    var filter: js.UndefOr[
        String | (js.ThisFunction3[
          /* this */ Sortable, 
          /* event */ Event | TouchEvent, 
          /* target */ HTMLElement, 
          /* sortable */ Sortable, 
          Boolean
        ])
      ] = js.undefined
    
    /**
      * ignore the HTML5 DnD behaviour and force the fallback to kick in
      */
    var forceFallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Class name for the drop placeholder
      */
    var ghostClass: js.UndefOr[String] = js.undefined
    
    /**
      * To drag elements from one list into another, both lists must have the same group value.
      * You can also define whether lists can give away, give and keep a copy (clone), and receive elements.
      */
    var group: js.UndefOr[String | GroupOptions] = js.undefined
    
    /**
      * Drag handle selector within list items
      */
    var handle: js.UndefOr[String] = js.undefined
    
    var ignore: js.UndefOr[String] = js.undefined
    
    /**
      * Will always use inverted swap zone if set to true
      */
    var invertSwap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Threshold of the inverted swap zone
      * (will be set to `swapThreshold` value by default)
      */
    var invertedSwapThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Element is dropped into the list from another list
      */
    var onAdd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Called when dragging element changes position
      */
    var onChange: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Element is chosen
      */
    var onChoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Created a clone of an element
      */
    var onClone: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Element dragging ended
      */
    var onEnd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Attempt to drag a filtered element
      */
    var onFilter: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Event when you move an item in the list or between lists
      */
    var onMove: js.UndefOr[
        js.Function2[/* evt */ MoveEvent, /* originalEvent */ Event, Boolean | `-1` | `1` | Unit]
      ] = js.undefined
    
    /**
      * Element is removed from the list into another list
      */
    var onRemove: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Called by any change to the list (add / update / remove)
      */
    var onSort: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Element dragging started
      */
    var onStart: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Element is unchosen
      */
    var onUnchoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Changed sorting within list
      */
    var onUpdate: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Call `event.preventDefault()` when triggered `filter`
      */
    var preventOnFilter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove the clone element when it is not showing,
      * rather than just hiding it
      */
    var removeCloneOnHide: js.UndefOr[Boolean] = js.undefined
    
    var setData: js.UndefOr[
        js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
      ] = js.undefined
    
    /**
      * sorting inside list
      */
    var sort: js.UndefOr[Boolean] = js.undefined
    
    var store: js.UndefOr[Get] = js.undefined
    
    /**
      * Threshold of the swap zone.
      * Defaults to `1`
      */
    var swapThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * How many *pixels* the point should move before cancelling a delayed drag event
      */
    var touchStartThreshold: js.UndefOr[Double] = js.undefined
  }
  object SortableOptions {
    
    inline def apply(): SortableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableOptions]
    }
    
    extension [Self <: SortableOptions](x: Self) {
      
      inline def setAnimation(value: Double): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChosenClass(value: String): Self = StObject.set(x, "chosenClass", value.asInstanceOf[js.Any])
      
      inline def setChosenClassUndefined: Self = StObject.set(x, "chosenClass", js.undefined)
      
      inline def setDataIdAttr(value: String): Self = StObject.set(x, "dataIdAttr", value.asInstanceOf[js.Any])
      
      inline def setDataIdAttrUndefined: Self = StObject.set(x, "dataIdAttr", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayOnTouchOnly(value: Boolean): Self = StObject.set(x, "delayOnTouchOnly", value.asInstanceOf[js.Any])
      
      inline def setDelayOnTouchOnlyUndefined: Self = StObject.set(x, "delayOnTouchOnly", js.undefined)
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(
        value: (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
      ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionFunction3(value: (/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement) => Direction): Self = StObject.set(x, "direction", js.Any.fromFunction3(value))
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
      
      inline def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
      
      inline def setDraggable(value: String): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDragoverBubble(value: Boolean): Self = StObject.set(x, "dragoverBubble", value.asInstanceOf[js.Any])
      
      inline def setDragoverBubbleUndefined: Self = StObject.set(x, "dragoverBubble", js.undefined)
      
      inline def setDropBubble(value: Boolean): Self = StObject.set(x, "dropBubble", value.asInstanceOf[js.Any])
      
      inline def setDropBubbleUndefined: Self = StObject.set(x, "dropBubble", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEmptyInsertThreshold(value: Double): Self = StObject.set(x, "emptyInsertThreshold", value.asInstanceOf[js.Any])
      
      inline def setEmptyInsertThresholdUndefined: Self = StObject.set(x, "emptyInsertThreshold", js.undefined)
      
      inline def setFallbackClass(value: String): Self = StObject.set(x, "fallbackClass", value.asInstanceOf[js.Any])
      
      inline def setFallbackClassUndefined: Self = StObject.set(x, "fallbackClass", js.undefined)
      
      inline def setFallbackOffset(value: X): Self = StObject.set(x, "fallbackOffset", value.asInstanceOf[js.Any])
      
      inline def setFallbackOffsetUndefined: Self = StObject.set(x, "fallbackOffset", js.undefined)
      
      inline def setFallbackOnBody(value: Boolean): Self = StObject.set(x, "fallbackOnBody", value.asInstanceOf[js.Any])
      
      inline def setFallbackOnBodyUndefined: Self = StObject.set(x, "fallbackOnBody", js.undefined)
      
      inline def setFallbackTolerance(value: Double): Self = StObject.set(x, "fallbackTolerance", value.asInstanceOf[js.Any])
      
      inline def setFallbackToleranceUndefined: Self = StObject.set(x, "fallbackTolerance", js.undefined)
      
      inline def setFilter(
        value: String | (js.ThisFunction3[
              /* this */ Sortable, 
              /* event */ Event | TouchEvent, 
              /* target */ HTMLElement, 
              /* sortable */ Sortable, 
              Boolean
            ])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setForceFallback(value: Boolean): Self = StObject.set(x, "forceFallback", value.asInstanceOf[js.Any])
      
      inline def setForceFallbackUndefined: Self = StObject.set(x, "forceFallback", js.undefined)
      
      inline def setGhostClass(value: String): Self = StObject.set(x, "ghostClass", value.asInstanceOf[js.Any])
      
      inline def setGhostClassUndefined: Self = StObject.set(x, "ghostClass", js.undefined)
      
      inline def setGroup(value: String | GroupOptions): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setInvertSwap(value: Boolean): Self = StObject.set(x, "invertSwap", value.asInstanceOf[js.Any])
      
      inline def setInvertSwapUndefined: Self = StObject.set(x, "invertSwap", js.undefined)
      
      inline def setInvertedSwapThreshold(value: Double): Self = StObject.set(x, "invertedSwapThreshold", value.asInstanceOf[js.Any])
      
      inline def setInvertedSwapThresholdUndefined: Self = StObject.set(x, "invertedSwapThreshold", js.undefined)
      
      inline def setOnAdd(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnChange(value: /* evt */ SortableEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnChoose(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onChoose", js.Any.fromFunction1(value))
      
      inline def setOnChooseUndefined: Self = StObject.set(x, "onChoose", js.undefined)
      
      inline def setOnClone(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onClone", js.Any.fromFunction1(value))
      
      inline def setOnCloneUndefined: Self = StObject.set(x, "onClone", js.undefined)
      
      inline def setOnEnd(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnFilter(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setOnMove(value: (/* evt */ MoveEvent, /* originalEvent */ Event) => Boolean | `-1` | `1` | Unit): Self = StObject.set(x, "onMove", js.Any.fromFunction2(value))
      
      inline def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
      
      inline def setOnRemove(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnSort(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOnStart(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnUnchoose(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onUnchoose", js.Any.fromFunction1(value))
      
      inline def setOnUnchooseUndefined: Self = StObject.set(x, "onUnchoose", js.undefined)
      
      inline def setOnUpdate(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPreventOnFilter(value: Boolean): Self = StObject.set(x, "preventOnFilter", value.asInstanceOf[js.Any])
      
      inline def setPreventOnFilterUndefined: Self = StObject.set(x, "preventOnFilter", js.undefined)
      
      inline def setRemoveCloneOnHide(value: Boolean): Self = StObject.set(x, "removeCloneOnHide", value.asInstanceOf[js.Any])
      
      inline def setRemoveCloneOnHideUndefined: Self = StObject.set(x, "removeCloneOnHide", js.undefined)
      
      inline def setSetData(value: (/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement) => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
      
      inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setStore(value: Get): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setSwapThreshold(value: Double): Self = StObject.set(x, "swapThreshold", value.asInstanceOf[js.Any])
      
      inline def setSwapThresholdUndefined: Self = StObject.set(x, "swapThreshold", js.undefined)
      
      inline def setTouchStartThreshold(value: Double): Self = StObject.set(x, "touchStartThreshold", value.asInstanceOf[js.Any])
      
      inline def setTouchStartThresholdUndefined: Self = StObject.set(x, "touchStartThreshold", js.undefined)
    }
  }
  
  @js.native
  trait Utils_ extends StObject {
    
    /**
      * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
      * @param element an HTMLElement.
      * @param selector an element seletor.
      * @param context a specific element's context.
      */
    def closest(element: HTMLElement, selector: String): HTMLElement | Null = js.native
    def closest(element: HTMLElement, selector: String, context: HTMLElement): HTMLElement | Null = js.native
    
    /**
      * Get the values of all the CSS properties.
      * @param element an HTMLElement.
      */
    def css(element: HTMLElement): CSSStyleDeclaration = js.native
    /**
      * Get the value of style properties.
      * @param element an HTMLElement.
      * @param prop a property key.
      */
    def css[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 465, starting with typings.sortablejs.sortablejsStrings.accentColor, typings.sortablejs.sortablejsStrings.alignContent, typings.sortablejs.sortablejsStrings.alignItems */ Any */](element: HTMLElement, prop: K): /* import warning: importer.ImportType#apply Failed type conversion: std.CSSStyleDeclaration[K] */ js.Any = js.native
    /**
      * Set one CSS property.
      * @param element an HTMLElement.
      * @param prop a property key.
      * @param value a property value.
      */
    def css[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 465, starting with typings.sortablejs.sortablejsStrings.accentColor, typings.sortablejs.sortablejsStrings.alignContent, typings.sortablejs.sortablejsStrings.alignItems */ Any */](
      element: HTMLElement,
      prop: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.CSSStyleDeclaration[K] */ js.Any
    ): Unit = js.native
    
    /**
      * Deselects the provided multi-drag item
      * @param element The element to be deselected
      */
    def deselect(element: HTMLElement): Unit = js.native
    
    /**
      * Get elements by tag name.
      * @param context an HTMLElement.
      * @param tagName A tag name.
      * @param iterator An iterator.
      */
    def find(context: HTMLElement, tagName: String): NodeListOf[HTMLElement] = js.native
    def find(
      context: HTMLElement,
      tagName: String,
      iterator: js.Function2[/* value */ HTMLElement, /* index */ Double, Unit]
    ): NodeListOf[HTMLElement] = js.native
    
    /**
      * Check the current matched set of elements against a selector.
      * @param element an HTMLElement.
      * @param selector an element selector.
      */
    def is(element: HTMLElement, selector: String): Boolean = js.native
    
    /**
      * Remove an event handler function
      * @param element an HTMLElement.
      * @param event an Event context.
      * @param fn a callback.
      */
    def off(element: HTMLElement, event: String, fn: EventListenerOrEventListenerObject): Unit = js.native
    
    /**
      * Attach an event handler function
      * @param element an HTMLElement.
      * @param event an Event context.
      * @param fn
      */
    def on(element: HTMLElement, event: String, fn: EventListenerOrEventListenerObject): Unit = js.native
    
    /**
      * Selects the provided multi-drag item
      * @param element The element to be selected
      */
    def select(element: HTMLElement): Unit = js.native
    
    /**
      * Add or remove one classes from each element
      * @param element an HTMLElement.
      * @param name a class name.
      * @param state a class's state.
      */
    def toggleClass(element: HTMLElement, name: String, state: Boolean): Unit = js.native
  }
}
