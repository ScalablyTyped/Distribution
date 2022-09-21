package typings.std.anon

import typings.std.FlatArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done[Arr, Depth /* <: Double */] extends StObject {
  
  /* standard es2019.array */
  var done: Arr
  
  /* standard es2019.array */
  var recur: Arr | (FlatArray[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][Depth] */ js.Any
  ])
}
object Done {
  
  inline def apply[Arr, Depth /* <: Double */](
    done: Arr,
    recur: Arr | (FlatArray[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][Depth] */ js.Any
    ])
  ): Done[Arr, Depth] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], recur = recur.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[Arr, Depth]]
  }
  
  extension [Self <: Done[?, ?], Arr, Depth /* <: Double */](x: Self & (Done[Arr, Depth])) {
    
    inline def setDone(value: Arr): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setRecur(
      value: Arr | (FlatArray[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][Depth] */ js.Any
        ])
    ): Self = StObject.set(x, "recur", value.asInstanceOf[js.Any])
  }
}
