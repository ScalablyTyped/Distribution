package typings.qrcodeReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CanvasQRCodeProps = typings.qrcodeReact.mod.BaseQRCodeProps with typings.qrcodeReact.AnonCanvas with typings.react.mod.CanvasHTMLAttributes[typings.std.HTMLCanvasElement]
  type QRCode = typings.react.mod.ComponentClass[
    typings.qrcodeReact.mod.CanvasQRCodeProps | typings.qrcodeReact.mod.SvgQRCodeProps, 
    typings.react.mod.ComponentState
  ]
  type SvgQRCodeProps = typings.qrcodeReact.mod.BaseQRCodeProps with typings.qrcodeReact.AnonRenderAs with typings.react.mod.SVGProps[typings.std.SVGSVGElement]
}
