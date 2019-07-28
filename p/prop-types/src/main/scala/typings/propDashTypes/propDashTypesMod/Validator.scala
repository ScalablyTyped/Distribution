package typings.propDashTypes.propDashTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator[T] extends js.Object {
  def apply(props: js.Object, propName: String, componentName: String, location: String, propFullName: String): Error | Null = js.native
}

