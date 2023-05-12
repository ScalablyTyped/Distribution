package typings.reactCommandPalette

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactCommandPalette.reactCommandPaletteStrings.`inline`
import typings.reactCommandPalette.reactCommandPaletteStrings.modal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandPaletteMod {
  
  @JSImport("react-command-palette/command-palette", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  trait Command extends StObject {
    
    var color: String
    
    def command(): Unit
    
    var id: Double
    
    var name: String
  }
  object Command {
    
    inline def apply(color: String, command: () => Unit, id: Double, name: String): Command = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], command = js.Any.fromFunction0(command), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: () => Unit): Self = StObject.set(x, "command", js.Any.fromFunction0(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type CommandPalette = Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    /**
      * alwaysRenderCommands a boolean, Set it to true if you'd like to render suggestions
      * even when the input is not focused.
      *
      * @default true
      */
    var alwaysRenderCommands: js.UndefOr[Boolean] = js.undefined
    
    /**
      * closeOnSelect a boolean, when true selecting an item will immediately close the
      * command-palette
      *
      * @default false
      */
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * commands appears in the command palette. For each command in the array the object
      * must have a _name_ and a _command_. The _name_ is a user friendly string that will
      * be display to the user. The command is a function that will be executed when the
      * user clicks or presses the enter key. Commands may also include custom properties
      * this" will be bound to the command
      */
    var commands: js.Array[Command]
    
    /**
      * defaultInputValue a string that determines the value of the text in the input field.
      *
      * @default ''
      */
    var defaultInputValue: js.UndefOr[String] = js.undefined
    
    /**
      * display one of "modal" or "inline", when set to "modal" the command palette is
      * rendered centered inside a modal. When set to "inline", it is render inline with
      * other page content.
      *
      * @default 'modal'
      */
    var display: js.UndefOr[modal | `inline`] = js.undefined
    
    /**
      * a function that filters the search query. If this prop is not used the default
      * behavior will search the input exactly entered
      */
    var filterSearchQuery: js.UndefOr[js.Function1[/* inputValue */ String, String]] = js.undefined
    
    /**
      * When suggestion is clicked, react-autosuggest needs to populate the input element
      * based on the clicked suggestion. Teach react-autosuggest how to calculate the
      * input value for every given suggestion. By default the highlighed suggestion will be
      * displayed
      */
    var getSuggestionValue: js.UndefOr[js.Function1[/* suggestion */ Command, String]] = js.undefined
    
    /**
      * header a string or a React.ComponentType which provides a helpful description for
      * the usage of the command palette. The component is displayed at the top of the
      * command palette. header are not displayed by default. see: examples
      * sampleInstruction.js for reference
      *
      * @default null
      */
    var header: js.UndefOr[ReactNode | Null] = js.undefined
    
    /**
      * When highlightFirstSuggestion={true}, Autosuggest will automatically highlight the
      *  first suggestion.
      *
      * @default true
      */
    var highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined
    
    /**
      * hotKeys a string or array of strings that contain a keyboard shortcut for
      * opening/closing the palette.
      *
      * @default 'command+shift+p'
      */
    var hotKeys: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * maxDisplayed a number between 1 and 500 that determines the maximum number of
      * commands that will be rendered on screen.
      *
      * @default 7
      */
    var maxDisplayed: js.UndefOr[Double] = js.undefined
    
    /**
      * onAfterOpen a function that fires after the command palette modal is opened
      */
    var onAfterOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * onChange a function that's called when the input value changes.
      */
    var onChange: js.UndefOr[js.Function2[/* inputValue */ String, /* userQuery */ String, Unit]] = js.undefined
    
    /**
      * onHighlight a function that's called when the highlighted suggestion changes.
      */
    var onHighlight: js.UndefOr[js.Function1[/* suggestion */ Record[String, Any], Unit]] = js.undefined
    
    /**
      * onRequestClose a function that fires after the command palette modal is closed
      */
    var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * onSelect a function that's called when the selected suggestion changes, given the
      * user selects an item or the user clears the selection. It's called with the item that
      * was selected or null
      */
    var onSelect: js.UndefOr[js.Function1[/* command */ Record[String, Any], Unit]] = js.undefined
    
    /**
      * open a boolean, when set to true it forces the command palette to be displayed.
      *
      * @default false.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * options controls how fuzzy search is configured see [fuzzysort options]
      *
      * @default
      * @see {@link https://github.com/farzher/fuzzysort#options}
      */
    var options: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * placeholder a string that contains a short text description which is displayed
      * inside the the input field until the user provides input.
      *
      * @default 'Type a command'
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * a selector compatible with querySelector. By default, the modal portal will be
      * appended to the document's body. You can choose a different parent element by
      * selector. If you do this, please ensure that your app element is set correctly. The
      * app element should not be a parent of the modal, to prevent modal content from being
      * hidden to screenreaders while it is open.
      *
      * @default 'body'
      */
    var reactModalParentSelector: js.UndefOr[String] = js.undefined
    
    /**
      * a React.func that defines the layout and contents of the commands in the
      * command list. For complete documentation see the storybook notes.
      *
      * @default null
      */
    var renderCommand: js.UndefOr[(js.Function1[/* command */ Command, ReactNode]) | Null] = js.undefined
    
    /**
      * resetInputOnOpen a boolean which indicates whether to reset the user's query
      * to `defaultInputValue` when the command palette opens.
      *
      * @default false
      */
    var resetInputOnOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * shouldReturnFocusAfterClose a boolean indicate if the modal should restore focus to
      * the element that had focus prior to its display.
      *
      * @default true
      */
    var shouldReturnFocusAfterClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * showSpinnerOnSelect a boolean which displays a loading indicator immediately after
      * a command has been selected. When true the spinner is enabled when false the spinner
      * is disabled.
      *
      * @default true
      */
    var showSpinnerOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * spinner a string or a React.ComponentType that is displayed when the user selects
      * an item. If a custom spinner is not set then the default spinner will be used. If
      * custom component or string is provided then it will automatically be wrapped inside
      * a div with a role="status" attribute. If a component is provided then it will be be
      * wrapped in a div that also contains a sibling node with a div contain "Loading..."
      * visible only to screen readers.
      */
    var spinner: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Styles and object that contains a list of key value pairs where the keys map the
      * command palette components to their CSS class names.
      *
      * @default
      * @see {@link https://github.com/asabaylus/react-command-palette/blob/main/src/themes/theme.js}
      */
    var theme: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * trigger a string or a React.ComponentType that opens the command palette when
      * clicked. If a custom trigger is not set, then by default a button will be used. If a
      * custom component or string is provided then it will automatically be wrapped inside
      * an accessible div which will allow it be keyboard accessible, clickable and focusable
      * for assistive technologies.
      */
    var trigger: js.UndefOr[ReactNode] = js.undefined
  }
  object Props {
    
    inline def apply(commands: js.Array[Command]): Props = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAlwaysRenderCommands(value: Boolean): Self = StObject.set(x, "alwaysRenderCommands", value.asInstanceOf[js.Any])
      
      inline def setAlwaysRenderCommandsUndefined: Self = StObject.set(x, "alwaysRenderCommands", js.undefined)
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
      
      inline def setDisplay(value: modal | `inline`): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFilterSearchQuery(value: /* inputValue */ String => String): Self = StObject.set(x, "filterSearchQuery", js.Any.fromFunction1(value))
      
      inline def setFilterSearchQueryUndefined: Self = StObject.set(x, "filterSearchQuery", js.undefined)
      
      inline def setGetSuggestionValue(value: /* suggestion */ Command => String): Self = StObject.set(x, "getSuggestionValue", js.Any.fromFunction1(value))
      
      inline def setGetSuggestionValueUndefined: Self = StObject.set(x, "getSuggestionValue", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHighlightFirstSuggestion(value: Boolean): Self = StObject.set(x, "highlightFirstSuggestion", value.asInstanceOf[js.Any])
      
      inline def setHighlightFirstSuggestionUndefined: Self = StObject.set(x, "highlightFirstSuggestion", js.undefined)
      
      inline def setHotKeys(value: js.Array[String] | String): Self = StObject.set(x, "hotKeys", value.asInstanceOf[js.Any])
      
      inline def setHotKeysUndefined: Self = StObject.set(x, "hotKeys", js.undefined)
      
      inline def setHotKeysVarargs(value: String*): Self = StObject.set(x, "hotKeys", js.Array(value*))
      
      inline def setMaxDisplayed(value: Double): Self = StObject.set(x, "maxDisplayed", value.asInstanceOf[js.Any])
      
      inline def setMaxDisplayedUndefined: Self = StObject.set(x, "maxDisplayed", js.undefined)
      
      inline def setOnAfterOpen(value: () => Unit): Self = StObject.set(x, "onAfterOpen", js.Any.fromFunction0(value))
      
      inline def setOnAfterOpenUndefined: Self = StObject.set(x, "onAfterOpen", js.undefined)
      
      inline def setOnChange(value: (/* inputValue */ String, /* userQuery */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnHighlight(value: /* suggestion */ Record[String, Any] => Unit): Self = StObject.set(x, "onHighlight", js.Any.fromFunction1(value))
      
      inline def setOnHighlightUndefined: Self = StObject.set(x, "onHighlight", js.undefined)
      
      inline def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      inline def setOnSelect(value: /* command */ Record[String, Any] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReactModalParentSelector(value: String): Self = StObject.set(x, "reactModalParentSelector", value.asInstanceOf[js.Any])
      
      inline def setReactModalParentSelectorUndefined: Self = StObject.set(x, "reactModalParentSelector", js.undefined)
      
      inline def setRenderCommand(value: /* command */ Command => ReactNode): Self = StObject.set(x, "renderCommand", js.Any.fromFunction1(value))
      
      inline def setRenderCommandNull: Self = StObject.set(x, "renderCommand", null)
      
      inline def setRenderCommandUndefined: Self = StObject.set(x, "renderCommand", js.undefined)
      
      inline def setResetInputOnOpen(value: Boolean): Self = StObject.set(x, "resetInputOnOpen", value.asInstanceOf[js.Any])
      
      inline def setResetInputOnOpenUndefined: Self = StObject.set(x, "resetInputOnOpen", js.undefined)
      
      inline def setShouldReturnFocusAfterClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusAfterClose", value.asInstanceOf[js.Any])
      
      inline def setShouldReturnFocusAfterCloseUndefined: Self = StObject.set(x, "shouldReturnFocusAfterClose", js.undefined)
      
      inline def setShowSpinnerOnSelect(value: Boolean): Self = StObject.set(x, "showSpinnerOnSelect", value.asInstanceOf[js.Any])
      
      inline def setShowSpinnerOnSelectUndefined: Self = StObject.set(x, "showSpinnerOnSelect", js.undefined)
      
      inline def setSpinner(value: ReactNode): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setTheme(value: Record[String, String]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTrigger(value: ReactNode): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
