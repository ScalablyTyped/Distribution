package typings.reactTagsinput

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactTagsinput.anon.Value
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tagsinput", JSImport.Namespace)
  @js.native
  class ^[Tag] () extends TagsInput[Tag]
  
  type InputProps = StringDictionary[js.Any]
  
  @js.native
  trait ReactTagsInputProps[Tag] extends Props[TagsInput[Tag]] {
    
    var addKeys: js.UndefOr[js.Array[Double | String]] = js.native
    
    var addOnBlur: js.UndefOr[Boolean] = js.native
    
    var addOnPaste: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var currentValue: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var focusedClassName: js.UndefOr[String] = js.native
    
    var inputProps: js.UndefOr[InputProps] = js.native
    
    var inputValue: js.UndefOr[String] = js.native
    
    var maxTags: js.UndefOr[Double] = js.native
    
    def onChange(tags: js.Array[Tag], changed: js.Array[Tag], changedIndexes: js.Array[Double]): Unit = js.native
    
    var onChangeInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onValidationReject: js.UndefOr[js.Function1[/* tags */ js.Array[String], Unit]] = js.native
    
    var onlyUnique: js.UndefOr[Boolean] = js.native
    
    var pasteSplit: js.UndefOr[js.Function1[/* data */ String, js.Array[String]]] = js.native
    
    var preventSubmit: js.UndefOr[Boolean] = js.native
    
    var removeKeys: js.UndefOr[js.Array[Double]] = js.native
    
    var renderInput: js.UndefOr[js.Function1[/* props */ RenderInputProps[Tag], ReactNode]] = js.native
    
    var renderLayout: js.UndefOr[RenderLayout] = js.native
    
    var renderTag: js.UndefOr[js.Function1[/* props */ RenderTagProps[Tag], ReactNode]] = js.native
    
    var tagDisplayProp: js.UndefOr[(/* keyof Tag */ String) | Null] = js.native
    
    var tagProps: js.UndefOr[TagProps] = js.native
    
    var validationRegex: js.UndefOr[RegExp] = js.native
    
    var value: js.Array[Tag] = js.native
  }
  object ReactTagsInputProps {
    
    @scala.inline
    def apply[Tag](onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit, value: js.Array[Tag]): ReactTagsInputProps[Tag] = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction3(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTagsInputProps[Tag]]
    }
    
    @scala.inline
    implicit class ReactTagsInputPropsMutableBuilder[Self <: ReactTagsInputProps[_], Tag] (val x: Self with ReactTagsInputProps[Tag]) extends AnyVal {
      
      @scala.inline
      def setAddKeys(value: js.Array[Double | String]): Self = StObject.set(x, "addKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddKeysUndefined: Self = StObject.set(x, "addKeys", js.undefined)
      
      @scala.inline
      def setAddKeysVarargs(value: (Double | String)*): Self = StObject.set(x, "addKeys", js.Array(value :_*))
      
      @scala.inline
      def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
      
      @scala.inline
      def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrentValue(value: String): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentValueUndefined: Self = StObject.set(x, "currentValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFocusedClassName(value: String): Self = StObject.set(x, "focusedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedClassNameUndefined: Self = StObject.set(x, "focusedClassName", js.undefined)
      
      @scala.inline
      def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setMaxTags(value: Double): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagsUndefined: Self = StObject.set(x, "maxTags", js.undefined)
      
      @scala.inline
      def setOnChange(value: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeInput(value: /* value */ String => Unit): Self = StObject.set(x, "onChangeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeInputUndefined: Self = StObject.set(x, "onChangeInput", js.undefined)
      
      @scala.inline
      def setOnValidationReject(value: /* tags */ js.Array[String] => Unit): Self = StObject.set(x, "onValidationReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValidationRejectUndefined: Self = StObject.set(x, "onValidationReject", js.undefined)
      
      @scala.inline
      def setOnlyUnique(value: Boolean): Self = StObject.set(x, "onlyUnique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUniqueUndefined: Self = StObject.set(x, "onlyUnique", js.undefined)
      
      @scala.inline
      def setPasteSplit(value: /* data */ String => js.Array[String]): Self = StObject.set(x, "pasteSplit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPasteSplitUndefined: Self = StObject.set(x, "pasteSplit", js.undefined)
      
      @scala.inline
      def setPreventSubmit(value: Boolean): Self = StObject.set(x, "preventSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventSubmitUndefined: Self = StObject.set(x, "preventSubmit", js.undefined)
      
      @scala.inline
      def setRemoveKeys(value: js.Array[Double]): Self = StObject.set(x, "removeKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveKeysUndefined: Self = StObject.set(x, "removeKeys", js.undefined)
      
      @scala.inline
      def setRemoveKeysVarargs(value: Double*): Self = StObject.set(x, "removeKeys", js.Array(value :_*))
      
      @scala.inline
      def setRenderInput(value: /* props */ RenderInputProps[Tag] => ReactNode): Self = StObject.set(x, "renderInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderInputUndefined: Self = StObject.set(x, "renderInput", js.undefined)
      
      @scala.inline
      def setRenderLayout(value: (/* tagElements */ js.Array[ReactElement], /* inputElement */ ReactElement) => ReactChild): Self = StObject.set(x, "renderLayout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderLayoutUndefined: Self = StObject.set(x, "renderLayout", js.undefined)
      
      @scala.inline
      def setRenderTag(value: /* props */ RenderTagProps[Tag] => ReactNode): Self = StObject.set(x, "renderTag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTagUndefined: Self = StObject.set(x, "renderTag", js.undefined)
      
      @scala.inline
      def setTagDisplayProp(value: /* keyof Tag */ String): Self = StObject.set(x, "tagDisplayProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagDisplayPropNull: Self = StObject.set(x, "tagDisplayProp", null)
      
      @scala.inline
      def setTagDisplayPropUndefined: Self = StObject.set(x, "tagDisplayProp", js.undefined)
      
      @scala.inline
      def setTagProps(value: TagProps): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
      
      @scala.inline
      def setValidationRegex(value: RegExp): Self = StObject.set(x, "validationRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRegexUndefined: Self = StObject.set(x, "validationRegex", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[Tag]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Tag*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RenderInputProps[Tag] extends InputProps {
    
    def addTag(tag: Tag): Unit = js.native
    
    def onChange(e: ChangeEvent[Value]): Unit = js.native
    
    def ref(r: js.Any): Unit = js.native
    
    // parameter is either a DOM element or a mounted React component
    val value: Tag = js.native
  }
  object RenderInputProps {
    
    @scala.inline
    def apply[Tag](addTag: Tag => Unit, onChange: ChangeEvent[Value] => Unit, ref: js.Any => Unit, value: Tag): RenderInputProps[Tag] = {
      val __obj = js.Dynamic.literal(addTag = js.Any.fromFunction1(addTag), onChange = js.Any.fromFunction1(onChange), ref = js.Any.fromFunction1(ref), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderInputProps[Tag]]
    }
    
    @scala.inline
    implicit class RenderInputPropsMutableBuilder[Self <: RenderInputProps[_], Tag] (val x: Self with RenderInputProps[Tag]) extends AnyVal {
      
      @scala.inline
      def setAddTag(value: Tag => Unit): Self = StObject.set(x, "addTag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChange(value: ChangeEvent[Value] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: js.Any => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: Tag): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderLayout = js.Function2[
    /* tagElements */ js.Array[ReactElement], 
    /* inputElement */ ReactElement, 
    ReactChild
  ]
  
  @js.native
  trait RenderTagProps[Tag] extends TagProps {
    
    val disabled: Boolean = js.native
    
    def getTagDisplayValue(tag: Tag): String = js.native
    
    def onRemove(tagIndex: Double): Unit = js.native
    
    val tag: Tag = js.native
  }
  object RenderTagProps {
    
    @scala.inline
    def apply[Tag](disabled: Boolean, getTagDisplayValue: Tag => String, onRemove: Double => Unit, tag: Tag): RenderTagProps[Tag] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], getTagDisplayValue = js.Any.fromFunction1(getTagDisplayValue), onRemove = js.Any.fromFunction1(onRemove), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderTagProps[Tag]]
    }
    
    @scala.inline
    implicit class RenderTagPropsMutableBuilder[Self <: RenderTagProps[_], Tag] (val x: Self with RenderTagProps[Tag]) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTagDisplayValue(value: Tag => String): Self = StObject.set(x, "getTagDisplayValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemove(value: Double => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  type TagProps = StringDictionary[js.Any]
  
  @js.native
  trait TagsInput[Tag]
    extends Component[ReactTagsInputProps[Tag], js.Object, js.Any] {
    
    def accept(): js.Any = js.native
    
    def addTag(tag: Tag): js.Any = js.native
    
    def blur(): Unit = js.native
    
    def clearInput(): Unit = js.native
    
    def focus(): Unit = js.native
  }
}
