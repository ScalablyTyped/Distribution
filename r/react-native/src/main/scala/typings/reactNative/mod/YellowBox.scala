package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "YellowBox")
@js.native
class YellowBox protected ()
  extends Component[js.Any, js.Any, js.Any] {
  def this(props: js.Any) = this()
  def this(props: js.Any, context: js.Any) = this()
}

@JSImport("react-native", "YellowBox")
@js.native
object YellowBox
  extends Instantiable1[/* props */ js.Any, Component[js.Any, js.Any, js.Any]]
     with Instantiable2[/* props */ js.Any, /* context */ js.Any, Component[js.Any, js.Any, js.Any]] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[_]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[_, _]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[_, _]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[_]] = js.native
  def ignoreWarnings(warnings: js.Array[String]): Unit = js.native
}

