package typings.storybookComponents.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components", "IFrame")
@js.native
open class IFrame protected ()
  extends Component[IFrameProps, js.Object, Any] {
  def this(props: IFrameProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: IFrameProps, context: Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MIFrame(): Unit = js.native
  
  var iframe: Any = js.native
  
  def setIframeBodyStyle(style: BodyStyle): Any = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MIFrame(nextProps: IFrameProps): Boolean = js.native
}
