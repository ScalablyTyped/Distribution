package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.reactSortableTreeStrings.children
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatData[T] extends StObject {
  
  var flatData: js.Array[Omit[TreeItem[T], children]]
  
  var getKey: js.UndefOr[js.Function1[/* item */ TreeItem[T], String | Double]] = js.undefined
  
  var getParentKey: js.UndefOr[js.Function1[/* item */ TreeItem[T], String | Double | Null]] = js.undefined
  
  var rootKey: js.UndefOr[String | Double] = js.undefined
}
object FlatData {
  
  inline def apply[T](flatData: js.Array[Omit[TreeItem[T], children]]): FlatData[T] = {
    val __obj = js.Dynamic.literal(flatData = flatData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatData[T]]
  }
  
  extension [Self <: FlatData[?], T](x: Self & FlatData[T]) {
    
    inline def setFlatData(value: js.Array[Omit[TreeItem[T], children]]): Self = StObject.set(x, "flatData", value.asInstanceOf[js.Any])
    
    inline def setFlatDataVarargs(value: (Omit[TreeItem[T], children])*): Self = StObject.set(x, "flatData", js.Array(value*))
    
    inline def setGetKey(value: /* item */ TreeItem[T] => String | Double): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    inline def setGetParentKey(value: /* item */ TreeItem[T] => String | Double | Null): Self = StObject.set(x, "getParentKey", js.Any.fromFunction1(value))
    
    inline def setGetParentKeyUndefined: Self = StObject.set(x, "getParentKey", js.undefined)
    
    inline def setRootKey(value: String | Double): Self = StObject.set(x, "rootKey", value.asInstanceOf[js.Any])
    
    inline def setRootKeyUndefined: Self = StObject.set(x, "rootKey", js.undefined)
  }
}
