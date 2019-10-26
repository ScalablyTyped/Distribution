package typings.reactDashMdl.reactDashMdlMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.CompositionEvent
import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.Key
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.UIEvent
import typings.react.reactMod.WheelEvent
import typings.reactDashMdl.Anon_Html
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderProps
  extends ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with MDLDOMAttributes[TableHeader] {
  var cellFormatter: js.UndefOr[
    js.Function3[/* value */ js.Any, /* row */ js.Any, /* index */ Double, ReactNode]
  ] = js.undefined
  var name: String
  var nosort: js.UndefOr[Boolean] = js.undefined
  var numeric: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[TableHeader, NativeMouseEvent], /* name */ String, _]
  ] = js.undefined
  var sortFn: js.UndefOr[js.Function3[/* a */ js.Any, /* b */ js.Any, /* isAsc */ Boolean, Double]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[ReactNode] = js.undefined
}

object TableHeaderProps {
  @scala.inline
  def apply(
    name: String,
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    async: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: js.UndefOr[Boolean] = js.undefined,
    cellFormatter: (/* value */ js.Any, /* row */ js.Any, /* index */ Double) => ReactNode = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    challenge: String = null,
    charSet: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    classID: String = null,
    className: String = null,
    colSpan: Int | Double = null,
    color: String = null,
    cols: Int | Double = null,
    content: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    coords: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    dateTime: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: Double | String | js.Array[String] = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    download: js.Any = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    encType: String = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    frameBorder: Double | String = null,
    headers: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    high: Int | Double = null,
    href: String = null,
    hrefLang: String = null,
    htmlFor: String = null,
    httpEquiv: String = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: String = null,
    integrity: String = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    key: Key = null,
    keyParams: String = null,
    keyType: String = null,
    kind: String = null,
    lang: String = null,
    list: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    low: Int | Double = null,
    manifest: String = null,
    marginHeight: Int | Double = null,
    marginWidth: Int | Double = null,
    max: Double | String = null,
    maxLength: Int | Double = null,
    media: String = null,
    mediaGroup: String = null,
    method: String = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    nosort: js.UndefOr[Boolean] = js.undefined,
    numeric: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[TableHeader, Event] => Unit = null,
    onBlur: FocusEvent[TableHeader] => Unit = null,
    onCanPlay: SyntheticEvent[TableHeader, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[TableHeader, Event] => Unit = null,
    onClick: (/* e */ MouseEvent[TableHeader, NativeMouseEvent], /* name */ String) => _ = null,
    onCompositionEnd: CompositionEvent[TableHeader] => Unit = null,
    onCompositionStart: CompositionEvent[TableHeader] => Unit = null,
    onCompositionUpdate: CompositionEvent[TableHeader] => Unit = null,
    onContextMenu: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[TableHeader] => Unit = null,
    onCut: ClipboardEvent[TableHeader] => Unit = null,
    onDoubleClick: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[TableHeader] => Unit = null,
    onDragEnd: DragEvent[TableHeader] => Unit = null,
    onDragEnter: DragEvent[TableHeader] => Unit = null,
    onDragExit: DragEvent[TableHeader] => Unit = null,
    onDragLeave: DragEvent[TableHeader] => Unit = null,
    onDragOver: DragEvent[TableHeader] => Unit = null,
    onDragStart: DragEvent[TableHeader] => Unit = null,
    onDrop: DragEvent[TableHeader] => Unit = null,
    onDurationChange: SyntheticEvent[TableHeader, Event] => Unit = null,
    onEmptied: SyntheticEvent[TableHeader, Event] => Unit = null,
    onEncrypted: SyntheticEvent[TableHeader, Event] => Unit = null,
    onEnded: SyntheticEvent[TableHeader, Event] => Unit = null,
    onError: SyntheticEvent[TableHeader, Event] => Unit = null,
    onFocus: FocusEvent[TableHeader] => Unit = null,
    onInput: FormEvent[TableHeader] => Unit = null,
    onKeyDown: KeyboardEvent[TableHeader] => Unit = null,
    onKeyPress: KeyboardEvent[TableHeader] => Unit = null,
    onKeyUp: KeyboardEvent[TableHeader] => Unit = null,
    onLoad: SyntheticEvent[TableHeader, Event] => Unit = null,
    onLoadStart: SyntheticEvent[TableHeader, Event] => Unit = null,
    onLoadedData: SyntheticEvent[TableHeader, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[TableHeader, Event] => Unit = null,
    onMouseDown: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[TableHeader, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[TableHeader] => Unit = null,
    onPause: SyntheticEvent[TableHeader, Event] => Unit = null,
    onPlay: SyntheticEvent[TableHeader, Event] => Unit = null,
    onPlaying: SyntheticEvent[TableHeader, Event] => Unit = null,
    onProgress: SyntheticEvent[TableHeader, Event] => Unit = null,
    onRateChange: SyntheticEvent[TableHeader, Event] => Unit = null,
    onScroll: UIEvent[TableHeader] => Unit = null,
    onSeeked: SyntheticEvent[TableHeader, Event] => Unit = null,
    onSeeking: SyntheticEvent[TableHeader, Event] => Unit = null,
    onSelect: SyntheticEvent[TableHeader, Event] => Unit = null,
    onStalled: SyntheticEvent[TableHeader, Event] => Unit = null,
    onSubmit: FormEvent[TableHeader] => Unit = null,
    onSuspend: SyntheticEvent[TableHeader, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[TableHeader, Event] => Unit = null,
    onTouchCancel: TouchEvent[TableHeader] => Unit = null,
    onTouchEnd: TouchEvent[TableHeader] => Unit = null,
    onTouchMove: TouchEvent[TableHeader] => Unit = null,
    onTouchStart: TouchEvent[TableHeader] => Unit = null,
    onVolumeChange: SyntheticEvent[TableHeader, Event] => Unit = null,
    onWaiting: SyntheticEvent[TableHeader, Event] => Unit = null,
    onWheel: WheelEvent[TableHeader] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    optimum: Int | Double = null,
    pattern: String = null,
    placeholder: String = null,
    poster: String = null,
    prefix: String = null,
    preload: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[js.Any] = null,
    rel: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    rowSpan: Int | Double = null,
    sandbox: String = null,
    scope: String = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    scrolling: String = null,
    seamless: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    shape: String = null,
    sizes: String = null,
    sortFn: (/* a */ js.Any, /* b */ js.Any, /* isAsc */ Boolean) => Double = null,
    span: Int | Double = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    srcDoc: String = null,
    srcLang: String = null,
    srcSet: String = null,
    start: Int | Double = null,
    step: Double | String = null,
    style: CSSProperties = null,
    summary: String = null,
    tabIndex: Int | Double = null,
    target: String = null,
    title: String = null,
    tooltip: ReactNode = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    useMap: String = null,
    vocab: String = null,
    width: Double | String = null,
    wmode: String = null,
    wrap: String = null
  ): TableHeaderProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (about != null) __obj.updateDynamic("about")(about)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen)
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave)
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (cellFormatter != null) __obj.updateDynamic("cellFormatter")(js.Any.fromFunction3(cellFormatter))
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge)
    if (charSet != null) __obj.updateDynamic("charSet")(charSet)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID)
    if (className != null) __obj.updateDynamic("className")(className)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (download != null) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (encType != null) __obj.updateDynamic("encType")(encType)
    if (form != null) __obj.updateDynamic("form")(form)
    if (formAction != null) __obj.updateDynamic("formAction")(formAction)
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType)
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod)
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate)
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget)
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang)
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inlist != null) __obj.updateDynamic("inlist")(inlist)
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (is != null) __obj.updateDynamic("is")(is)
    if (itemID != null) __obj.updateDynamic("itemID")(itemID)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams)
    if (keyType != null) __obj.updateDynamic("keyType")(keyType)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (list != null) __obj.updateDynamic("list")(list)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    if (marginHeight != null) __obj.updateDynamic("marginHeight")(marginHeight.asInstanceOf[js.Any])
    if (marginWidth != null) __obj.updateDynamic("marginWidth")(marginWidth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media)
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup)
    if (method != null) __obj.updateDynamic("method")(method)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
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
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
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
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
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
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (optimum != null) __obj.updateDynamic("optimum")(optimum.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (property != null) __obj.updateDynamic("property")(property)
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (role != null) __obj.updateDynamic("role")(role)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped)
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling)
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless)
    if (security != null) __obj.updateDynamic("security")(security)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (sortFn != null) __obj.updateDynamic("sortFn")(js.Any.fromFunction3(sortFn))
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcDoc != null) __obj.updateDynamic("srcDoc")(srcDoc)
    if (srcLang != null) __obj.updateDynamic("srcLang")(srcLang)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable)
    if (useMap != null) __obj.updateDynamic("useMap")(useMap)
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[TableHeaderProps]
  }
}

