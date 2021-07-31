package typings.reactSortableTree.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatData[T, I /* <: String | Double */, K /* <: /* keyof T */ String */, P /* <: /* keyof T */ String */] extends StObject {
  
  var flatData: NumberDictionary[T] | StringDictionary[T]
  
  // tslint:disable-next-line:no-unnecessary-generics
  var getKey: js.UndefOr[
    js.Function1[
      /* item */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.undefined
  
  // tslint:disable-next-line:no-unnecessary-generics
  var getParentKey: js.UndefOr[
    js.Function1[
      /* item */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ] = js.undefined
  
  var rootKey: js.UndefOr[I] = js.undefined
}
object FlatData {
  
  @scala.inline
  def apply[T, I /* <: String | Double */, K /* <: /* keyof T */ String */, P /* <: /* keyof T */ String */](flatData: NumberDictionary[T] | StringDictionary[T]): FlatData[T, I, K, P] = {
    val __obj = js.Dynamic.literal(flatData = flatData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatData[T, I, K, P]]
  }
  
  @scala.inline
  implicit class FlatDataMutableBuilder[Self <: FlatData[?, ?, ?, ?], T, I /* <: String | Double */, K /* <: /* keyof T */ String */, P /* <: /* keyof T */ String */] (val x: Self & (FlatData[T, I, K, P])) extends AnyVal {
    
    @scala.inline
    def setFlatData(value: NumberDictionary[T] | StringDictionary[T]): Self = StObject.set(x, "flatData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKey(
      value: /* item */ T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    @scala.inline
    def setGetParentKey(
      value: /* item */ T => /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ): Self = StObject.set(x, "getParentKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParentKeyUndefined: Self = StObject.set(x, "getParentKey", js.undefined)
    
    @scala.inline
    def setRootKey(value: I): Self = StObject.set(x, "rootKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootKeyUndefined: Self = StObject.set(x, "rootKey", js.undefined)
  }
}
