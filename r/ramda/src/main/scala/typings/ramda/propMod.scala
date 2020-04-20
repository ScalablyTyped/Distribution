package typings.ramda

import typings.ramda.toolsMod.Placeholder
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/prop", JSImport.Namespace)
@js.native
object propMod extends js.Object {
  def default[T](__ : Placeholder, obj: T): js.Function1[
    /* keyof T */ /* p */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def default[P /* <: String */](p: P): js.Function1[/* obj */ Record[P, _], _] = js.native
  def default[P /* <: /* keyof T */ String */, T](p: P, obj: T): /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any = js.native
  @JSName("default")
  def default_P_StringT[P /* <: String */, T](p: P): js.Function1[/* obj */ Record[P, T], T] = js.native
}

