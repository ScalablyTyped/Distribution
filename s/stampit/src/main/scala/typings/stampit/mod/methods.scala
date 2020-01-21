package typings.stampit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "methods")
@js.native
object methods extends js.Object {
  def apply[Obj](methods: MethodMap[Obj]*): StampType[Obj] = js.native
}

