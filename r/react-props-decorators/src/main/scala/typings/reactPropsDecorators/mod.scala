package typings.reactPropsDecorators

import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-props-decorators", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var defaultProps: js.Function1[/* defaultProps */ js.Any, ClassDecorator] = js.native
  var propTypes: js.Function1[/* map */ ValidationMap[js.Any], ClassDecorator] = js.native
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
}

