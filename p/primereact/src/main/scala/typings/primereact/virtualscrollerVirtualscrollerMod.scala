package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.primereactStrings.`to-end`
import typings.primereact.primereactStrings.`to-start`
import typings.primereact.primereactStrings.auto
import typings.primereact.primereactStrings.both
import typings.primereact.primereactStrings.horizontal
import typings.primereact.primereactStrings.smooth
import typings.primereact.primereactStrings.vertical
import typings.primereact.utilsUtilsMod.IconOptions
import typings.primereact.utilsUtilsMod.IconType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.UIEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualscrollerVirtualscrollerMod {
  
  @JSImport("primereact/virtualscroller/virtualscroller", "VirtualScroller")
  @js.native
  open class VirtualScroller protected () extends Component[VirtualScrollerProps, Any, Any] {
    def this(props: VirtualScrollerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: VirtualScrollerProps, context: Any) = this()
    
    /**
      * Returns the reference of virtualScroller's container.
      * @return {React.Ref<HTMLDivElement>} Ref Div element
      */
    def getElementRef(): Ref[HTMLDivElement] = js.native
    
    /**
      * Returns the range of items added to the DOM.
      */
    def getRenderedRange(): VirtualScrollerRenderedRange = js.native
    
    def scrollInView(index: js.Array[Double], to: `to-start` | `to-end`): Unit = js.native
    def scrollInView(index: js.Array[Double], to: `to-start` | `to-end`, behavior: auto | smooth): Unit = js.native
    /**
      * It is used to move the specified index into the view. It is a method that will usually be needed when keyboard support is added to the virtualScroller component.
      * @param {number} index - Index of item according to orientation mode.
      * @param {'to-start' | 'to-end'} to - Defines the location of the item in view, valid values are 'to-start' and 'to-end'.
      * @param {'auto' | 'smooth'} behavior - Behavior of scroll, valid values are 'auto' and 'smooth'
      */
    def scrollInView(index: Double, to: `to-start` | `to-end`): Unit = js.native
    def scrollInView(index: Double, to: `to-start` | `to-end`, behavior: auto | smooth): Unit = js.native
    
    /**
      * Scroll to move to a specific position.
      * @param {VirtualScrollerOptionsType} options - Custom virtual scroller options.
      */
    def scrollTo(options: VirtualScrollerOptionsType): Unit = js.native
    
    def scrollToIndex(index: js.Array[Double]): Unit = js.native
    def scrollToIndex(index: js.Array[Double], behavior: auto | smooth): Unit = js.native
    /**
      * Scroll to move to a specific item.
      * @param {number} index - Index of item according to orientation mode.
      * @param {'auto' | 'smooth'} behavior - Behavior of scroll, valid values are 'auto' and 'smooth'
      */
    def scrollToIndex(index: Double): Unit = js.native
    def scrollToIndex(index: Double, behavior: auto | smooth): Unit = js.native
  }
  
  /**
    * Custom change event.
    * @see {@link VirtualScrollerProps.onScrollIndexChange}
    * @event
    */
  trait VirtualScrollerChangeEvent extends StObject {
    
    /**
      * First index of the new data range to be loaded.
      */
    var first: Double | VirtualScrollerState
    
    /**
      * Last index of the new data range to be loaded.
      */
    var last: Double | VirtualScrollerState
  }
  object VirtualScrollerChangeEvent {
    
    inline def apply(first: Double | VirtualScrollerState, last: Double | VirtualScrollerState): VirtualScrollerChangeEvent = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double | VirtualScrollerState): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Double | VirtualScrollerState): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom content template options.
    */
  @js.native
  trait VirtualScrollerContentTemplateOptions extends StObject {
    
    /**
      * Whether the orientation is both.
      */
    var both: Boolean = js.native
    
    /**
      * Items of wrapper element.
      */
    var children: Any = js.native
    
    /**
      * Style class of the wrapper element.
      */
    var className: String = js.native
    
    /**
      * Columns of the virtual scroller.
      */
    var columns: js.Array[Any] = js.native
    
    /**
      * Ref of wrapper element.
      */
    var contentRef: Any = js.native
    
    /**
      * Default wrapper element.
      */
    var element: Element = js.native
    
    /**
      * Information of any item.
      * @param {number} index - Index of the template item.
      */
    def getItemOptions(index: Double): VirtualScrollerTemplateOptions = js.native
    
    /**
      * Information of any item during the loading.
      * @param {number} index - Index of the item.
      * @param {object} ext - The extra options to pass to the content.
      */
    def getLoaderOptions(index: Double): VirtualScrollerLoadingTemplateOptions = js.native
    def getLoaderOptions(index: Double, ext: js.Object): VirtualScrollerLoadingTemplateOptions = js.native
    
    /**
      * Whether the orientation is horizontal.
      */
    var horizontal: Boolean = js.native
    
    /**
      * The height/width of item according to orientation.
      */
    var itemSize: Double | js.Array[Double] = js.native
    
    /**
      * Loaded data.
      */
    var items: js.UndefOr[(js.Array[Any | js.Array[Any]]) | Null] = js.native
    
    /**
      * Whether the data is loaded.
      */
    var loading: Boolean = js.native
    
    /**
      * Template of loading item.
      */
    var loadingTemplate: ReactNode | (js.Function1[/* options */ VirtualScrollerLoadingTemplateOptions, ReactNode]) = js.native
    
    /**
      * Props of VirtualScroller component.
      */
    var props: VirtualScrollerProps = js.native
    
    /**
      * Rows of the virtual scroller.
      */
    var rows: js.Array[Any] = js.native
    
    /**
      * Ref of spacer element.
      */
    var spacerRef: Any = js.native
    
    /**
      * Ref of sticky element in content.
      */
    var stickyRef: Any = js.native
    
    /**
      * Whether the orientation is vertical.
      */
    var vertical: Boolean = js.native
  }
  
  /**
    * Custom lazy load event.
    * @see {@link VirtualScrollerProps.onLazyLoad}
    * @extends {VirtualScrollerChangeEvent}
    * @event
    */
  type VirtualScrollerLazyEvent = VirtualScrollerChangeEvent
  
  /**
    * Custom loader icon template props.
    */
  trait VirtualScrollerLoaderIconTemplateOptions extends StObject {
    
    /**
      * Style class of the loader icon.
      */
    var className: String
    
    /**
      * The JSX element that represents the loader icon.
      */
    var element: Element
    
    /**
      * The props of the VirtualScroller component.
      */
    var props: VirtualScrollerProps
  }
  object VirtualScrollerLoaderIconTemplateOptions {
    
    inline def apply(className: String, element: Element, props: VirtualScrollerProps): VirtualScrollerLoaderIconTemplateOptions = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerLoaderIconTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerLoaderIconTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VirtualScrollerProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom template options.
    * @extends VirtualScrollerTemplateOptions
    */
  trait VirtualScrollerLoadingTemplateOptions
    extends StObject
       with VirtualScrollerTemplateOptions
       with /**
    * Extra options.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Total number of columns in a row in 'both' orientation mode in view.
      */
    var numCols: Double
  }
  object VirtualScrollerLoadingTemplateOptions {
    
    inline def apply(
      count: Double,
      even: Boolean,
      first: Boolean,
      index: Double,
      last: Boolean,
      numCols: Double,
      odd: Boolean,
      props: VirtualScrollerProps
    ): VirtualScrollerLoadingTemplateOptions = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], even = even.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], numCols = numCols.asInstanceOf[js.Any], odd = odd.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerLoadingTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerLoadingTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setNumCols(value: Double): Self = StObject.set(x, "numCols", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom virtual scroller options type.
    */
  trait VirtualScrollerOptionsType extends StObject {
    
    /**
      * Behavior of scroll, valid values are 'auto' and 'smooth'
      */
    var behavior: auto | smooth
    
    /**
      * Left position of scroll.
      */
    var left: Double
    
    /**
      * Top position of scroll
      */
    var top: Double
  }
  object VirtualScrollerOptionsType {
    
    inline def apply(behavior: auto | smooth, left: Double, top: Double): VirtualScrollerOptionsType = {
      val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerOptionsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerOptionsType] (val x: Self) extends AnyVal {
      
      inline def setBehavior(value: auto | smooth): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait VirtualScrollerProps extends StObject {
    
    /**
      * Used to append each loaded item to top without removing any items from the DOM. Using very large data may cause the browser to crash.
      * @defaultValue false
      */
    var appendOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to dynamically change the height or width of scrollable container.
      * @defaultValue false
      */
    var autoSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the component.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Columns of the virtual scroller for vertical option.
      */
    var columns: js.UndefOr[Any] = js.undefined
    
    /**
      * The template of item's wrapper element.
      */
    var contentTemplate: js.UndefOr[
        ReactNode | (js.Function1[/* options */ VirtualScrollerContentTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * Delay in scroll before new data is loaded.
      * @defaultValue 0
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * If disabled, the VirtualScroller feature is eliminated and the content is displayed directly.
      * @defaultValue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * When enabled, positions the content as inline.
      * @defaultValue false
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The height/width of item according to orientation.
      */
    var itemSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * The template of item.
      */
    var itemTemplate: js.UndefOr[
        ReactNode | (js.Function2[/* item */ Any, /* options */ VirtualScrollerTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * An array of objects to display.
      */
    var items: js.UndefOr[(js.Array[Any | js.Array[Any]]) | Null] = js.undefined
    
    /**
      * Defines if data is loaded and interacted with in lazy manner.
      * @defaultValue false
      */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to implement a custom loader instead of using the loader feature in the VirtualScroller.
      * @defaultValue false
      */
    var loaderDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The template of loader's icon.
      * @deprecated Since v9.2.3, use `loadingIcon` instead.
      */
    var loaderIconTemplate: js.UndefOr[
        ReactNode | (js.Function1[/* options */ VirtualScrollerLoaderIconTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * Whether the data is loaded.
      * @defaultValue false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to show while indicating data load is in progress.
      */
    var loadingIcon: js.UndefOr[IconType[VirtualScrollerProps]] = js.undefined
    
    /**
      * The template of loader.
      */
    var loadingTemplate: js.UndefOr[
        ReactNode | (js.Function1[/* options */ VirtualScrollerLoadingTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * Determines how many additional elements to add to the DOM outside of the view. According to the scrolls made up and down, extra items are added in a certain algorithm in the form of multiples of this number. Default value is half the number of items shown in the view.
      */
    var numToleratedItems: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback to invoke in lazy mode to load new data.
      * @param {VirtualScrollerLazyEvent} event - Custom lazy load event.
      */
    var onLazyLoad: js.UndefOr[js.Function1[/* event */ VirtualScrollerLazyEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when scroll position changes.
      * @param {React.UIEvent<HTMLElement>} event - Browser event
      */
    var onScroll: js.UndefOr[js.Function1[/* event */ UIEvent[HTMLElement, NativeUIEvent], Unit]] = js.undefined
    
    /**
      * Callback to invoke when scroll position and item's range in view changes.
      * @param {VirtualScrollerChangeEvent} event - Custom change event
      */
    var onScrollIndexChange: js.UndefOr[js.Function1[/* event */ VirtualScrollerChangeEvent, Unit]] = js.undefined
    
    /**
      * The orientation of scrollbar, valid values are 'vertical', 'horizontal' and 'both'.
      * @defaultValue 'vertical'
      */
    var orientation: js.UndefOr[vertical | horizontal | both] = js.undefined
    
    /**
      * Delay after window's resize finishes.
      * @defaultValue 10
      */
    var resizeDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Height of the scroll viewport.
      */
    var scrollHeight: js.UndefOr[String] = js.undefined
    
    /**
      * Width of the scroll viewport.
      */
    var scrollWidth: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to show loader.
      * @defaultValue false
      */
    var showLoader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to implement a custom spacer instead of using the spacer feature in the VirtualScroller.
      * @defaultValue true
      */
    var showSpacer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to specify how many items to load in each load method in lazy mode.
      * @defaultValue 0
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * Inline style of the component.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Index of the element in tabbing order.
      * @defaultValue 0
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object VirtualScrollerProps {
    
    inline def apply(): VirtualScrollerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VirtualScrollerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerProps] (val x: Self) extends AnyVal {
      
      inline def setAppendOnly(value: Boolean): Self = StObject.set(x, "appendOnly", value.asInstanceOf[js.Any])
      
      inline def setAppendOnlyUndefined: Self = StObject.set(x, "appendOnly", js.undefined)
      
      inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContentTemplate(value: ReactNode | (js.Function1[/* options */ VirtualScrollerContentTemplateOptions, ReactNode])): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
      
      inline def setContentTemplateFunction1(value: /* options */ VirtualScrollerContentTemplateOptions => ReactNode): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction1(value))
      
      inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setItemSize(value: Double | js.Array[Double]): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
      
      inline def setItemSizeUndefined: Self = StObject.set(x, "itemSize", js.undefined)
      
      inline def setItemSizeVarargs(value: Double*): Self = StObject.set(x, "itemSize", js.Array(value*))
      
      inline def setItemTemplate(
        value: ReactNode | (js.Function2[/* item */ Any, /* options */ VirtualScrollerTemplateOptions, ReactNode])
      ): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      inline def setItemTemplateFunction2(value: (/* item */ Any, /* options */ VirtualScrollerTemplateOptions) => ReactNode): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction2(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setItems(value: js.Array[Any | js.Array[Any]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsNull: Self = StObject.set(x, "items", null)
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (Any | js.Array[Any])*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLoaderDisabled(value: Boolean): Self = StObject.set(x, "loaderDisabled", value.asInstanceOf[js.Any])
      
      inline def setLoaderDisabledUndefined: Self = StObject.set(x, "loaderDisabled", js.undefined)
      
      inline def setLoaderIconTemplate(
        value: ReactNode | (js.Function1[/* options */ VirtualScrollerLoaderIconTemplateOptions, ReactNode])
      ): Self = StObject.set(x, "loaderIconTemplate", value.asInstanceOf[js.Any])
      
      inline def setLoaderIconTemplateFunction1(value: /* options */ VirtualScrollerLoaderIconTemplateOptions => ReactNode): Self = StObject.set(x, "loaderIconTemplate", js.Any.fromFunction1(value))
      
      inline def setLoaderIconTemplateUndefined: Self = StObject.set(x, "loaderIconTemplate", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingIcon(value: IconType[VirtualScrollerProps]): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      inline def setLoadingIconFunction1(value: /* options */ IconOptions[VirtualScrollerProps] => ReactNode): Self = StObject.set(x, "loadingIcon", js.Any.fromFunction1(value))
      
      inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      inline def setLoadingTemplate(value: ReactNode | (js.Function1[/* options */ VirtualScrollerLoadingTemplateOptions, ReactNode])): Self = StObject.set(x, "loadingTemplate", value.asInstanceOf[js.Any])
      
      inline def setLoadingTemplateFunction1(value: /* options */ VirtualScrollerLoadingTemplateOptions => ReactNode): Self = StObject.set(x, "loadingTemplate", js.Any.fromFunction1(value))
      
      inline def setLoadingTemplateUndefined: Self = StObject.set(x, "loadingTemplate", js.undefined)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setNumToleratedItems(value: Double): Self = StObject.set(x, "numToleratedItems", value.asInstanceOf[js.Any])
      
      inline def setNumToleratedItemsUndefined: Self = StObject.set(x, "numToleratedItems", js.undefined)
      
      inline def setOnLazyLoad(value: /* event */ VirtualScrollerLazyEvent => Unit): Self = StObject.set(x, "onLazyLoad", js.Any.fromFunction1(value))
      
      inline def setOnLazyLoadUndefined: Self = StObject.set(x, "onLazyLoad", js.undefined)
      
      inline def setOnScroll(value: /* event */ UIEvent[HTMLElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollIndexChange(value: /* event */ VirtualScrollerChangeEvent => Unit): Self = StObject.set(x, "onScrollIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnScrollIndexChangeUndefined: Self = StObject.set(x, "onScrollIndexChange", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOrientation(value: vertical | horizontal | both): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setResizeDelay(value: Double): Self = StObject.set(x, "resizeDelay", value.asInstanceOf[js.Any])
      
      inline def setResizeDelayUndefined: Self = StObject.set(x, "resizeDelay", js.undefined)
      
      inline def setScrollHeight(value: String): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      inline def setScrollWidth(value: String): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
      
      inline def setShowLoader(value: Boolean): Self = StObject.set(x, "showLoader", value.asInstanceOf[js.Any])
      
      inline def setShowLoaderUndefined: Self = StObject.set(x, "showLoader", js.undefined)
      
      inline def setShowSpacer(value: Boolean): Self = StObject.set(x, "showSpacer", value.asInstanceOf[js.Any])
      
      inline def setShowSpacerUndefined: Self = StObject.set(x, "showSpacer", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  /**
    * Virtual scroller rendered range.
    */
  trait VirtualScrollerRenderedRange extends StObject {
    
    /**
      * First index of the new data range to be rendered.
      */
    var first: Double
    
    /**
      * Last index of the new data range to be rendered.
      */
    var last: Double
    
    /**
      * Viewport of the rendered range.
      */
    var viewport: VirtualScrollerViewportRenderedRange
  }
  object VirtualScrollerRenderedRange {
    
    inline def apply(first: Double, last: Double, viewport: VirtualScrollerViewportRenderedRange): VirtualScrollerRenderedRange = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerRenderedRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerRenderedRange] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: VirtualScrollerViewportRenderedRange): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom virtual scroller state.
    */
  trait VirtualScrollerState extends StObject {
    
    /**
      * Number of columns to be rendered.
      */
    var cols: Double
    
    /**
      * Number of rows to be rendered.
      */
    var rows: Double
  }
  object VirtualScrollerState {
    
    inline def apply(cols: Double, rows: Double): VirtualScrollerState = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerState] (val x: Self) extends AnyVal {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom template options.
    */
  trait VirtualScrollerTemplateOptions extends StObject {
    
    /**
      * Total numbers of items.
      */
    var count: Double
    
    /**
      * Whether the index is even.
      */
    var even: Boolean
    
    /**
      * Whether this is the first item.
      */
    var first: Boolean
    
    /**
      * Index of the item.
      */
    var index: Double
    
    /**
      * Whether this is the last item.
      */
    var last: Boolean
    
    /**
      * Whether the index is odd.
      */
    var odd: Boolean
    
    /**
      * The props of the virtual scroller.
      */
    var props: VirtualScrollerProps
  }
  object VirtualScrollerTemplateOptions {
    
    inline def apply(
      count: Double,
      even: Boolean,
      first: Boolean,
      index: Double,
      last: Boolean,
      odd: Boolean,
      props: VirtualScrollerProps
    ): VirtualScrollerTemplateOptions = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], even = even.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], odd = odd.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEven(value: Boolean): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setOdd(value: Boolean): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VirtualScrollerProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Viewport rendered range.
    */
  trait VirtualScrollerViewportRenderedRange extends StObject {
    
    /**
      * The first number of the current viewport.
      */
    var first: Double
    
    /**
      * The last number of the current viewport.
      */
    var last: Double
  }
  object VirtualScrollerViewportRenderedRange {
    
    inline def apply(first: Double, last: Double): VirtualScrollerViewportRenderedRange = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerViewportRenderedRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualScrollerViewportRenderedRange] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    }
  }
}
