package typings.ramda

import org.scalablytyped.runtime.TopLevel
import typings.ramda.toolsMod.ValueOfRecord
import typings.std.Parameters
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/applySpec", JSImport.Namespace)
@js.native
object applySpecMod extends js.Object {
  def default[Obj /* <: Record[String, js.Function1[/* repeated */ _, _]] */](obj: Obj): js.Function1[
    /* args */ Parameters[ValueOfRecord[Obj]], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Obj ]: std.ReturnType<Obj[Key]>}
    */ typings.ramda.ramdaStrings.default with TopLevel[Obj]
  ] = js.native
  def default[T](obj: js.Any): js.Function1[/* repeated */ js.Any, T] = js.native
}

