package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppObjectPrototype[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */] extends js.Object {
  def createObject(qProp: P): js.Promise[O]
  def createSessionObject(qProp: P): js.Promise[O]
}

object IAppObjectPrototype {
  @scala.inline
  def apply[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */](createObject: js.Function1[P, js.Promise[O]], createSessionObject: js.Function1[P, js.Promise[O]]): IAppObjectPrototype[P, O] = {
    val __obj = js.Dynamic.literal(createObject = createObject, createSessionObject = createSessionObject)
  
    __obj.asInstanceOf[IAppObjectPrototype[P, O]]
  }
}

