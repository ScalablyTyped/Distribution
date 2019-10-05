package typings.reactDashVirtualDashKeyboard.reactDashVirtualDashKeyboardMod

import typings.std.Element
import typings.std.Event
import typings.std.RegExp
import typings.virtualDashKeyboard.virtualDashKeyboardMod.CustomLayout
import typings.virtualDashKeyboard.virtualDashKeyboardMod.KeyboardOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactKeyboardOptions extends KeyboardOptions {
  @JSName("accepted")
  var accepted_ReactKeyboardOptions: js.UndefOr[scala.Nothing] = js.undefined
}

object ReactKeyboardOptions {
  @scala.inline
  def apply(
    `type`: String,
    acceptValid: js.UndefOr[Boolean] = js.undefined,
    accepted: js.UndefOr[scala.Nothing] = js.undefined,
    alwaysOpen: js.UndefOr[Boolean] = js.undefined,
    appendLocally: js.UndefOr[Boolean] = js.undefined,
    appendTo: String | js.Object = null,
    autoAccept: js.UndefOr[Boolean] = js.undefined,
    autoAcceptOnEsc: js.UndefOr[Boolean] = js.undefined,
    autoAcceptOnValid: js.UndefOr[Boolean] = js.undefined,
    beforeClose: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    beforeInsert: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    beforeVisible: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    buildKey: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    cancelClose: js.UndefOr[Boolean] = js.undefined,
    canceled: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    caretToEnd: js.UndefOr[Boolean] = js.undefined,
    change: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    `class`: String = null,
    closeByClickEvent: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    comboRegex: RegExp = null,
    combos: js.Object = null,
    css: js.Object = null,
    customLayout: CustomLayout = null,
    display: js.Object = null,
    enterMod: String = null,
    enterNavigation: js.UndefOr[Boolean] = js.undefined,
    hidden: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    ignoreEsc: js.UndefOr[Boolean] = js.undefined,
    initialFocus: js.UndefOr[Boolean] = js.undefined,
    initialized: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    keyBinding: String = null,
    language: String | js.Array[String] = null,
    layout: String = null,
    lockInput: js.UndefOr[Boolean] = js.undefined,
    maxInsert: js.UndefOr[Boolean] = js.undefined,
    maxLength: Boolean | Double = null,
    noFocus: js.UndefOr[Boolean] = js.undefined,
    openOn: String = null,
    position: Boolean | js.Object = null,
    preventPaste: String = null,
    repeatDelay: Int | Double = null,
    repeatRate: Int | Double = null,
    reposition: js.UndefOr[Boolean] = js.undefined,
    resetDefault: js.UndefOr[Boolean] = js.undefined,
    restrictInclude: String = null,
    restrictInput: js.UndefOr[Boolean] = js.undefined,
    restricted: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    scrollAdjustment: Double | String = null,
    stayOpen: js.UndefOr[Boolean] = js.undefined,
    stickyShift: js.UndefOr[Boolean] = js.undefined,
    stopAtEnd: js.UndefOr[Boolean] = js.undefined,
    switchInput: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    tabNavigation: js.UndefOr[Boolean] = js.undefined,
    updateOnChange: js.UndefOr[Boolean] = js.undefined,
    useCombos: js.UndefOr[Boolean] = js.undefined,
    usePreview: js.UndefOr[Boolean] = js.undefined,
    useWheel: js.UndefOr[Boolean] = js.undefined,
    userClosed: js.UndefOr[Boolean] = js.undefined,
    validate: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    visible: (/* event */ js.UndefOr[Event | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit = null,
    wheelMessage: String = null
  ): ReactKeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(acceptValid)) __obj.updateDynamic("acceptValid")(acceptValid)
    if (!js.isUndefined(accepted)) __obj.updateDynamic("accepted")(accepted)
    if (!js.isUndefined(alwaysOpen)) __obj.updateDynamic("alwaysOpen")(alwaysOpen)
    if (!js.isUndefined(appendLocally)) __obj.updateDynamic("appendLocally")(appendLocally)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAccept)) __obj.updateDynamic("autoAccept")(autoAccept)
    if (!js.isUndefined(autoAcceptOnEsc)) __obj.updateDynamic("autoAcceptOnEsc")(autoAcceptOnEsc)
    if (!js.isUndefined(autoAcceptOnValid)) __obj.updateDynamic("autoAcceptOnValid")(autoAcceptOnValid)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction3(beforeClose))
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction3(beforeInsert))
    if (beforeVisible != null) __obj.updateDynamic("beforeVisible")(js.Any.fromFunction3(beforeVisible))
    if (buildKey != null) __obj.updateDynamic("buildKey")(js.Any.fromFunction3(buildKey))
    if (!js.isUndefined(cancelClose)) __obj.updateDynamic("cancelClose")(cancelClose)
    if (canceled != null) __obj.updateDynamic("canceled")(js.Any.fromFunction3(canceled))
    if (!js.isUndefined(caretToEnd)) __obj.updateDynamic("caretToEnd")(caretToEnd)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction3(change))
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(closeByClickEvent)) __obj.updateDynamic("closeByClickEvent")(closeByClickEvent)
    if (color != null) __obj.updateDynamic("color")(color)
    if (comboRegex != null) __obj.updateDynamic("comboRegex")(comboRegex)
    if (combos != null) __obj.updateDynamic("combos")(combos)
    if (css != null) __obj.updateDynamic("css")(css)
    if (customLayout != null) __obj.updateDynamic("customLayout")(customLayout)
    if (display != null) __obj.updateDynamic("display")(display)
    if (enterMod != null) __obj.updateDynamic("enterMod")(enterMod)
    if (!js.isUndefined(enterNavigation)) __obj.updateDynamic("enterNavigation")(enterNavigation)
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction3(hidden))
    if (!js.isUndefined(ignoreEsc)) __obj.updateDynamic("ignoreEsc")(ignoreEsc)
    if (!js.isUndefined(initialFocus)) __obj.updateDynamic("initialFocus")(initialFocus)
    if (initialized != null) __obj.updateDynamic("initialized")(js.Any.fromFunction3(initialized))
    if (keyBinding != null) __obj.updateDynamic("keyBinding")(keyBinding)
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (!js.isUndefined(lockInput)) __obj.updateDynamic("lockInput")(lockInput)
    if (!js.isUndefined(maxInsert)) __obj.updateDynamic("maxInsert")(maxInsert)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(noFocus)) __obj.updateDynamic("noFocus")(noFocus)
    if (openOn != null) __obj.updateDynamic("openOn")(openOn)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (preventPaste != null) __obj.updateDynamic("preventPaste")(preventPaste)
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (repeatRate != null) __obj.updateDynamic("repeatRate")(repeatRate.asInstanceOf[js.Any])
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition)
    if (!js.isUndefined(resetDefault)) __obj.updateDynamic("resetDefault")(resetDefault)
    if (restrictInclude != null) __obj.updateDynamic("restrictInclude")(restrictInclude)
    if (!js.isUndefined(restrictInput)) __obj.updateDynamic("restrictInput")(restrictInput)
    if (restricted != null) __obj.updateDynamic("restricted")(js.Any.fromFunction3(restricted))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (scrollAdjustment != null) __obj.updateDynamic("scrollAdjustment")(scrollAdjustment.asInstanceOf[js.Any])
    if (!js.isUndefined(stayOpen)) __obj.updateDynamic("stayOpen")(stayOpen)
    if (!js.isUndefined(stickyShift)) __obj.updateDynamic("stickyShift")(stickyShift)
    if (!js.isUndefined(stopAtEnd)) __obj.updateDynamic("stopAtEnd")(stopAtEnd)
    if (switchInput != null) __obj.updateDynamic("switchInput")(js.Any.fromFunction3(switchInput))
    if (!js.isUndefined(tabNavigation)) __obj.updateDynamic("tabNavigation")(tabNavigation)
    if (!js.isUndefined(updateOnChange)) __obj.updateDynamic("updateOnChange")(updateOnChange)
    if (!js.isUndefined(useCombos)) __obj.updateDynamic("useCombos")(useCombos)
    if (!js.isUndefined(usePreview)) __obj.updateDynamic("usePreview")(usePreview)
    if (!js.isUndefined(useWheel)) __obj.updateDynamic("useWheel")(useWheel)
    if (!js.isUndefined(userClosed)) __obj.updateDynamic("userClosed")(userClosed)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction3(validate))
    if (visible != null) __obj.updateDynamic("visible")(js.Any.fromFunction3(visible))
    if (wheelMessage != null) __obj.updateDynamic("wheelMessage")(wheelMessage)
    __obj.asInstanceOf[ReactKeyboardOptions]
  }
}

