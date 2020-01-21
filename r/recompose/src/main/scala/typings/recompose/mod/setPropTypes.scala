package typings.recompose.mod

import typings.react.mod.ComponentType
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "setPropTypes")
@js.native
object setPropTypes extends js.Object {
  def apply[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = js.native
}

