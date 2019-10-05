package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppObjectPrototype[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */] extends js.Object {
  def createObject(qProp: P): js.Promise[O]
  def createSessionObject(qProp: P): js.Promise[O]
}

object IAppObjectPrototype {
  @scala.inline
  def apply[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */](createObject: P => js.Promise[O], createSessionObject: P => js.Promise[O]): IAppObjectPrototype[P, O] = {
    val __obj = js.Dynamic.literal(createObject = js.Any.fromFunction1(createObject), createSessionObject = js.Any.fromFunction1(createSessionObject))
  
    __obj.asInstanceOf[IAppObjectPrototype[P, O]]
  }
}

