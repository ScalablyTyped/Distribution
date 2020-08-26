package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppObjectPrototype[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */] extends js.Object {
  def createObject(qProp: P): js.Promise[O] = js.native
  def createSessionObject(qProp: P): js.Promise[O] = js.native
}

object IAppObjectPrototype {
  @scala.inline
  def apply[/* <: typings.qlikEngineapi.EngineAPI.IGenericObjectProperties */ P, /* <: typings.qlikEngineapi.EngineAPI.IGenericObject */ O](createObject: P => js.Promise[O], createSessionObject: P => js.Promise[O]): IAppObjectPrototype[P, O] = {
    val __obj = js.Dynamic.literal(createObject = js.Any.fromFunction1(createObject), createSessionObject = js.Any.fromFunction1(createSessionObject))
    __obj.asInstanceOf[IAppObjectPrototype[P, O]]
  }
  @scala.inline
  implicit class IAppObjectPrototypeOps[Self <: IAppObjectPrototype[_, _], /* <: typings.qlikEngineapi.EngineAPI.IGenericObjectProperties */ P, /* <: typings.qlikEngineapi.EngineAPI.IGenericObject */ O] (val x: Self with (IAppObjectPrototype[P, O])) extends AnyVal {
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
    def setCreateObject(value: P => js.Promise[O]): Self = this.set("createObject", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateSessionObject(value: P => js.Promise[O]): Self = this.set("createSessionObject", js.Any.fromFunction1(value))
  }
  
}

