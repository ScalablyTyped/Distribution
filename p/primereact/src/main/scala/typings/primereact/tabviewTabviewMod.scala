package typings.primereact

import typings.primereact.primereactStrings.`additions removals`
import typings.primereact.primereactStrings.`additions text`
import typings.primereact.primereactStrings.`inline`
import typings.primereact.primereactStrings.`removals additions`
import typings.primereact.primereactStrings.`removals text`
import typings.primereact.primereactStrings.`text additions`
import typings.primereact.primereactStrings.`text removals`
import typings.primereact.primereactStrings.additions
import typings.primereact.primereactStrings.all
import typings.primereact.primereactStrings.ascending
import typings.primereact.primereactStrings.assertive
import typings.primereact.primereactStrings.both
import typings.primereact.primereactStrings.copy
import typings.primereact.primereactStrings.date
import typings.primereact.primereactStrings.decimal
import typings.primereact.primereactStrings.descending
import typings.primereact.primereactStrings.dialog
import typings.primereact.primereactStrings.email
import typings.primereact.primereactStrings.execute
import typings.primereact.primereactStrings.grammar
import typings.primereact.primereactStrings.grid
import typings.primereact.primereactStrings.horizontal
import typings.primereact.primereactStrings.inherit
import typings.primereact.primereactStrings.link
import typings.primereact.primereactStrings.list
import typings.primereact.primereactStrings.listbox
import typings.primereact.primereactStrings.location
import typings.primereact.primereactStrings.menu
import typings.primereact.primereactStrings.mixed
import typings.primereact.primereactStrings.move
import typings.primereact.primereactStrings.no
import typings.primereact.primereactStrings.none
import typings.primereact.primereactStrings.numeric
import typings.primereact.primereactStrings.off
import typings.primereact.primereactStrings.on
import typings.primereact.primereactStrings.other
import typings.primereact.primereactStrings.page
import typings.primereact.primereactStrings.polite
import typings.primereact.primereactStrings.popup
import typings.primereact.primereactStrings.removals
import typings.primereact.primereactStrings.search
import typings.primereact.primereactStrings.spelling
import typings.primereact.primereactStrings.step
import typings.primereact.primereactStrings.tel
import typings.primereact.primereactStrings.text
import typings.primereact.primereactStrings.time
import typings.primereact.primereactStrings.tree
import typings.primereact.primereactStrings.url
import typings.primereact.primereactStrings.vertical
import typings.primereact.primereactStrings.yes
import typings.primereact.utilsUtilsMod.IconOptions
import typings.primereact.utilsUtilsMod.IconType
import typings.primereact.utilsUtilsMod.PassThroughType
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.Component
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SVGProps
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import typings.std.HTMLSpanElement
import typings.std.HTMLUListElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabviewTabviewMod {
  
  @JSImport("primereact/tabview/tabview", "TabPanel")
  @js.native
  open class TabPanel protected () extends Component[TabPanelProps, Any, Any] {
    def this(props: TabPanelProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: TabPanelProps, context: Any) = this()
  }
  
  @JSImport("primereact/tabview/tabview", "TabView")
  @js.native
  open class TabView protected () extends Component[TabViewProps, Any, Any] {
    def this(props: TabViewProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: TabViewProps, context: Any) = this()
    
    /**
      * Used to get container element.
      * @return {HTMLDivElement} Container element
      */
    def getElement(): HTMLDivElement = js.native
    
    /**
      * Resets all states.
      */
    def reset(): Unit = js.native
  }
  
  /**
    * Custom Tabpanel header template options
    */
  trait TabPanelHeaderTemplateOptions extends StObject {
    
    /**
      * The aria-controls attribute of the tab header.
      */
    var ariaControls: String
    
    /**
      * Style class of the header element.
      */
    var className: String
    
    /**
      * The JSX element of the tab header.
      */
    var element: Element
    
    /**
      * The index of the tab header.
      */
    var index: Double
    
    /**
      * Left icon of the tab header.
      */
    var leftIconElement: Element
    
    /**
      * Callback to invoke on click.
      * @param {React.MouseEvent<HTMLElement>} event - Browser event.
      */
    def onClick(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
    
    /**
      * Callback to invoke when the key pressed.
      * @param {React.KeyboardEvent<HTMLElement>} event - Browser event.
      */
    def onKeyDown(event: KeyboardEvent[HTMLElement]): Unit
    
    /**
      * The props of the tab panel component.
      */
    var props: TabPanelProps
    
    /**
      * Right icon of the tab header.
      */
    var rightIconElement: Element
    
    /**
      * Whether the tab header is selected or not.
      */
    var selected: Boolean
    
    /**
      * Style class of the header title element.
      */
    var titleClassName: String
    
    /**
      * The title element of the tab header.
      */
    var titleElement: Element
  }
  object TabPanelHeaderTemplateOptions {
    
    inline def apply(
      ariaControls: String,
      className: String,
      element: Element,
      index: Double,
      leftIconElement: Element,
      onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
      onKeyDown: KeyboardEvent[HTMLElement] => Unit,
      props: TabPanelProps,
      rightIconElement: Element,
      selected: Boolean,
      titleClassName: String,
      titleElement: Element
    ): TabPanelHeaderTemplateOptions = {
      val __obj = js.Dynamic.literal(ariaControls = ariaControls.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], leftIconElement = leftIconElement.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onKeyDown = js.Any.fromFunction1(onKeyDown), props = props.asInstanceOf[js.Any], rightIconElement = rightIconElement.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], titleClassName = titleClassName.asInstanceOf[js.Any], titleElement = titleElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelHeaderTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabPanelHeaderTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLeftIconElement(value: Element): Self = StObject.set(x, "leftIconElement", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setProps(value: TabPanelProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRightIconElement(value: Element): Self = StObject.set(x, "rightIconElement", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTitleClassName(value: String): Self = StObject.set(x, "titleClassName", value.asInstanceOf[js.Any])
      
      inline def setTitleElement(value: Element): Self = StObject.set(x, "titleElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabPanelPassThroughMethodOptions extends StObject {
    
    var parent: TabViewPassThroughMethodOptions
    
    var props: TabPanelProps
  }
  object TabPanelPassThroughMethodOptions {
    
    inline def apply(parent: TabViewPassThroughMethodOptions, props: TabPanelProps): TabPanelPassThroughMethodOptions = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelPassThroughMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabPanelPassThroughMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setParent(value: TabViewPassThroughMethodOptions): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: TabPanelProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabPanelPassThroughOptions extends StObject {
    
    /**
      * Uses to pass attributes to the list's DOM element.
      */
    var content: js.UndefOr[TabPanelPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the header's DOM element.
      */
    var header: js.UndefOr[TabPanelPassThroughType[HTMLAttributes[HTMLLIElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the header action's DOM element.
      */
    var headerAction: js.UndefOr[TabPanelPassThroughType[HTMLAttributes[HTMLAnchorElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the title's DOM element.
      */
    var headerTitle: js.UndefOr[TabPanelPassThroughType[HTMLAttributes[HTMLSpanElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the root's DOM element.
      */
    var root: js.UndefOr[TabPanelPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
  }
  object TabPanelPassThroughOptions {
    
    inline def apply(): TabPanelPassThroughOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelPassThroughOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabPanelPassThroughOptions] (val x: Self) extends AnyVal {
      
      inline def setContent(value: TabPanelPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(
        value: /* options */ js.UndefOr[TabPanelPassThroughMethodOptions] => HTMLAttributes[HTMLDivElement] | Unit
      ): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHeader(value: TabPanelPassThroughType[HTMLAttributes[HTMLLIElement]]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderAction(value: TabPanelPassThroughType[HTMLAttributes[HTMLAnchorElement]]): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
      
      inline def setHeaderActionFunction1(
        value: /* options */ js.UndefOr[TabPanelPassThroughMethodOptions] => HTMLAttributes[HTMLAnchorElement] | Unit
      ): Self = StObject.set(x, "headerAction", js.Any.fromFunction1(value))
      
      inline def setHeaderActionNull: Self = StObject.set(x, "headerAction", null)
      
      inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
      
      inline def setHeaderFunction1(
        value: /* options */ js.UndefOr[TabPanelPassThroughMethodOptions] => HTMLAttributes[HTMLLIElement] | Unit
      ): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderTitle(value: TabPanelPassThroughType[HTMLAttributes[HTMLSpanElement]]): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleFunction1(
        value: /* options */ js.UndefOr[TabPanelPassThroughMethodOptions] => HTMLAttributes[HTMLSpanElement] | Unit
      ): Self = StObject.set(x, "headerTitle", js.Any.fromFunction1(value))
      
      inline def setHeaderTitleNull: Self = StObject.set(x, "headerTitle", null)
      
      inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setRoot(value: TabPanelPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootFunction1(
        value: /* options */ js.UndefOr[TabPanelPassThroughMethodOptions] => HTMLAttributes[HTMLDivElement] | Unit
      ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type TabPanelPassThroughType[T] = PassThroughType[T, TabPanelPassThroughMethodOptions]
  
  trait TabPanelProps extends StObject {
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the tab header and content.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Defines if tab can be removed.
      * @defaultValue false
      */
    var closable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Close button of the tab header.
      */
    var closeIcon: js.UndefOr[IconType[TabPanel]] = js.undefined
    
    /**
      * Style class of the tab content.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the tab content.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Whether the tab is disabled.
      * @defaultValue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Orientation of tab headers.
      */
    var header: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the tab header.
      */
    var headerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the tab header.
      */
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Header template of the tab to customize more.
      */
    var headerTemplate: js.UndefOr[
        ReactNode | (js.Function1[/* options */ TabPanelHeaderTemplateOptions, ReactNode])
      ] = js.undefined
    
    /**
      * Icons can be placed at left of a header.
      */
    var leftIcon: js.UndefOr[IconType[TabPanel]] = js.undefined
    
    /**
      * Next button of the tab header.
      */
    var nextButton: js.UndefOr[IconType[TabPanel]] = js.undefined
    
    /**
      * Previous button of the tab header.
      */
    var prevButton: js.UndefOr[IconType[TabPanel]] = js.undefined
    
    /**
      * Uses to pass attributes to DOM elements inside the component.
      * @type {TabPanelPassThroughOptions}
      */
    var pt: js.UndefOr[TabPanelPassThroughOptions] = js.undefined
    
    /**
      * Icons can be placed at right of a header.
      */
    var rightIcon: js.UndefOr[IconType[TabPanel]] = js.undefined
    
    /**
      * Inline style of the tab header and content.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TabPanelProps {
    
    inline def apply(): TabPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabPanelProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: IconType[TabPanel]): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconFunction1(value: /* options */ IconOptions[TabPanel] => ReactNode): Self = StObject.set(x, "closeIcon", js.Any.fromFunction1(value))
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderTemplate(value: ReactNode | (js.Function1[/* options */ TabPanelHeaderTemplateOptions, ReactNode])): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderTemplateFunction1(value: /* options */ TabPanelHeaderTemplateOptions => ReactNode): Self = StObject.set(x, "headerTemplate", js.Any.fromFunction1(value))
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLeftIcon(value: IconType[TabPanel]): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconFunction1(value: /* options */ IconOptions[TabPanel] => ReactNode): Self = StObject.set(x, "leftIcon", js.Any.fromFunction1(value))
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setNextButton(value: IconType[TabPanel]): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonFunction1(value: /* options */ IconOptions[TabPanel] => ReactNode): Self = StObject.set(x, "nextButton", js.Any.fromFunction1(value))
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setPrevButton(value: IconType[TabPanel]): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonFunction1(value: /* options */ IconOptions[TabPanel] => ReactNode): Self = StObject.set(x, "prevButton", js.Any.fromFunction1(value))
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
      
      inline def setPt(value: TabPanelPassThroughOptions): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setRightIcon(value: IconType[TabPanel]): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      inline def setRightIconFunction1(value: /* options */ IconOptions[TabPanel] => ReactNode): Self = StObject.set(x, "rightIcon", js.Any.fromFunction1(value))
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TabViewPassThroughMethodOptions extends StObject {
    
    var props: TabViewProps
    
    var state: TabViewState
  }
  object TabViewPassThroughMethodOptions {
    
    inline def apply(props: TabViewProps, state: TabViewState): TabViewPassThroughMethodOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabViewPassThroughMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabViewPassThroughMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setProps(value: TabViewProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setState(value: TabViewState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabViewPassThroughOptions extends StObject {
    
    /**
      * Uses to pass attributes to the inkbar's DOM element.
      */
    var inkbar: js.UndefOr[TabViewPassThroughType[HTMLAttributes[HTMLLIElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the list's DOM element.
      */
    var nav: js.UndefOr[TabViewPassThroughType[HTMLAttributes[HTMLUListElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the nav container's DOM element.
      */
    var navContainer: js.UndefOr[TabViewPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the nav content's DOM element.
      */
    var navContent: js.UndefOr[TabViewPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the next button's DOM element.
      */
    var nextButton: js.UndefOr[TabViewPassThroughType[HTMLAttributes[HTMLButtonElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the next button icon's DOM element.
      */
    var nextIcon: js.UndefOr[
        TabViewPassThroughType[SVGProps[SVGSVGElement] | HTMLAttributes[HTMLSpanElement]]
      ] = js.undefined
    
    /**
      * Uses to pass attributes to the panel's DOM element.
      */
    var panelContainer: js.UndefOr[TabViewPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the previous button's DOM element.
      */
    var previousButton: js.UndefOr[TabViewPassThroughType[HTMLAttributes[HTMLButtonElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the previous button icon's DOM element.
      */
    var previousIcon: js.UndefOr[
        TabViewPassThroughType[SVGProps[SVGSVGElement] | HTMLAttributes[HTMLSpanElement]]
      ] = js.undefined
    
    /**
      * Uses to pass attributes to the root's DOM element.
      */
    var root: js.UndefOr[TabViewPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
  }
  object TabViewPassThroughOptions {
    
    inline def apply(): TabViewPassThroughOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabViewPassThroughOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabViewPassThroughOptions] (val x: Self) extends AnyVal {
      
      inline def setInkbar(value: TabViewPassThroughType[HTMLAttributes[HTMLLIElement]]): Self = StObject.set(x, "inkbar", value.asInstanceOf[js.Any])
      
      inline def setInkbarFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => HTMLAttributes[HTMLLIElement] | Unit
      ): Self = StObject.set(x, "inkbar", js.Any.fromFunction1(value))
      
      inline def setInkbarNull: Self = StObject.set(x, "inkbar", null)
      
      inline def setInkbarUndefined: Self = StObject.set(x, "inkbar", js.undefined)
      
      inline def setNav(value: TabViewPassThroughType[HTMLAttributes[HTMLUListElement]]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavContainer(value: TabViewPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "navContainer", value.asInstanceOf[js.Any])
      
      inline def setNavContainerFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => HTMLAttributes[HTMLDivElement] | Unit
      ): Self = StObject.set(x, "navContainer", js.Any.fromFunction1(value))
      
      inline def setNavContainerNull: Self = StObject.set(x, "navContainer", null)
      
      inline def setNavContainerUndefined: Self = StObject.set(x, "navContainer", js.undefined)
      
      inline def setNavContent(value: TabViewPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "navContent", value.asInstanceOf[js.Any])
      
      inline def setNavContentFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => HTMLAttributes[HTMLDivElement] | Unit
      ): Self = StObject.set(x, "navContent", js.Any.fromFunction1(value))
      
      inline def setNavContentNull: Self = StObject.set(x, "navContent", null)
      
      inline def setNavContentUndefined: Self = StObject.set(x, "navContent", js.undefined)
      
      inline def setNavFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => HTMLAttributes[HTMLUListElement] | Unit
      ): Self = StObject.set(x, "nav", js.Any.fromFunction1(value))
      
      inline def setNavNull: Self = StObject.set(x, "nav", null)
      
      inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      inline def setNextButton(value: TabViewPassThroughType[HTMLAttributes[HTMLButtonElement]]): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => HTMLAttributes[HTMLButtonElement] | Unit
      ): Self = StObject.set(x, "nextButton", js.Any.fromFunction1(value))
      
      inline def setNextButtonNull: Self = StObject.set(x, "nextButton", null)
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setNextIcon(value: TabViewPassThroughType[SVGProps[SVGSVGElement] | HTMLAttributes[HTMLSpanElement]]): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      inline def setNextIconFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => (SVGProps[SVGSVGElement] | HTMLAttributes[HTMLSpanElement]) | Unit
      ): Self = StObject.set(x, "nextIcon", js.Any.fromFunction1(value))
      
      inline def setNextIconNull: Self = StObject.set(x, "nextIcon", null)
      
      inline def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      inline def setPanelContainer(value: TabViewPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "panelContainer", value.asInstanceOf[js.Any])
      
      inline def setPanelContainerFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => HTMLAttributes[HTMLDivElement] | Unit
      ): Self = StObject.set(x, "panelContainer", js.Any.fromFunction1(value))
      
      inline def setPanelContainerNull: Self = StObject.set(x, "panelContainer", null)
      
      inline def setPanelContainerUndefined: Self = StObject.set(x, "panelContainer", js.undefined)
      
      inline def setPreviousButton(value: TabViewPassThroughType[HTMLAttributes[HTMLButtonElement]]): Self = StObject.set(x, "previousButton", value.asInstanceOf[js.Any])
      
      inline def setPreviousButtonFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => HTMLAttributes[HTMLButtonElement] | Unit
      ): Self = StObject.set(x, "previousButton", js.Any.fromFunction1(value))
      
      inline def setPreviousButtonNull: Self = StObject.set(x, "previousButton", null)
      
      inline def setPreviousButtonUndefined: Self = StObject.set(x, "previousButton", js.undefined)
      
      inline def setPreviousIcon(value: TabViewPassThroughType[SVGProps[SVGSVGElement] | HTMLAttributes[HTMLSpanElement]]): Self = StObject.set(x, "previousIcon", value.asInstanceOf[js.Any])
      
      inline def setPreviousIconFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => (SVGProps[SVGSVGElement] | HTMLAttributes[HTMLSpanElement]) | Unit
      ): Self = StObject.set(x, "previousIcon", js.Any.fromFunction1(value))
      
      inline def setPreviousIconNull: Self = StObject.set(x, "previousIcon", null)
      
      inline def setPreviousIconUndefined: Self = StObject.set(x, "previousIcon", js.undefined)
      
      inline def setRoot(value: TabViewPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootFunction1(
        value: /* options */ js.UndefOr[TabViewPassThroughMethodOptions] => HTMLAttributes[HTMLDivElement] | Unit
      ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type TabViewPassThroughType[T] = PassThroughType[T, TabViewPassThroughMethodOptions]
  
  /* Inlined parent std.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'ref'> */
  trait TabViewProps extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    /**
      * Active index of the TabView.
      * @defaultValue 0
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.undefined
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * Callback to invoke before an active tab is changed. Return false to prevent tab from changing.
      * @param {TabViewTabChangeEvent} event - Custom tab change event.
      */
    var onBeforeTabChange: js.UndefOr[js.Function1[/* event */ TabViewTabChangeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke before an active tab is close. Return false to prevent tab from closing.
      * @param {TabViewTabCloseEvent} event - Custom tab close event.
      */
    var onBeforeTabClose: js.UndefOr[js.Function1[/* event */ TabViewTabCloseEvent, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.undefined
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.undefined
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onResize: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.undefined
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * Callback to invoke when an active tab is changed.
      * @param {TabViewTabChangeEvent} event -  Custom tab change event.
      */
    var onTabChange: js.UndefOr[js.Function1[/* event */ TabViewTabChangeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when an active tab is closed.
      * @param {TabViewTabCloseEvent} event - Custom tab close event.
      */
    var onTabClose: js.UndefOr[js.Function1[/* event */ TabViewTabCloseEvent, Unit]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.undefined
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.undefined
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * Style class of the panels container of the tabview.
      */
    var panelContainerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the panels container of the tabview.
      */
    var panelContainerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    /**
      * Uses to pass attributes to DOM elements inside the component.
      * @type {TabViewPassThroughOptions}
      */
    var pt: js.UndefOr[TabViewPassThroughOptions] = js.undefined
    
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var rel: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to render the contents of the selected tab or all tabs.
      * @defaultValue true
      */
    var renderActiveOnly: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    var rev: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    /**
      * When enabled displays buttons at each side of the tab headers to scroll the tab list.
      * @defaultValue false
      */
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
  }
  object TabViewProps {
    
    inline def apply(): TabViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabViewProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabViewProps] (val x: Self) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAbort(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAnimationEnd(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnAnimationIteration(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      inline def setOnAnimationStart(value: AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      inline def setOnAuxClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      inline def setOnBeforeInput(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      inline def setOnBeforeTabChange(value: /* event */ TabViewTabChangeEvent => Unit): Self = StObject.set(x, "onBeforeTabChange", js.Any.fromFunction1(value))
      
      inline def setOnBeforeTabChangeUndefined: Self = StObject.set(x, "onBeforeTabChange", js.undefined)
      
      inline def setOnBeforeTabClose(value: /* event */ TabViewTabCloseEvent => Unit): Self = StObject.set(x, "onBeforeTabClose", js.Any.fromFunction1(value))
      
      inline def setOnBeforeTabCloseUndefined: Self = StObject.set(x, "onBeforeTabClose", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLDivElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompositionEnd(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      inline def setOnCompositionStart(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      inline def setOnCompositionUpdate(value: CompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnCopy(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnCut(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      inline def setOnDoubleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      inline def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEncrypted(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      inline def setOnEnded(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLDivElement, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnInvalid(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadStart(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnPause(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: PointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReset(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnStalled(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTabChange(value: /* event */ TabViewTabChangeEvent => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setOnTabClose(value: /* event */ TabViewTabCloseEvent => Unit): Self = StObject.set(x, "onTabClose", js.Any.fromFunction1(value))
      
      inline def setOnTabCloseUndefined: Self = StObject.set(x, "onTabClose", js.undefined)
      
      inline def setOnTimeUpdate(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransitionEnd(value: TransitionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOnVolumeChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: WheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setPanelContainerClassName(value: String): Self = StObject.set(x, "panelContainerClassName", value.asInstanceOf[js.Any])
      
      inline def setPanelContainerClassNameUndefined: Self = StObject.set(x, "panelContainerClassName", js.undefined)
      
      inline def setPanelContainerStyle(value: CSSProperties): Self = StObject.set(x, "panelContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setPanelContainerStyleUndefined: Self = StObject.set(x, "panelContainerStyle", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setPt(value: TabViewPassThroughOptions): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRenderActiveOnly(value: Boolean): Self = StObject.set(x, "renderActiveOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderActiveOnlyUndefined: Self = StObject.set(x, "renderActiveOnly", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  trait TabViewState extends StObject {
    
    /**
      * Current active index state.
      */
    var activeIndex: Double
    
    /**
      * Current state of hidden tab.
      */
    var hiddenTabsState: js.Array[Double]
    
    /**
      * Unique id for the TabView component.
      */
    var id: String
    
    /**
      * Current state of the next button.
      * @defaultValue false
      */
    var isNextButtonDisabled: Boolean
    
    /**
      * Current state of previous button.
      * @defaultValue true
      */
    var isPrevButtonDisabled: Boolean
  }
  object TabViewState {
    
    inline def apply(
      activeIndex: Double,
      hiddenTabsState: js.Array[Double],
      id: String,
      isNextButtonDisabled: Boolean,
      isPrevButtonDisabled: Boolean
    ): TabViewState = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], hiddenTabsState = hiddenTabsState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isNextButtonDisabled = isNextButtonDisabled.asInstanceOf[js.Any], isPrevButtonDisabled = isPrevButtonDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabViewState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabViewState] (val x: Self) extends AnyVal {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setHiddenTabsState(value: js.Array[Double]): Self = StObject.set(x, "hiddenTabsState", value.asInstanceOf[js.Any])
      
      inline def setHiddenTabsStateVarargs(value: Double*): Self = StObject.set(x, "hiddenTabsState", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsNextButtonDisabled(value: Boolean): Self = StObject.set(x, "isNextButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsPrevButtonDisabled(value: Boolean): Self = StObject.set(x, "isPrevButtonDisabled", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom change event.
    * @see {@link TabViewProps.onTabChange}
    * @event
    */
  trait TabViewTabChangeEvent extends StObject {
    
    /**
      * Index of the selected tab
      */
    var index: Double
    
    /**
      * Browser event
      */
    var originalEvent: SyntheticEvent[typings.std.Element, Event]
  }
  object TabViewTabChangeEvent {
    
    inline def apply(index: Double, originalEvent: SyntheticEvent[typings.std.Element, Event]): TabViewTabChangeEvent = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabViewTabChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabViewTabChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[typings.std.Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom close event.
    * @see {@link TabViewProps.onTabClose}
    * @event
    */
  trait TabViewTabCloseEvent extends StObject {
    
    /**
      * Index of the selected tab
      */
    var index: Double
    
    /**
      * Browser event
      */
    var originalEvent: SyntheticEvent[typings.std.Element, Event]
  }
  object TabViewTabCloseEvent {
    
    inline def apply(index: Double, originalEvent: SyntheticEvent[typings.std.Element, Event]): TabViewTabCloseEvent = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabViewTabCloseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabViewTabCloseEvent] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[typings.std.Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
}
