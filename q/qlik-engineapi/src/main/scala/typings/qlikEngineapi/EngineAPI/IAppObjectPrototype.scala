package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAppObjectPrototype[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */] extends StObject {
  
  def createObject(qProp: P): js.Promise[O] = js.native
  
  def createSessionObject(qProp: P): js.Promise[O] = js.native
}
object IAppObjectPrototype {
  
  @scala.inline
  def apply[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */](createObject: P => js.Promise[O], createSessionObject: P => js.Promise[O]): IAppObjectPrototype[P, O] = {
    val __obj = js.Dynamic.literal(createObject = js.Any.fromFunction1(createObject), createSessionObject = js.Any.fromFunction1(createSessionObject))
    __obj.asInstanceOf[IAppObjectPrototype[P, O]]
  }
  
  @scala.inline
  implicit class IAppObjectPrototypeMutableBuilder[Self <: IAppObjectPrototype[_, _], P /* <: IGenericObjectProperties */, O /* <: IGenericObject */] (val x: Self with (IAppObjectPrototype[P, O])) extends AnyVal {
    
    @scala.inline
    def setCreateObject(value: P => js.Promise[O]): Self = StObject.set(x, "createObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSessionObject(value: P => js.Promise[O]): Self = StObject.set(x, "createSessionObject", js.Any.fromFunction1(value))
  }
}
