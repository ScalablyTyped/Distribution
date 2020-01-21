package typings.storybookComponents.iframeMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/blocks/IFrame", "IFrame")
@js.native
class IFrame ()
  extends Component[IFrameProps, js.Object, js.Any] {
  var iframe: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MIFrame(): Unit = js.native
  def setIframeBodyStyle(style: BodyStyle): js.Any = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MIFrame(nextProps: IFrameProps): Boolean = js.native
}

