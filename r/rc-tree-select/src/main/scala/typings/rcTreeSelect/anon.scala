package typings.rcTreeSelect

import typings.rcSelect.libBaseSelectMod.BaseSelectRef
import typings.rcSelect.libBaseSelectMod.CustomTagProps
import typings.rcSelect.libBaseSelectMod.DisplayValueType
import typings.rcSelect.libBaseSelectMod.Placement
import typings.rcSelect.libBaseSelectMod.RenderDOMFunc
import typings.rcSelect.libBaseSelectMod.RenderNode
import typings.rcSelect.libSelectMod.ArrayElementType
import typings.rcSelect.libSelectMod.LabelInValueType
import typings.rcSelect.libSelectMod.SelectHandler
import typings.rcTree.esInterfaceMod.DataEntity
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esInterfaceMod.IconType
import typings.rcTree.esTreeMod.ExpandAction
import typings.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import typings.rcTreeSelect.esTreeSelectMod.ChangeEventExtra
import typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import typings.rcTreeSelect.esTreeSelectMod.InternalFieldName
import typings.rcTreeSelect.esTreeSelectMod.LegacyDataNode
import typings.rcTreeSelect.esTreeSelectMod.RawValueType
import typings.rcTreeSelect.esTreeSelectMod.SimpleModeConfig
import typings.rcTreeSelect.esUtilsStrategyUtilMod.CheckedStrategy
import typings.rcTrigger.esInterfaceMod.AlignType
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
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
import typings.react.mod.Ref
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var ref: js.UndefOr[Ref[BaseSelectRef]] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRef(value: Ref[BaseSelectRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ BaseSelectRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait FieldNames extends StObject {
    
    var fieldNames: InternalFieldName
    
    var filterTreeNode: js.UndefOr[
        Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ] = js.undefined
    
    var treeNodeFilterProp: String
  }
  object FieldNames {
    
    inline def apply(fieldNames: InternalFieldName, treeNodeFilterProp: String): FieldNames = {
      val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldNames]
    }
    
    extension [Self <: FieldNames](x: Self) {
      
      inline def setFieldNames(value: InternalFieldName): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFilterTreeNode(
        value: Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ): Self = StObject.set(x, "filterTreeNode", value.asInstanceOf[js.Any])
      
      inline def setFilterTreeNodeFunction2(value: (/* inputValue */ String, /* treeNode */ DefaultOptionType) => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction2(value))
      
      inline def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      inline def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var _title: js.Array[String]
    
    var children: String
    
    var key: String
    
    var value: String
  }
  object Key {
    
    inline def apply(_title: js.Array[String], children: String, key: String, value: String): Key = {
      val __obj = js.Dynamic.literal(_title = _title.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def set_title(value: js.Array[String]): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
      
      inline def set_titleVarargs(value: String*): Self = StObject.set(x, "_title", js.Array(value*))
    }
  }
  
  trait KeyEntities extends StObject {
    
    var keyEntities: Record[String, DataEntity[DataNode]]
    
    var valueEntities: Map[RawValueType, DataEntity[DataNode]]
  }
  object KeyEntities {
    
    inline def apply(
      keyEntities: Record[String, DataEntity[DataNode]],
      valueEntities: Map[RawValueType, DataEntity[DataNode]]
    ): KeyEntities = {
      val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any], valueEntities = valueEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyEntities]
    }
    
    extension [Self <: KeyEntities](x: Self) {
      
      inline def setKeyEntities(value: Record[String, DataEntity[DataNode]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setValueEntities(value: Map[RawValueType, DataEntity[DataNode]]): Self = StObject.set(x, "valueEntities", value.asInstanceOf[js.Any])
    }
  }
  
  trait SHOWALL extends StObject {
    
    var SHOW_ALL: /* "SHOW_ALL" */ String
    
    var SHOW_CHILD: /* "SHOW_CHILD" */ String
    
    var SHOW_PARENT: /* "SHOW_PARENT" */ String
    
    var TreeNode: FC[TreeNodeProps]
  }
  object SHOWALL {
    
    inline def apply(
      SHOW_ALL: /* "SHOW_ALL" */ String,
      SHOW_CHILD: /* "SHOW_CHILD" */ String,
      SHOW_PARENT: /* "SHOW_PARENT" */ String,
      TreeNode: FC[TreeNodeProps]
    ): SHOWALL = {
      val __obj = js.Dynamic.literal(SHOW_ALL = SHOW_ALL.asInstanceOf[js.Any], SHOW_CHILD = SHOW_CHILD.asInstanceOf[js.Any], SHOW_PARENT = SHOW_PARENT.asInstanceOf[js.Any], TreeNode = TreeNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SHOWALL]
    }
    
    extension [Self <: SHOWALL](x: Self) {
      
      inline def setSHOW_ALL(value: /* "SHOW_ALL" */ String): Self = StObject.set(x, "SHOW_ALL", value.asInstanceOf[js.Any])
      
      inline def setSHOW_CHILD(value: /* "SHOW_CHILD" */ String): Self = StObject.set(x, "SHOW_CHILD", value.asInstanceOf[js.Any])
      
      inline def setSHOW_PARENT(value: /* "SHOW_PARENT" */ String): Self = StObject.set(x, "SHOW_PARENT", value.asInstanceOf[js.Any])
      
      inline def setTreeNode(value: FC[TreeNodeProps]): Self = StObject.set(x, "TreeNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selected extends StObject {
    
    var selected: Boolean
  }
  object Selected {
    
    inline def apply(selected: Boolean): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-tree-select.rc-tree-select/es/TreeSelect.TreeSelectProps<any, rc-tree-select.rc-tree-select/es/TreeSelect.DefaultOptionType> & {  searchPlaceholder :string | undefined} */
  trait TreeSelectPropsanyDefault extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-autocomplete`: js.UndefOr["none" | "inline" | "list" | "both"] = js.undefined
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-checked`: js.UndefOr[Boolean | "mixed"] = js.undefined
    
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    var `aria-current`: js.UndefOr[Boolean | "page" | "step" | "location" | "date" | "time"] = js.undefined
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-dropeffect`: js.UndefOr["none" | "copy" | "execute" | "link" | "move" | "popup"] = js.undefined
    
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-haspopup`: js.UndefOr[Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"] = js.undefined
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-invalid`: js.UndefOr[Boolean | "grammar" | "spelling"] = js.undefined
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    var `aria-live`: js.UndefOr["off" | "assertive" | "polite"] = js.undefined
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-orientation`: js.UndefOr["horizontal" | "vertical"] = js.undefined
    
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    var `aria-pressed`: js.UndefOr[Boolean | "mixed"] = js.undefined
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-relevant`: js.UndefOr[
        "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
      ] = js.undefined
    
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    var `aria-sort`: js.UndefOr["none" | "ascending" | "descending" | "other"] = js.undefined
    
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoClearSearchValue: js.UndefOr[Boolean] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var choiceTransitionName: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[RenderNode] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var direction: js.UndefOr["ltr" | "rtl"] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropdownAlign: js.UndefOr[AlignType] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.undefined
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.undefined
    
    var dropdownStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var fieldNames: js.UndefOr[typings.rcTreeSelect.esTreeSelectMod.FieldNames] = js.undefined
    
    var filterTreeNode: js.UndefOr[
        Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ] = js.undefined
    
    var getInputElement: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.undefined
    
    var getRawInputElement: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputIcon: js.UndefOr[RenderNode] = js.undefined
    
    /** @deprecated Use `searchValue` instead */
    var inputValue: js.UndefOr[String] = js.undefined
    
    var labelInValue: js.UndefOr[Boolean] = js.undefined
    
    var listHeight: js.UndefOr[Double] = js.undefined
    
    var listItemHeight: js.UndefOr[Double] = js.undefined
    
    var loadData: js.UndefOr[js.Function1[/* dataNode */ LegacyDataNode, js.Promise[Any]]] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxTagCount: js.UndefOr[Double | "responsive"] = js.undefined
    
    var maxTagPlaceholder: js.UndefOr[
        ReactNode | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactNode])
      ] = js.undefined
    
    var maxTagTextLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var notFoundContent: js.UndefOr[ReactNode] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ Any, 
          /* labelList */ js.Array[ReactNode], 
          /* extra */ ChangeEventExtra, 
          Unit
        ]
      ] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDeselect: js.UndefOr[SelectHandler[ArrayElementType[Any], DefaultOptionType]] = js.undefined
    
    var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[SelectHandler[ArrayElementType[Any], DefaultOptionType]] = js.undefined
    
    var onTreeExpand: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[typings.react.mod.Key], Unit]] = js.undefined
    
    var onTreeLoad: js.UndefOr[js.Function1[/* loadedKeys */ js.Array[typings.react.mod.Key], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[ReactNode] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var removeIcon: js.UndefOr[RenderNode] = js.undefined
    
    var searchPlaceholder: js.UndefOr[String] = js.undefined
    
    var searchValue: js.UndefOr[String] = js.undefined
    
    var showAction: js.UndefOr[js.Array["focus" | "click"]] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var showCheckedStrategy: js.UndefOr[CheckedStrategy] = js.undefined
    
    var showSearch: js.UndefOr[Boolean] = js.undefined
    
    var showTreeIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.undefined
    
    var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var treeCheckStrictly: js.UndefOr[Boolean] = js.undefined
    
    var treeCheckable: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var treeData: js.UndefOr[js.Array[DefaultOptionType]] = js.undefined
    
    var treeDataSimpleMode: js.UndefOr[Boolean | SimpleModeConfig] = js.undefined
    
    var treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined
    
    var treeDefaultExpandedKeys: js.UndefOr[js.Array[typings.react.mod.Key]] = js.undefined
    
    var treeExpandAction: js.UndefOr[ExpandAction] = js.undefined
    
    var treeExpandedKeys: js.UndefOr[js.Array[typings.react.mod.Key]] = js.undefined
    
    var treeIcon: js.UndefOr[IconType] = js.undefined
    
    var treeLine: js.UndefOr[Boolean] = js.undefined
    
    var treeLoadedKeys: js.UndefOr[js.Array[typings.react.mod.Key]] = js.undefined
    
    var treeMotion: js.UndefOr[Any] = js.undefined
    
    var treeNodeFilterProp: js.UndefOr[String] = js.undefined
    
    var treeNodeLabelProp: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object TreeSelectPropsanyDefault {
    
    inline def apply(): TreeSelectPropsanyDefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeSelectPropsanyDefault]
    }
    
    extension [Self <: TreeSelectPropsanyDefault](x: Self) {
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: "none" | "inline" | "list" | "both"): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | "page" | "step" | "location" | "date" | "time"): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: "none" | "copy" | "execute" | "link" | "move" | "popup"): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | "menu" | "listbox" | "tree" | "grid" | "dialog"): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | "grammar" | "spelling"): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: "off" | "assertive" | "polite"): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: "horizontal" | "vertical"): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | "mixed"): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: "additions" | ("additions removals") | ("additions text") | "all" | "removals" | ("removals additions") | ("removals text") | "text" | ("text additions") | ("text removals")
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
      
      inline def `setAria-sort`(value: "none" | "ascending" | "descending" | "other"): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
      
      inline def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChoiceTransitionName(value: String): Self = StObject.set(x, "choiceTransitionName", value.asInstanceOf[js.Any])
      
      inline def setChoiceTransitionNameUndefined: Self = StObject.set(x, "choiceTransitionName", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearIcon(value: RenderNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: "ltr" | "rtl"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      inline def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      inline def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      inline def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      inline def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      inline def setFieldNames(value: typings.rcTreeSelect.esTreeSelectMod.FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFilterTreeNode(
        value: Boolean | (js.Function2[/* inputValue */ String, /* treeNode */ DefaultOptionType, Boolean])
      ): Self = StObject.set(x, "filterTreeNode", value.asInstanceOf[js.Any])
      
      inline def setFilterTreeNodeFunction2(value: (/* inputValue */ String, /* treeNode */ DefaultOptionType) => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction2(value))
      
      inline def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      inline def setGetInputElement(value: () => Element): Self = StObject.set(x, "getInputElement", js.Any.fromFunction0(value))
      
      inline def setGetInputElementUndefined: Self = StObject.set(x, "getInputElement", js.undefined)
      
      inline def setGetPopupContainer(value: /* props */ Any => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setGetRawInputElement(value: () => Element): Self = StObject.set(x, "getRawInputElement", js.Any.fromFunction0(value))
      
      inline def setGetRawInputElementUndefined: Self = StObject.set(x, "getRawInputElement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputIcon(value: RenderNode): Self = StObject.set(x, "inputIcon", value.asInstanceOf[js.Any])
      
      inline def setInputIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "inputIcon", js.Any.fromFunction1(value))
      
      inline def setInputIconUndefined: Self = StObject.set(x, "inputIcon", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
      
      inline def setLabelInValueUndefined: Self = StObject.set(x, "labelInValue", js.undefined)
      
      inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      inline def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      inline def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      inline def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      inline def setLoadData(value: /* dataNode */ LegacyDataNode => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxTagCount(value: Double | "responsive"): Self = StObject.set(x, "maxTagCount", value.asInstanceOf[js.Any])
      
      inline def setMaxTagCountUndefined: Self = StObject.set(x, "maxTagCount", js.undefined)
      
      inline def setMaxTagPlaceholder(value: ReactNode | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactNode])): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[DisplayValueType] => ReactNode): Self = StObject.set(x, "maxTagPlaceholder", js.Any.fromFunction1(value))
      
      inline def setMaxTagPlaceholderUndefined: Self = StObject.set(x, "maxTagPlaceholder", js.undefined)
      
      inline def setMaxTagTextLength(value: Double): Self = StObject.set(x, "maxTagTextLength", value.asInstanceOf[js.Any])
      
      inline def setMaxTagTextLengthUndefined: Self = StObject.set(x, "maxTagTextLength", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNotFoundContent(value: ReactNode): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      inline def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(
        value: (/* value */ Any, /* labelList */ js.Array[ReactNode], /* extra */ ChangeEventExtra) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDeselect(
        value: (LabelInValueType | typings.rcSelect.libSelectMod.RawValueType | ArrayElementType[Any], DefaultOptionType) => Unit
      ): Self = StObject.set(x, "onDeselect", js.Any.fromFunction2(value))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnDropdownVisibleChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onDropdownVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnDropdownVisibleChangeUndefined: Self = StObject.set(x, "onDropdownVisibleChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInputKeyDown(value: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnInputKeyDownUndefined: Self = StObject.set(x, "onInputKeyDown", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnPopupScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onPopupScroll", js.Any.fromFunction1(value))
      
      inline def setOnPopupScrollUndefined: Self = StObject.set(x, "onPopupScroll", js.undefined)
      
      inline def setOnSearch(value: /* value */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSelect(
        value: (LabelInValueType | typings.rcSelect.libSelectMod.RawValueType | ArrayElementType[Any], DefaultOptionType) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnTreeExpand(value: /* expandedKeys */ js.Array[typings.react.mod.Key] => Unit): Self = StObject.set(x, "onTreeExpand", js.Any.fromFunction1(value))
      
      inline def setOnTreeExpandUndefined: Self = StObject.set(x, "onTreeExpand", js.undefined)
      
      inline def setOnTreeLoad(value: /* loadedKeys */ js.Array[typings.react.mod.Key] => Unit): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction1(value))
      
      inline def setOnTreeLoadUndefined: Self = StObject.set(x, "onTreeLoad", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRemoveIcon(value: RenderNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      inline def setRemoveIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      inline def setShowAction(value: js.Array["focus" | "click"]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      inline def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      inline def setShowActionVarargs(value: ("focus" | "click")*): Self = StObject.set(x, "showAction", js.Array(value*))
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setShowCheckedStrategy(value: CheckedStrategy): Self = StObject.set(x, "showCheckedStrategy", value.asInstanceOf[js.Any])
      
      inline def setShowCheckedStrategyUndefined: Self = StObject.set(x, "showCheckedStrategy", js.undefined)
      
      inline def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      inline def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      inline def setShowTreeIcon(value: Boolean): Self = StObject.set(x, "showTreeIcon", value.asInstanceOf[js.Any])
      
      inline def setShowTreeIconUndefined: Self = StObject.set(x, "showTreeIcon", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ typings.rcTree.esTreeNodeMod.TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = StObject.set(x, "tagRender", js.Any.fromFunction1(value))
      
      inline def setTagRenderUndefined: Self = StObject.set(x, "tagRender", js.undefined)
      
      inline def setTokenSeparators(value: js.Array[String]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
      
      inline def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
      
      inline def setTokenSeparatorsVarargs(value: String*): Self = StObject.set(x, "tokenSeparators", js.Array(value*))
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTreeCheckStrictly(value: Boolean): Self = StObject.set(x, "treeCheckStrictly", value.asInstanceOf[js.Any])
      
      inline def setTreeCheckStrictlyUndefined: Self = StObject.set(x, "treeCheckStrictly", js.undefined)
      
      inline def setTreeCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "treeCheckable", value.asInstanceOf[js.Any])
      
      inline def setTreeCheckableUndefined: Self = StObject.set(x, "treeCheckable", js.undefined)
      
      inline def setTreeData(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      inline def setTreeDataSimpleMode(value: Boolean | SimpleModeConfig): Self = StObject.set(x, "treeDataSimpleMode", value.asInstanceOf[js.Any])
      
      inline def setTreeDataSimpleModeUndefined: Self = StObject.set(x, "treeDataSimpleMode", js.undefined)
      
      inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      inline def setTreeDataVarargs(value: DefaultOptionType*): Self = StObject.set(x, "treeData", js.Array(value*))
      
      inline def setTreeDefaultExpandAll(value: Boolean): Self = StObject.set(x, "treeDefaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandAllUndefined: Self = StObject.set(x, "treeDefaultExpandAll", js.undefined)
      
      inline def setTreeDefaultExpandedKeys(value: js.Array[typings.react.mod.Key]): Self = StObject.set(x, "treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandedKeysUndefined: Self = StObject.set(x, "treeDefaultExpandedKeys", js.undefined)
      
      inline def setTreeDefaultExpandedKeysVarargs(value: typings.react.mod.Key*): Self = StObject.set(x, "treeDefaultExpandedKeys", js.Array(value*))
      
      inline def setTreeExpandAction(value: ExpandAction): Self = StObject.set(x, "treeExpandAction", value.asInstanceOf[js.Any])
      
      inline def setTreeExpandActionUndefined: Self = StObject.set(x, "treeExpandAction", js.undefined)
      
      inline def setTreeExpandedKeys(value: js.Array[typings.react.mod.Key]): Self = StObject.set(x, "treeExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeExpandedKeysUndefined: Self = StObject.set(x, "treeExpandedKeys", js.undefined)
      
      inline def setTreeExpandedKeysVarargs(value: typings.react.mod.Key*): Self = StObject.set(x, "treeExpandedKeys", js.Array(value*))
      
      inline def setTreeIcon(value: IconType): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      inline def setTreeIconFunction1(value: /* props */ typings.rcTree.esTreeNodeMod.TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "treeIcon", js.Any.fromFunction1(value))
      
      inline def setTreeIconUndefined: Self = StObject.set(x, "treeIcon", js.undefined)
      
      inline def setTreeLine(value: Boolean): Self = StObject.set(x, "treeLine", value.asInstanceOf[js.Any])
      
      inline def setTreeLineUndefined: Self = StObject.set(x, "treeLine", js.undefined)
      
      inline def setTreeLoadedKeys(value: js.Array[typings.react.mod.Key]): Self = StObject.set(x, "treeLoadedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeLoadedKeysUndefined: Self = StObject.set(x, "treeLoadedKeys", js.undefined)
      
      inline def setTreeLoadedKeysVarargs(value: typings.react.mod.Key*): Self = StObject.set(x, "treeLoadedKeys", js.Array(value*))
      
      inline def setTreeMotion(value: Any): Self = StObject.set(x, "treeMotion", value.asInstanceOf[js.Any])
      
      inline def setTreeMotionUndefined: Self = StObject.set(x, "treeMotion", js.undefined)
      
      inline def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
      
      inline def setTreeNodeFilterPropUndefined: Self = StObject.set(x, "treeNodeFilterProp", js.undefined)
      
      inline def setTreeNodeLabelProp(value: String): Self = StObject.set(x, "treeNodeLabelProp", value.asInstanceOf[js.Any])
      
      inline def setTreeNodeLabelPropUndefined: Self = StObject.set(x, "treeNodeLabelProp", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
