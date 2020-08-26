package typings.reduxOrm.anon

import org.scalablytyped.runtime.Instantiable0
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.IdType
import typings.reduxOrm.modelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetId[M /* <: Model[Instantiable0[AnyModel], _] */] extends js.Object {
  def getId(): IdType[M] = js.native
}

object GetId {
  @scala.inline
  def apply[/* <: typings.reduxOrm.modelMod.Model[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */ M](getId: () => IdType[M]): GetId[M] = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId))
    __obj.asInstanceOf[GetId[M]]
  }
  @scala.inline
  implicit class GetIdOps[Self <: GetId[_], /* <: typings.reduxOrm.modelMod.Model[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */ M] (val x: Self with GetId[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetId(value: () => IdType[M]): Self = this.set("getId", js.Any.fromFunction0(value))
  }
  
}

