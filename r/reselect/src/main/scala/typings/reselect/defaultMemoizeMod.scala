package typings.reselect

import typings.reselect.anon.ClearCache
import typings.reselect.typesMod.EqualityFn
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultMemoizeMod {
  
  @JSImport("reselect/es/defaultMemoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCacheKeyComparator(equalityCheck: EqualityFn): js.Function2[
    /* prev */ js.Array[Any] | IArguments | Null, 
    /* next */ js.Array[Any] | IArguments | Null, 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCacheKeyComparator")(equalityCheck.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* prev */ js.Array[Any] | IArguments | Null, 
    /* next */ js.Array[Any] | IArguments | Null, 
    Boolean
  ]]
  
  @JSImport("reselect/es/defaultMemoize", "defaultEqualityCheck")
  @js.native
  val defaultEqualityCheck: EqualityFn = js.native
  
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F): F & ClearCache = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any]).asInstanceOf[F & ClearCache]
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, equalityCheckOrOptions: DefaultMemoizeOptions): F & ClearCache = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any], equalityCheckOrOptions.asInstanceOf[js.Any])).asInstanceOf[F & ClearCache]
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, equalityCheckOrOptions: EqualityFn): F & ClearCache = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any], equalityCheckOrOptions.asInstanceOf[js.Any])).asInstanceOf[F & ClearCache]
  
  trait DefaultMemoizeOptions extends StObject {
    
    var equalityCheck: js.UndefOr[EqualityFn] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var resultEqualityCheck: js.UndefOr[EqualityFn] = js.undefined
  }
  object DefaultMemoizeOptions {
    
    inline def apply(): DefaultMemoizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultMemoizeOptions]
    }
    
    extension [Self <: DefaultMemoizeOptions](x: Self) {
      
      inline def setEqualityCheck(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "equalityCheck", js.Any.fromFunction2(value))
      
      inline def setEqualityCheckUndefined: Self = StObject.set(x, "equalityCheck", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setResultEqualityCheck(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "resultEqualityCheck", js.Any.fromFunction2(value))
      
      inline def setResultEqualityCheckUndefined: Self = StObject.set(x, "resultEqualityCheck", js.undefined)
    }
  }
}
