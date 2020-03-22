package typings.qrcodeReact.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qrcode.react", JSImport.Namespace)
@js.native
class ^ protected ()
  extends Component[CanvasQRCodeProps | SvgQRCodeProps, ComponentState, js.Any] {
  def this(props: CanvasQRCodeProps) = this()
  def this(props: SvgQRCodeProps) = this()
  def this(props: CanvasQRCodeProps, context: js.Any) = this()
  def this(props: SvgQRCodeProps, context: js.Any) = this()
}

@JSImport("qrcode.react", JSImport.Namespace)
@js.native
object ^ extends TopLevel[QRCode]

