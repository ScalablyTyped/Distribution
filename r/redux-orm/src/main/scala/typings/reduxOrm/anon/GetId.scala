package typings.reduxOrm.anon

import org.scalablytyped.runtime.Instantiable0
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.IdType
import typings.reduxOrm.modelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetId[M /* <: Model[Instantiable0[AnyModel], _] */] extends js.Object {
  def getId(): IdType[M]
}

object GetId {
  @scala.inline
  def apply[/* <: typings.reduxOrm.modelMod.Model[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */ M](getId: () => IdType[M]): GetId[M] = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId))
    __obj.asInstanceOf[GetId[M]]
  }
}

