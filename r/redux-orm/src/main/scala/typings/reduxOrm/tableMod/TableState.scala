package typings.reduxOrm.tableMod

import org.scalablytyped.runtime.Instantiable0
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.IdType
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableState[MClass /* <: Instantiable0[AnyModel] */] extends js.Object {
  
  val indexes: TableIndexes[MClass] = js.native
  
  val meta: DefaultMeta[IdType[InstanceType[MClass]]] = js.native
}
