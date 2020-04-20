package typings.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.IdType
import typings.reduxOrm.modelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetId[M /* <: Model[Instantiable0[AnyModel], _] */] extends js.Object {
  def getId(): IdType[M]
}

object AnonGetId {
  @scala.inline
  def apply[M /* <: Model[Instantiable0[AnyModel], _] */](getId: () => IdType[M]): AnonGetId[M] = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId))
    __obj.asInstanceOf[AnonGetId[M]]
  }
}

