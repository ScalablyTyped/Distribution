package typings.qrcodeDotReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qrcodeDotReactMod {
  import typings.qrcodeDotReact.Anon_Canvas
  import typings.qrcodeDotReact.Anon_RenderAs
  import typings.react.reactMod.CanvasHTMLAttributes
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.SVGProps
  import typings.std.HTMLCanvasElement
  import typings.std.SVGSVGElement

  type CanvasQRCodeProps = BaseQRCodeProps with Anon_Canvas with CanvasHTMLAttributes[HTMLCanvasElement]
  type QRCode = ComponentClass[CanvasQRCodeProps | SvgQRCodeProps, ComponentState]
  type SvgQRCodeProps = BaseQRCodeProps with Anon_RenderAs with SVGProps[SVGSVGElement]
}
