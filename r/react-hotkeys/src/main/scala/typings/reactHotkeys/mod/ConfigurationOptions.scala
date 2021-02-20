package typings.reactHotkeys.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationOptions extends StObject {
  
  /**
    * Whether to allow combination submatches - e.g. if there is an action bound to
    * cmd, pressing shift+cmd will *not* trigger that action when
    * allowCombinationSubmatches is false.
    */
  var allowCombinationSubmatches: js.UndefOr[Boolean] = js.native
  
  /**
    * A mapping of custom key codes to key names that you can then use in your
    * key sequences
    */
  var customKeyCodes: js.UndefOr[NumberDictionary[String]] = js.native
  
  /**
    * The default component type to wrap HotKey components' children in, to provide
    * the required focus and keyboard event listening for HotKeys to function
    */
  var defaultComponent: js.UndefOr[ReactComponent] = js.native
  
  /**
    * The default key event key maps are bound to, if left unspecified
    */
  var defaultKeyEvent: js.UndefOr[KeyEventName] = js.native
  
  /**
    * The default tabIndex value passed to the wrapping component used to contain
    * HotKey components' children. -1 skips focusing the element when tabbing through
    * the DOM, but allows focusing programmatically.
    */
  var defaultTabIndex: js.UndefOr[TabIndex] = js.native
  
  /**
    * Whether to allow hard sequences, or the binding of handlers to actions that have
    * names that are valid key sequences, which implicitly define actions that are
    * triggered by that key sequence
    */
  var enableHardSequences: js.UndefOr[Boolean] = js.native
  
  /**
    * The function used to determine whether a key event should be ignored by React
    * Hotkeys. By default, keyboard events originating elements with a tag name in
    * ignoreTags, or a isContentEditable property of true, are ignored.
    */
  var ignoreEventsCondition: js.UndefOr[js.Function1[/* keyEvent */ KeyboardEvent, Boolean]] = js.native
  
  /**
    * Whether to ignore changes to keyMap and handlers props by default (this reduces
    * a significant amount of unnecessarily resetting internal state)
    */
  var ignoreKeymapAndHandlerChangesByDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to ignore repeated keyboard events when a key is being held down
    */
  var ignoreRepeatedEventsWhenKeyHeldDown: js.UndefOr[Boolean] = js.native
  
  /**
    * The HTML tags that React HotKeys should ignore key events from. This only works
    * if you are using the default ignoreEventsCondition function.
    */
  var ignoreTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The level of logging of its own behaviour React HotKeys should perform. Default
    * level is 'warn'.
    */
  var logLevel: js.UndefOr[String] = js.native
  
  /**
    * Whether React HotKeys should simulate keypress events for the keys that do not
    * natively emit them.
    */
  var simulateMissingKeyPressEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to call stopPropagation() on events after they are handled (preventing
    * the event from bubbling up any further, both within React Hotkeys and any other
    * event listeners bound in React).
    *
    * This does not affect the behaviour of React Hotkeys, but rather what happens to
    * the event once React Hotkeys is done with it (whether it's allowed to propagate
    * any further through the Render tree).
    */
  var stopEventPropagationAfterHandling: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to call stopPropagation() on events after they are ignored (preventing
    * the event from bubbling up any further, both within React Hotkeys and any other
    * event listeners bound in React).
    *
    * This does not affect the behaviour of React Hotkeys, but rather what happens to
    * the event once React Hotkeys is done with it (whether it's allowed to propagate
    * any further through the Render tree).
    */
  var stopEventPropagationAfterIgnoring: js.UndefOr[Boolean] = js.native
}
object ConfigurationOptions {
  
  @scala.inline
  def apply(): ConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptions]
  }
  
  @scala.inline
  implicit class ConfigurationOptionsMutableBuilder[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCombinationSubmatches(value: Boolean): Self = StObject.set(x, "allowCombinationSubmatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCombinationSubmatchesUndefined: Self = StObject.set(x, "allowCombinationSubmatches", js.undefined)
    
    @scala.inline
    def setCustomKeyCodes(value: NumberDictionary[String]): Self = StObject.set(x, "customKeyCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyCodesUndefined: Self = StObject.set(x, "customKeyCodes", js.undefined)
    
    @scala.inline
    def setDefaultComponent(value: ReactComponent): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultComponentUndefined: Self = StObject.set(x, "defaultComponent", js.undefined)
    
    @scala.inline
    def setDefaultKeyEvent(value: KeyEventName): Self = StObject.set(x, "defaultKeyEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultKeyEventUndefined: Self = StObject.set(x, "defaultKeyEvent", js.undefined)
    
    @scala.inline
    def setDefaultTabIndex(value: TabIndex): Self = StObject.set(x, "defaultTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTabIndexUndefined: Self = StObject.set(x, "defaultTabIndex", js.undefined)
    
    @scala.inline
    def setEnableHardSequences(value: Boolean): Self = StObject.set(x, "enableHardSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHardSequencesUndefined: Self = StObject.set(x, "enableHardSequences", js.undefined)
    
    @scala.inline
    def setIgnoreEventsCondition(value: /* keyEvent */ KeyboardEvent => Boolean): Self = StObject.set(x, "ignoreEventsCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreEventsConditionUndefined: Self = StObject.set(x, "ignoreEventsCondition", js.undefined)
    
    @scala.inline
    def setIgnoreKeymapAndHandlerChangesByDefault(value: Boolean): Self = StObject.set(x, "ignoreKeymapAndHandlerChangesByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreKeymapAndHandlerChangesByDefaultUndefined: Self = StObject.set(x, "ignoreKeymapAndHandlerChangesByDefault", js.undefined)
    
    @scala.inline
    def setIgnoreRepeatedEventsWhenKeyHeldDown(value: Boolean): Self = StObject.set(x, "ignoreRepeatedEventsWhenKeyHeldDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreRepeatedEventsWhenKeyHeldDownUndefined: Self = StObject.set(x, "ignoreRepeatedEventsWhenKeyHeldDown", js.undefined)
    
    @scala.inline
    def setIgnoreTags(value: js.Array[String]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTagsUndefined: Self = StObject.set(x, "ignoreTags", js.undefined)
    
    @scala.inline
    def setIgnoreTagsVarargs(value: String*): Self = StObject.set(x, "ignoreTags", js.Array(value :_*))
    
    @scala.inline
    def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setSimulateMissingKeyPressEvents(value: Boolean): Self = StObject.set(x, "simulateMissingKeyPressEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulateMissingKeyPressEventsUndefined: Self = StObject.set(x, "simulateMissingKeyPressEvents", js.undefined)
    
    @scala.inline
    def setStopEventPropagationAfterHandling(value: Boolean): Self = StObject.set(x, "stopEventPropagationAfterHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopEventPropagationAfterHandlingUndefined: Self = StObject.set(x, "stopEventPropagationAfterHandling", js.undefined)
    
    @scala.inline
    def setStopEventPropagationAfterIgnoring(value: Boolean): Self = StObject.set(x, "stopEventPropagationAfterIgnoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopEventPropagationAfterIgnoringUndefined: Self = StObject.set(x, "stopEventPropagationAfterIgnoring", js.undefined)
  }
}
