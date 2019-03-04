package typings
package reactDashVirtualDashKeyboardLib.reactDashVirtualDashKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactKeyboardOptions
  extends virtualDashKeyboardLib.virtualDashKeyboardMod.KeyboardOptions {
  @JSName("accepted")
  var accepted_ReactKeyboardOptions: js.UndefOr[scala.Nothing] = js.undefined
}

object ReactKeyboardOptions {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    acceptValid: js.UndefOr[scala.Boolean] = js.undefined,
    accepted: js.UndefOr[scala.Nothing] = js.undefined,
    alwaysOpen: js.UndefOr[scala.Boolean] = js.undefined,
    appendLocally: js.UndefOr[scala.Boolean] = js.undefined,
    appendTo: java.lang.String | js.Object = null,
    autoAccept: js.UndefOr[scala.Boolean] = js.undefined,
    autoAcceptOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    autoAcceptOnValid: js.UndefOr[scala.Boolean] = js.undefined,
    beforeClose: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    beforeInsert: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    beforeVisible: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    buildKey: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    cancelClose: js.UndefOr[scala.Boolean] = js.undefined,
    canceled: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    caretToEnd: js.UndefOr[scala.Boolean] = js.undefined,
    change: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    `class`: java.lang.String = null,
    closeByClickEvent: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    comboRegex: stdLib.RegExp = null,
    combos: js.Object = null,
    css: js.Object = null,
    customLayout: virtualDashKeyboardLib.virtualDashKeyboardMod.CustomLayout = null,
    display: js.Object = null,
    enterMod: java.lang.String = null,
    enterNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    ignoreEsc: js.UndefOr[scala.Boolean] = js.undefined,
    initialFocus: js.UndefOr[scala.Boolean] = js.undefined,
    initialized: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    keyBinding: java.lang.String = null,
    language: java.lang.String | js.Array[java.lang.String] = null,
    layout: java.lang.String = null,
    lockInput: js.UndefOr[scala.Boolean] = js.undefined,
    maxInsert: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Boolean | scala.Double = null,
    noFocus: js.UndefOr[scala.Boolean] = js.undefined,
    openOn: java.lang.String = null,
    position: scala.Boolean | js.Object = null,
    preventPaste: java.lang.String = null,
    repeatDelay: scala.Int | scala.Double = null,
    repeatRate: scala.Int | scala.Double = null,
    reposition: js.UndefOr[scala.Boolean] = js.undefined,
    resetDefault: js.UndefOr[scala.Boolean] = js.undefined,
    restrictInclude: java.lang.String = null,
    restrictInput: js.UndefOr[scala.Boolean] = js.undefined,
    restricted: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    scrollAdjustment: scala.Double | java.lang.String = null,
    stayOpen: js.UndefOr[scala.Boolean] = js.undefined,
    stickyShift: js.UndefOr[scala.Boolean] = js.undefined,
    stopAtEnd: js.UndefOr[scala.Boolean] = js.undefined,
    switchInput: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    tabNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    updateOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    useCombos: js.UndefOr[scala.Boolean] = js.undefined,
    usePreview: js.UndefOr[scala.Boolean] = js.undefined,
    useWheel: js.UndefOr[scala.Boolean] = js.undefined,
    userClosed: js.UndefOr[scala.Boolean] = js.undefined,
    validate: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    visible: virtualDashKeyboardLib.virtualDashKeyboardMod.kbEventHandler = null,
    wheelMessage: java.lang.String = null
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
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(beforeInsert)
    if (beforeVisible != null) __obj.updateDynamic("beforeVisible")(beforeVisible)
    if (buildKey != null) __obj.updateDynamic("buildKey")(buildKey)
    if (!js.isUndefined(cancelClose)) __obj.updateDynamic("cancelClose")(cancelClose)
    if (canceled != null) __obj.updateDynamic("canceled")(canceled)
    if (!js.isUndefined(caretToEnd)) __obj.updateDynamic("caretToEnd")(caretToEnd)
    if (change != null) __obj.updateDynamic("change")(change)
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
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(ignoreEsc)) __obj.updateDynamic("ignoreEsc")(ignoreEsc)
    if (!js.isUndefined(initialFocus)) __obj.updateDynamic("initialFocus")(initialFocus)
    if (initialized != null) __obj.updateDynamic("initialized")(initialized)
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
    if (restricted != null) __obj.updateDynamic("restricted")(restricted)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (scrollAdjustment != null) __obj.updateDynamic("scrollAdjustment")(scrollAdjustment.asInstanceOf[js.Any])
    if (!js.isUndefined(stayOpen)) __obj.updateDynamic("stayOpen")(stayOpen)
    if (!js.isUndefined(stickyShift)) __obj.updateDynamic("stickyShift")(stickyShift)
    if (!js.isUndefined(stopAtEnd)) __obj.updateDynamic("stopAtEnd")(stopAtEnd)
    if (switchInput != null) __obj.updateDynamic("switchInput")(switchInput)
    if (!js.isUndefined(tabNavigation)) __obj.updateDynamic("tabNavigation")(tabNavigation)
    if (!js.isUndefined(updateOnChange)) __obj.updateDynamic("updateOnChange")(updateOnChange)
    if (!js.isUndefined(useCombos)) __obj.updateDynamic("useCombos")(useCombos)
    if (!js.isUndefined(usePreview)) __obj.updateDynamic("usePreview")(usePreview)
    if (!js.isUndefined(useWheel)) __obj.updateDynamic("useWheel")(useWheel)
    if (!js.isUndefined(userClosed)) __obj.updateDynamic("userClosed")(userClosed)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (visible != null) __obj.updateDynamic("visible")(visible)
    if (wheelMessage != null) __obj.updateDynamic("wheelMessage")(wheelMessage)
    __obj.asInstanceOf[ReactKeyboardOptions]
  }
}

