package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEventHandler
import typings.react.reactMod.CompositionEventHandler
import typings.react.reactMod.DragEventHandler
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEventHandler
import typings.react.reactMod.UIEventHandler
import typings.react.reactMod.WheelEventHandler
import typings.reactDashMdl.Anon_Html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends MDLHTMLAttributes
     with MDLDOMAttributes[Tabs] {
  var activeTab: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* tabId */ Double, _]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Tabs]] = js.undefined
  var tabBarProps: js.UndefOr[TabBarProps] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    about: String = null,
    accept: String = null,
    acceptCharset: String = null,
    accessKey: String = null,
    action: String = null,
    activeTab: Int | Double = null,
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
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onAbort: ReactEventHandler[Tabs] = null,
    onBlur: FocusEventHandler[Tabs] = null,
    onCanPlay: ReactEventHandler[Tabs] = null,
    onCanPlayThrough: ReactEventHandler[Tabs] = null,
    onChange: /* tabId */ Double => _ = null,
    onClick: MouseEventHandler[Tabs] = null,
    onCompositionEnd: CompositionEventHandler[Tabs] = null,
    onCompositionStart: CompositionEventHandler[Tabs] = null,
    onCompositionUpdate: CompositionEventHandler[Tabs] = null,
    onContextMenu: MouseEventHandler[Tabs] = null,
    onCopy: ClipboardEventHandler[Tabs] = null,
    onCut: ClipboardEventHandler[Tabs] = null,
    onDoubleClick: MouseEventHandler[Tabs] = null,
    onDrag: DragEventHandler[Tabs] = null,
    onDragEnd: DragEventHandler[Tabs] = null,
    onDragEnter: DragEventHandler[Tabs] = null,
    onDragExit: DragEventHandler[Tabs] = null,
    onDragLeave: DragEventHandler[Tabs] = null,
    onDragOver: DragEventHandler[Tabs] = null,
    onDragStart: DragEventHandler[Tabs] = null,
    onDrop: DragEventHandler[Tabs] = null,
    onDurationChange: ReactEventHandler[Tabs] = null,
    onEmptied: ReactEventHandler[Tabs] = null,
    onEncrypted: ReactEventHandler[Tabs] = null,
    onEnded: ReactEventHandler[Tabs] = null,
    onError: ReactEventHandler[Tabs] = null,
    onFocus: FocusEventHandler[Tabs] = null,
    onInput: FormEventHandler[Tabs] = null,
    onKeyDown: KeyboardEventHandler[Tabs] = null,
    onKeyPress: KeyboardEventHandler[Tabs] = null,
    onKeyUp: KeyboardEventHandler[Tabs] = null,
    onLoad: ReactEventHandler[Tabs] = null,
    onLoadStart: ReactEventHandler[Tabs] = null,
    onLoadedData: ReactEventHandler[Tabs] = null,
    onLoadedMetadata: ReactEventHandler[Tabs] = null,
    onMouseDown: MouseEventHandler[Tabs] = null,
    onMouseEnter: MouseEventHandler[Tabs] = null,
    onMouseLeave: MouseEventHandler[Tabs] = null,
    onMouseMove: MouseEventHandler[Tabs] = null,
    onMouseOut: MouseEventHandler[Tabs] = null,
    onMouseOver: MouseEventHandler[Tabs] = null,
    onMouseUp: MouseEventHandler[Tabs] = null,
    onPaste: ClipboardEventHandler[Tabs] = null,
    onPause: ReactEventHandler[Tabs] = null,
    onPlay: ReactEventHandler[Tabs] = null,
    onPlaying: ReactEventHandler[Tabs] = null,
    onProgress: ReactEventHandler[Tabs] = null,
    onRateChange: ReactEventHandler[Tabs] = null,
    onScroll: UIEventHandler[Tabs] = null,
    onSeeked: ReactEventHandler[Tabs] = null,
    onSeeking: ReactEventHandler[Tabs] = null,
    onSelect: ReactEventHandler[Tabs] = null,
    onStalled: ReactEventHandler[Tabs] = null,
    onSubmit: FormEventHandler[Tabs] = null,
    onSuspend: ReactEventHandler[Tabs] = null,
    onTimeUpdate: ReactEventHandler[Tabs] = null,
    onTouchCancel: TouchEventHandler[Tabs] = null,
    onTouchEnd: TouchEventHandler[Tabs] = null,
    onTouchMove: TouchEventHandler[Tabs] = null,
    onTouchStart: TouchEventHandler[Tabs] = null,
    onVolumeChange: ReactEventHandler[Tabs] = null,
    onWaiting: ReactEventHandler[Tabs] = null,
    onWheel: WheelEventHandler[Tabs] = null,
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
    tabBarProps: TabBarProps = null,
    tabIndex: Int | Double = null,
    target: String = null,
    title: String = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    useMap: String = null,
    vocab: String = null,
    width: Double | String = null,
    wmode: String = null,
    wrap: String = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (action != null) __obj.updateDynamic("action")(action)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
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
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay)
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange)
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied)
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted)
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData)
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked)
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend)
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange)
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting)
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel)
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
    if (tabBarProps != null) __obj.updateDynamic("tabBarProps")(tabBarProps)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable)
    if (useMap != null) __obj.updateDynamic("useMap")(useMap)
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[TabsProps]
  }
}

