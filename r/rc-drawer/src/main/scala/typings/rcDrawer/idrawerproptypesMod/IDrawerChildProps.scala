package typings.rcDrawer.idrawerproptypesMod

import typings.rcDrawer.AnonTarget
import typings.rcDrawer.rcDrawerBooleans.`false`
import typings.rcDrawer.rcDrawerStrings.`additions text`
import typings.rcDrawer.rcDrawerStrings.`inline`
import typings.rcDrawer.rcDrawerStrings.additions
import typings.rcDrawer.rcDrawerStrings.all
import typings.rcDrawer.rcDrawerStrings.ascending
import typings.rcDrawer.rcDrawerStrings.assertive
import typings.rcDrawer.rcDrawerStrings.both
import typings.rcDrawer.rcDrawerStrings.copy
import typings.rcDrawer.rcDrawerStrings.date
import typings.rcDrawer.rcDrawerStrings.decimal
import typings.rcDrawer.rcDrawerStrings.descending
import typings.rcDrawer.rcDrawerStrings.dialog
import typings.rcDrawer.rcDrawerStrings.email
import typings.rcDrawer.rcDrawerStrings.execute
import typings.rcDrawer.rcDrawerStrings.grammar
import typings.rcDrawer.rcDrawerStrings.grid
import typings.rcDrawer.rcDrawerStrings.horizontal
import typings.rcDrawer.rcDrawerStrings.inherit
import typings.rcDrawer.rcDrawerStrings.link
import typings.rcDrawer.rcDrawerStrings.list
import typings.rcDrawer.rcDrawerStrings.listbox
import typings.rcDrawer.rcDrawerStrings.location
import typings.rcDrawer.rcDrawerStrings.menu
import typings.rcDrawer.rcDrawerStrings.mixed
import typings.rcDrawer.rcDrawerStrings.move
import typings.rcDrawer.rcDrawerStrings.no
import typings.rcDrawer.rcDrawerStrings.none
import typings.rcDrawer.rcDrawerStrings.numeric
import typings.rcDrawer.rcDrawerStrings.off
import typings.rcDrawer.rcDrawerStrings.on
import typings.rcDrawer.rcDrawerStrings.other
import typings.rcDrawer.rcDrawerStrings.page
import typings.rcDrawer.rcDrawerStrings.polite
import typings.rcDrawer.rcDrawerStrings.popup
import typings.rcDrawer.rcDrawerStrings.removals
import typings.rcDrawer.rcDrawerStrings.search
import typings.rcDrawer.rcDrawerStrings.spelling
import typings.rcDrawer.rcDrawerStrings.step
import typings.rcDrawer.rcDrawerStrings.tel
import typings.rcDrawer.rcDrawerStrings.text
import typings.rcDrawer.rcDrawerStrings.time
import typings.rcDrawer.rcDrawerStrings.tree
import typings.rcDrawer.rcDrawerStrings.url
import typings.rcDrawer.rcDrawerStrings.vertical
import typings.rcDrawer.rcDrawerStrings.yes
import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawerChildProps extends IProps {
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var getOpenCount: js.UndefOr[js.Function0[Double]] = js.undefined
  var switchScrollingEffect: js.UndefOr[js.Function1[/* close */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IDrawerChildProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    afterVisibleChange: /* open */ Boolean => Unit = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    ease: String = null,
    getContainer: () => HTMLElement = null,
    getOpenCount: () => Double = null,
    handler: ReactElement | `false` = null,
    height: String | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    level: String | js.Array[String] = null,
    levelMove: ILevelMove | (js.Function1[/* e */ AnonTarget, ILevelMove]) = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    onAbort: SyntheticEvent[_, Event_] => Unit = null,
    onAnimationEnd: AnimationEvent[_] => Unit = null,
    onAnimationIteration: AnimationEvent[_] => Unit = null,
    onAnimationStart: AnimationEvent[_] => Unit = null,
    onAuxClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[_] => Unit = null,
    onBlur: FocusEvent[_] => Unit = null,
    onCanPlay: SyntheticEvent[_, Event_] => Unit = null,
    onCanPlayThrough: SyntheticEvent[_, Event_] => Unit = null,
    onChange: /* open */ js.UndefOr[Boolean] => Unit = null,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onClose: /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit = null,
    onCompositionEnd: CompositionEvent[_] => Unit = null,
    onCompositionStart: CompositionEvent[_] => Unit = null,
    onCompositionUpdate: CompositionEvent[_] => Unit = null,
    onContextMenu: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[_] => Unit = null,
    onCut: ClipboardEvent[_] => Unit = null,
    onDoubleClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[_] => Unit = null,
    onDragEnd: DragEvent[_] => Unit = null,
    onDragEnter: DragEvent[_] => Unit = null,
    onDragExit: DragEvent[_] => Unit = null,
    onDragLeave: DragEvent[_] => Unit = null,
    onDragOver: DragEvent[_] => Unit = null,
    onDragStart: DragEvent[_] => Unit = null,
    onDrop: DragEvent[_] => Unit = null,
    onDurationChange: SyntheticEvent[_, Event_] => Unit = null,
    onEmptied: SyntheticEvent[_, Event_] => Unit = null,
    onEncrypted: SyntheticEvent[_, Event_] => Unit = null,
    onEnded: SyntheticEvent[_, Event_] => Unit = null,
    onError: SyntheticEvent[_, Event_] => Unit = null,
    onFocus: FocusEvent[_] => Unit = null,
    onHandleClick: /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit = null,
    onInput: FormEvent[_] => Unit = null,
    onInvalid: FormEvent[_] => Unit = null,
    onKeyDown: KeyboardEvent[_] => Unit = null,
    onKeyPress: KeyboardEvent[_] => Unit = null,
    onKeyUp: KeyboardEvent[_] => Unit = null,
    onLoad: SyntheticEvent[_, Event_] => Unit = null,
    onLoadStart: SyntheticEvent[_, Event_] => Unit = null,
    onLoadedData: SyntheticEvent[_, Event_] => Unit = null,
    onLoadedMetadata: SyntheticEvent[_, Event_] => Unit = null,
    onMouseDown: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[_] => Unit = null,
    onPause: SyntheticEvent[_, Event_] => Unit = null,
    onPlay: SyntheticEvent[_, Event_] => Unit = null,
    onPlaying: SyntheticEvent[_, Event_] => Unit = null,
    onPointerCancel: PointerEvent[_] => Unit = null,
    onPointerDown: PointerEvent[_] => Unit = null,
    onPointerEnter: PointerEvent[_] => Unit = null,
    onPointerLeave: PointerEvent[_] => Unit = null,
    onPointerMove: PointerEvent[_] => Unit = null,
    onPointerOut: PointerEvent[_] => Unit = null,
    onPointerOver: PointerEvent[_] => Unit = null,
    onPointerUp: PointerEvent[_] => Unit = null,
    onProgress: SyntheticEvent[_, Event_] => Unit = null,
    onRateChange: SyntheticEvent[_, Event_] => Unit = null,
    onReset: FormEvent[_] => Unit = null,
    onScroll: UIEvent[_] => Unit = null,
    onSeeked: SyntheticEvent[_, Event_] => Unit = null,
    onSeeking: SyntheticEvent[_, Event_] => Unit = null,
    onSelect: SyntheticEvent[_, Event_] => Unit = null,
    onStalled: SyntheticEvent[_, Event_] => Unit = null,
    onSubmit: FormEvent[_] => Unit = null,
    onSuspend: SyntheticEvent[_, Event_] => Unit = null,
    onTimeUpdate: SyntheticEvent[_, Event_] => Unit = null,
    onTouchCancel: TouchEvent[_] => Unit = null,
    onTouchEnd: TouchEvent[_] => Unit = null,
    onTouchMove: TouchEvent[_] => Unit = null,
    onTouchStart: TouchEvent[_] => Unit = null,
    onTransitionEnd: TransitionEvent[_] => Unit = null,
    onVolumeChange: SyntheticEvent[_, Event_] => Unit = null,
    onWaiting: SyntheticEvent[_, Event_] => Unit = null,
    onWheel: WheelEvent[_] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    placement: IPlacement = null,
    prefix: String = null,
    prefixCls: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    showMask: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    switchScrollingEffect: /* close */ js.UndefOr[Boolean] => Unit = null,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null,
    width: String | Double = null
  ): IDrawerChildProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (getOpenCount != null) __obj.updateDynamic("getOpenCount")(js.Any.fromFunction0(getOpenCount))
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelMove != null) __obj.updateDynamic("levelMove")(levelMove.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onHandleClick != null) __obj.updateDynamic("onHandleClick")(js.Any.fromFunction1(onHandleClick))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(showMask)) __obj.updateDynamic("showMask")(showMask.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (switchScrollingEffect != null) __obj.updateDynamic("switchScrollingEffect")(js.Any.fromFunction1(switchScrollingEffect))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrawerChildProps]
  }
}

