package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/forEachObjIndexed", JSImport.Namespace)
@js.native
object forEachObjIndexedMod extends js.Object {
  def default[T](
    fn: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      /* key */ String, 
      /* obj */ T, 
      Unit
    ]
  ): js.Function1[/* obj */ T, T] = js.native
  def default[T](
    fn: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      /* key */ String, 
      /* obj */ T, 
      Unit
    ],
    obj: T
  ): T = js.native
}

