package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-svg", "Image")
@js.native
class Image protected ()
  extends Component[ImageProps, ComponentState, js.Any] {
  def this(props: ImageProps) = this()
  def this(props: ImageProps, context: js.Any) = this()
}

@JSImport("react-native-svg", "Image")
@js.native
object Image extends TopLevel[ComponentClass[ImageProps, ComponentState]]

