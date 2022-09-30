package typings.reactBlessed

import org.scalablytyped.runtime.TopLevel
import typings.blessed.mod.Widgets.BlessedElement
import typings.blessed.mod.Widgets.Events.IKeyEventArg
import typings.blessed.mod.Widgets.Events.IMouseEventArg
import typings.blessed.mod.Widgets.Log
import typings.blessed.mod.Widgets.NodeGenericEventType
import typings.blessed.mod.Widgets.NodeMouseEventType
import typings.blessed.mod.Widgets.NodeScreenEventType
import typings.blessed.mod.Widgets.Screen
import typings.react.mod.Attributes
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.reactBlessed.anon.Bg
import typings.reactBlessed.anon.Children
import typings.reactBlessed.anon.Class
import typings.reactBlessed.anon.Fg
import typings.reactBlessed.anon.PartialLayoutOptions
import typings.reactBlessed.anon.Selected
import typings.reactBlessed.anon.Style
import typings.reactBlessed.reactBlessedBooleans.`false`
import typings.reactBlessed.reactBlessedStrings.Space
import typings.reactBlessed.reactBlessedStrings.bg
import typings.reactBlessed.reactBlessedStrings.children
import typings.reactBlessed.reactBlessedStrings.content
import typings.reactBlessed.reactBlessedStrings.element
import typings.reactBlessed.reactBlessedStrings.keypress
import typings.reactBlessed.reactBlessedStrings.line
import typings.reactBlessed.reactBlessedStrings.style
import typings.reactBlessed.reactBlessedStrings.warning
import typings.std.Capitalize
import typings.std.Exclude
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-blessed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlessedRenderer(bls: Any): renderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlessedRenderer")(bls.asInstanceOf[js.Any]).asInstanceOf[renderer]
  
  inline def render(c: typings.react.mod.global.JSX.Element, s: Screen): (Component[js.Object, js.Object, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(c.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[(Component[js.Object, js.Object, Any]) | Null]
  inline def render(c: typings.react.mod.global.JSX.Element, s: Screen, callback: Callback): (Component[js.Object, js.Object, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(c.asInstanceOf[js.Any], s.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[js.Object, js.Object, Any]) | Null]
  
  type BigTextElement = typings.blessed.mod.Widgets.BigTextElement
  
  type BlessedAttributes[E /* <: Element */] = WithClassProp[
    (ModifiedBlessedOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: E['options'] */ js.Any
    ]) & ProgressBarProps[E] & ListProps[E] & LayoutProps[E], 
    js.UndefOr[
      ((ModifiedBlessedOptions[
        /* import warning: importer.ImportType#apply Failed type conversion: E['options'] */ js.Any
      ]) & ProgressBarProps[E] & ListProps[E] & LayoutProps[E]) | `false` | Null
    ]
  ]
  
  trait BlessedIntrinsicElements extends StObject {
    
    var bigtext: DetailedBlessedProps[BigTextElement]
    
    var box: DetailedBlessedProps[BoxElement]
    
    var button: DetailedBlessedProps[ButtonElement]
    
    var checkbox: DetailedBlessedProps[CheckboxElement]
    
    var element: DetailedBlessedProps[Element]
    
    var filemanager: DetailedBlessedProps[FileManagerElement]
    
    var input: DetailedBlessedProps[InputElement]
    
    var layout: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement]
    
    var line: DetailedBlessedProps[LineElement]
    
    var list: DetailedBlessedProps[ListElement]
    
    var listbar: DetailedBlessedProps[ListbarElement]
    
    var listtable: DetailedBlessedProps[ListTableElement]
    
    var loading: DetailedBlessedProps[LoadingElement]
    
    var log: DetailedBlessedProps[LogElement]
    
    var message: DetailedBlessedProps[MessageElement]
    
    var progressbar: DetailedBlessedProps[ProgressBarElement]
    
    var prompt: DetailedBlessedProps[PromptElement]
    
    var question: DetailedBlessedProps[QuestionElement]
    
    var radiobutton: DetailedBlessedProps[RadioButtonElement]
    
    var radioset: DetailedBlessedProps[RadioSetElement]
    
    var scrollablebox: DetailedBlessedProps[ScrollableBoxElement]
    
    var scrollabletext: DetailedBlessedProps[ScrollableTextElement]
    
    var table: DetailedBlessedProps[TableElement]
    
    var terminal: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement]
    
    var text: DetailedBlessedProps[TextElement]
    
    var textarea: DetailedBlessedProps[TextareaElement]
    
    var textbox: DetailedBlessedProps[TextboxElement]
  }
  object BlessedIntrinsicElements {
    
    inline def apply(
      bigtext: DetailedBlessedProps[BigTextElement],
      box: DetailedBlessedProps[BoxElement],
      button: DetailedBlessedProps[ButtonElement],
      checkbox: DetailedBlessedProps[CheckboxElement],
      element: DetailedBlessedProps[Element],
      filemanager: DetailedBlessedProps[FileManagerElement],
      input: DetailedBlessedProps[InputElement],
      layout: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement],
      line: DetailedBlessedProps[LineElement],
      list: DetailedBlessedProps[ListElement],
      listbar: DetailedBlessedProps[ListbarElement],
      listtable: DetailedBlessedProps[ListTableElement],
      loading: DetailedBlessedProps[LoadingElement],
      log: DetailedBlessedProps[LogElement],
      message: DetailedBlessedProps[MessageElement],
      progressbar: DetailedBlessedProps[ProgressBarElement],
      prompt: DetailedBlessedProps[PromptElement],
      question: DetailedBlessedProps[QuestionElement],
      radiobutton: DetailedBlessedProps[RadioButtonElement],
      radioset: DetailedBlessedProps[RadioSetElement],
      scrollablebox: DetailedBlessedProps[ScrollableBoxElement],
      scrollabletext: DetailedBlessedProps[ScrollableTextElement],
      table: DetailedBlessedProps[TableElement],
      terminal: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement],
      text: DetailedBlessedProps[TextElement],
      textarea: DetailedBlessedProps[TextareaElement],
      textbox: DetailedBlessedProps[TextboxElement]
    ): BlessedIntrinsicElements = {
      val __obj = js.Dynamic.literal(bigtext = bigtext.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], filemanager = filemanager.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listbar = listbar.asInstanceOf[js.Any], listtable = listtable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progressbar = progressbar.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], radiobutton = radiobutton.asInstanceOf[js.Any], radioset = radioset.asInstanceOf[js.Any], scrollablebox = scrollablebox.asInstanceOf[js.Any], scrollabletext = scrollabletext.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], textbox = textbox.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlessedIntrinsicElements]
    }
    
    extension [Self <: BlessedIntrinsicElements](x: Self) {
      
      inline def setBigtext(value: DetailedBlessedProps[BigTextElement]): Self = StObject.set(x, "bigtext", value.asInstanceOf[js.Any])
      
      inline def setBox(value: DetailedBlessedProps[BoxElement]): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setButton(value: DetailedBlessedProps[ButtonElement]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setCheckbox(value: DetailedBlessedProps[CheckboxElement]): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DetailedBlessedProps[Element]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFilemanager(value: DetailedBlessedProps[FileManagerElement]): Self = StObject.set(x, "filemanager", value.asInstanceOf[js.Any])
      
      inline def setInput(value: DetailedBlessedProps[InputElement]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLine(value: DetailedBlessedProps[LineElement]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setList(value: DetailedBlessedProps[ListElement]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListbar(value: DetailedBlessedProps[ListbarElement]): Self = StObject.set(x, "listbar", value.asInstanceOf[js.Any])
      
      inline def setListtable(value: DetailedBlessedProps[ListTableElement]): Self = StObject.set(x, "listtable", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: DetailedBlessedProps[LoadingElement]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLog(value: DetailedBlessedProps[LogElement]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: DetailedBlessedProps[MessageElement]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProgressbar(value: DetailedBlessedProps[ProgressBarElement]): Self = StObject.set(x, "progressbar", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: DetailedBlessedProps[PromptElement]): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setQuestion(value: DetailedBlessedProps[QuestionElement]): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
      
      inline def setRadiobutton(value: DetailedBlessedProps[RadioButtonElement]): Self = StObject.set(x, "radiobutton", value.asInstanceOf[js.Any])
      
      inline def setRadioset(value: DetailedBlessedProps[RadioSetElement]): Self = StObject.set(x, "radioset", value.asInstanceOf[js.Any])
      
      inline def setScrollablebox(value: DetailedBlessedProps[ScrollableBoxElement]): Self = StObject.set(x, "scrollablebox", value.asInstanceOf[js.Any])
      
      inline def setScrollabletext(value: DetailedBlessedProps[ScrollableTextElement]): Self = StObject.set(x, "scrollabletext", value.asInstanceOf[js.Any])
      
      inline def setTable(value: DetailedBlessedProps[TableElement]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTerminal(value: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement]): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setText(value: DetailedBlessedProps[TextElement]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextarea(value: DetailedBlessedProps[TextareaElement]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTextbox(value: DetailedBlessedProps[TextboxElement]): Self = StObject.set(x, "textbox", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Key in keyof react-blessed.react-blessed.BlessedIntrinsicElements as react-blessed.react-blessed.Prefix<'blessed-', Key> ]: react-blessed.react-blessed.BlessedIntrinsicElements[Key]} */
  trait BlessedIntrinsicElementsPrefixed extends StObject {
    
    var bigtext: DetailedBlessedProps[BigTextElement]
    
    var box: DetailedBlessedProps[BoxElement]
    
    var button: DetailedBlessedProps[ButtonElement]
    
    var checkbox: DetailedBlessedProps[CheckboxElement]
    
    var element: DetailedBlessedProps[Element]
    
    var filemanager: DetailedBlessedProps[FileManagerElement]
    
    var input: DetailedBlessedProps[InputElement]
    
    var layout: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement]
    
    var line: DetailedBlessedProps[LineElement]
    
    var list: DetailedBlessedProps[ListElement]
    
    var listbar: DetailedBlessedProps[ListbarElement]
    
    var listtable: DetailedBlessedProps[ListTableElement]
    
    var loading: DetailedBlessedProps[LoadingElement]
    
    var log: DetailedBlessedProps[LogElement]
    
    var message: DetailedBlessedProps[MessageElement]
    
    var progressbar: DetailedBlessedProps[ProgressBarElement]
    
    var prompt: DetailedBlessedProps[PromptElement]
    
    var question: DetailedBlessedProps[QuestionElement]
    
    var radiobutton: DetailedBlessedProps[RadioButtonElement]
    
    var radioset: DetailedBlessedProps[RadioSetElement]
    
    var scrollablebox: DetailedBlessedProps[ScrollableBoxElement]
    
    var scrollabletext: DetailedBlessedProps[ScrollableTextElement]
    
    var table: DetailedBlessedProps[TableElement]
    
    var terminal: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement]
    
    var text: DetailedBlessedProps[TextElement]
    
    var textarea: DetailedBlessedProps[TextareaElement]
    
    var textbox: DetailedBlessedProps[TextboxElement]
  }
  object BlessedIntrinsicElementsPrefixed {
    
    inline def apply(
      bigtext: DetailedBlessedProps[BigTextElement],
      box: DetailedBlessedProps[BoxElement],
      button: DetailedBlessedProps[ButtonElement],
      checkbox: DetailedBlessedProps[CheckboxElement],
      element: DetailedBlessedProps[Element],
      filemanager: DetailedBlessedProps[FileManagerElement],
      input: DetailedBlessedProps[InputElement],
      layout: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement],
      line: DetailedBlessedProps[LineElement],
      list: DetailedBlessedProps[ListElement],
      listbar: DetailedBlessedProps[ListbarElement],
      listtable: DetailedBlessedProps[ListTableElement],
      loading: DetailedBlessedProps[LoadingElement],
      log: DetailedBlessedProps[LogElement],
      message: DetailedBlessedProps[MessageElement],
      progressbar: DetailedBlessedProps[ProgressBarElement],
      prompt: DetailedBlessedProps[PromptElement],
      question: DetailedBlessedProps[QuestionElement],
      radiobutton: DetailedBlessedProps[RadioButtonElement],
      radioset: DetailedBlessedProps[RadioSetElement],
      scrollablebox: DetailedBlessedProps[ScrollableBoxElement],
      scrollabletext: DetailedBlessedProps[ScrollableTextElement],
      table: DetailedBlessedProps[TableElement],
      terminal: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement],
      text: DetailedBlessedProps[TextElement],
      textarea: DetailedBlessedProps[TextareaElement],
      textbox: DetailedBlessedProps[TextboxElement]
    ): BlessedIntrinsicElementsPrefixed = {
      val __obj = js.Dynamic.literal(bigtext = bigtext.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], filemanager = filemanager.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listbar = listbar.asInstanceOf[js.Any], listtable = listtable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progressbar = progressbar.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], radiobutton = radiobutton.asInstanceOf[js.Any], radioset = radioset.asInstanceOf[js.Any], scrollablebox = scrollablebox.asInstanceOf[js.Any], scrollabletext = scrollabletext.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], textbox = textbox.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlessedIntrinsicElementsPrefixed]
    }
    
    extension [Self <: BlessedIntrinsicElementsPrefixed](x: Self) {
      
      inline def setBigtext(value: DetailedBlessedProps[BigTextElement]): Self = StObject.set(x, "bigtext", value.asInstanceOf[js.Any])
      
      inline def setBox(value: DetailedBlessedProps[BoxElement]): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setButton(value: DetailedBlessedProps[ButtonElement]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setCheckbox(value: DetailedBlessedProps[CheckboxElement]): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DetailedBlessedProps[Element]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFilemanager(value: DetailedBlessedProps[FileManagerElement]): Self = StObject.set(x, "filemanager", value.asInstanceOf[js.Any])
      
      inline def setInput(value: DetailedBlessedProps[InputElement]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLine(value: DetailedBlessedProps[LineElement]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setList(value: DetailedBlessedProps[ListElement]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListbar(value: DetailedBlessedProps[ListbarElement]): Self = StObject.set(x, "listbar", value.asInstanceOf[js.Any])
      
      inline def setListtable(value: DetailedBlessedProps[ListTableElement]): Self = StObject.set(x, "listtable", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: DetailedBlessedProps[LoadingElement]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLog(value: DetailedBlessedProps[LogElement]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: DetailedBlessedProps[MessageElement]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProgressbar(value: DetailedBlessedProps[ProgressBarElement]): Self = StObject.set(x, "progressbar", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: DetailedBlessedProps[PromptElement]): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setQuestion(value: DetailedBlessedProps[QuestionElement]): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
      
      inline def setRadiobutton(value: DetailedBlessedProps[RadioButtonElement]): Self = StObject.set(x, "radiobutton", value.asInstanceOf[js.Any])
      
      inline def setRadioset(value: DetailedBlessedProps[RadioSetElement]): Self = StObject.set(x, "radioset", value.asInstanceOf[js.Any])
      
      inline def setScrollablebox(value: DetailedBlessedProps[ScrollableBoxElement]): Self = StObject.set(x, "scrollablebox", value.asInstanceOf[js.Any])
      
      inline def setScrollabletext(value: DetailedBlessedProps[ScrollableTextElement]): Self = StObject.set(x, "scrollabletext", value.asInstanceOf[js.Any])
      
      inline def setTable(value: DetailedBlessedProps[TableElement]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTerminal(value: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement]): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setText(value: DetailedBlessedProps[TextElement]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextarea(value: DetailedBlessedProps[TextareaElement]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTextbox(value: DetailedBlessedProps[TextboxElement]): Self = StObject.set(x, "textbox", value.asInstanceOf[js.Any])
    }
  }
  
  /* BLESSED-REACT LOCALLY DEFINED PROPS **************************************/
  // @types/blessed defines 'styles' as 'any' but 'blessed' can only can only
  // take certain values. define them here.
  trait BorderStyle extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var ch: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[line | bg] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object BorderStyle {
    
    inline def apply(): BorderStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderStyle]
    }
    
    extension [Self <: BorderStyle](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setType(value: line | bg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  type BoxElement = typings.blessed.mod.Widgets.BoxElement
  
  type ButtonElement = typings.blessed.mod.Widgets.ButtonElement
  
  type Callback = js.Function0[js.UndefOr[Unit | Null]]
  
  type CamelCasedGenericEventNames = Prefix[GenericContentPrefix, Capitalize[GenericContent]]
  
  type CamelCasedScreenEventNames = Prefix[ScreenElementPrefix, Capitalize[ScreenElement]]
  
  type CheckboxElement = typings.blessed.mod.Widgets.CheckboxElement
  
  type DetailedBlessedProps[E /* <: Element */] = BlessedAttributes[E] & ClassAttributes[E]
  
  type Element = BlessedElement
  
  trait ElementStyle
    extends StObject
       with ItemStyle {
    
    var border: js.UndefOr[BorderStyle] = js.undefined
    
    var focus: js.UndefOr[Bg] = js.undefined
    
    var hover: js.UndefOr[Bg] = js.undefined
    
    var scrollbar: js.UndefOr[Fg] = js.undefined
    
    var transparent: js.UndefOr[Boolean] = js.undefined
  }
  object ElementStyle {
    
    inline def apply(): ElementStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementStyle]
    }
    
    extension [Self <: ElementStyle](x: Self) {
      
      inline def setBorder(value: BorderStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFocus(value: Bg): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setHover(value: Bg): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setScrollbar(value: Fg): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  type EventHandler[T] = js.Function1[/* args */ SpreadableArgs[T, js.Array[T] | T], Unit]
  
  // create event handlers that map to 'blessed' events. see
  // https://github.com/Yomguithereal/react-blessed/blob/f5e1f791dea1788745695d557040b91f573f9ef5/src/fiber/events.js
  type EventHandlerProp[T /* <: String */, E /* <: js.Function1[/* args */ scala.Nothing, Unit] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in / * template literal string: on${Capitalize<T>} * / string ]:? E}
    */ typings.reactBlessed.reactBlessedStrings.EventHandlerProp & TopLevel[Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ key in / * template literal string: on${Capitalize<T>} * / string ]:? react-blessed.react-blessed.ScreenEventHandler}
  - Dropped {[ key in / * template literal string: on${Capitalize<T>} * / string ]:? react-blessed.react-blessed.GenericEventHandler}
  - Dropped {[ key in / * template literal string: on${Capitalize<T>} * / string ]:? react-blessed.react-blessed.MouseEventHandler}
  - Dropped {[ key in / * template literal string: on${Capitalize<T>} * / string ]:? react-blessed.react-blessed.KeyPressEventHandler}
  - Dropped {[ key in / * template literal string: on${Capitalize<T>} * / string ]:? react-blessed.react-blessed.WarningEventHandler} */ trait EventProps extends StObject
  
  type ExludedGenericEventNames = Prefix[GenericContentPrefix, Prefix[Space, GenericContent]]
  
  type ExludedScreenEventNames = Prefix[ScreenElementPrefix, Prefix[Space, ScreenElement]]
  
  type FileManagerElement = typings.blessed.mod.Widgets.FileManagerElement
  
  // remove {[key: string]: any} indexer defined in Blessed.Widgets.IOptions.
  // 'blessed' doesn't exist in a DOM so it probably doesn't make sense to allow any property
  type FilterOptions[T /* <: Record[Any, Any] */] = Partial[Omit[KnownKeys[T], style | children]]
  
  type GenericContent = content
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactBlessed.reactBlessedStrings.set
    - typings.reactBlessed.reactBlessedStrings.parsed
  */
  trait GenericContentPrefix extends StObject
  object GenericContentPrefix {
    
    inline def parsed: typings.reactBlessed.reactBlessedStrings.parsed = "parsed".asInstanceOf[typings.reactBlessed.reactBlessedStrings.parsed]
    
    inline def set: typings.reactBlessed.reactBlessedStrings.set = "set".asInstanceOf[typings.reactBlessed.reactBlessedStrings.set]
  }
  
  type GenericEvent = Unit
  
  type GenericEventHandler = EventHandler[GenericEvent]
  
  type GenericEventNames = (Exclude[NodeGenericEventType, ExludedGenericEventNames]) | CamelCasedGenericEventNames
  
  type GenericEventProps = EventHandlerProp[GenericEventNames, GenericEventHandler]
  
  type InputElement = typings.blessed.mod.Widgets.InputElement
  
  trait ItemStyle extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var blink: js.UndefOr[Boolean] = js.undefined
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object ItemStyle {
    
    inline def apply(): ItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemStyle]
    }
    
    extension [Self <: ItemStyle](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
      
      inline def setBlinkUndefined: Self = StObject.set(x, "blink", js.undefined)
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  type KeyPressEvent = js.Tuple2[/* key */ Any, /* event */ IKeyEventArg]
  
  type KeyPressEventHandler = EventHandler[KeyPressEvent]
  
  type KeyPressEventProps = EventHandlerProp[keypress, KeyPressEventHandler]
  
  // remove indexers
  // https://stackoverflow.com/questions/51465182/how-to-remove-index-signature-using-mapped-types
  type KnownKeys[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T as string extends K? never : number extends K? never : K ]: T[K]}
    */ typings.reactBlessed.reactBlessedStrings.KnownKeys & TopLevel[T]
  
  type LayoutElement = typings.blessed.mod.Widgets.LayoutElement
  
  // layout does not require prop 'layout' in Blessed.Widgets.LayoutOptions--make it optional
  type LayoutProps[T] = js.Object | PartialLayoutOptions
  
  type LineElement = typings.blessed.mod.Widgets.LineElement
  
  type ListElement = typings.blessed.mod.Widgets.ListElement
  
  type ListProps[T] = js.Object | (ProgressBarEventProps & Selected)
  
  trait ListStyle
    extends StObject
       with ElementStyle {
    
    var item: js.UndefOr[ItemStyle] = js.undefined
    
    var selected: js.UndefOr[ItemStyle] = js.undefined
  }
  object ListStyle {
    
    inline def apply(): ListStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListStyle]
    }
    
    extension [Self <: ListStyle](x: Self) {
      
      inline def setItem(value: ItemStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setSelected(value: ItemStyle): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  type ListTableElement = typings.blessed.mod.Widgets.ListTableElement
  
  type ListbarElement = typings.blessed.mod.Widgets.ListbarElement
  
  type LoadingElement = typings.blessed.mod.Widgets.LoadingElement
  
  type LogElement = Log
  
  type MessageElement = typings.blessed.mod.Widgets.MessageElement
  
  type ModifiedBlessedOptions[T /* <: Record[Any, Any] */] = FilterOptions[T] & Children & EventProps
  
  type MouseEvent = IMouseEventArg
  
  type MouseEventHandler = EventHandler[MouseEvent]
  
  type MouseEventProps = EventHandlerProp[NodeMouseEventType, MouseEventHandler]
  
  /* EVENTS *******************************************************************/
  type Prefix[T /* <: String */, P /* <: String */] = /* template literal string: ${T}${P} */ String
  
  type ProgressBarElement = typings.blessed.mod.Widgets.ProgressBarElement
  
  type ProgressBarEvent = Unit
  
  type ProgressBarEventHandler = EventHandler[ProgressBarEvent]
  
  type ProgressBarEventNames = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-blessed.anon.FnCall>[0] */ js.Any
  
  type ProgressBarEventProps = EventHandlerProp[ProgressBarEventNames, ProgressBarEventHandler]
  
  type ProgressBarProps[T] = js.Object | (ProgressBarEventProps & Style)
  
  trait ProgressBarStyle
    extends StObject
       with ElementStyle {
    
    var bar: js.UndefOr[Bg] = js.undefined
  }
  object ProgressBarStyle {
    
    inline def apply(): ProgressBarStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarStyle]
    }
    
    extension [Self <: ProgressBarStyle](x: Self) {
      
      inline def setBar(value: Bg): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    }
  }
  
  type PromptElement = typings.blessed.mod.Widgets.PromptElement
  
  type QuestionElement = typings.blessed.mod.Widgets.QuestionElement
  
  type RadioButtonElement = typings.blessed.mod.Widgets.RadioButtonElement
  
  type RadioSetElement = typings.blessed.mod.Widgets.RadioSetElement
  
  // 'react-blessed' handles 'blessed' events by matching event names to
  // handlers by prefixing event names with with "on" and camelCasing the
  // result. this cannot be fully recreated in TS so we must manually map them
  // here.
  /* Rewritten from type alias, can be one of: 
    - typings.reactBlessed.reactBlessedStrings.click
    - typings.reactBlessed.reactBlessedStrings.mouseover
    - typings.reactBlessed.reactBlessedStrings.mouseout
    - typings.reactBlessed.reactBlessedStrings.mouseup
  */
  trait ScreenElement extends StObject
  object ScreenElement {
    
    inline def click: typings.reactBlessed.reactBlessedStrings.click = "click".asInstanceOf[typings.reactBlessed.reactBlessedStrings.click]
    
    inline def mouseout: typings.reactBlessed.reactBlessedStrings.mouseout = "mouseout".asInstanceOf[typings.reactBlessed.reactBlessedStrings.mouseout]
    
    inline def mouseover: typings.reactBlessed.reactBlessedStrings.mouseover = "mouseover".asInstanceOf[typings.reactBlessed.reactBlessedStrings.mouseover]
    
    inline def mouseup: typings.reactBlessed.reactBlessedStrings.mouseup = "mouseup".asInstanceOf[typings.reactBlessed.reactBlessedStrings.mouseup]
  }
  
  type ScreenElementPrefix = element
  
  type ScreenEvent = Screen
  
  type ScreenEventHandler = EventHandler[ScreenEvent]
  
  type ScreenEventNames = (Exclude[NodeScreenEventType, ExludedScreenEventNames]) | CamelCasedScreenEventNames
  
  type ScreenEventProps = EventHandlerProp[ScreenEventNames, ScreenEventHandler]
  
  type ScrollableBoxElement = typings.blessed.mod.Widgets.ScrollableBoxElement
  
  type ScrollableTextElement = typings.blessed.mod.Widgets.ScrollableTextElement
  
  type SpreadableArgs[T, K] = K
  
  type TableElement = typings.blessed.mod.Widgets.TableElement
  
  type TerminalElement = typings.blessed.mod.Widgets.TerminalElement
  
  type TextElement = typings.blessed.mod.Widgets.TextElement
  
  type TextareaElement = typings.blessed.mod.Widgets.TextareaElement
  
  type TextboxElement = typings.blessed.mod.Widgets.TextboxElement
  
  type WarningEvent = String
  
  type WarningEventHandler = EventHandler[WarningEvent]
  
  type WarningEventProps = EventHandlerProp[warning, WarningEventHandler]
  
  type WithClassProp[T, K] = T & Class[K]
  
  // it isn't possible to use the global JSX namespace because some 'blessed'
  // elements will collide with ones set in react defs.
  // augment react JSX when old JSX transform is used
  /* augmented module */
  object reactAugmentingMod {
    
    object JSX {
      
      // set IntrinsicElements to 'react-blessed' elements both with and without
      // 'blessed-' prefix
      /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
      - typings.reactBlessed.mod.BlessedIntrinsicElements because var conflicts: bigtext, box, button, checkbox, element, filemanager, input, layout, line, list, listbar, listtable, loading, log, message, progressbar, prompt, question, radiobutton, radioset, scrollablebox, scrollabletext, table, terminal, text, textarea, textbox. Inlined  */ trait IntrinsicElements
        extends StObject
           with BlessedIntrinsicElementsPrefixed
      object IntrinsicElements {
        
        inline def apply(
          bigtext: DetailedBlessedProps[BigTextElement],
          box: DetailedBlessedProps[BoxElement],
          button: DetailedBlessedProps[ButtonElement],
          checkbox: DetailedBlessedProps[CheckboxElement],
          element: DetailedBlessedProps[Element],
          filemanager: DetailedBlessedProps[FileManagerElement],
          input: DetailedBlessedProps[InputElement],
          layout: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement],
          line: DetailedBlessedProps[LineElement],
          list: DetailedBlessedProps[ListElement],
          listbar: DetailedBlessedProps[ListbarElement],
          listtable: DetailedBlessedProps[ListTableElement],
          loading: DetailedBlessedProps[LoadingElement],
          log: DetailedBlessedProps[LogElement],
          message: DetailedBlessedProps[MessageElement],
          progressbar: DetailedBlessedProps[ProgressBarElement],
          prompt: DetailedBlessedProps[PromptElement],
          question: DetailedBlessedProps[QuestionElement],
          radiobutton: DetailedBlessedProps[RadioButtonElement],
          radioset: DetailedBlessedProps[RadioSetElement],
          scrollablebox: DetailedBlessedProps[ScrollableBoxElement],
          scrollabletext: DetailedBlessedProps[ScrollableTextElement],
          table: DetailedBlessedProps[TableElement],
          terminal: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement],
          text: DetailedBlessedProps[TextElement],
          textarea: DetailedBlessedProps[TextareaElement],
          textbox: DetailedBlessedProps[TextboxElement]
        ): IntrinsicElements = {
          val __obj = js.Dynamic.literal(bigtext = bigtext.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], filemanager = filemanager.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listbar = listbar.asInstanceOf[js.Any], listtable = listtable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progressbar = progressbar.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], radiobutton = radiobutton.asInstanceOf[js.Any], radioset = radioset.asInstanceOf[js.Any], scrollablebox = scrollablebox.asInstanceOf[js.Any], scrollabletext = scrollabletext.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], textbox = textbox.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
      }
    }
  }
  
  object reactJsxDevRuntimeAugmentingMod {
    
    object JSX {
      
      type IntrinsicAttributes = Attributes
      
      type IntrinsicClassAttributes[T] = ClassAttributes[T]
      
      /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
      - typings.reactBlessed.mod.BlessedIntrinsicElements because var conflicts: bigtext, box, button, checkbox, element, filemanager, input, layout, line, list, listbar, listtable, loading, log, message, progressbar, prompt, question, radiobutton, radioset, scrollablebox, scrollabletext, table, terminal, text, textarea, textbox. Inlined  */ trait IntrinsicElements
        extends StObject
           with BlessedIntrinsicElementsPrefixed
      object IntrinsicElements {
        
        inline def apply(
          bigtext: DetailedBlessedProps[BigTextElement],
          box: DetailedBlessedProps[BoxElement],
          button: DetailedBlessedProps[ButtonElement],
          checkbox: DetailedBlessedProps[CheckboxElement],
          element: DetailedBlessedProps[Element],
          filemanager: DetailedBlessedProps[FileManagerElement],
          input: DetailedBlessedProps[InputElement],
          layout: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement],
          line: DetailedBlessedProps[LineElement],
          list: DetailedBlessedProps[ListElement],
          listbar: DetailedBlessedProps[ListbarElement],
          listtable: DetailedBlessedProps[ListTableElement],
          loading: DetailedBlessedProps[LoadingElement],
          log: DetailedBlessedProps[LogElement],
          message: DetailedBlessedProps[MessageElement],
          progressbar: DetailedBlessedProps[ProgressBarElement],
          prompt: DetailedBlessedProps[PromptElement],
          question: DetailedBlessedProps[QuestionElement],
          radiobutton: DetailedBlessedProps[RadioButtonElement],
          radioset: DetailedBlessedProps[RadioSetElement],
          scrollablebox: DetailedBlessedProps[ScrollableBoxElement],
          scrollabletext: DetailedBlessedProps[ScrollableTextElement],
          table: DetailedBlessedProps[TableElement],
          terminal: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement],
          text: DetailedBlessedProps[TextElement],
          textarea: DetailedBlessedProps[TextareaElement],
          textbox: DetailedBlessedProps[TextboxElement]
        ): IntrinsicElements = {
          val __obj = js.Dynamic.literal(bigtext = bigtext.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], filemanager = filemanager.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listbar = listbar.asInstanceOf[js.Any], listtable = listtable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progressbar = progressbar.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], radiobutton = radiobutton.asInstanceOf[js.Any], radioset = radioset.asInstanceOf[js.Any], scrollablebox = scrollablebox.asInstanceOf[js.Any], scrollabletext = scrollabletext.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], textbox = textbox.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
      }
    }
  }
  
  // augment react/jsx-runtime JSX when new JSX transform is used
  object reactJsxRuntimeAugmentingMod {
    
    object JSX {
      
      // copy React JSX, otherwise class refs won't type as expected
      type IntrinsicAttributes = Attributes
      
      type IntrinsicClassAttributes[T] = ClassAttributes[T]
      
      /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
      - typings.reactBlessed.mod.BlessedIntrinsicElements because var conflicts: bigtext, box, button, checkbox, element, filemanager, input, layout, line, list, listbar, listtable, loading, log, message, progressbar, prompt, question, radiobutton, radioset, scrollablebox, scrollabletext, table, terminal, text, textarea, textbox. Inlined  */ trait IntrinsicElements
        extends StObject
           with BlessedIntrinsicElementsPrefixed
      object IntrinsicElements {
        
        inline def apply(
          bigtext: DetailedBlessedProps[BigTextElement],
          box: DetailedBlessedProps[BoxElement],
          button: DetailedBlessedProps[ButtonElement],
          checkbox: DetailedBlessedProps[CheckboxElement],
          element: DetailedBlessedProps[Element],
          filemanager: DetailedBlessedProps[FileManagerElement],
          input: DetailedBlessedProps[InputElement],
          layout: DetailedBlessedProps[typings.blessed.mod.Widgets.LayoutElement],
          line: DetailedBlessedProps[LineElement],
          list: DetailedBlessedProps[ListElement],
          listbar: DetailedBlessedProps[ListbarElement],
          listtable: DetailedBlessedProps[ListTableElement],
          loading: DetailedBlessedProps[LoadingElement],
          log: DetailedBlessedProps[LogElement],
          message: DetailedBlessedProps[MessageElement],
          progressbar: DetailedBlessedProps[ProgressBarElement],
          prompt: DetailedBlessedProps[PromptElement],
          question: DetailedBlessedProps[QuestionElement],
          radiobutton: DetailedBlessedProps[RadioButtonElement],
          radioset: DetailedBlessedProps[RadioSetElement],
          scrollablebox: DetailedBlessedProps[ScrollableBoxElement],
          scrollabletext: DetailedBlessedProps[ScrollableTextElement],
          table: DetailedBlessedProps[TableElement],
          terminal: DetailedBlessedProps[typings.blessed.mod.Widgets.TerminalElement],
          text: DetailedBlessedProps[TextElement],
          textarea: DetailedBlessedProps[TextareaElement],
          textbox: DetailedBlessedProps[TextboxElement]
        ): IntrinsicElements = {
          val __obj = js.Dynamic.literal(bigtext = bigtext.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], filemanager = filemanager.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listbar = listbar.asInstanceOf[js.Any], listtable = listtable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progressbar = progressbar.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], radiobutton = radiobutton.asInstanceOf[js.Any], radioset = radioset.asInstanceOf[js.Any], scrollablebox = scrollablebox.asInstanceOf[js.Any], scrollabletext = scrollabletext.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], textbox = textbox.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
      }
    }
  }
  
  type renderer = js.Function3[
    /* c */ typings.react.mod.global.JSX.Element, 
    /* s */ Screen, 
    /* callback */ js.UndefOr[Callback], 
    (Component[js.Object, js.Object, Any]) | Null
  ]
}
