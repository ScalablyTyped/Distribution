package typings.rcTreeSelect

import typings.rcSelect.anon.Mark
import typings.rcSelect.generateMod.RefSelectProps
import typings.rcSelect.generatorMod.CustomTagProps
import typings.rcSelect.generatorMod.FilterFunc
import typings.rcSelect.generatorMod.OnClear
import typings.rcSelect.generatorMod.SingleType
import typings.rcSelect.interfaceMod.RenderDOMFunc
import typings.rcSelect.interfaceMod.RenderNode
import typings.rcTree.interfaceMod.IconType
import typings.rcTreeSelect.interfaceMod.ChangeEventExtra
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.LabelValueType
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import typings.rcTreeSelect.interfaceMod.SimpleModeConfig
import typings.rcTreeSelect.rcTreeSelectStrings.`additions removals`
import typings.rcTreeSelect.rcTreeSelectStrings.`additions text`
import typings.rcTreeSelect.rcTreeSelectStrings.`inline`
import typings.rcTreeSelect.rcTreeSelectStrings.`removals additions`
import typings.rcTreeSelect.rcTreeSelectStrings.`removals text`
import typings.rcTreeSelect.rcTreeSelectStrings.`text additions`
import typings.rcTreeSelect.rcTreeSelectStrings.`text removals`
import typings.rcTreeSelect.rcTreeSelectStrings.additions
import typings.rcTreeSelect.rcTreeSelectStrings.all
import typings.rcTreeSelect.rcTreeSelectStrings.ascending
import typings.rcTreeSelect.rcTreeSelectStrings.assertive
import typings.rcTreeSelect.rcTreeSelectStrings.both
import typings.rcTreeSelect.rcTreeSelectStrings.click
import typings.rcTreeSelect.rcTreeSelectStrings.copy
import typings.rcTreeSelect.rcTreeSelectStrings.date
import typings.rcTreeSelect.rcTreeSelectStrings.descending
import typings.rcTreeSelect.rcTreeSelectStrings.dialog
import typings.rcTreeSelect.rcTreeSelectStrings.execute
import typings.rcTreeSelect.rcTreeSelectStrings.focus
import typings.rcTreeSelect.rcTreeSelectStrings.grammar
import typings.rcTreeSelect.rcTreeSelectStrings.grid
import typings.rcTreeSelect.rcTreeSelectStrings.horizontal
import typings.rcTreeSelect.rcTreeSelectStrings.link
import typings.rcTreeSelect.rcTreeSelectStrings.list
import typings.rcTreeSelect.rcTreeSelectStrings.listbox
import typings.rcTreeSelect.rcTreeSelectStrings.location
import typings.rcTreeSelect.rcTreeSelectStrings.menu
import typings.rcTreeSelect.rcTreeSelectStrings.mixed
import typings.rcTreeSelect.rcTreeSelectStrings.move
import typings.rcTreeSelect.rcTreeSelectStrings.none
import typings.rcTreeSelect.rcTreeSelectStrings.off
import typings.rcTreeSelect.rcTreeSelectStrings.other
import typings.rcTreeSelect.rcTreeSelectStrings.page
import typings.rcTreeSelect.rcTreeSelectStrings.polite
import typings.rcTreeSelect.rcTreeSelectStrings.popup
import typings.rcTreeSelect.rcTreeSelectStrings.removals
import typings.rcTreeSelect.rcTreeSelectStrings.spelling
import typings.rcTreeSelect.rcTreeSelectStrings.step
import typings.rcTreeSelect.rcTreeSelectStrings.text
import typings.rcTreeSelect.rcTreeSelectStrings.time
import typings.rcTreeSelect.rcTreeSelectStrings.tree
import typings.rcTreeSelect.rcTreeSelectStrings.vertical
import typings.rcTreeSelect.strategyUtilMod.CheckedStrategy
import typings.rcTreeSelect.treeNodeMod.TreeNodeProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeSelectMod {
  
  @JSImport("rc-tree-select/es/TreeSelect", JSImport.Default)
  @js.native
  class default[ValueType] () extends TreeSelect[ValueType]
  object default {
    
    @JSImport("rc-tree-select/es/TreeSelect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof SHOW_ALL` */
    @JSImport("rc-tree-select/es/TreeSelect", "default.SHOW_ALL")
    @js.native
    def SHOW_ALL: /* "SHOW_ALL" */ String = js.native
    @scala.inline
    def SHOW_ALL_=(x: /* "SHOW_ALL" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_ALL")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof SHOW_CHILD` */
    @JSImport("rc-tree-select/es/TreeSelect", "default.SHOW_CHILD")
    @js.native
    def SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
    @scala.inline
    def SHOW_CHILD_=(x: /* "SHOW_CHILD" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_CHILD")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof SHOW_PARENT` */
    @JSImport("rc-tree-select/es/TreeSelect", "default.SHOW_PARENT")
    @js.native
    def SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
    @scala.inline
    def SHOW_PARENT_=(x: /* "SHOW_PARENT" */ String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PARENT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("rc-tree-select/es/TreeSelect", "default.TreeNode")
    @js.native
    def TreeNode: FC[TreeNodeProps] = js.native
    @scala.inline
    def TreeNode_=(x: FC[TreeNodeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TreeNode")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TreeSelect[ValueType]
    extends Component[TreeSelectProps[ValueType], js.Object, js.Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var selectRef: RefObject[RefSelectProps] = js.native
  }
  
  /* Inlined parent std.Omit<rc-select.rc-select/lib/generate.SelectProps<std.Array<rc-tree-select.rc-tree-select/es/interface.DataNode>, ValueType>, 'onChange' | 'mode' | 'menuItemSelectedIcon' | 'dropdownAlign' | 'backfill' | 'getInputElement' | 'optionLabelProp' | 'tokenSeparators' | 'filterOption'> */
  trait TreeSelectProps[ValueType] extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    var `aria-busy`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    var `aria-modal`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Boolean] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoClearSearchValue: js.UndefOr[Boolean] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var choiceTransitionName: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[ReactNode] = js.undefined
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.undefined
    
    var dropdownPopupAlign: js.UndefOr[js.Any] = js.undefined
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.undefined
    
    var dropdownStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var filterTreeNode: js.UndefOr[Boolean | FilterFunc[LegacyDataNode]] = js.undefined
    
    var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputIcon: js.UndefOr[RenderNode] = js.undefined
    
    /** @deprecated Use `searchValue` instead */
    var inputValue: js.UndefOr[String] = js.undefined
    
    var internalProps: js.UndefOr[Mark[js.Array[DataNode]]] = js.undefined
    
    var labelInValue: js.UndefOr[Boolean] = js.undefined
    
    var listHeight: js.UndefOr[Double] = js.undefined
    
    var listItemHeight: js.UndefOr[Double] = js.undefined
    
    var loadData: js.UndefOr[js.Function1[/* dataNode */ LegacyDataNode, js.Promise[js.Any]]] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var maxTagCount: js.UndefOr[Double] = js.undefined
    
    var maxTagPlaceholder: js.UndefOr[js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode]] = js.undefined
    
    var maxTagTextLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var notFoundContent: js.UndefOr[ReactNode] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ ValueType, 
          /* labelList */ js.Array[ReactNode], 
          /* extra */ ChangeEventExtra, 
          Unit
        ]
      ] = js.undefined
    
    var onClear: js.UndefOr[OnClear] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var onDeselect: js.UndefOr[
        js.Function2[
          /* value */ SingleType[ValueType], 
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<rc-tree-select.rc-tree-select/es/interface.DataNode>[number] */ /* option */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[
        js.Function2[
          /* value */ SingleType[ValueType], 
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<rc-tree-select.rc-tree-select/es/interface.DataNode>[number] */ /* option */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var onTreeExpand: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
    
    var onTreeLoad: js.UndefOr[js.Function1[/* loadedKeys */ js.Array[Key], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var optionFilterProp: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Array[DataNode]] = js.undefined
    
    var placeholder: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var removeIcon: js.UndefOr[ReactNode] = js.undefined
    
    /** `searchPlaceholder` has been removed since search box has been merged into input box */
    var searchPlaceholder: js.UndefOr[ReactNode] = js.undefined
    
    var searchValue: js.UndefOr[String] = js.undefined
    
    var showAction: js.UndefOr[js.Array[focus | click]] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var showCheckedStrategy: js.UndefOr[CheckedStrategy] = js.undefined
    
    var showSearch: js.UndefOr[Boolean] = js.undefined
    
    var showTreeIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var treeCheckStrictly: js.UndefOr[Boolean] = js.undefined
    
    var treeCheckable: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var treeData: js.UndefOr[js.Array[DataNode]] = js.undefined
    
    var treeDataSimpleMode: js.UndefOr[Boolean | SimpleModeConfig] = js.undefined
    
    var treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined
    
    var treeDefaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var treeExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var treeIcon: js.UndefOr[IconType] = js.undefined
    
    var treeLine: js.UndefOr[Boolean] = js.undefined
    
    var treeLoadedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var treeMotion: js.UndefOr[js.Any] = js.undefined
    
    var treeNodeFilterProp: js.UndefOr[String] = js.undefined
    
    var treeNodeLabelProp: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[ValueType] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object TreeSelectProps {
    
    @scala.inline
    def apply[ValueType](): TreeSelectProps[ValueType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeSelectProps[ValueType]]
    }
    
    @scala.inline
    implicit class TreeSelectPropsMutableBuilder[Self <: TreeSelectProps[?], ValueType] (val x: Self & TreeSelectProps[ValueType]) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChoiceTransitionName(value: String): Self = StObject.set(x, "choiceTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoiceTransitionNameUndefined: Self = StObject.set(x, "choiceTransitionName", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setDefaultActiveFirstOption(value: Boolean): Self = StObject.set(x, "defaultActiveFirstOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveFirstOptionUndefined: Self = StObject.set(x, "defaultActiveFirstOption", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      @scala.inline
      def setDropdownPopupAlign(value: js.Any): Self = StObject.set(x, "dropdownPopupAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPopupAlignUndefined: Self = StObject.set(x, "dropdownPopupAlign", js.undefined)
      
      @scala.inline
      def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      @scala.inline
      def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      @scala.inline
      def setFilterTreeNode(value: Boolean | FilterFunc[LegacyDataNode]): Self = StObject.set(x, "filterTreeNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTreeNodeFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[LegacyDataNode]) => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* props */ js.Any => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputIcon(value: RenderNode): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIconFunction1(value: /* props */ js.Any => ReactNode): Self = StObject.set(x, "inputIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputIconUndefined: Self = StObject.set(x, "inputIcon", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setInternalProps(value: Mark[js.Array[DataNode]]): Self = StObject.set(x, "internalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalPropsUndefined: Self = StObject.set(x, "internalProps", js.undefined)
      
      @scala.inline
      def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelInValueUndefined: Self = StObject.set(x, "labelInValue", js.undefined)
      
      @scala.inline
      def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      @scala.inline
      def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      @scala.inline
      def setLoadData(value: /* dataNode */ LegacyDataNode => js.Promise[js.Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMaxTagCount(value: Double): Self = StObject.set(x, "maxTagCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagCountUndefined: Self = StObject.set(x, "maxTagCount", js.undefined)
      
      @scala.inline
      def setMaxTagPlaceholder(value: /* omittedValues */ js.Array[LabelValueType] => ReactNode): Self = StObject.set(x, "maxTagPlaceholder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxTagPlaceholderUndefined: Self = StObject.set(x, "maxTagPlaceholder", js.undefined)
      
      @scala.inline
      def setMaxTagTextLength(value: Double): Self = StObject.set(x, "maxTagTextLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagTextLengthUndefined: Self = StObject.set(x, "maxTagTextLength", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setNotFoundContent(value: ReactNode): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* value */ ValueType, /* labelList */ js.Array[ReactNode], /* extra */ ChangeEventExtra) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDeselect(
        value: (/* value */ SingleType[ValueType], /* import warning: importer.ImportType#apply Failed type conversion: std.Array<rc-tree-select.rc-tree-select/es/interface.DataNode>[number] */ /* option */ js.Any) => Unit
      ): Self = StObject.set(x, "onDeselect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnDropdownVisibleChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onDropdownVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropdownVisibleChangeUndefined: Self = StObject.set(x, "onDropdownVisibleChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInputKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onInputKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputKeyDownUndefined: Self = StObject.set(x, "onInputKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnPopupScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onPopupScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPopupScrollUndefined: Self = StObject.set(x, "onPopupScroll", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* value */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSelect(
        value: (/* value */ SingleType[ValueType], /* import warning: importer.ImportType#apply Failed type conversion: std.Array<rc-tree-select.rc-tree-select/es/interface.DataNode>[number] */ /* option */ js.Any) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnTreeExpand(value: /* expandedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onTreeExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTreeExpandUndefined: Self = StObject.set(x, "onTreeExpand", js.undefined)
      
      @scala.inline
      def setOnTreeLoad(value: /* loadedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTreeLoadUndefined: Self = StObject.set(x, "onTreeLoad", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptionFilterProp(value: String): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionFilterPropUndefined: Self = StObject.set(x, "optionFilterProp", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[DataNode]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: DataNode*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: ReactNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setSearchPlaceholder(value: ReactNode): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      @scala.inline
      def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      @scala.inline
      def setShowAction(value: js.Array[focus | click]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      @scala.inline
      def setShowActionVarargs(value: (focus | click)*): Self = StObject.set(x, "showAction", js.Array(value :_*))
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setShowCheckedStrategy(value: CheckedStrategy): Self = StObject.set(x, "showCheckedStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckedStrategyUndefined: Self = StObject.set(x, "showCheckedStrategy", js.undefined)
      
      @scala.inline
      def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setShowTreeIcon(value: Boolean): Self = StObject.set(x, "showTreeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTreeIconUndefined: Self = StObject.set(x, "showTreeIcon", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ typings.rcTree.treeNodeMod.TreeNodeProps => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = StObject.set(x, "tagRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagRenderUndefined: Self = StObject.set(x, "tagRender", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTreeCheckStrictly(value: Boolean): Self = StObject.set(x, "treeCheckStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeCheckStrictlyUndefined: Self = StObject.set(x, "treeCheckStrictly", js.undefined)
      
      @scala.inline
      def setTreeCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "treeCheckable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeCheckableUndefined: Self = StObject.set(x, "treeCheckable", js.undefined)
      
      @scala.inline
      def setTreeData(value: js.Array[DataNode]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataSimpleMode(value: Boolean | SimpleModeConfig): Self = StObject.set(x, "treeDataSimpleMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataSimpleModeUndefined: Self = StObject.set(x, "treeDataSimpleMode", js.undefined)
      
      @scala.inline
      def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      @scala.inline
      def setTreeDataVarargs(value: DataNode*): Self = StObject.set(x, "treeData", js.Array(value :_*))
      
      @scala.inline
      def setTreeDefaultExpandAll(value: Boolean): Self = StObject.set(x, "treeDefaultExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandAllUndefined: Self = StObject.set(x, "treeDefaultExpandAll", js.undefined)
      
      @scala.inline
      def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandedKeysUndefined: Self = StObject.set(x, "treeDefaultExpandedKeys", js.undefined)
      
      @scala.inline
      def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeDefaultExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeExpandedKeysUndefined: Self = StObject.set(x, "treeExpandedKeys", js.undefined)
      
      @scala.inline
      def setTreeExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeIcon(value: IconType): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIconFunction1(value: /* props */ typings.rcTree.treeNodeMod.TreeNodeProps => ReactNode): Self = StObject.set(x, "treeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeIconUndefined: Self = StObject.set(x, "treeIcon", js.undefined)
      
      @scala.inline
      def setTreeLine(value: Boolean): Self = StObject.set(x, "treeLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLineUndefined: Self = StObject.set(x, "treeLine", js.undefined)
      
      @scala.inline
      def setTreeLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeLoadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLoadedKeysUndefined: Self = StObject.set(x, "treeLoadedKeys", js.undefined)
      
      @scala.inline
      def setTreeLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "treeLoadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeMotion(value: js.Any): Self = StObject.set(x, "treeMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeMotionUndefined: Self = StObject.set(x, "treeMotion", js.undefined)
      
      @scala.inline
      def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeNodeFilterPropUndefined: Self = StObject.set(x, "treeNodeFilterProp", js.undefined)
      
      @scala.inline
      def setTreeNodeLabelProp(value: String): Self = StObject.set(x, "treeNodeLabelProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeNodeLabelPropUndefined: Self = StObject.set(x, "treeNodeLabelProp", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
