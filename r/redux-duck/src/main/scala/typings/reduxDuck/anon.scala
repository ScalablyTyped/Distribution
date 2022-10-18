package typings.reduxDuck

import typings.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Type[T /* <: String & (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */, AppAction /* <: Action[Any] */] extends StObject {
    
    var `type`: T
  }
  object Type {
    
    inline def apply[T /* <: String & (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */, AppAction /* <: Action[Any] */](`type`: T): Type[T, AppAction] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T, AppAction]]
    }
    
    extension [Self <: Type[?, ?], T /* <: String & (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */, AppAction /* <: Action[Any] */](x: Self & (Type[T, AppAction])) {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
