package typings.rcTreeSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait ChangeEventExtra extends StObject {
    
    /** @deprecated This prop not work as react node anymore. */
    var allCheckedNodes: js.Array[LegacyCheckedNode] = js.native
    
    /** @deprecated Use `onSelect` or `onDeselect` instead. */
    var checked: js.UndefOr[Boolean] = js.native
    
    /** @deprecated Please save prev value by control logic instead */
    var preValue: js.Array[LabelValueType] = js.native
    
    /** @deprecated Use `onSelect` or `onDeselect` instead. */
    var selected: js.UndefOr[Boolean] = js.native
    
    /** @deprecated This prop not work as react node anymore. */
    var triggerNode: ReactElement = js.native
    
    var triggerValue: RawValueType = js.native
  }
  object ChangeEventExtra {
    
    @scala.inline
    def apply(
      allCheckedNodes: js.Array[LegacyCheckedNode],
      preValue: js.Array[LabelValueType],
      triggerNode: ReactElement,
      triggerValue: RawValueType
    ): ChangeEventExtra = {
      val __obj = js.Dynamic.literal(allCheckedNodes = allCheckedNodes.asInstanceOf[js.Any], preValue = preValue.asInstanceOf[js.Any], triggerNode = triggerNode.asInstanceOf[js.Any], triggerValue = triggerValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEventExtra]
    }
    
    @scala.inline
    implicit class ChangeEventExtraMutableBuilder[Self <: ChangeEventExtra] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllCheckedNodes(value: js.Array[LegacyCheckedNode]): Self = StObject.set(x, "allCheckedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllCheckedNodesVarargs(value: LegacyCheckedNode*): Self = StObject.set(x, "allCheckedNodes", js.Array(value :_*))
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setPreValue(value: js.Array[LabelValueType]): Self = StObject.set(x, "preValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreValueVarargs(value: LabelValueType*): Self = StObject.set(x, "preValue", js.Array(value :_*))
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTriggerNode(value: ReactElement): Self = StObject.set(x, "triggerNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerValue(value: RawValueType): Self = StObject.set(x, "triggerValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataNode
    extends /** Customize data info */
  /* prop */ StringDictionary[js.Any] {
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[js.Array[DataNode]] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactNode] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var value: js.UndefOr[RawValueType] = js.native
  }
  object DataNode {
    
    @scala.inline
    def apply(): DataNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataNode]
    }
    
    @scala.inline
    implicit class DataNodeMutableBuilder[Self <: DataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[DataNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: DataNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type DefaultValueType = RawValueType | (js.Array[LabelValueType | RawValueType]) | LabelValueType
  
  @js.native
  trait FlattenDataNode extends StObject {
    
    var data: DataNode = js.native
    
    var key: Key = js.native
    
    var level: Double = js.native
  }
  object FlattenDataNode {
    
    @scala.inline
    def apply(data: DataNode, key: Key, level: Double): FlattenDataNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenDataNode]
    }
    
    @scala.inline
    implicit class FlattenDataNodeMutableBuilder[Self <: FlattenDataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: DataNode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InnerDataNode extends DataNode {
    
    @JSName("children")
    var children_InnerDataNode: js.UndefOr[js.Array[InnerDataNode]] = js.native
    
    @JSName("key")
    var key_InnerDataNode: Key = js.native
    
    @JSName("value")
    var value_InnerDataNode: RawValueType = js.native
  }
  object InnerDataNode {
    
    @scala.inline
    def apply(key: Key, value: RawValueType): InnerDataNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerDataNode]
    }
    
    @scala.inline
    implicit class InnerDataNodeMutableBuilder[Self <: InnerDataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[InnerDataNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: InnerDataNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Key = String | Double
  
  @js.native
  trait LabelValueType extends StObject {
    
    /** Only works on `treeCheckStrictly` */
    var halfChecked: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactNode] = js.native
    
    var value: js.UndefOr[RawValueType] = js.native
  }
  object LabelValueType {
    
    @scala.inline
    def apply(): LabelValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelValueType]
    }
    
    @scala.inline
    implicit class LabelValueTypeMutableBuilder[Self <: LabelValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedUndefined: Self = StObject.set(x, "halfChecked", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait LegacyCheckedNode extends StObject {
    
    var children: js.UndefOr[js.Array[LegacyCheckedNode]] = js.native
    
    var node: ReactElement = js.native
    
    var pos: String = js.native
  }
  object LegacyCheckedNode {
    
    @scala.inline
    def apply(node: ReactElement, pos: String): LegacyCheckedNode = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyCheckedNode]
    }
    
    @scala.inline
    implicit class LegacyCheckedNodeMutableBuilder[Self <: LegacyCheckedNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[LegacyCheckedNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: LegacyCheckedNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setNode(value: ReactElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LegacyDataNode extends DataNode {
    
    var props: js.Any = js.native
  }
  object LegacyDataNode {
    
    @scala.inline
    def apply(props: js.Any): LegacyDataNode = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyDataNode]
    }
    
    @scala.inline
    implicit class LegacyDataNodeMutableBuilder[Self <: LegacyDataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type RawValueType = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcTreeSelect.rcTreeSelectStrings.option
    - typings.rcTreeSelect.rcTreeSelectStrings.selection
    - typings.rcTreeSelect.rcTreeSelectStrings.input
    - typings.rcTreeSelect.rcTreeSelectStrings.clear
  */
  trait SelectSource extends StObject
  object SelectSource {
    
    @scala.inline
    def clear: typings.rcTreeSelect.rcTreeSelectStrings.clear = "clear".asInstanceOf[typings.rcTreeSelect.rcTreeSelectStrings.clear]
    
    @scala.inline
    def input: typings.rcTreeSelect.rcTreeSelectStrings.input = "input".asInstanceOf[typings.rcTreeSelect.rcTreeSelectStrings.input]
    
    @scala.inline
    def option: typings.rcTreeSelect.rcTreeSelectStrings.option = "option".asInstanceOf[typings.rcTreeSelect.rcTreeSelectStrings.option]
    
    @scala.inline
    def selection: typings.rcTreeSelect.rcTreeSelectStrings.selection = "selection".asInstanceOf[typings.rcTreeSelect.rcTreeSelectStrings.selection]
  }
  
  @js.native
  trait SimpleModeConfig extends StObject {
    
    var id: js.UndefOr[Key] = js.native
    
    var pId: js.UndefOr[Key] = js.native
    
    var rootPId: js.UndefOr[Key] = js.native
  }
  object SimpleModeConfig {
    
    @scala.inline
    def apply(): SimpleModeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleModeConfig]
    }
    
    @scala.inline
    implicit class SimpleModeConfigMutableBuilder[Self <: SimpleModeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Key): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPId(value: Key): Self = StObject.set(x, "pId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPIdUndefined: Self = StObject.set(x, "pId", js.undefined)
      
      @scala.inline
      def setRootPId(value: Key): Self = StObject.set(x, "rootPId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPIdUndefined: Self = StObject.set(x, "rootPId", js.undefined)
    }
  }
  
  @js.native
  trait TreeDataNode extends DataNode {
    
    @JSName("children")
    var children_TreeDataNode: js.UndefOr[js.Array[TreeDataNode]] = js.native
    
    @JSName("key")
    var key_TreeDataNode: Key = js.native
  }
  object TreeDataNode {
    
    @scala.inline
    def apply(key: Key): TreeDataNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDataNode]
    }
    
    @scala.inline
    implicit class TreeDataNodeMutableBuilder[Self <: TreeDataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[TreeDataNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: TreeDataNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
