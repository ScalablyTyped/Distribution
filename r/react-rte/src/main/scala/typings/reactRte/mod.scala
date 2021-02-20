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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-rte", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Any, js.Any]
  object default {
    
    /* static member */
    @JSImport("react-rte", "default.createEmptyValue")
    @js.native
    def createEmptyValue(): EditorValue = js.native
    
    /* static member */
    @JSImport("react-rte", "default.createValueFromString")
    @js.native
    def createValueFromString(markup: String, format: String): EditorValue = js.native
    @JSImport("react-rte", "default.createValueFromString")
    @js.native
    def createValueFromString(markup: String, format: String, options: ImportOptions): EditorValue = js.native
  }
  
  @JSImport("react-rte", "EditorValue")
  @js.native
  class EditorValue protected () extends StObject {
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
    
    @JSImport("react-rte", "EditorValue.createEmpty")
    @js.native
    def createEmpty(): EditorValue = js.native
    @JSImport("react-rte", "EditorValue.createEmpty")
    @js.native
    def createEmpty(decorator: js.Any): EditorValue = js.native
    
    @JSImport("react-rte", "EditorValue.createFromState")
    @js.native
    def createFromState(editorState: EditorState): EditorValue = js.native
    
    @JSImport("react-rte", "EditorValue.createFromString")
    @js.native
    def createFromString(markup: String, format: String): EditorValue = js.native
    @JSImport("react-rte", "EditorValue.createFromString")
    @js.native
    def createFromString(markup: String, format: String, decorator: js.UndefOr[scala.Nothing], options: ImportOptions): EditorValue = js.native
    @JSImport("react-rte", "EditorValue.createFromString")
    @js.native
    def createFromString(markup: String, format: String, decorator: js.Any): EditorValue = js.native
    @JSImport("react-rte", "EditorValue.createFromString")
    @js.native
    def createFromString(markup: String, format: String, decorator: js.Any, options: ImportOptions): EditorValue = js.native
  }
  
  type BlockRenderer = js.Function1[/* block */ ContentBlock, String]
  
  type BlockStyleFn = js.Function1[/* block */ ContentBlock, RenderConfig]
  
  type ChangeHandler = js.Function1[/* value */ EditorValue, js.Any]
  
  type CustControlFunc = js.Function3[
    /* set */ SetControlState, 
    /* get */ GetControlState, 
    /* state */ EditorState, 
    ReactNode
  ]
  
  type CustomBlockFn = js.Function1[/* element */ Element, js.UndefOr[Null | CustomBlockObject]]
  
  @js.native
  trait CustomBlockObject extends StObject {
    
    var data: js.UndefOr[js.Object] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object CustomBlockObject {
    
    @scala.inline
    def apply(): CustomBlockObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomBlockObject]
    }
    
    @scala.inline
    implicit class CustomBlockObjectMutableBuilder[Self <: CustomBlockObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type CustomControl = ReactNode | CustControlFunc
  
  type CustomInlineFn = js.Function2[
    /* element */ Element, 
    /* inlineCreators */ InlineCreators, 
    js.UndefOr[
      Null | Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
    ]
  ]
  
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    RenderConfig
  ]
  
  @js.native
  trait ExportOptions extends StObject {
    
    var blockRenderers: js.UndefOr[StringDictionary[BlockRenderer]] = js.native
    
    var blockStyleFn: js.UndefOr[BlockStyleFn] = js.native
    
    var entityStyleFn: js.UndefOr[EntityStyleFn] = js.native
    
    var inlineStyles: js.UndefOr[StringDictionary[RenderConfig]] = js.native
  }
  object ExportOptions {
    
    @scala.inline
    def apply(): ExportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportOptions]
    }
    
    @scala.inline
    implicit class ExportOptionsMutableBuilder[Self <: ExportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockRenderers(value: StringDictionary[BlockRenderer]): Self = StObject.set(x, "blockRenderers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockRenderersUndefined: Self = StObject.set(x, "blockRenderers", js.undefined)
      
      @scala.inline
      def setBlockStyleFn(value: /* block */ ContentBlock => RenderConfig): Self = StObject.set(x, "blockStyleFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlockStyleFnUndefined: Self = StObject.set(x, "blockStyleFn", js.undefined)
      
      @scala.inline
      def setEntityStyleFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any => RenderConfig
      ): Self = StObject.set(x, "entityStyleFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntityStyleFnUndefined: Self = StObject.set(x, "entityStyleFn", js.undefined)
      
      @scala.inline
      def setInlineStyles(value: StringDictionary[RenderConfig]): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineStylesUndefined: Self = StObject.set(x, "inlineStyles", js.undefined)
    }
  }
  
  type GetControlState = js.Function1[/* key */ String, js.UndefOr[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRte.reactRteStrings.INLINE_STYLE_BUTTONS
    - typings.reactRte.reactRteStrings.BLOCK_TYPE_BUTTONS
    - typings.reactRte.reactRteStrings.LINK_BUTTONS
    - typings.reactRte.reactRteStrings.BLOCK_TYPE_DROPDOWN
    - typings.reactRte.reactRteStrings.HISTORY_BUTTONS
    - typings.reactRte.reactRteStrings.IMAGE_BUTTON
  */
  trait GroupName extends StObject
  object GroupName {
    
    @scala.inline
    def BLOCK_TYPE_BUTTONS: typings.reactRte.reactRteStrings.BLOCK_TYPE_BUTTONS = "BLOCK_TYPE_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.BLOCK_TYPE_BUTTONS]
    
    @scala.inline
    def BLOCK_TYPE_DROPDOWN: typings.reactRte.reactRteStrings.BLOCK_TYPE_DROPDOWN = "BLOCK_TYPE_DROPDOWN".asInstanceOf[typings.reactRte.reactRteStrings.BLOCK_TYPE_DROPDOWN]
    
    @scala.inline
    def HISTORY_BUTTONS: typings.reactRte.reactRteStrings.HISTORY_BUTTONS = "HISTORY_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.HISTORY_BUTTONS]
    
    @scala.inline
    def IMAGE_BUTTON: typings.reactRte.reactRteStrings.IMAGE_BUTTON = "IMAGE_BUTTON".asInstanceOf[typings.reactRte.reactRteStrings.IMAGE_BUTTON]
    
    @scala.inline
    def INLINE_STYLE_BUTTONS: typings.reactRte.reactRteStrings.INLINE_STYLE_BUTTONS = "INLINE_STYLE_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.INLINE_STYLE_BUTTONS]
    
    @scala.inline
    def LINK_BUTTONS: typings.reactRte.reactRteStrings.LINK_BUTTONS = "LINK_BUTTONS".asInstanceOf[typings.reactRte.reactRteStrings.LINK_BUTTONS]
  }
  
  @js.native
  trait ImportOptions extends StObject {
    
    var customBlockFn: js.UndefOr[CustomBlockFn] = js.native
    
    var customInlineFn: js.UndefOr[CustomInlineFn] = js.native
    
    var elementStyles: js.UndefOr[StringDictionary[String]] = js.native
    
    var parser: js.UndefOr[js.Function1[/* html */ String, HTMLBodyElement]] = js.native
  }
  object ImportOptions {
    
    @scala.inline
    def apply(): ImportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportOptions]
    }
    
    @scala.inline
    implicit class ImportOptionsMutableBuilder[Self <: ImportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomBlockFn(value: /* element */ Element => js.UndefOr[Null | CustomBlockObject]): Self = StObject.set(x, "customBlockFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomBlockFnUndefined: Self = StObject.set(x, "customBlockFn", js.undefined)
      
      @scala.inline
      def setCustomInlineFn(
        value: (/* element */ Element, /* inlineCreators */ InlineCreators) => js.UndefOr[
              Null | Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
            ]
      ): Self = StObject.set(x, "customInlineFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCustomInlineFnUndefined: Self = StObject.set(x, "customInlineFn", js.undefined)
      
      @scala.inline
      def setElementStyles(value: StringDictionary[String]): Self = StObject.set(x, "elementStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementStylesUndefined: Self = StObject.set(x, "elementStyles", js.undefined)
      
      @scala.inline
      def setParser(value: /* html */ String => HTMLBodyElement): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
  
  @js.native
  trait InlineCreators extends StObject {
    
    def Entity(`type`: String): js.Any = js.native
    def Entity(`type`: String, data: js.Object): js.Any = js.native
    
    def Style(style: String): typings.reactRte.mod.Style = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var blockStyleFn: js.UndefOr[js.Function1[/* block */ ContentBlock, js.UndefOr[String]]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var customControls: js.UndefOr[js.Array[CustomControl]] = js.native
    
    var customStyleMap: js.UndefOr[StringDictionary[StringDictionary[js.Any]]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var editorClassName: js.UndefOr[String] = js.native
    
    var editorStyle: js.UndefOr[js.Object] = js.native
    
    var handleReturn: js.UndefOr[js.Function1[/* event */ js.Object, Boolean]] = js.native
    
    var keyBindingFn: js.UndefOr[js.Function1[/* event */ js.Object, js.UndefOr[String]]] = js.native
    
    var onChange: js.UndefOr[ChangeHandler] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var rootStyle: js.UndefOr[js.Object] = js.native
    
    var toolbarClassName: js.UndefOr[String] = js.native
    
    // Alias of readOnly
    var toolbarConfig: js.UndefOr[ToolbarConfig] = js.native
    
    var toolbarStyle: js.UndefOr[js.Object] = js.native
    
    var value: EditorValue = js.native
  }
  object Props {
    
    @scala.inline
    def apply(value: EditorValue): Props = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBlockStyleFn(value: /* block */ ContentBlock => js.UndefOr[String]): Self = StObject.set(x, "blockStyleFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlockStyleFnUndefined: Self = StObject.set(x, "blockStyleFn", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCustomControls(value: js.Array[CustomControl]): Self = StObject.set(x, "customControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomControlsUndefined: Self = StObject.set(x, "customControls", js.undefined)
      
      @scala.inline
      def setCustomControlsVarargs(value: CustomControl*): Self = StObject.set(x, "customControls", js.Array(value :_*))
      
      @scala.inline
      def setCustomStyleMap(value: StringDictionary[StringDictionary[js.Any]]): Self = StObject.set(x, "customStyleMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomStyleMapUndefined: Self = StObject.set(x, "customStyleMap", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEditorClassName(value: String): Self = StObject.set(x, "editorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorClassNameUndefined: Self = StObject.set(x, "editorClassName", js.undefined)
      
      @scala.inline
      def setEditorStyle(value: js.Object): Self = StObject.set(x, "editorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorStyleUndefined: Self = StObject.set(x, "editorStyle", js.undefined)
      
      @scala.inline
      def setHandleReturn(value: /* event */ js.Object => Boolean): Self = StObject.set(x, "handleReturn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleReturnUndefined: Self = StObject.set(x, "handleReturn", js.undefined)
      
      @scala.inline
      def setKeyBindingFn(value: /* event */ js.Object => js.UndefOr[String]): Self = StObject.set(x, "keyBindingFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyBindingFnUndefined: Self = StObject.set(x, "keyBindingFn", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ EditorValue => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRootStyle(value: js.Object): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
      
      @scala.inline
      def setToolbarClassName(value: String): Self = StObject.set(x, "toolbarClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarClassNameUndefined: Self = StObject.set(x, "toolbarClassName", js.undefined)
      
      @scala.inline
      def setToolbarConfig(value: ToolbarConfig): Self = StObject.set(x, "toolbarConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarConfigUndefined: Self = StObject.set(x, "toolbarConfig", js.undefined)
      
      @scala.inline
      def setToolbarStyle(value: js.Object): Self = StObject.set(x, "toolbarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarStyleUndefined: Self = StObject.set(x, "toolbarStyle", js.undefined)
      
      @scala.inline
      def setValue(value: EditorValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderConfig extends StObject {
    
    var attributes: js.UndefOr[js.Any] = js.native
    
    var element: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
  }
  object RenderConfig {
    
    @scala.inline
    def apply(): RenderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConfig]
    }
    
    @scala.inline
    implicit class RenderConfigMutableBuilder[Self <: RenderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type RichTextEditor = Component[Props, js.Any, js.Any]
  
  type SetControlState = js.Function2[/* key */ String, /* value */ String, Unit]
  
  type StringMap = StringDictionary[String]
  
  @js.native
  trait Style extends StObject {
    
    var style: String = js.native
    
    var `type`: STYLE = js.native
  }
  object Style {
    
    @scala.inline
    def apply(style: String, `type`: STYLE): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: STYLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StyleConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var label: String = js.native
    
    var style: String = js.native
  }
  object StyleConfig {
    
    @scala.inline
    def apply(label: String, style: String): StyleConfig = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleConfig]
    }
    
    @scala.inline
    implicit class StyleConfigMutableBuilder[Self <: StyleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type StyleConfigList = js.Array[StyleConfig]
  
  @js.native
  trait ToolbarConfig extends StObject {
    
    var BLOCK_TYPE_BUTTONS: StyleConfigList = js.native
    
    var BLOCK_TYPE_DROPDOWN: StyleConfigList = js.native
    
    var INLINE_STYLE_BUTTONS: StyleConfigList = js.native
    
    var display: js.Array[GroupName] = js.native
    
    var extraProps: js.UndefOr[js.Object] = js.native
  }
  object ToolbarConfig {
    
    @scala.inline
    def apply(
      BLOCK_TYPE_BUTTONS: StyleConfigList,
      BLOCK_TYPE_DROPDOWN: StyleConfigList,
      INLINE_STYLE_BUTTONS: StyleConfigList,
      display: js.Array[GroupName]
    ): ToolbarConfig = {
      val __obj = js.Dynamic.literal(BLOCK_TYPE_BUTTONS = BLOCK_TYPE_BUTTONS.asInstanceOf[js.Any], BLOCK_TYPE_DROPDOWN = BLOCK_TYPE_DROPDOWN.asInstanceOf[js.Any], INLINE_STYLE_BUTTONS = INLINE_STYLE_BUTTONS.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarConfig]
    }
    
    @scala.inline
    implicit class ToolbarConfigMutableBuilder[Self <: ToolbarConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBLOCK_TYPE_BUTTONS(value: StyleConfigList): Self = StObject.set(x, "BLOCK_TYPE_BUTTONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBLOCK_TYPE_BUTTONSVarargs(value: StyleConfig*): Self = StObject.set(x, "BLOCK_TYPE_BUTTONS", js.Array(value :_*))
      
      @scala.inline
      def setBLOCK_TYPE_DROPDOWN(value: StyleConfigList): Self = StObject.set(x, "BLOCK_TYPE_DROPDOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBLOCK_TYPE_DROPDOWNVarargs(value: StyleConfig*): Self = StObject.set(x, "BLOCK_TYPE_DROPDOWN", js.Array(value :_*))
      
      @scala.inline
      def setDisplay(value: js.Array[GroupName]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayVarargs(value: GroupName*): Self = StObject.set(x, "display", js.Array(value :_*))
      
      @scala.inline
      def setExtraProps(value: js.Object): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
      
      @scala.inline
      def setINLINE_STYLE_BUTTONS(value: StyleConfigList): Self = StObject.set(x, "INLINE_STYLE_BUTTONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINLINE_STYLE_BUTTONSVarargs(value: StyleConfig*): Self = StObject.set(x, "INLINE_STYLE_BUTTONS", js.Array(value :_*))
    }
  }
}
