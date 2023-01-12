package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Filter Options
trait FilterOptions[T /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ js.Any */] extends StObject {
  
  var filter: (FilterFunction[
    /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ js.Any, 
    S
  ]) | FilterObject | String
}
object FilterOptions {
  
  inline def apply[T /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ js.Any */](
    filter: (FilterFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ js.Any, 
      S
    ]) | FilterObject | String
  ): FilterOptions[T, S] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions[T, S]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterOptions[?, ?], T /* <: FindConstant */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ js.Any */] (val x: Self & (FilterOptions[T, S])) extends AnyVal {
    
    inline def setFilter(
      value: (FilterFunction[
          /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ js.Any, 
          S
        ]) | FilterObject | String
    ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ js.Any => /* is S */ Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
  }
}
