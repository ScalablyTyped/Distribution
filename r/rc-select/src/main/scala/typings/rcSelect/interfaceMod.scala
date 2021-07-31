package typings.rcSelect

import org.scalablytyped.runtime.StringDictionary
import typings.rcSelect.anon.Source
import typings.rcSelect.generatorMod.Key
import typings.rcSelect.generatorMod.RawValueType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait FlattenOptionData extends StObject {
    
    var data: OptionData | OptionGroupData
    
    var group: js.UndefOr[Boolean] = js.undefined
    
    var groupOption: js.UndefOr[Boolean] = js.undefined
    
    var key: String | Double
  }
  object FlattenOptionData {
    
    @scala.inline
    def apply(data: OptionData | OptionGroupData, key: String | Double): FlattenOptionData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenOptionData]
    }
    
    @scala.inline
    implicit class FlattenOptionDataMutableBuilder[Self <: FlattenOptionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: OptionData | OptionGroupData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOption(value: Boolean): Self = StObject.set(x, "groupOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOptionUndefined: Self = StObject.set(x, "groupOption", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcSelect.rcSelectStrings.multiple
    - typings.rcSelect.rcSelectStrings.tags
    - typings.rcSelect.rcSelectStrings.combobox
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def combobox: typings.rcSelect.rcSelectStrings.combobox = "combobox".asInstanceOf[typings.rcSelect.rcSelectStrings.combobox]
    
    @scala.inline
    def multiple: typings.rcSelect.rcSelectStrings.multiple = "multiple".asInstanceOf[typings.rcSelect.rcSelectStrings.multiple]
    
    @scala.inline
    def tags: typings.rcSelect.rcSelectStrings.tags = "tags".asInstanceOf[typings.rcSelect.rcSelectStrings.tags]
  }
  
  type OnActiveValue = js.Function3[/* active */ RawValueType, /* index */ Double, /* info */ js.UndefOr[Source], Unit]
  
  trait OptionCoreData extends StObject {
    
    /** @deprecated Only works when use `children` as option data */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var value: Key
  }
  object OptionCoreData {
    
    @scala.inline
    def apply(value: Key): OptionCoreData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionCoreData]
    }
    
    @scala.inline
    implicit class OptionCoreDataMutableBuilder[Self <: OptionCoreData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
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
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: Key): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionData
    extends StObject
       with OptionCoreData
       with /** Save for customize data */
  /* prop */ StringDictionary[js.Any]
  object OptionData {
    
    @scala.inline
    def apply(value: Key): OptionData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionData]
    }
  }
  
  trait OptionGroupData
    extends StObject
       with /** Save for customize data */
  /* prop */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var options: js.Array[OptionData]
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object OptionGroupData {
    
    @scala.inline
    def apply(options: js.Array[OptionData]): OptionGroupData = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionGroupData]
    }
    
    @scala.inline
    implicit class OptionGroupDataMutableBuilder[Self <: OptionGroupData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[OptionData]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: OptionData*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type OptionsType = js.Array[OptionData | OptionGroupData]
  
  type RenderDOMFunc = js.Function1[/* props */ js.Any, HTMLElement]
  
  type RenderNode = ReactNode | (js.Function1[/* props */ js.Any, ReactNode])
}
