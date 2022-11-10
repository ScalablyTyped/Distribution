package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.anon.PartialBrowserFetcherOptiPath
import typings.puppeteerCore.mod.^
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

inline def createBrowserFetcher(options: PartialBrowserFetcherOptiPath): BrowserFetcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserFetcher")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserFetcher]

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
  T extends std.Node ? puppeteer-core.puppeteer-core.ElementHandle<T> : puppeteer-core.puppeteer-core.JSHandle<T>
  }}}
  */
type HandleFor[T] = ElementHandle[T]

type HandleOr[T] = HandleFor[T] | JSHandle[T] | T

type Handler[T] = js.Function1[/* event */ js.UndefOr[T], Unit]

type InterceptResolutionStrategy = InterceptResolutionAction

/* Rewritten from type alias, can be one of: 
  - typings.puppeteerCore.puppeteerCoreStrings.`0`
  - typings.puppeteerCore.puppeteerCoreStrings.`1`
  - typings.puppeteerCore.puppeteerCoreStrings.`2`
  - typings.puppeteerCore.puppeteerCoreStrings.`3`
  - typings.puppeteerCore.puppeteerCoreStrings.`4`
  - typings.puppeteerCore.puppeteerCoreStrings.`5`
  - typings.puppeteerCore.puppeteerCoreStrings.`6`
  - typings.puppeteerCore.puppeteerCoreStrings.`7`
  - typings.puppeteerCore.puppeteerCoreStrings.`8`
  - typings.puppeteerCore.puppeteerCoreStrings.`9`
  - typings.puppeteerCore.puppeteerCoreStrings.Power
  - typings.puppeteerCore.puppeteerCoreStrings.Eject
  - typings.puppeteerCore.puppeteerCoreStrings.Abort
  - typings.puppeteerCore.puppeteerCoreStrings.Help
  - typings.puppeteerCore.puppeteerCoreStrings.Backspace
  - typings.puppeteerCore.puppeteerCoreStrings.Tab
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad5
  - typings.puppeteerCore.puppeteerCoreStrings.NumpadEnter
  - typings.puppeteerCore.puppeteerCoreStrings.Enter
  - typings.puppeteerCore.puppeteerCoreStrings.Carriagereturn
  - typings.puppeteerCore.puppeteerCoreStrings.Linefeed
  - typings.puppeteerCore.puppeteerCoreStrings.ShiftLeft
  - typings.puppeteerCore.puppeteerCoreStrings.ShiftRight
  - typings.puppeteerCore.puppeteerCoreStrings.ControlLeft
  - typings.puppeteerCore.puppeteerCoreStrings.ControlRight
  - typings.puppeteerCore.puppeteerCoreStrings.AltLeft
  - typings.puppeteerCore.puppeteerCoreStrings.AltRight
  - typings.puppeteerCore.puppeteerCoreStrings.Pause
  - typings.puppeteerCore.puppeteerCoreStrings.CapsLock
  - typings.puppeteerCore.puppeteerCoreStrings.Escape
  - typings.puppeteerCore.puppeteerCoreStrings.Convert
  - typings.puppeteerCore.puppeteerCoreStrings.NonConvert
  - typings.puppeteerCore.puppeteerCoreStrings.Space
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad9
  - typings.puppeteerCore.puppeteerCoreStrings.PageUp
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad3
  - typings.puppeteerCore.puppeteerCoreStrings.PageDown
  - typings.puppeteerCore.puppeteerCoreStrings.End
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad1
  - typings.puppeteerCore.puppeteerCoreStrings.Home
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad7
  - typings.puppeteerCore.puppeteerCoreStrings.ArrowLeft
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad4
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad8
  - typings.puppeteerCore.puppeteerCoreStrings.ArrowUp
  - typings.puppeteerCore.puppeteerCoreStrings.ArrowRight
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad6
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad2
  - typings.puppeteerCore.puppeteerCoreStrings.ArrowDown
  - typings.puppeteerCore.puppeteerCoreStrings.Select
  - typings.puppeteerCore.puppeteerCoreStrings.Open
  - typings.puppeteerCore.puppeteerCoreStrings.PrintScreen
  - typings.puppeteerCore.puppeteerCoreStrings.Insert
  - typings.puppeteerCore.puppeteerCoreStrings.Numpad0
  - typings.puppeteerCore.puppeteerCoreStrings.Delete
  - typings.puppeteerCore.puppeteerCoreStrings.NumpadDecimal
  - typings.puppeteerCore.puppeteerCoreStrings.Digit0
  - typings.puppeteerCore.puppeteerCoreStrings.Digit1
  - typings.puppeteerCore.puppeteerCoreStrings.Digit2
  - typings.puppeteerCore.puppeteerCoreStrings.Digit3
  - typings.puppeteerCore.puppeteerCoreStrings.Digit4
  - typings.puppeteerCore.puppeteerCoreStrings.Digit5
  - typings.puppeteerCore.puppeteerCoreStrings.Digit6
  - typings.puppeteerCore.puppeteerCoreStrings.Digit7
  - typings.puppeteerCore.puppeteerCoreStrings.Digit8
  - typings.puppeteerCore.puppeteerCoreStrings.Digit9
  - typings.puppeteerCore.puppeteerCoreStrings.KeyA
  - typings.puppeteerCore.puppeteerCoreStrings.KeyB
  - typings.puppeteerCore.puppeteerCoreStrings.KeyC
  - typings.puppeteerCore.puppeteerCoreStrings.KeyD
  - typings.puppeteerCore.puppeteerCoreStrings.KeyE
  - typings.puppeteerCore.puppeteerCoreStrings.KeyF
  - typings.puppeteerCore.puppeteerCoreStrings.KeyG
  - typings.puppeteerCore.puppeteerCoreStrings.KeyH
  - typings.puppeteerCore.puppeteerCoreStrings.KeyI
  - typings.puppeteerCore.puppeteerCoreStrings.KeyJ
  - typings.puppeteerCore.puppeteerCoreStrings.KeyK
  - typings.puppeteerCore.puppeteerCoreStrings.KeyL
  - typings.puppeteerCore.puppeteerCoreStrings.KeyM
  - typings.puppeteerCore.puppeteerCoreStrings.KeyN
  - typings.puppeteerCore.puppeteerCoreStrings.KeyO
  - typings.puppeteerCore.puppeteerCoreStrings.KeyP
  - typings.puppeteerCore.puppeteerCoreStrings.KeyQ
  - typings.puppeteerCore.puppeteerCoreStrings.KeyR
  - typings.puppeteerCore.puppeteerCoreStrings.KeyS
  - typings.puppeteerCore.puppeteerCoreStrings.KeyT
  - typings.puppeteerCore.puppeteerCoreStrings.KeyU
  - typings.puppeteerCore.puppeteerCoreStrings.KeyV
  - typings.puppeteerCore.puppeteerCoreStrings.KeyW
  - typings.puppeteerCore.puppeteerCoreStrings.KeyX
  - typings.puppeteerCore.puppeteerCoreStrings.KeyY
  - typings.puppeteerCore.puppeteerCoreStrings.KeyZ
  - typings.puppeteerCore.puppeteerCoreStrings.MetaLeft
  - typings.puppeteerCore.puppeteerCoreStrings.MetaRight
  - typings.puppeteerCore.puppeteerCoreStrings.ContextMenu
  - typings.puppeteerCore.puppeteerCoreStrings.NumpadMultiply
  - typings.puppeteerCore.puppeteerCoreStrings.NumpadAdd
  - typings.puppeteerCore.puppeteerCoreStrings.NumpadSubtract
  - typings.puppeteerCore.puppeteerCoreStrings.NumpadDivide
  - typings.puppeteerCore.puppeteerCoreStrings.F1
  - typings.puppeteerCore.puppeteerCoreStrings.F2
  - typings.puppeteerCore.puppeteerCoreStrings.F3
  - typings.puppeteerCore.puppeteerCoreStrings.F4
  - typings.puppeteerCore.puppeteerCoreStrings.F5
  - typings.puppeteerCore.puppeteerCoreStrings.F6
  - typings.puppeteerCore.puppeteerCoreStrings.F7
  - typings.puppeteerCore.puppeteerCoreStrings.F8
  - typings.puppeteerCore.puppeteerCoreStrings.F9
  - typings.puppeteerCore.puppeteerCoreStrings.F10
  - typings.puppeteerCore.puppeteerCoreStrings.F11
  - typings.puppeteerCore.puppeteerCoreStrings.F12
  - typings.puppeteerCore.puppeteerCoreStrings.F13
  - typings.puppeteerCore.puppeteerCoreStrings.F14
  - typings.puppeteerCore.puppeteerCoreStrings.F15
  - typings.puppeteerCore.puppeteerCoreStrings.F16
  - typings.puppeteerCore.puppeteerCoreStrings.F17
  - typings.puppeteerCore.puppeteerCoreStrings.F18
  - typings.puppeteerCore.puppeteerCoreStrings.F19
  - typings.puppeteerCore.puppeteerCoreStrings.F20
  - typings.puppeteerCore.puppeteerCoreStrings.F21
  - typings.puppeteerCore.puppeteerCoreStrings.F22
  - typings.puppeteerCore.puppeteerCoreStrings.F23
  - typings.puppeteerCore.puppeteerCoreStrings.F24
  - typings.puppeteerCore.puppeteerCoreStrings.NumLock
  - typings.puppeteerCore.puppeteerCoreStrings.ScrollLock
  - typings.puppeteerCore.puppeteerCoreStrings.AudioVolumeMute
  - typings.puppeteerCore.puppeteerCoreStrings.AudioVolumeDown
  - typings.puppeteerCore.puppeteerCoreStrings.AudioVolumeUp
  - typings.puppeteerCore.puppeteerCoreStrings.MediaTrackNext
  - typings.puppeteerCore.puppeteerCoreStrings.MediaTrackPrevious
  - typings.puppeteerCore.puppeteerCoreStrings.MediaStop
  - typings.puppeteerCore.puppeteerCoreStrings.MediaPlayPause
  - typings.puppeteerCore.puppeteerCoreStrings.Semicolon
  - typings.puppeteerCore.puppeteerCoreStrings.Equal
  - typings.puppeteerCore.puppeteerCoreStrings.NumpadEqual
  - typings.puppeteerCore.puppeteerCoreStrings.Comma
  - typings.puppeteerCore.puppeteerCoreStrings.Minus
  - typings.puppeteerCore.puppeteerCoreStrings.Period
  - typings.puppeteerCore.puppeteerCoreStrings.Slash
  - typings.puppeteerCore.puppeteerCoreStrings.Backquote
  - typings.puppeteerCore.puppeteerCoreStrings.BracketLeft
  - typings.puppeteerCore.puppeteerCoreStrings.Backslash
  - typings.puppeteerCore.puppeteerCoreStrings.BracketRight
  - typings.puppeteerCore.puppeteerCoreStrings.Quote
  - typings.puppeteerCore.puppeteerCoreStrings.AltGraph
  - typings.puppeteerCore.puppeteerCoreStrings.Props
  - typings.puppeteerCore.puppeteerCoreStrings.Cancel
  - typings.puppeteerCore.puppeteerCoreStrings.Clear
  - typings.puppeteerCore.puppeteerCoreStrings.Shift
  - typings.puppeteerCore.puppeteerCoreStrings.Control
  - typings.puppeteerCore.puppeteerCoreStrings.Alt
  - typings.puppeteerCore.puppeteerCoreStrings.Accept
  - typings.puppeteerCore.puppeteerCoreStrings.ModeChange
  - typings.puppeteerCore.puppeteerCoreStrings.Space
  - typings.puppeteerCore.puppeteerCoreStrings.Print
  - typings.puppeteerCore.puppeteerCoreStrings.Execute
  - typings.puppeteerCore.puppeteerCoreStrings.Null
  - typings.puppeteerCore.puppeteerCoreStrings.a_
  - typings.puppeteerCore.puppeteerCoreStrings.b_
  - typings.puppeteerCore.puppeteerCoreStrings.c_
  - typings.puppeteerCore.puppeteerCoreStrings.d_
  - typings.puppeteerCore.puppeteerCoreStrings.e_
  - typings.puppeteerCore.puppeteerCoreStrings.f_
  - typings.puppeteerCore.puppeteerCoreStrings.g_
  - typings.puppeteerCore.puppeteerCoreStrings.h_
  - typings.puppeteerCore.puppeteerCoreStrings.i_
  - typings.puppeteerCore.puppeteerCoreStrings.j_
  - typings.puppeteerCore.puppeteerCoreStrings.k_
  - typings.puppeteerCore.puppeteerCoreStrings.l_
  - typings.puppeteerCore.puppeteerCoreStrings.m_
  - typings.puppeteerCore.puppeteerCoreStrings.n_
  - typings.puppeteerCore.puppeteerCoreStrings.o_
  - typings.puppeteerCore.puppeteerCoreStrings.p_
  - typings.puppeteerCore.puppeteerCoreStrings.q_
  - typings.puppeteerCore.puppeteerCoreStrings.r_
  - typings.puppeteerCore.puppeteerCoreStrings.s_
  - typings.puppeteerCore.puppeteerCoreStrings.t_
  - typings.puppeteerCore.puppeteerCoreStrings.u_
  - typings.puppeteerCore.puppeteerCoreStrings.v_
  - typings.puppeteerCore.puppeteerCoreStrings.w_
  - typings.puppeteerCore.puppeteerCoreStrings.x_
  - typings.puppeteerCore.puppeteerCoreStrings.y_
  - typings.puppeteerCore.puppeteerCoreStrings.z_
  - typings.puppeteerCore.puppeteerCoreStrings.Meta
  - typings.puppeteerCore.puppeteerCoreStrings.Asterisk
  - typings.puppeteerCore.puppeteerCoreStrings.Plussign
  - typings.puppeteerCore.puppeteerCoreStrings.`-_`
  - typings.puppeteerCore.puppeteerCoreStrings.Slash
  - typings.puppeteerCore.puppeteerCoreStrings.Semicolon
  - typings.puppeteerCore.puppeteerCoreStrings.Equalssign
  - typings.puppeteerCore.puppeteerCoreStrings.Comma
  - typings.puppeteerCore.puppeteerCoreStrings.Dot
  - typings.puppeteerCore.puppeteerCoreStrings.Graveaccent
  - typings.puppeteerCore.puppeteerCoreStrings.`[`
  - / * \ * / java.lang.String
  - typings.puppeteerCore.puppeteerCoreStrings.`]`
  - typings.puppeteerCore.puppeteerCoreStrings.Attn
  - typings.puppeteerCore.puppeteerCoreStrings.CrSel
  - typings.puppeteerCore.puppeteerCoreStrings.ExSel
  - typings.puppeteerCore.puppeteerCoreStrings.EraseEof
  - typings.puppeteerCore.puppeteerCoreStrings.Play
  - typings.puppeteerCore.puppeteerCoreStrings.ZoomOut
  - typings.puppeteerCore.puppeteerCoreStrings.Exclamationmark
  - typings.puppeteerCore.puppeteerCoreStrings.`@`
  - typings.puppeteerCore.puppeteerCoreStrings.Numbersign
  - typings.puppeteerCore.puppeteerCoreStrings.$
  - typings.puppeteerCore.puppeteerCoreStrings.Percentsign
  - typings.puppeteerCore.puppeteerCoreStrings.^
  - typings.puppeteerCore.puppeteerCoreStrings.Ampersand
  - typings.puppeteerCore.puppeteerCoreStrings.A
  - typings.puppeteerCore.puppeteerCoreStrings.B
  - typings.puppeteerCore.puppeteerCoreStrings.C
  - typings.puppeteerCore.puppeteerCoreStrings.D
  - typings.puppeteerCore.puppeteerCoreStrings.E
  - typings.puppeteerCore.puppeteerCoreStrings.F
  - typings.puppeteerCore.puppeteerCoreStrings.G
  - typings.puppeteerCore.puppeteerCoreStrings.H
  - typings.puppeteerCore.puppeteerCoreStrings.I
  - typings.puppeteerCore.puppeteerCoreStrings.J
  - typings.puppeteerCore.puppeteerCoreStrings.K
  - typings.puppeteerCore.puppeteerCoreStrings.L
  - typings.puppeteerCore.puppeteerCoreStrings.M
  - typings.puppeteerCore.puppeteerCoreStrings.N
  - typings.puppeteerCore.puppeteerCoreStrings.O
  - typings.puppeteerCore.puppeteerCoreStrings.P
  - typings.puppeteerCore.puppeteerCoreStrings.Q
  - typings.puppeteerCore.puppeteerCoreStrings.R
  - typings.puppeteerCore.puppeteerCoreStrings.S
  - typings.puppeteerCore.puppeteerCoreStrings.T
  - typings.puppeteerCore.puppeteerCoreStrings.U
  - typings.puppeteerCore.puppeteerCoreStrings.V
  - typings.puppeteerCore.puppeteerCoreStrings.W
  - typings.puppeteerCore.puppeteerCoreStrings.X
  - typings.puppeteerCore.puppeteerCoreStrings.Y
  - typings.puppeteerCore.puppeteerCoreStrings.Z
  - typings.puppeteerCore.puppeteerCoreStrings.Colon
  - typings.puppeteerCore.puppeteerCoreStrings.Lessthansign
  - typings.puppeteerCore.puppeteerCoreStrings._underscore
  - typings.puppeteerCore.puppeteerCoreStrings.Greaterthansign
  - typings.puppeteerCore.puppeteerCoreStrings.Questionmark
  - typings.puppeteerCore.puppeteerCoreStrings.Tilde
  - typings.puppeteerCore.puppeteerCoreStrings.Leftcurlybracket
  - typings.puppeteerCore.puppeteerCoreStrings.Verticalline
  - typings.puppeteerCore.puppeteerCoreStrings.Rightcurlybracket
  - typings.puppeteerCore.puppeteerCoreStrings.Quotationmark
  - typings.puppeteerCore.puppeteerCoreStrings.SoftLeft
  - typings.puppeteerCore.puppeteerCoreStrings.SoftRight
  - typings.puppeteerCore.puppeteerCoreStrings.Camera
  - typings.puppeteerCore.puppeteerCoreStrings.Call
  - typings.puppeteerCore.puppeteerCoreStrings.EndCall
  - typings.puppeteerCore.puppeteerCoreStrings.VolumeDown
  - typings.puppeteerCore.puppeteerCoreStrings.VolumeUp
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
