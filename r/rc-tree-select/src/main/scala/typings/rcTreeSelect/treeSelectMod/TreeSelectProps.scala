package typings.rcTreeSelect.treeSelectMod

import typings.rcTreeSelect.interfaceMod.ChangeEventExtra
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.LabelValueType
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import typings.rcTreeSelect.interfaceMod.SimpleModeConfig
import typings.rcTreeSelect.strategyUtilMod.CheckedStrategy
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SelectProps<Array<DataNode>, ValueType> * / any, 'onChange' | 'mode' | 'menuItemSelectedIcon' | 'dropdownRender' | 'dropdownAlign' | 'backfill' | 'getInputElement' | 'optionLabelProp' | 'tokenSeparators' | 'filterOption'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SelectProps<Array<DataNode>, ValueType> * / any[P]} */ trait TreeSelectProps[ValueType] extends js.Object {
  var autoClearSearchValue: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[ValueType] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownPopupAlign: js.UndefOr[js.Any] = js.undefined
  var filterTreeNode: js.UndefOr[
    Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any)
  ] = js.undefined
  /** @deprecated Use `searchValue` instead */
  var inputValue: js.UndefOr[String] = js.undefined
  var loadData: js.UndefOr[js.Function1[/* dataNode */ LegacyDataNode, js.Promise[_]]] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode]] = js.undefined
  var maxTagTextLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ ValueType, 
      /* labelList */ js.Array[ReactNode], 
      /* extra */ ChangeEventExtra, 
      Unit
    ]
  ] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onTreeExpand: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
  var onTreeLoad: js.UndefOr[js.Function1[/* loadedKeys */ js.Array[Key], Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[ReactNode] = js.undefined
  /** `searchPlaceholder` has been removed since search box has been merged into input box */
  var searchPlaceholder: js.UndefOr[ReactNode] = js.undefined
  var searchValue: js.UndefOr[String] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var showCheckedStrategy: js.UndefOr[CheckedStrategy] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showTreeIcon: js.UndefOr[Boolean] = js.undefined
  var switcherIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  ] = js.undefined
  var treeCheckStrictly: js.UndefOr[Boolean] = js.undefined
  var treeCheckable: js.UndefOr[Boolean | ReactNode] = js.undefined
  var treeData: js.UndefOr[js.Array[DataNode]] = js.undefined
  var treeDataSimpleMode: js.UndefOr[Boolean | SimpleModeConfig] = js.undefined
  var treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined
  var treeDefaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var treeExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var treeIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  ] = js.undefined
  var treeLine: js.UndefOr[Boolean] = js.undefined
  var treeLoadedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var treeMotion: js.UndefOr[js.Any] = js.undefined
  var treeNodeFilterProp: js.UndefOr[String] = js.undefined
  var treeNodeLabelProp: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[ValueType] = js.undefined
}

object TreeSelectProps {
  @scala.inline
  def apply[ValueType](
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: ValueType = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownPopupAlign: js.Any = null,
    filterTreeNode: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any) = null,
    inputValue: String = null,
    loadData: /* dataNode */ LegacyDataNode => js.Promise[_] = null,
    maxTagCount: js.UndefOr[Double] = js.undefined,
    maxTagPlaceholder: /* omittedValues */ js.Array[LabelValueType] => ReactNode = null,
    maxTagTextLength: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* value */ ValueType, /* labelList */ js.Array[ReactNode], /* extra */ ChangeEventExtra) => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onTreeExpand: /* expandedKeys */ js.Array[Key] => Unit = null,
    onTreeLoad: /* loadedKeys */ js.Array[Key] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: ReactNode = null,
    searchPlaceholder: ReactNode = null,
    searchValue: String = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showCheckedStrategy: CheckedStrategy = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showTreeIcon: js.UndefOr[Boolean] = js.undefined,
    switcherIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any = null,
    treeCheckStrictly: js.UndefOr[Boolean] = js.undefined,
    treeCheckable: Boolean | ReactNode = null,
    treeData: js.Array[DataNode] = null,
    treeDataSimpleMode: Boolean | SimpleModeConfig = null,
    treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    treeDefaultExpandedKeys: js.Array[Key] = null,
    treeExpandedKeys: js.Array[Key] = null,
    treeIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any = null,
    treeLine: js.UndefOr[Boolean] = js.undefined,
    treeLoadedKeys: js.Array[Key] = null,
    treeMotion: js.Any = null,
    treeNodeFilterProp: String = null,
    treeNodeLabelProp: String = null,
    value: ValueType = null
  ): TreeSelectProps[ValueType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dropdownPopupAlign != null) __obj.updateDynamic("dropdownPopupAlign")(dropdownPopupAlign.asInstanceOf[js.Any])
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(filterTreeNode.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (!js.isUndefined(maxTagCount)) __obj.updateDynamic("maxTagCount")(maxTagCount.get.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(js.Any.fromFunction1(maxTagPlaceholder))
    if (!js.isUndefined(maxTagTextLength)) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onTreeExpand != null) __obj.updateDynamic("onTreeExpand")(js.Any.fromFunction1(onTreeExpand))
    if (onTreeLoad != null) __obj.updateDynamic("onTreeLoad")(js.Any.fromFunction1(onTreeLoad))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.get.asInstanceOf[js.Any])
    if (showCheckedStrategy != null) __obj.updateDynamic("showCheckedStrategy")(showCheckedStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTreeIcon)) __obj.updateDynamic("showTreeIcon")(showTreeIcon.get.asInstanceOf[js.Any])
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(treeCheckStrictly)) __obj.updateDynamic("treeCheckStrictly")(treeCheckStrictly.get.asInstanceOf[js.Any])
    if (treeCheckable != null) __obj.updateDynamic("treeCheckable")(treeCheckable.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData.asInstanceOf[js.Any])
    if (treeDataSimpleMode != null) __obj.updateDynamic("treeDataSimpleMode")(treeDataSimpleMode.asInstanceOf[js.Any])
    if (!js.isUndefined(treeDefaultExpandAll)) __obj.updateDynamic("treeDefaultExpandAll")(treeDefaultExpandAll.get.asInstanceOf[js.Any])
    if (treeDefaultExpandedKeys != null) __obj.updateDynamic("treeDefaultExpandedKeys")(treeDefaultExpandedKeys.asInstanceOf[js.Any])
    if (treeExpandedKeys != null) __obj.updateDynamic("treeExpandedKeys")(treeExpandedKeys.asInstanceOf[js.Any])
    if (treeIcon != null) __obj.updateDynamic("treeIcon")(treeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(treeLine)) __obj.updateDynamic("treeLine")(treeLine.get.asInstanceOf[js.Any])
    if (treeLoadedKeys != null) __obj.updateDynamic("treeLoadedKeys")(treeLoadedKeys.asInstanceOf[js.Any])
    if (treeMotion != null) __obj.updateDynamic("treeMotion")(treeMotion.asInstanceOf[js.Any])
    if (treeNodeFilterProp != null) __obj.updateDynamic("treeNodeFilterProp")(treeNodeFilterProp.asInstanceOf[js.Any])
    if (treeNodeLabelProp != null) __obj.updateDynamic("treeNodeLabelProp")(treeNodeLabelProp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeSelectProps[ValueType]]
  }
}

