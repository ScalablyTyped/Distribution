package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.primereactStrings.checkbox
import typings.primereact.primereactStrings.lenient
import typings.primereact.primereactStrings.multiple
import typings.primereact.primereactStrings.single
import typings.primereact.primereactStrings.strict
import typings.primereact.utilsUtilsMod.IconOptions
import typings.primereact.utilsUtilsMod.IconType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeTreeMod {
  
  @JSImport("primereact/tree/tree", "Tree")
  @js.native
  open class Tree protected () extends Component[TreeProps, Any, Any] {
    def this(props: TreeProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: TreeProps, context: Any) = this()
    
    /**
      * Filters the data.
      * @param {T} value - The filter value
      */
    def filter[T](value: T): Unit = js.native
    
    /**
      * Used to get container element.
      * @return {HTMLDivElement} Container element
      */
    def getElement(): HTMLDivElement = js.native
  }
  
  /**
    * Custom tree checkbox selection type
    */
  trait TreeCheckboxSelectionKeyType extends StObject {
    
    /**
      * Whether the checkbox is checked or not.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the checkbox is partially checked or not.
      */
    var partialChecked: js.UndefOr[Boolean] = js.undefined
  }
  object TreeCheckboxSelectionKeyType {
    
    inline def apply(): TreeCheckboxSelectionKeyType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeCheckboxSelectionKeyType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeCheckboxSelectionKeyType] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setPartialChecked(value: Boolean): Self = StObject.set(x, "partialChecked", value.asInstanceOf[js.Any])
      
      inline def setPartialCheckedUndefined: Self = StObject.set(x, "partialChecked", js.undefined)
    }
  }
  
  /**
    * Custom tree checkbox selection keys
    */
  type TreeCheckboxSelectionKeys = /**
    * Extra options.
    */
  StringDictionary[TreeCheckboxSelectionKeyType]
  
  /**
    * Custom dragdrop event.
    * @see {@link TreeProps.onDragDrop}
    * @event
    */
  trait TreeDragDropEvent extends StObject {
    
    /**
      * The node that is being dragged.
      */
    var dragNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    
    /**
      * The index of the drop.
      */
    var dropIndex: Double
    
    /**
      * The node that is being dropped on.
      */
    var dropNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    
    /**
      * Browser event.
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * New value after the dragdrop.
      */
    var value: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
      ]
  }
  object TreeDragDropEvent {
    
    inline def apply(
      dragNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any,
      dropIndex: Double,
      dropNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any,
      originalEvent: SyntheticEvent[Element, Event],
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
        ]
    ): TreeDragDropEvent = {
      val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], dropNode = dropNode.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDragDropEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeDragDropEvent] (val x: Self) extends AnyVal {
      
      inline def setDragNode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
      ): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
      
      inline def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
      
      inline def setDropNode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
      ): Self = StObject.set(x, "dropNode", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
            ]
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any)*
      ): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait TreeEventNodeEvent extends StObject {
    
    /**
      * Unselected node instance.
      */
    var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    
    /**
      * Browser event.
      */
    var originalEvent: SyntheticEvent[Element, Event]
  }
  object TreeEventNodeEvent {
    
    inline def apply(
      node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any,
      originalEvent: SyntheticEvent[Element, Event]
    ): TreeEventNodeEvent = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeEventNodeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeEventNodeEvent] (val x: Self) extends AnyVal {
      
      inline def setNode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
      ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom tree event.
    * @see {@link TreeProps.onToggle}
    * @event
    */
  trait TreeExpandedEvent extends StObject {
    
    /**
      * Browser event.
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * Expanded node key.
      */
    var value: TreeExpandedKeysType
  }
  object TreeExpandedEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], value: TreeExpandedKeysType): TreeExpandedEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeExpandedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeExpandedEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TreeExpandedKeysType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom tree expanded keys type
    */
  type TreeExpandedKeysType = /**
    * Extra options.
    */
  StringDictionary[Boolean]
  
  /**
    * Custom tree filter input options
    */
  trait TreeFilterInputOptions extends StObject {
    
    /**
      * Style class of the tree filter input element.
      */
    var className: String
    
    /**
      * Callback function to be invoked when the change event.
      * @param {React.KeyboardEvent<HTMLInputElement>} event - Browser event.
      */
    def onChange(event: KeyboardEvent[HTMLInputElement]): Unit
    
    /**
      * Callback function to be invoked when the keydown event.
      * @param {React.KeyboardEvent<HTMLInputElement>} event - Browser event.
      */
    def onKeyDown(event: KeyboardEvent[HTMLInputElement]): Unit
  }
  object TreeFilterInputOptions {
    
    inline def apply(
      className: String,
      onChange: KeyboardEvent[HTMLInputElement] => Unit,
      onKeyDown: KeyboardEvent[HTMLInputElement] => Unit
    ): TreeFilterInputOptions = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown))
      __obj.asInstanceOf[TreeFilterInputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeFilterInputOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Custom tree filter options
    */
  trait TreeFilterOptions extends StObject {
    
    /**
      * Used to filter options
      * @param {KeyboardEvent} event - Browser event.
      */
    var filter: js.UndefOr[js.Function1[/* event */ js.UndefOr[typings.std.KeyboardEvent], Unit]] = js.undefined
    
    /**
      * Used to reset the filtered options
      */
    var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object TreeFilterOptions {
    
    inline def apply(): TreeFilterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeFilterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeFilterOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: /* event */ js.UndefOr[typings.std.KeyboardEvent] => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    }
  }
  
  /**
    * Custom filter value change event.
    * @see {@link TreeProps.onFilterValueChange}
    * @event
    */
  trait TreeFilterValueChangeEvent extends StObject {
    
    /**
      * Browser event.
      */
    var originalEvent: FormEvent[HTMLInputElement]
    
    /**
      * The filtered value.
      */
    var value: String
  }
  object TreeFilterValueChangeEvent {
    
    inline def apply(originalEvent: FormEvent[HTMLInputElement], value: String): TreeFilterValueChangeEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeFilterValueChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeFilterValueChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: FormEvent[HTMLInputElement]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom tree header template options
    */
  trait TreeHeaderTemplateOptions extends StObject {
    
    /**
      * The JSX element of the tree header.
      */
    var element: typings.react.mod.global.JSX.Element
    
    /**
      * Style class of the filter container element.
      */
    var filterContainerClassName: String
    
    /**
      * The JSX element of the filter input.
      */
    var filterElement: typings.react.mod.global.JSX.Element
    
    /**
      * Style class of the filter icon element.
      */
    var filterIconClasssName: String
    
    /**
      * The options for the filter input element.
      */
    var filterInput: TreeFilterInputOptions
    
    /**
      * The props of the tree header component.
      */
    var props: TreeProps
  }
  object TreeHeaderTemplateOptions {
    
    inline def apply(
      element: typings.react.mod.global.JSX.Element,
      filterContainerClassName: String,
      filterElement: typings.react.mod.global.JSX.Element,
      filterIconClasssName: String,
      filterInput: TreeFilterInputOptions,
      props: TreeProps
    ): TreeHeaderTemplateOptions = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], filterContainerClassName = filterContainerClassName.asInstanceOf[js.Any], filterElement = filterElement.asInstanceOf[js.Any], filterIconClasssName = filterIconClasssName.asInstanceOf[js.Any], filterInput = filterInput.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeHeaderTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeHeaderTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setElement(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFilterContainerClassName(value: String): Self = StObject.set(x, "filterContainerClassName", value.asInstanceOf[js.Any])
      
      inline def setFilterElement(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "filterElement", value.asInstanceOf[js.Any])
      
      inline def setFilterIconClasssName(value: String): Self = StObject.set(x, "filterIconClasssName", value.asInstanceOf[js.Any])
      
      inline def setFilterInput(value: TreeFilterInputOptions): Self = StObject.set(x, "filterInput", value.asInstanceOf[js.Any])
      
      inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom tree multiple selection keys
    */
  type TreeMultipleSelectionKeys = /**
    * Extra options.
    */
  StringDictionary[Boolean]
  
  /**
    * Custom click event
    * @see {@link TreeProps.onNodeClick}
    */
  trait TreeNodeClickEvent extends StObject {
    
    /**
      * The current node
      */
    var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    
    /**
      * Browser event
      */
    var originalEvent: SyntheticEvent[Element, Event]
  }
  object TreeNodeClickEvent {
    
    inline def apply(
      node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any,
      originalEvent: SyntheticEvent[Element, Event]
    ): TreeNodeClickEvent = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeNodeClickEvent] (val x: Self) extends AnyVal {
      
      inline def setNode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
      ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom click event.
    * @see {@link TreeProps.onNodeDoubleClick}
    * @extends {TreeNodeClickEvent}
    * @event
    */
  type TreeNodeDoubleClickEvent = TreeNodeClickEvent
  
  /**
    * Custom tree node template options
    */
  trait TreeNodeTemplateOptions extends StObject {
    
    /**
      * Style class of the element.
      */
    var className: String
    
    /**
      * The JSX element that represents the tree node.
      */
    var element: typings.react.mod.global.JSX.Element
    
    /**
      * Whether the tree node is expanded or not.
      */
    var expanded: Boolean
    
    /**
      * Callback to invoke when the toggler button is clicked.
      * @param {React.SyntheticEvent} event - Browser event
      */
    def onTogglerClick(event: SyntheticEvent[Element, Event]): Unit
    
    /**
      * The props of the Tree component.
      */
    var props: TreeProps
  }
  object TreeNodeTemplateOptions {
    
    inline def apply(
      className: String,
      element: typings.react.mod.global.JSX.Element,
      expanded: Boolean,
      onTogglerClick: SyntheticEvent[Element, Event] => Unit,
      props: TreeProps
    ): TreeNodeTemplateOptions = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onTogglerClick = js.Any.fromFunction1(onTogglerClick), props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeNodeTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setOnTogglerClick(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onTogglerClick", js.Any.fromFunction1(value))
      
      inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeProps extends StObject {
    
    /**
      * Icon to display in the checkbox.
      */
    var checkboxIcon: js.UndefOr[IconType[TreeProps]] = js.undefined
    
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
      * Icon of an expanded tab.
      */
    var collapseIcon: js.UndefOr[IconType[TreeProps]] = js.undefined
    
    /**
      * Style class of the tree content.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the tree content.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * A single key to control the selection with the context menu.
      */
    var contextMenuSelectionKey: js.UndefOr[String] = js.undefined
    
    /**
      * When present, it specifies that the component should be disabled.
      * @defaultValue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Unique key to enable dragdrop functionality.
      * @defaultValue false
      */
    var dragdropScope: js.UndefOr[String] = js.undefined
    
    /**
      * Icon of an collapsed tab.
      */
    var expandIcon: js.UndefOr[IconType[TreeProps]] = js.undefined
    
    /**
      * An array of keys to represent the state of the tree expansion state in controlled mode.
      */
    var expandedKeys: js.UndefOr[TreeExpandedKeysType] = js.undefined
    
    /**
      * When specified, displays an input field to filter the items.
      * @defaultValue false
      */
    var filter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When filtering is enabled, filterBy decides which field or fields (comma separated) to search against.
      * @defaultValue label
      */
    var filterBy: js.UndefOr[String] = js.undefined
    
    /**
      * Icon of the filter.
      */
    var filterIcon: js.UndefOr[IconType[TreeProps] | String] = js.undefined
    
    /**
      * Locale to use in filtering. The default locale is the host environment's current locale.
      * @defaultValue undefined
      */
    var filterLocale: js.UndefOr[String] = js.undefined
    
    /**
      * Mode for filtering valid values are "lenient" and "strict". Default is lenient.
      * @defaultValue lenient
      */
    var filterMode: js.UndefOr[lenient | strict] = js.undefined
    
    /**
      * Placeholder text to show when filter input is empty.
      */
    var filterPlaceholder: js.UndefOr[String] = js.undefined
    
    /**
      * Template of filter element.
      */
    var filterTemplate: js.UndefOr[ReactNode | (js.Function1[/* options */ TreeFilterOptions, ReactNode])] = js.undefined
    
    /**
      * When filtering is enabled, the value of input field.
      */
    var filterValue: js.UndefOr[String] = js.undefined
    
    /**
      * The template of header.
      */
    var footer: js.UndefOr[ReactNode | (js.Function1[/* props */ this.type, ReactNode])] = js.undefined
    
    /**
      * The template of header.
      */
    var header: js.UndefOr[ReactNode | (js.Function1[/* options */ TreeHeaderTemplateOptions, ReactNode])] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to display loading indicator.
      * @defaultValue false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon to display when tree is loading.
      */
    var loadingIcon: js.UndefOr[IconType[TreeProps]] = js.undefined
    
    /**
      * Defines how multiple items can be selected, when true metaKey needs to be pressed to select or unselect an item and when set to false selection of each item can be toggled individually. On touch enabled devices, metaKeySelection is turned off automatically.
      * @defaultValue true
      */
    var metaKeySelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Template of node element.
      * @defaultValue false
      */
    var nodeTemplate: js.UndefOr[
        ReactNode | (js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, 
          /* options */ TreeNodeTemplateOptions, 
          ReactNode
        ])
      ] = js.undefined
    
    /**
      * Callback to invoke when a node is collapsed.
      * @param {TreeEventNodeEvent} event - Custom node event.
      */
    var onCollapse: js.UndefOr[js.Function1[/* event */ TreeEventNodeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a node is selected with a context menu.
      * @param {TreeEventNodeEvent} event - Custom node event.
      */
    var onContextMenu: js.UndefOr[js.Function1[/* event */ TreeEventNodeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when selection changes with a context menu.
      * @param {TreeSelectionEvent} event - Custom select event.
      */
    var onContextMenuSelectionChange: js.UndefOr[js.Function1[/* event */ TreeSelectionEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a node is selected.
      * @param {TreeDragDropEvent} event - Custom dragdrop event.
      */
    var onDragDrop: js.UndefOr[js.Function1[/* event */ TreeDragDropEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a node is expanded.
      * @param {TreeEventNodeEvent} event - Custom node event.
      */
    var onExpand: js.UndefOr[js.Function1[/* event */ TreeEventNodeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when filter value changes.
      * @param {TreeFilterValueChangeEvent} event - Custom filter value change event.
      */
    var onFilterValueChange: js.UndefOr[js.Function1[/* event */ TreeFilterValueChangeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when the node is clicked.
      * @param {TreeNodeClickEvent} event - Custom click event.
      */
    var onNodeClick: js.UndefOr[js.Function1[/* event */ TreeNodeClickEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when the node is double-clicked.
      * @param {TreeNodeDoubleClickEvent} event - Custom doubleclick event.
      */
    var onNodeDoubleClick: js.UndefOr[js.Function1[/* event */ TreeNodeDoubleClickEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a node is selected.
      * @param {TreeEventNodeEvent} event - Custom node event.
      */
    var onSelect: js.UndefOr[js.Function1[/* event */ TreeEventNodeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when selection changes.
      * @param {TreeSelectionEvent} event - Custom select event.
      */
    var onSelectionChange: js.UndefOr[js.Function1[/* event */ TreeSelectionEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a node is toggled.
      * @param {TreeExpandedEvent} event - Custom expand event.
      */
    var onToggle: js.UndefOr[js.Function1[/* event */ TreeExpandedEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke when a node is unselected.
      * @param {TreeEventNodeEvent} event - Custom node event.
      */
    var onUnselect: js.UndefOr[js.Function1[/* event */ TreeEventNodeEvent, Unit]] = js.undefined
    
    /**
      * 	Whether checkbox selections propagate to descendant nodes.
      * @defaultValue true
      */
    var propagateSelectionDown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether checkbox selections propagate to ancestor nodes.
      * @defaultValue true
      */
    var propagateSelectionUp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A single or an array of keys to control the selection state.
      */
    var selectionKeys: js.UndefOr[String | TreeMultipleSelectionKeys | TreeCheckboxSelectionKeys | Null] = js.undefined
    
    /**
      * Defines the selection mode, valid values "single", "multiple", and "checkbox".
      */
    var selectionMode: js.UndefOr[single | multiple | checkbox] = js.undefined
    
    /**
      * Whether to show the header or not.
      * @defaultValue true
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inline style of the component.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Template of toggler element.
      */
    var togglerTemplate: js.UndefOr[
        ReactNode | (js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, 
          /* options */ TreeTogglerTemplateOptions, 
          ReactNode
        ])
      ] = js.undefined
    
    /**
      * An array of treenodes.
      */
    var value: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
        ]
      ] = js.undefined
  }
  object TreeProps {
    
    inline def apply(): TreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeProps] (val x: Self) extends AnyVal {
      
      inline def setCheckboxIcon(value: IconType[TreeProps]): Self = StObject.set(x, "checkboxIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckboxIconFunction1(value: /* options */ IconOptions[TreeProps] => ReactNode): Self = StObject.set(x, "checkboxIcon", js.Any.fromFunction1(value))
      
      inline def setCheckboxIconUndefined: Self = StObject.set(x, "checkboxIcon", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapseIcon(value: IconType[TreeProps]): Self = StObject.set(x, "collapseIcon", value.asInstanceOf[js.Any])
      
      inline def setCollapseIconFunction1(value: /* options */ IconOptions[TreeProps] => ReactNode): Self = StObject.set(x, "collapseIcon", js.Any.fromFunction1(value))
      
      inline def setCollapseIconUndefined: Self = StObject.set(x, "collapseIcon", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setContextMenuSelectionKey(value: String): Self = StObject.set(x, "contextMenuSelectionKey", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSelectionKeyUndefined: Self = StObject.set(x, "contextMenuSelectionKey", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDragdropScope(value: String): Self = StObject.set(x, "dragdropScope", value.asInstanceOf[js.Any])
      
      inline def setDragdropScopeUndefined: Self = StObject.set(x, "dragdropScope", js.undefined)
      
      inline def setExpandIcon(value: IconType[TreeProps]): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* options */ IconOptions[TreeProps] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandedKeys(value: TreeExpandedKeysType): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterBy(value: String): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      inline def setFilterIcon(value: IconType[TreeProps] | String): Self = StObject.set(x, "filterIcon", value.asInstanceOf[js.Any])
      
      inline def setFilterIconFunction1(value: /* options */ IconOptions[TreeProps] => ReactNode): Self = StObject.set(x, "filterIcon", js.Any.fromFunction1(value))
      
      inline def setFilterIconUndefined: Self = StObject.set(x, "filterIcon", js.undefined)
      
      inline def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      inline def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      inline def setFilterMode(value: lenient | strict): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      inline def setFilterTemplate(value: ReactNode | (js.Function1[/* options */ TreeFilterOptions, ReactNode])): Self = StObject.set(x, "filterTemplate", value.asInstanceOf[js.Any])
      
      inline def setFilterTemplateFunction1(value: /* options */ TreeFilterOptions => ReactNode): Self = StObject.set(x, "filterTemplate", js.Any.fromFunction1(value))
      
      inline def setFilterTemplateUndefined: Self = StObject.set(x, "filterTemplate", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      inline def setFooter(value: ReactNode | (js.Function1[TreeProps, ReactNode])): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: TreeProps => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: ReactNode | (js.Function1[/* options */ TreeHeaderTemplateOptions, ReactNode])): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction1(value: /* options */ TreeHeaderTemplateOptions => ReactNode): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingIcon(value: IconType[TreeProps]): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      inline def setLoadingIconFunction1(value: /* options */ IconOptions[TreeProps] => ReactNode): Self = StObject.set(x, "loadingIcon", js.Any.fromFunction1(value))
      
      inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      inline def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      inline def setNodeTemplate(
        value: ReactNode | (js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, 
              /* options */ TreeNodeTemplateOptions, 
              ReactNode
            ])
      ): Self = StObject.set(x, "nodeTemplate", value.asInstanceOf[js.Any])
      
      inline def setNodeTemplateFunction2(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, /* options */ TreeNodeTemplateOptions) => ReactNode
      ): Self = StObject.set(x, "nodeTemplate", js.Any.fromFunction2(value))
      
      inline def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
      
      inline def setOnCollapse(value: /* event */ TreeEventNodeEvent => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setOnContextMenu(value: /* event */ TreeEventNodeEvent => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuSelectionChange(value: /* event */ TreeSelectionEvent => Unit): Self = StObject.set(x, "onContextMenuSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuSelectionChangeUndefined: Self = StObject.set(x, "onContextMenuSelectionChange", js.undefined)
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDragDrop(value: /* event */ TreeDragDropEvent => Unit): Self = StObject.set(x, "onDragDrop", js.Any.fromFunction1(value))
      
      inline def setOnDragDropUndefined: Self = StObject.set(x, "onDragDrop", js.undefined)
      
      inline def setOnExpand(value: /* event */ TreeEventNodeEvent => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnFilterValueChange(value: /* event */ TreeFilterValueChangeEvent => Unit): Self = StObject.set(x, "onFilterValueChange", js.Any.fromFunction1(value))
      
      inline def setOnFilterValueChangeUndefined: Self = StObject.set(x, "onFilterValueChange", js.undefined)
      
      inline def setOnNodeClick(value: /* event */ TreeNodeClickEvent => Unit): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction1(value))
      
      inline def setOnNodeClickUndefined: Self = StObject.set(x, "onNodeClick", js.undefined)
      
      inline def setOnNodeDoubleClick(value: /* event */ TreeNodeDoubleClickEvent => Unit): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnNodeDoubleClickUndefined: Self = StObject.set(x, "onNodeDoubleClick", js.undefined)
      
      inline def setOnSelect(value: /* event */ TreeEventNodeEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSelectionChange(value: /* event */ TreeSelectionEvent => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnToggle(value: /* event */ TreeExpandedEvent => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOnUnselect(value: /* event */ TreeEventNodeEvent => Unit): Self = StObject.set(x, "onUnselect", js.Any.fromFunction1(value))
      
      inline def setOnUnselectUndefined: Self = StObject.set(x, "onUnselect", js.undefined)
      
      inline def setPropagateSelectionDown(value: Boolean): Self = StObject.set(x, "propagateSelectionDown", value.asInstanceOf[js.Any])
      
      inline def setPropagateSelectionDownUndefined: Self = StObject.set(x, "propagateSelectionDown", js.undefined)
      
      inline def setPropagateSelectionUp(value: Boolean): Self = StObject.set(x, "propagateSelectionUp", value.asInstanceOf[js.Any])
      
      inline def setPropagateSelectionUpUndefined: Self = StObject.set(x, "propagateSelectionUp", js.undefined)
      
      inline def setSelectionKeys(value: String | TreeMultipleSelectionKeys | TreeCheckboxSelectionKeys): Self = StObject.set(x, "selectionKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectionKeysNull: Self = StObject.set(x, "selectionKeys", null)
      
      inline def setSelectionKeysUndefined: Self = StObject.set(x, "selectionKeys", js.undefined)
      
      inline def setSelectionMode(value: single | multiple | checkbox): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTogglerTemplate(
        value: ReactNode | (js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, 
              /* options */ TreeTogglerTemplateOptions, 
              ReactNode
            ])
      ): Self = StObject.set(x, "togglerTemplate", value.asInstanceOf[js.Any])
      
      inline def setTogglerTemplateFunction2(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, /* options */ TreeTogglerTemplateOptions) => ReactNode
      ): Self = StObject.set(x, "togglerTemplate", js.Any.fromFunction2(value))
      
      inline def setTogglerTemplateUndefined: Self = StObject.set(x, "togglerTemplate", js.undefined)
      
      inline def setValue(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
            ]
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any)*
      ): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /**
    * Custom tree event.
    * @see {@link TreeProps.onSelectionChange},{@link TreeProps.onContextMenuSelectionChange}
    * @event
    */
  trait TreeSelectionEvent extends StObject {
    
    /**
      * Browser event.
      */
    var originalEvent: SyntheticEvent[Element, Event]
    
    /**
      * Selected node key(s).
      */
    var value: String | TreeMultipleSelectionKeys | TreeCheckboxSelectionKeys | Null
  }
  object TreeSelectionEvent {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event]): TreeSelectionEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[TreeSelectionEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeSelectionEvent] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | TreeMultipleSelectionKeys | TreeCheckboxSelectionKeys): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  /**
    * Custom tree toggler template options
    */
  trait TreeTogglerTemplateOptions extends StObject {
    
    /**
      * Style class of the panels container.
      */
    var containerClassName: String
    
    /**
      * JSX element to be used as the template options.
      */
    var element: typings.react.mod.global.JSX.Element
    
    /**
      * Whether the tree node is expanded or not.
      */
    var expanded: Boolean
    
    /**
      * Icon classname.
      */
    var iconClassName: String
    
    /**
      * Callback to invoke on click.
      * @param {React.SyntheticEvent} event - Browser event.
      */
    def onClick(event: SyntheticEvent[Element, Event]): Unit
    
    /**
      * The props of Tree component
      */
    var props: TreeProps
  }
  object TreeTogglerTemplateOptions {
    
    inline def apply(
      containerClassName: String,
      element: typings.react.mod.global.JSX.Element,
      expanded: Boolean,
      iconClassName: String,
      onClick: SyntheticEvent[Element, Event] => Unit,
      props: TreeProps
    ): TreeTogglerTemplateOptions = {
      val __obj = js.Dynamic.literal(containerClassName = containerClassName.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], iconClassName = iconClassName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeTogglerTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeTogglerTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setElement(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
