package typings.sortArray

import org.scalablytyped.runtime.StringDictionary
import typings.sortArray.sortArrayInts.`-1`
import typings.sortArray.sortArrayInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Isomorphic, load-anywhere function to sort an array by scalar, deep or
    * computed values in any standard or custom order. Returns the array
    * passed in.
    * @param array The input array to sort. It is sorted in place.
    * @param options Sort options.
    */
  inline def apply[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T](array: js.Array[T], options: SortOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("sort-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Primitive = js.UndefOr[Double | String | Boolean | js.BigInt | js.Symbol | Null]
  
  trait SortOptions[Computed] extends StObject {
    
    /**
      * One or more property names or computed fields to sort by.
      * Specifying property names is only relevant when sorting an array of
      * objects.
      */
    var by: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * A dictionary object containing one or more computed field functions. The
      * function will be invoked once per item in the array. Each invocation
      * will receive the array item as input and must return a primitive value
      * by which the array can be sorted.
      */
    var computed: js.UndefOr[StringDictionary[js.Function1[/* item */ Computed, Primitive]]] = js.undefined
    
    /**
      * A dictionary object containing one or more custom orders. Each custom
      * order value must be an array defining the order expected values must be
      * sorted in.
      */
    var customOrders: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Configures whether null values will be sorted before or after defined
      * values. Set to -1 for before, 1 for after. Defaults to 1.
      * @default 1
      */
    var nullRank: js.UndefOr[`-1` | `1`] = js.undefined
    
    /**
      * One or more sort orders. Specify 'asc', 'desc' or a property name from
      * the options.customOrders object.
      */
    var order: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Configures whether undefined values will be sorted before or after
      * defined values. Set to -1 for before, 1 for after. Defaults to 1.
      * @default 1
      */
    var undefinedRank: js.UndefOr[`-1` | `1`] = js.undefined
  }
  object SortOptions {
    
    inline def apply[Computed](): SortOptions[Computed] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortOptions[Computed]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortOptions[?], Computed] (val x: Self & SortOptions[Computed]) extends AnyVal {
      
      inline def setBy(value: String | js.Array[String]): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      inline def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      inline def setByVarargs(value: String*): Self = StObject.set(x, "by", js.Array(value*))
      
      inline def setComputed(value: StringDictionary[js.Function1[/* item */ Computed, Primitive]]): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
      
      inline def setCustomOrders(value: StringDictionary[Any]): Self = StObject.set(x, "customOrders", value.asInstanceOf[js.Any])
      
      inline def setCustomOrdersUndefined: Self = StObject.set(x, "customOrders", js.undefined)
      
      inline def setNullRank(value: `-1` | `1`): Self = StObject.set(x, "nullRank", value.asInstanceOf[js.Any])
      
      inline def setNullRankUndefined: Self = StObject.set(x, "nullRank", js.undefined)
      
      inline def setOrder(value: String | js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setUndefinedRank(value: `-1` | `1`): Self = StObject.set(x, "undefinedRank", value.asInstanceOf[js.Any])
      
      inline def setUndefinedRankUndefined: Self = StObject.set(x, "undefinedRank", js.undefined)
    }
  }
}
