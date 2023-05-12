package typings.reactRte

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
import typings.draftJs.mod.EditorState
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactRte.reactRteStrings.STYLE
import typings.std.Element
import typings.std.HTMLBodyElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-rte", JSImport.Default)
  @js.native
  open class default () extends Component[Props, Any, Any]
  object default {
    
    @JSImport("react-rte", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createEmptyValue(): EditorValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyValue")().asInstanceOf[EditorValue]
    
    /* static member */
    inline def createValueFromString(markup: String, format: String): EditorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createValueFromString")(markup.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[EditorValue]
    inline def createValueFromString(markup: String, format: String, options: ImportOptions): EditorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createValueFromString")(markup.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorValue]
  }
  
  @JSImport("react-rte", "EditorValue")
  @js.native
  open class EditorValue protected () extends StObject {
    def this(editorState: EditorState, cache: StringMap) = this()
    
    def getEditorState(): EditorState = js.native
    
    def setContentFromString(markup: String, format: String): EditorValue = js.native
    def setContentFromString(markup: String, format: String, options: ImportOptions): EditorValue = js.native
    
    def setEditorState(editorState: EditorState): EditorValue = js.native
    
    def toString(format: String): String = js.native
    def toString(format: String, options: ExportOptions): String = js.native
  }
  /* static members */
  object EditorValue {
    
    @JSImport("react-rte", "EditorValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEmpty(): EditorValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[EditorValue]
    inline def createEmpty(decorator: Any): EditorValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")(decorator.asInstanceOf[js.Any]).asInstanceOf[EditorValue]
    
    inline def createFromState(editorState: EditorState): EditorValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromState")(editorState.asInstanceOf[js.Any]).asInstanceOf[EditorValue]
    
    inline def createFromString(markup: String, format: String): EditorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromString")(markup.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[EditorValue]
    inline def createFromString(markup: String, format: String, decorator: Any): EditorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromString")(markup.asInstanceOf[js.Any], format.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any])).asInstanceOf[EditorValue]
    inline def createFromString(markup: String, format: String, decorator: Any, options: ImportOptions): EditorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromString")(markup.asInstanceOf[js.Any], format.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorValue]
    inline def createFromString(markup: String, format: String, decorator: Unit, options: ImportOptions): EditorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromString")(markup.asInstanceOf[js.Any], format.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorValue]
  }
  
  type BlockRenderer = js.Function1[/* block */ ContentBlock, String]
  
  type BlockStyleFn = js.Function1[/* block */ ContentBlock, RenderConfig]
  
  type ChangeHandler = js.Function1[/* value */ EditorValue, Any]
  
  type CustControlFunc = js.Function3[
    /* set */ SetControlState, 
    /* get */ GetControlState, 
    /* state */ EditorState, 
    ReactNode
  ]
  
  type CustomBlockFn = js.Function1[/* element */ Element, js.UndefOr[Null | CustomBlockObject]]
  
  trait CustomBlockObject extends StObject {
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CustomBlockObject {
    
    inline def apply(): CustomBlockObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomBlockObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomBlockObject] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type CustomControl = ReactNode | CustControlFunc
  
  type CustomInlineFn = js.Function2[
    /* element */ Element, 
    /* inlineCreators */ InlineCreators, 
    js.UndefOr[
      Null | Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ Any)
    ]
  ]
  
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ Any, 
    RenderConfig
  ]
  
  trait ExportOptions extends StObject {
    
    var blockRenderers: js.UndefOr[StringDictionary[BlockRenderer]] = js.undefined
    
    var blockStyleFn: js.UndefOr[BlockStyleFn] = js.undefined
    
    var entityStyleFn: js.UndefOr[EntityStyleFn] = js.undefined
    
    var inlineStyles: js.UndefOr[StringDictionary[RenderConfig]] = js.undefined
  }
  object ExportOptions {
    
    inline def apply(): ExportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockRenderers(value: StringDictionary[BlockRenderer]): Self = StObject.set(x, "blockRenderers", value.asInstanceOf[js.Any])
      
      inline def setBlockRenderersUndefined: Self = StObject.set(x, "blockRenderers", js.undefined)
      
      inline def setBlockStyleFn(value: /* block */ ContentBlock => RenderConfig): Self = StObject.set(x, "blockStyleFn", js.Any.fromFunction1(value))
      
      inline def setBlockStyleFnUndefined: Self = StObject.set(x, "blockStyleFn", js.undefined)
      
      inline def setEntityStyleFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ Any => RenderConfig
      ): Self = StObject.set(x, "entityStyleFn", js.Any.fromFunction1(value))
      
      inline def setEntityStyleFnUndefined: Self = StObject.set(x, "entityStyleFn", js.undefined)
      
      inline def setInlineStyles(value: StringDictionary[RenderConfig]): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
      
      inline def setInlineStylesUndefined: Self = StObject.set(x, "inlineStyles", js.undefined)
    }
  }
  
  type GetControlState = js.Function1[/* key */ String, js.UndefOr[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRte.reactRteStrings.INLINE_STYLE_BUTTONS
    - typings.reactRte.reactRteStrings.BLOCK_TYPE_BUTTONS
    - typings.reactRte.reactRteStrings.BLOCK_ALIGNMENT_BUTTONS
    - typings.reactRte.reactRteStrings.LINK_BUTTONS
    - typings.reactRte.reactRteStrings.BLOCK_TYPE_DROPDOWN
    - typings.reactRte.reactRteStrings.HISTORY_BUTTONS
    - typings.reactRte.reactRteStrings.IMAGE_BUTTON
  */
  trait GroupName extends StObject
  object GroupName {
    
    inline def BLOCK_ALIGNMENT_BUTTONS: typings.reactRte.reactRteStrings.BLOCK_ALIGNMENT_BUTTONS = "BLOCK_ALIGNMENT_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.BLOCK_ALIGNMENT_BUTTONS]
    
    inline def BLOCK_TYPE_BUTTONS: typings.reactRte.reactRteStrings.BLOCK_TYPE_BUTTONS = "BLOCK_TYPE_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.BLOCK_TYPE_BUTTONS]
    
    inline def BLOCK_TYPE_DROPDOWN: typings.reactRte.reactRteStrings.BLOCK_TYPE_DROPDOWN = "BLOCK_TYPE_DROPDOWN".asInstanceOf[typings.reactRte.reactRteStrings.BLOCK_TYPE_DROPDOWN]
    
    inline def HISTORY_BUTTONS: typings.reactRte.reactRteStrings.HISTORY_BUTTONS = "HISTORY_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.HISTORY_BUTTONS]
    
    inline def IMAGE_BUTTON: typings.reactRte.reactRteStrings.IMAGE_BUTTON = "IMAGE_BUTTON".asInstanceOf[typings.reactRte.reactRteStrings.IMAGE_BUTTON]
    
    inline def INLINE_STYLE_BUTTONS: typings.reactRte.reactRteStrings.INLINE_STYLE_BUTTONS = "INLINE_STYLE_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.INLINE_STYLE_BUTTONS]
    
    inline def LINK_BUTTONS: typings.reactRte.reactRteStrings.LINK_BUTTONS = "LINK_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.LINK_BUTTONS]
  }
  
  trait ImportOptions extends StObject {
    
    var customBlockFn: js.UndefOr[CustomBlockFn] = js.undefined
    
    var customInlineFn: js.UndefOr[CustomInlineFn] = js.undefined
    
    var elementStyles: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var parser: js.UndefOr[js.Function1[/* html */ String, HTMLBodyElement]] = js.undefined
  }
  object ImportOptions {
    
    inline def apply(): ImportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomBlockFn(value: /* element */ Element => js.UndefOr[Null | CustomBlockObject]): Self = StObject.set(x, "customBlockFn", js.Any.fromFunction1(value))
      
      inline def setCustomBlockFnUndefined: Self = StObject.set(x, "customBlockFn", js.undefined)
      
      inline def setCustomInlineFn(
        value: (/* element */ Element, /* inlineCreators */ InlineCreators) => js.UndefOr[
              Null | Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ Any)
            ]
      ): Self = StObject.set(x, "customInlineFn", js.Any.fromFunction2(value))
      
      inline def setCustomInlineFnUndefined: Self = StObject.set(x, "customInlineFn", js.undefined)
      
      inline def setElementStyles(value: StringDictionary[String]): Self = StObject.set(x, "elementStyles", value.asInstanceOf[js.Any])
      
      inline def setElementStylesUndefined: Self = StObject.set(x, "elementStyles", js.undefined)
      
      inline def setParser(value: /* html */ String => HTMLBodyElement): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
  
  @js.native
  trait InlineCreators extends StObject {
    
    def Entity(`type`: String): Any = js.native
    def Entity(`type`: String, data: js.Object): Any = js.native
    
    def Style(style: String): typings.reactRte.mod.Style = js.native
  }
  
  trait Props extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var blockStyleFn: js.UndefOr[js.Function1[/* block */ ContentBlock, js.UndefOr[String]]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var customControls: js.UndefOr[js.Array[CustomControl]] = js.undefined
    
    var customStyleMap: js.UndefOr[StringDictionary[StringDictionary[Any]]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var editorClassName: js.UndefOr[String] = js.undefined
    
    var editorStyle: js.UndefOr[js.Object] = js.undefined
    
    var handleReturn: js.UndefOr[js.Function1[/* event */ js.Object, Boolean]] = js.undefined
    
    var keyBindingFn: js.UndefOr[js.Function1[/* event */ js.Object, js.UndefOr[String]]] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ js.Object, Unit]] = js.undefined
    
    var onChange: js.UndefOr[ChangeHandler] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rootStyle: js.UndefOr[js.Object] = js.undefined
    
    var toolbarClassName: js.UndefOr[String] = js.undefined
    
    // Alias of readOnly
    var toolbarConfig: js.UndefOr[ToolbarConfig] = js.undefined
    
    var toolbarStyle: js.UndefOr[js.Object] = js.undefined
    
    var value: EditorValue
  }
  object Props {
    
    inline def apply(value: EditorValue): Props = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBlockStyleFn(value: /* block */ ContentBlock => js.UndefOr[String]): Self = StObject.set(x, "blockStyleFn", js.Any.fromFunction1(value))
      
      inline def setBlockStyleFnUndefined: Self = StObject.set(x, "blockStyleFn", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCustomControls(value: js.Array[CustomControl]): Self = StObject.set(x, "customControls", value.asInstanceOf[js.Any])
      
      inline def setCustomControlsUndefined: Self = StObject.set(x, "customControls", js.undefined)
      
      inline def setCustomControlsVarargs(value: CustomControl*): Self = StObject.set(x, "customControls", js.Array(value*))
      
      inline def setCustomStyleMap(value: StringDictionary[StringDictionary[Any]]): Self = StObject.set(x, "customStyleMap", value.asInstanceOf[js.Any])
      
      inline def setCustomStyleMapUndefined: Self = StObject.set(x, "customStyleMap", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditorClassName(value: String): Self = StObject.set(x, "editorClassName", value.asInstanceOf[js.Any])
      
      inline def setEditorClassNameUndefined: Self = StObject.set(x, "editorClassName", js.undefined)
      
      inline def setEditorStyle(value: js.Object): Self = StObject.set(x, "editorStyle", value.asInstanceOf[js.Any])
      
      inline def setEditorStyleUndefined: Self = StObject.set(x, "editorStyle", js.undefined)
      
      inline def setHandleReturn(value: /* event */ js.Object => Boolean): Self = StObject.set(x, "handleReturn", js.Any.fromFunction1(value))
      
      inline def setHandleReturnUndefined: Self = StObject.set(x, "handleReturn", js.undefined)
      
      inline def setKeyBindingFn(value: /* event */ js.Object => js.UndefOr[String]): Self = StObject.set(x, "keyBindingFn", js.Any.fromFunction1(value))
      
      inline def setKeyBindingFnUndefined: Self = StObject.set(x, "keyBindingFn", js.undefined)
      
      inline def setOnBlur(value: /* event */ js.Object => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* value */ EditorValue => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRootStyle(value: js.Object): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      inline def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
      
      inline def setToolbarClassName(value: String): Self = StObject.set(x, "toolbarClassName", value.asInstanceOf[js.Any])
      
      inline def setToolbarClassNameUndefined: Self = StObject.set(x, "toolbarClassName", js.undefined)
      
      inline def setToolbarConfig(value: ToolbarConfig): Self = StObject.set(x, "toolbarConfig", value.asInstanceOf[js.Any])
      
      inline def setToolbarConfigUndefined: Self = StObject.set(x, "toolbarConfig", js.undefined)
      
      inline def setToolbarStyle(value: js.Object): Self = StObject.set(x, "toolbarStyle", value.asInstanceOf[js.Any])
      
      inline def setToolbarStyleUndefined: Self = StObject.set(x, "toolbarStyle", js.undefined)
      
      inline def setValue(value: EditorValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderConfig extends StObject {
    
    var attributes: js.UndefOr[Any] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object RenderConfig {
    
    inline def apply(): RenderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderConfig] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type RichTextEditor = Component[Props, Any, Any]
  
  type SetControlState = js.Function2[/* key */ String, /* value */ String, Unit]
  
  type StringMap = StringDictionary[String]
  
  trait Style extends StObject {
    
    var style: String
    
    var `type`: STYLE
  }
  object Style {
    
    inline def apply(style: String): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("STYLE")
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setType(value: STYLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleConfig extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var style: String
  }
  object StyleConfig {
    
    inline def apply(label: String, style: String): StyleConfig = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleConfig] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type StyleConfigList = js.Array[StyleConfig]
  
  trait ToolbarConfig extends StObject {
    
    var BLOCK_ALIGNMENT_BUTTONS: StyleConfigList
    
    var BLOCK_TYPE_BUTTONS: StyleConfigList
    
    var BLOCK_TYPE_DROPDOWN: StyleConfigList
    
    var INLINE_STYLE_BUTTONS: StyleConfigList
    
    var display: js.Array[GroupName]
    
    var extraProps: js.UndefOr[js.Object] = js.undefined
  }
  object ToolbarConfig {
    
    inline def apply(
      BLOCK_ALIGNMENT_BUTTONS: StyleConfigList,
      BLOCK_TYPE_BUTTONS: StyleConfigList,
      BLOCK_TYPE_DROPDOWN: StyleConfigList,
      INLINE_STYLE_BUTTONS: StyleConfigList,
      display: js.Array[GroupName]
    ): ToolbarConfig = {
      val __obj = js.Dynamic.literal(BLOCK_ALIGNMENT_BUTTONS = BLOCK_ALIGNMENT_BUTTONS.asInstanceOf[js.Any], BLOCK_TYPE_BUTTONS = BLOCK_TYPE_BUTTONS.asInstanceOf[js.Any], BLOCK_TYPE_DROPDOWN = BLOCK_TYPE_DROPDOWN.asInstanceOf[js.Any], INLINE_STYLE_BUTTONS = INLINE_STYLE_BUTTONS.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarConfig] (val x: Self) extends AnyVal {
      
      inline def setBLOCK_ALIGNMENT_BUTTONS(value: StyleConfigList): Self = StObject.set(x, "BLOCK_ALIGNMENT_BUTTONS", value.asInstanceOf[js.Any])
      
      inline def setBLOCK_ALIGNMENT_BUTTONSVarargs(value: StyleConfig*): Self = StObject.set(x, "BLOCK_ALIGNMENT_BUTTONS", js.Array(value*))
      
      inline def setBLOCK_TYPE_BUTTONS(value: StyleConfigList): Self = StObject.set(x, "BLOCK_TYPE_BUTTONS", value.asInstanceOf[js.Any])
      
      inline def setBLOCK_TYPE_BUTTONSVarargs(value: StyleConfig*): Self = StObject.set(x, "BLOCK_TYPE_BUTTONS", js.Array(value*))
      
      inline def setBLOCK_TYPE_DROPDOWN(value: StyleConfigList): Self = StObject.set(x, "BLOCK_TYPE_DROPDOWN", value.asInstanceOf[js.Any])
      
      inline def setBLOCK_TYPE_DROPDOWNVarargs(value: StyleConfig*): Self = StObject.set(x, "BLOCK_TYPE_DROPDOWN", js.Array(value*))
      
      inline def setDisplay(value: js.Array[GroupName]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayVarargs(value: GroupName*): Self = StObject.set(x, "display", js.Array(value*))
      
      inline def setExtraProps(value: js.Object): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
      
      inline def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
      
      inline def setINLINE_STYLE_BUTTONS(value: StyleConfigList): Self = StObject.set(x, "INLINE_STYLE_BUTTONS", value.asInstanceOf[js.Any])
      
      inline def setINLINE_STYLE_BUTTONSVarargs(value: StyleConfig*): Self = StObject.set(x, "INLINE_STYLE_BUTTONS", js.Array(value*))
    }
  }
}
