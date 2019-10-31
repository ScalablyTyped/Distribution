package typings.stampit.stampitMod

import typings.stampit.stampitMod.stampit.Composer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stampit", "composers")
@js.native
object composers extends js.Object {
  def apply[Obj](functions: Composer[StampType[Obj]]*): StampType[Obj] = js.native
  def apply[Obj](functions: js.Array[Composer[StampType[Obj]]]): StampType[Obj] = js.native
}

