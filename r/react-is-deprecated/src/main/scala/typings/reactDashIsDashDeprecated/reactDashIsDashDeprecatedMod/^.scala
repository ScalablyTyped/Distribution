package typings.reactDashIsDashDeprecated.reactDashIsDashDeprecatedMod

import typings.react.reactMod.ReactPropTypes
import typings.react.reactMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-is-deprecated", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addIsDeprecated(propTypes: ReactPropTypes): DeprecatablePropTypes = js.native
  def deprecate[T](validator: Validator[T], message: String): Validator[T] = js.native
}

