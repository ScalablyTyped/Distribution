package typings.reactHotkeys.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOptions extends js.Object {
  /**
    * Whether to allow combination submatches - e.g. if there is an action bound to
    * cmd, pressing shift+cmd will *not* trigger that action when
    * allowCombinationSubmatches is false.
    */
  var allowCombinationSubmatches: js.UndefOr[Boolean] = js.undefined
  /**
    * A mapping of custom key codes to key names that you can then use in your
    * key sequences
    */
  var customKeyCodes: js.UndefOr[NumberDictionary[String]] = js.undefined
  /**
    * The default component type to wrap HotKey components' children in, to provide
    * the required focus and keyboard event listening for HotKeys to function
    */
  var defaultComponent: js.UndefOr[ReactComponent] = js.undefined
  /**
    * The default key event key maps are bound to, if left unspecified
    */
  var defaultKeyEvent: js.UndefOr[KeyEventName] = js.undefined
  /**
    * The default tabIndex value passed to the wrapping component used to contain
    * HotKey components' children. -1 skips focusing the element when tabbing through
    * the DOM, but allows focusing programmatically.
    */
  var defaultTabIndex: js.UndefOr[TabIndex] = js.undefined
  /**
    * Whether to allow hard sequences, or the binding of handlers to actions that have
    * names that are valid key sequences, which implicitly define actions that are
    * triggered by that key sequence
    */
  var enableHardSequences: js.UndefOr[Boolean] = js.undefined
  /**
    * The function used to determine whether a key event should be ignored by React
    * Hotkeys. By default, keyboard events originating elements with a tag name in
    * ignoreTags, or a isContentEditable property of true, are ignored.
    */
  var ignoreEventsCondition: js.UndefOr[js.Function1[/* keyEvent */ KeyboardEvent, Boolean]] = js.undefined
  /**
    * Whether to ignore changes to keyMap and handlers props by default (this reduces
    * a significant amount of unnecessarily resetting internal state)
    */
  var ignoreKeymapAndHandlerChangesByDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to ignore repeated keyboard events when a key is being held down
    */
  var ignoreRepeatedEventsWhenKeyHeldDown: js.UndefOr[Boolean] = js.undefined
  /**
    * The HTML tags that React HotKeys should ignore key events from. This only works
    * if you are using the default ignoreEventsCondition function.
    */
  var ignoreTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The level of logging of its own behaviour React HotKeys should perform. Default
    * level is 'warn'.
    */
  var logLevel: js.UndefOr[String] = js.undefined
  /**
    * Whether React HotKeys should simulate keypress events for the keys that do not
    * natively emit them.
    */
  var simulateMissingKeyPressEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to call stopPropagation() on events after they are handled (preventing
    * the event from bubbling up any further, both within React Hotkeys and any other
    * event listeners bound in React).
    *
    * This does not affect the behaviour of React Hotkeys, but rather what happens to
    * the event once React Hotkeys is done with it (whether it's allowed to propagate
    * any further through the Render tree).
    */
  var stopEventPropagationAfterHandling: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to call stopPropagation() on events after they are ignored (preventing
    * the event from bubbling up any further, both within React Hotkeys and any other
    * event listeners bound in React).
    *
    * This does not affect the behaviour of React Hotkeys, but rather what happens to
    * the event once React Hotkeys is done with it (whether it's allowed to propagate
    * any further through the Render tree).
    */
  var stopEventPropagationAfterIgnoring: js.UndefOr[Boolean] = js.undefined
}

object ConfigurationOptions {
  @scala.inline
  def apply(
    allowCombinationSubmatches: js.UndefOr[Boolean] = js.undefined,
    customKeyCodes: NumberDictionary[String] = null,
    defaultComponent: ReactComponent = null,
    defaultKeyEvent: KeyEventName = null,
    defaultTabIndex: TabIndex = null,
    enableHardSequences: js.UndefOr[Boolean] = js.undefined,
    ignoreEventsCondition: /* keyEvent */ KeyboardEvent => Boolean = null,
    ignoreKeymapAndHandlerChangesByDefault: js.UndefOr[Boolean] = js.undefined,
    ignoreRepeatedEventsWhenKeyHeldDown: js.UndefOr[Boolean] = js.undefined,
    ignoreTags: js.Array[String] = null,
    logLevel: String = null,
    simulateMissingKeyPressEvents: js.UndefOr[Boolean] = js.undefined,
    stopEventPropagationAfterHandling: js.UndefOr[Boolean] = js.undefined,
    stopEventPropagationAfterIgnoring: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCombinationSubmatches)) __obj.updateDynamic("allowCombinationSubmatches")(allowCombinationSubmatches.asInstanceOf[js.Any])
    if (customKeyCodes != null) __obj.updateDynamic("customKeyCodes")(customKeyCodes.asInstanceOf[js.Any])
    if (defaultComponent != null) __obj.updateDynamic("defaultComponent")(defaultComponent.asInstanceOf[js.Any])
    if (defaultKeyEvent != null) __obj.updateDynamic("defaultKeyEvent")(defaultKeyEvent.asInstanceOf[js.Any])
    if (defaultTabIndex != null) __obj.updateDynamic("defaultTabIndex")(defaultTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHardSequences)) __obj.updateDynamic("enableHardSequences")(enableHardSequences.asInstanceOf[js.Any])
    if (ignoreEventsCondition != null) __obj.updateDynamic("ignoreEventsCondition")(js.Any.fromFunction1(ignoreEventsCondition))
    if (!js.isUndefined(ignoreKeymapAndHandlerChangesByDefault)) __obj.updateDynamic("ignoreKeymapAndHandlerChangesByDefault")(ignoreKeymapAndHandlerChangesByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRepeatedEventsWhenKeyHeldDown)) __obj.updateDynamic("ignoreRepeatedEventsWhenKeyHeldDown")(ignoreRepeatedEventsWhenKeyHeldDown.asInstanceOf[js.Any])
    if (ignoreTags != null) __obj.updateDynamic("ignoreTags")(ignoreTags.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(simulateMissingKeyPressEvents)) __obj.updateDynamic("simulateMissingKeyPressEvents")(simulateMissingKeyPressEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEventPropagationAfterHandling)) __obj.updateDynamic("stopEventPropagationAfterHandling")(stopEventPropagationAfterHandling.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEventPropagationAfterIgnoring)) __obj.updateDynamic("stopEventPropagationAfterIgnoring")(stopEventPropagationAfterIgnoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptions]
  }
}

