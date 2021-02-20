package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.anon.Selected
import typings.rcSelect.generatorMod.CustomTagProps
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.interfaceMod.Mode
import typings.rcSelect.interfaceMod.RenderNode
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SelectorProps with RefAttributes[RefSelectorProps]] = js.native
  
  @js.native
  trait InnerSelectorProps extends StObject {
    
    var accessibilityIndex: Double = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var inputRef: Ref[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var mode: Mode = js.native
    
    var onInputChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var onInputPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    var open: Boolean = js.native
    
    var placeholder: js.UndefOr[ReactNode] = js.native
    
    var prefixCls: String = js.native
    
    var searchValue: String = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var values: js.Array[LabelValueType] = js.native
  }
  object InnerSelectorProps {
    
    @scala.inline
    def apply(
      accessibilityIndex: Double,
      id: String,
      mode: Mode,
      onInputChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionEnd: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionStart: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputKeyDown: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputMouseDown: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit,
      onInputPaste: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      open: Boolean,
      prefixCls: String,
      searchValue: String,
      values: js.Array[LabelValueType]
    ): InnerSelectorProps = {
      val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerSelectorProps]
    }
    
    @scala.inline
    implicit class InnerSelectorPropsMutableBuilder[Self <: InnerSelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityIndex(value: Double): Self = StObject.set(x, "accessibilityIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ (HTMLInputElement | HTMLTextAreaElement) | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInputChange(value: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputCompositionEnd(value: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputCompositionStart(value: CompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputKeyDown(value: KeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputMouseDown(value: MouseEvent[HTMLInputElement | HTMLTextAreaElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onInputMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputPaste(value: ClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onInputPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[LabelValueType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: LabelValueType*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RefSelectorProps extends StObject {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
  }
  object RefSelectorProps {
    
    @scala.inline
    def apply(blur: () => Unit, focus: () => Unit): RefSelectorProps = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[RefSelectorProps]
    }
    
    @scala.inline
    implicit class RefSelectorPropsMutableBuilder[Self <: RefSelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SelectorProps extends StObject {
    
    var accessibilityIndex: Double = js.native
    
    var activeValue: String = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * @private get real dom for trigger align.
      * This may be removed after React provides replacement of `findDOMNode`
      */
    var domRef: Ref[HTMLDivElement] = js.native
    
    var id: String = js.native
    
    var inputElement: Element = js.native
    
    var maxTagCount: js.UndefOr[Double] = js.native
    
    var maxTagPlaceholder: js.UndefOr[
        ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])
      ] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    var mode: Mode = js.native
    
    var multiple: Boolean = js.native
    
    var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.native
    
    /** `onSearch` returns go next step boolean to check if need do toggle open */
    def onSearch(searchText: String, fromTyping: Boolean, isCompositing: Boolean): Boolean = js.native
    
    def onSearchSubmit(searchText: String): Unit = js.native
    
    def onSelect(value: RawValueType, option: Selected): Unit = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var placeholder: js.UndefOr[ReactNode] = js.native
    
    var prefixCls: String = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var searchValue: String = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
    
    /** Check if `tokenSeparators` contains `\n` or `\r\n` */
    var tokenWithEnter: js.UndefOr[Boolean] = js.native
    
    /** Display in the Selector value, it's not same as `value` prop */
    var values: js.Array[LabelValueType] = js.native
  }
  
  type _To = ForwardRefExoticComponent[SelectorProps with RefAttributes[RefSelectorProps]]
  
  /* This means you don't have to write `default`, but can instead just say `selectorMod.foo` */
  override def _to: ForwardRefExoticComponent[SelectorProps with RefAttributes[RefSelectorProps]] = default
}
