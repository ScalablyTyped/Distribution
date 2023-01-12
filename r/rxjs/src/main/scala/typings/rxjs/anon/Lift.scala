package typings.rxjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lift extends StObject {
  
  var lift: /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<rxjs.anon.TypeofObservable>['lift'] */ js.Any
}
object Lift {
  
  inline def apply(
    lift: /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<rxjs.anon.TypeofObservable>['lift'] */ js.Any
  ): Lift = {
    val __obj = js.Dynamic.literal(lift = lift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lift] (val x: Self) extends AnyVal {
    
    inline def setLift(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<rxjs.anon.TypeofObservable>['lift'] */ js.Any
    ): Self = StObject.set(x, "lift", value.asInstanceOf[js.Any])
  }
}
