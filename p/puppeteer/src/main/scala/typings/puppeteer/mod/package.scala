package typings.puppeteer.mod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteer.anon.PartialBrowserFetcherOpti
import typings.puppeteer.mod.^
import typings.std.Capitalize
import typings.std.Element
import typings.std.Lowercase
import typings.std.PromiseLike
import typings.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_INTERCEPT_RESOLUTION_PRIORITY: /* 0 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_INTERCEPT_RESOLUTION_PRIORITY").asInstanceOf[/* 0 */ Double]

inline def EVALUATION_SCRIPT_URL: /* "pptr://__puppeteer_evaluation_script__" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVALUATION_SCRIPT_URL").asInstanceOf[/* "pptr://__puppeteer_evaluation_script__" */ String]

inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]

inline def connect(options: ConnectOptions): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]

inline def createBrowserFetcher(options: PartialBrowserFetcherOpti): BrowserFetcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserFetcher")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserFetcher]

inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]

inline def defaultArgs(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")().asInstanceOf[js.Array[String]]
inline def defaultArgs(options: BrowserLaunchArgumentOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def executablePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("executablePath")().asInstanceOf[String]
inline def executablePath(channel: ChromeReleaseChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("executablePath")(channel.asInstanceOf[js.Any]).asInstanceOf[String]

inline def launch(): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[Browser]]
inline def launch(options: PuppeteerLaunchOptions): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]

inline def registerCustomQueryHandler(name: String, handler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

type Awaitable[T] = T | PromiseLike[T]

type EvaluateFunc[T /* <: js.Array[Any] */] = js.Function1[/* params */ InnerParams[T], Awaitable[Any]]

type EventType = String | js.Symbol

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Node ? puppeteer.puppeteer.ElementHandle<T> : puppeteer.puppeteer.JSHandle<T>
  }}}
  */
type HandleFor[T] = ElementHandle[T]

type HandleOr[T] = HandleFor[T] | JSHandle[T] | T

type Handler[T] = js.Function1[/* event */ js.UndefOr[T], Unit]

type InterceptResolutionStrategy = InterceptResolutionAction

/* Rewritten from type alias, can be one of: 
  - typings.puppeteer.puppeteerStrings.`0`
  - typings.puppeteer.puppeteerStrings.`1`
  - typings.puppeteer.puppeteerStrings.`2`
  - typings.puppeteer.puppeteerStrings.`3`
  - typings.puppeteer.puppeteerStrings.`4`
  - typings.puppeteer.puppeteerStrings.`5`
  - typings.puppeteer.puppeteerStrings.`6`
  - typings.puppeteer.puppeteerStrings.`7`
  - typings.puppeteer.puppeteerStrings.`8`
  - typings.puppeteer.puppeteerStrings.`9`
  - typings.puppeteer.puppeteerStrings.Power
  - typings.puppeteer.puppeteerStrings.Eject
  - typings.puppeteer.puppeteerStrings.Abort
  - typings.puppeteer.puppeteerStrings.Help
  - typings.puppeteer.puppeteerStrings.Backspace
  - typings.puppeteer.puppeteerStrings.Tab
  - typings.puppeteer.puppeteerStrings.Numpad5
  - typings.puppeteer.puppeteerStrings.NumpadEnter
  - typings.puppeteer.puppeteerStrings.Enter
  - typings.puppeteer.puppeteerStrings.Carriagereturn
  - typings.puppeteer.puppeteerStrings.Linefeed
  - typings.puppeteer.puppeteerStrings.ShiftLeft
  - typings.puppeteer.puppeteerStrings.ShiftRight
  - typings.puppeteer.puppeteerStrings.ControlLeft
  - typings.puppeteer.puppeteerStrings.ControlRight
  - typings.puppeteer.puppeteerStrings.AltLeft
  - typings.puppeteer.puppeteerStrings.AltRight
  - typings.puppeteer.puppeteerStrings.Pause
  - typings.puppeteer.puppeteerStrings.CapsLock
  - typings.puppeteer.puppeteerStrings.Escape
  - typings.puppeteer.puppeteerStrings.Convert
  - typings.puppeteer.puppeteerStrings.NonConvert
  - typings.puppeteer.puppeteerStrings.Space
  - typings.puppeteer.puppeteerStrings.Numpad9
  - typings.puppeteer.puppeteerStrings.PageUp
  - typings.puppeteer.puppeteerStrings.Numpad3
  - typings.puppeteer.puppeteerStrings.PageDown
  - typings.puppeteer.puppeteerStrings.End
  - typings.puppeteer.puppeteerStrings.Numpad1
  - typings.puppeteer.puppeteerStrings.Home
  - typings.puppeteer.puppeteerStrings.Numpad7
  - typings.puppeteer.puppeteerStrings.ArrowLeft
  - typings.puppeteer.puppeteerStrings.Numpad4
  - typings.puppeteer.puppeteerStrings.Numpad8
  - typings.puppeteer.puppeteerStrings.ArrowUp
  - typings.puppeteer.puppeteerStrings.ArrowRight
  - typings.puppeteer.puppeteerStrings.Numpad6
  - typings.puppeteer.puppeteerStrings.Numpad2
  - typings.puppeteer.puppeteerStrings.ArrowDown
  - typings.puppeteer.puppeteerStrings.Select
  - typings.puppeteer.puppeteerStrings.Open
  - typings.puppeteer.puppeteerStrings.PrintScreen
  - typings.puppeteer.puppeteerStrings.Insert
  - typings.puppeteer.puppeteerStrings.Numpad0
  - typings.puppeteer.puppeteerStrings.Delete
  - typings.puppeteer.puppeteerStrings.NumpadDecimal
  - typings.puppeteer.puppeteerStrings.Digit0
  - typings.puppeteer.puppeteerStrings.Digit1
  - typings.puppeteer.puppeteerStrings.Digit2
  - typings.puppeteer.puppeteerStrings.Digit3
  - typings.puppeteer.puppeteerStrings.Digit4
  - typings.puppeteer.puppeteerStrings.Digit5
  - typings.puppeteer.puppeteerStrings.Digit6
  - typings.puppeteer.puppeteerStrings.Digit7
  - typings.puppeteer.puppeteerStrings.Digit8
  - typings.puppeteer.puppeteerStrings.Digit9
  - typings.puppeteer.puppeteerStrings.KeyA
  - typings.puppeteer.puppeteerStrings.KeyB
  - typings.puppeteer.puppeteerStrings.KeyC
  - typings.puppeteer.puppeteerStrings.KeyD
  - typings.puppeteer.puppeteerStrings.KeyE
  - typings.puppeteer.puppeteerStrings.KeyF
  - typings.puppeteer.puppeteerStrings.KeyG
  - typings.puppeteer.puppeteerStrings.KeyH
  - typings.puppeteer.puppeteerStrings.KeyI
  - typings.puppeteer.puppeteerStrings.KeyJ
  - typings.puppeteer.puppeteerStrings.KeyK
  - typings.puppeteer.puppeteerStrings.KeyL
  - typings.puppeteer.puppeteerStrings.KeyM
  - typings.puppeteer.puppeteerStrings.KeyN
  - typings.puppeteer.puppeteerStrings.KeyO
  - typings.puppeteer.puppeteerStrings.KeyP
  - typings.puppeteer.puppeteerStrings.KeyQ
  - typings.puppeteer.puppeteerStrings.KeyR
  - typings.puppeteer.puppeteerStrings.KeyS
  - typings.puppeteer.puppeteerStrings.KeyT
  - typings.puppeteer.puppeteerStrings.KeyU
  - typings.puppeteer.puppeteerStrings.KeyV
  - typings.puppeteer.puppeteerStrings.KeyW
  - typings.puppeteer.puppeteerStrings.KeyX
  - typings.puppeteer.puppeteerStrings.KeyY
  - typings.puppeteer.puppeteerStrings.KeyZ
  - typings.puppeteer.puppeteerStrings.MetaLeft
  - typings.puppeteer.puppeteerStrings.MetaRight
  - typings.puppeteer.puppeteerStrings.ContextMenu
  - typings.puppeteer.puppeteerStrings.NumpadMultiply
  - typings.puppeteer.puppeteerStrings.NumpadAdd
  - typings.puppeteer.puppeteerStrings.NumpadSubtract
  - typings.puppeteer.puppeteerStrings.NumpadDivide
  - typings.puppeteer.puppeteerStrings.F1
  - typings.puppeteer.puppeteerStrings.F2
  - typings.puppeteer.puppeteerStrings.F3
  - typings.puppeteer.puppeteerStrings.F4
  - typings.puppeteer.puppeteerStrings.F5
  - typings.puppeteer.puppeteerStrings.F6
  - typings.puppeteer.puppeteerStrings.F7
  - typings.puppeteer.puppeteerStrings.F8
  - typings.puppeteer.puppeteerStrings.F9
  - typings.puppeteer.puppeteerStrings.F10
  - typings.puppeteer.puppeteerStrings.F11
  - typings.puppeteer.puppeteerStrings.F12
  - typings.puppeteer.puppeteerStrings.F13
  - typings.puppeteer.puppeteerStrings.F14
  - typings.puppeteer.puppeteerStrings.F15
  - typings.puppeteer.puppeteerStrings.F16
  - typings.puppeteer.puppeteerStrings.F17
  - typings.puppeteer.puppeteerStrings.F18
  - typings.puppeteer.puppeteerStrings.F19
  - typings.puppeteer.puppeteerStrings.F20
  - typings.puppeteer.puppeteerStrings.F21
  - typings.puppeteer.puppeteerStrings.F22
  - typings.puppeteer.puppeteerStrings.F23
  - typings.puppeteer.puppeteerStrings.F24
  - typings.puppeteer.puppeteerStrings.NumLock
  - typings.puppeteer.puppeteerStrings.ScrollLock
  - typings.puppeteer.puppeteerStrings.AudioVolumeMute
  - typings.puppeteer.puppeteerStrings.AudioVolumeDown
  - typings.puppeteer.puppeteerStrings.AudioVolumeUp
  - typings.puppeteer.puppeteerStrings.MediaTrackNext
  - typings.puppeteer.puppeteerStrings.MediaTrackPrevious
  - typings.puppeteer.puppeteerStrings.MediaStop
  - typings.puppeteer.puppeteerStrings.MediaPlayPause
  - typings.puppeteer.puppeteerStrings.Semicolon
  - typings.puppeteer.puppeteerStrings.Equal
  - typings.puppeteer.puppeteerStrings.NumpadEqual
  - typings.puppeteer.puppeteerStrings.Comma
  - typings.puppeteer.puppeteerStrings.Minus
  - typings.puppeteer.puppeteerStrings.Period
  - typings.puppeteer.puppeteerStrings.Slash
  - typings.puppeteer.puppeteerStrings.Backquote
  - typings.puppeteer.puppeteerStrings.BracketLeft
  - typings.puppeteer.puppeteerStrings.Backslash
  - typings.puppeteer.puppeteerStrings.BracketRight
  - typings.puppeteer.puppeteerStrings.Quote
  - typings.puppeteer.puppeteerStrings.AltGraph
  - typings.puppeteer.puppeteerStrings.Props
  - typings.puppeteer.puppeteerStrings.Cancel
  - typings.puppeteer.puppeteerStrings.Clear
  - typings.puppeteer.puppeteerStrings.Shift
  - typings.puppeteer.puppeteerStrings.Control
  - typings.puppeteer.puppeteerStrings.Alt
  - typings.puppeteer.puppeteerStrings.Accept
  - typings.puppeteer.puppeteerStrings.ModeChange
  - typings.puppeteer.puppeteerStrings.Space
  - typings.puppeteer.puppeteerStrings.Print
  - typings.puppeteer.puppeteerStrings.Execute
  - typings.puppeteer.puppeteerStrings.Null
  - typings.puppeteer.puppeteerStrings.a_
  - typings.puppeteer.puppeteerStrings.b_
  - typings.puppeteer.puppeteerStrings.c_
  - typings.puppeteer.puppeteerStrings.d_
  - typings.puppeteer.puppeteerStrings.e_
  - typings.puppeteer.puppeteerStrings.f_
  - typings.puppeteer.puppeteerStrings.g_
  - typings.puppeteer.puppeteerStrings.h_
  - typings.puppeteer.puppeteerStrings.i_
  - typings.puppeteer.puppeteerStrings.j_
  - typings.puppeteer.puppeteerStrings.k_
  - typings.puppeteer.puppeteerStrings.l_
  - typings.puppeteer.puppeteerStrings.m_
  - typings.puppeteer.puppeteerStrings.n_
  - typings.puppeteer.puppeteerStrings.o_
  - typings.puppeteer.puppeteerStrings.p_
  - typings.puppeteer.puppeteerStrings.q_
  - typings.puppeteer.puppeteerStrings.r_
  - typings.puppeteer.puppeteerStrings.s_
  - typings.puppeteer.puppeteerStrings.t_
  - typings.puppeteer.puppeteerStrings.u_
  - typings.puppeteer.puppeteerStrings.v_
  - typings.puppeteer.puppeteerStrings.w_
  - typings.puppeteer.puppeteerStrings.x_
  - typings.puppeteer.puppeteerStrings.y_
  - typings.puppeteer.puppeteerStrings.z_
  - typings.puppeteer.puppeteerStrings.Meta
  - typings.puppeteer.puppeteerStrings.Asterisk
  - typings.puppeteer.puppeteerStrings.Plussign
  - typings.puppeteer.puppeteerStrings.`-_`
  - typings.puppeteer.puppeteerStrings.Slash
  - typings.puppeteer.puppeteerStrings.Semicolon
  - typings.puppeteer.puppeteerStrings.Equalssign
  - typings.puppeteer.puppeteerStrings.Comma
  - typings.puppeteer.puppeteerStrings.Dot
  - typings.puppeteer.puppeteerStrings.Graveaccent
  - typings.puppeteer.puppeteerStrings.`[`
  - / * \ * / java.lang.String
  - typings.puppeteer.puppeteerStrings.`]`
  - typings.puppeteer.puppeteerStrings.Attn
  - typings.puppeteer.puppeteerStrings.CrSel
  - typings.puppeteer.puppeteerStrings.ExSel
  - typings.puppeteer.puppeteerStrings.EraseEof
  - typings.puppeteer.puppeteerStrings.Play
  - typings.puppeteer.puppeteerStrings.ZoomOut
  - typings.puppeteer.puppeteerStrings.Exclamationmark
  - typings.puppeteer.puppeteerStrings.`@`
  - typings.puppeteer.puppeteerStrings.Numbersign
  - typings.puppeteer.puppeteerStrings.$
  - typings.puppeteer.puppeteerStrings.Percentsign
  - typings.puppeteer.puppeteerStrings.^
  - typings.puppeteer.puppeteerStrings.Ampersand
  - typings.puppeteer.puppeteerStrings.A
  - typings.puppeteer.puppeteerStrings.B
  - typings.puppeteer.puppeteerStrings.C
  - typings.puppeteer.puppeteerStrings.D
  - typings.puppeteer.puppeteerStrings.E
  - typings.puppeteer.puppeteerStrings.F
  - typings.puppeteer.puppeteerStrings.G
  - typings.puppeteer.puppeteerStrings.H
  - typings.puppeteer.puppeteerStrings.I
  - typings.puppeteer.puppeteerStrings.J
  - typings.puppeteer.puppeteerStrings.K
  - typings.puppeteer.puppeteerStrings.L
  - typings.puppeteer.puppeteerStrings.M
  - typings.puppeteer.puppeteerStrings.N
  - typings.puppeteer.puppeteerStrings.O
  - typings.puppeteer.puppeteerStrings.P
  - typings.puppeteer.puppeteerStrings.Q
  - typings.puppeteer.puppeteerStrings.R
  - typings.puppeteer.puppeteerStrings.S
  - typings.puppeteer.puppeteerStrings.T
  - typings.puppeteer.puppeteerStrings.U
  - typings.puppeteer.puppeteerStrings.V
  - typings.puppeteer.puppeteerStrings.W
  - typings.puppeteer.puppeteerStrings.X
  - typings.puppeteer.puppeteerStrings.Y
  - typings.puppeteer.puppeteerStrings.Z
  - typings.puppeteer.puppeteerStrings.Colon
  - typings.puppeteer.puppeteerStrings.Lessthansign
  - typings.puppeteer.puppeteerStrings._underscore
  - typings.puppeteer.puppeteerStrings.Greaterthansign
  - typings.puppeteer.puppeteerStrings.Questionmark
  - typings.puppeteer.puppeteerStrings.Tilde
  - typings.puppeteer.puppeteerStrings.Leftcurlybracket
  - typings.puppeteer.puppeteerStrings.Verticalline
  - typings.puppeteer.puppeteerStrings.Rightcurlybracket
  - typings.puppeteer.puppeteerStrings.Quotationmark
  - typings.puppeteer.puppeteerStrings.SoftLeft
  - typings.puppeteer.puppeteerStrings.SoftRight
  - typings.puppeteer.puppeteerStrings.Camera
  - typings.puppeteer.puppeteerStrings.Call
  - typings.puppeteer.puppeteerStrings.EndCall
  - typings.puppeteer.puppeteerStrings.VolumeDown
  - typings.puppeteer.puppeteerStrings.VolumeUp
*/
type KeyInput = _KeyInput | (/* \ */ String)

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Selector extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[Selector] : Selector extends 'a' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'script' | 'set' | 'stop' | 'style' | 'svg' | 'switch' | 'symbol' | 'text' | 'textPath' | 'title' | 'tspan' | 'use' | 'view' ? std.SVGElementTagNameMap[Selector] : std.Element
  }}}
  */
type NodeFor[Selector /* <: String */] = Element

type PaperFormat = Uppercase[LowerCasePaperFormat] | Capitalize[LowerCasePaperFormat] | LowerCasePaperFormat

type ResourceType = Lowercase[typings.devtoolsProtocol.mod.Protocol.Network.ResourceType]

type TargetFilterCallback = js.Function1[/* target */ TargetInfo, Boolean]
