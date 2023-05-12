package typings.rememo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rememo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S /* <: js.Function1[/* repeated */ Any, Any] */](selector: S): S & EnhancedSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[S & EnhancedSelector]
  inline def default[S /* <: js.Function1[/* repeated */ Any, Any] */](selector: S, getDependants: GetDependants): S & EnhancedSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], getDependants.asInstanceOf[js.Any])).asInstanceOf[S & EnhancedSelector]
  
  trait Cache extends StObject {
    
    /**
      * Function to clear cache.
      */
    def clear(): Unit
    /**
      * Function to clear cache.
      */
    @JSName("clear")
    var clear_Original: Clear
    
    /**
      * Cache head.
      */
    var head: js.UndefOr[CacheNode | Null] = js.undefined
    
    /**
      * Whether dependants are valid in
      * considering cache uniqueness. A cache is unique if dependents are all arrays
      * or objects.
      */
    var isUniqueByDependants: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dependants from previous invocation.
      */
    var lastDependants: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Cache {
    
    inline def apply(clear: () => Unit): Cache = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setHead(value: CacheNode): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadNull: Self = StObject.set(x, "head", null)
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setIsUniqueByDependants(value: Boolean): Self = StObject.set(x, "isUniqueByDependants", value.asInstanceOf[js.Any])
      
      inline def setIsUniqueByDependantsUndefined: Self = StObject.set(x, "isUniqueByDependants", js.undefined)
      
      inline def setLastDependants(value: js.Array[Any]): Self = StObject.set(x, "lastDependants", value.asInstanceOf[js.Any])
      
      inline def setLastDependantsUndefined: Self = StObject.set(x, "lastDependants", js.undefined)
      
      inline def setLastDependantsVarargs(value: Any*): Self = StObject.set(x, "lastDependants", js.Array(value*))
    }
  }
  
  trait CacheNode extends StObject {
    
    /**
      * Function arguments for cache entry.
      */
    var args: js.Array[Any]
    
    /**
      * Next node.
      */
    var next: js.UndefOr[CacheNode | Null] = js.undefined
    
    /**
      * Previous node.
      */
    var prev: js.UndefOr[CacheNode | Null] = js.undefined
    
    /**
      * Function result.
      */
    var `val`: Any
  }
  object CacheNode {
    
    inline def apply(args: js.Array[Any], `val`: Any): CacheNode = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheNode] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setNext(value: CacheNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: CacheNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  type Clear = js.Function0[Unit]
  
  trait EnhancedSelector extends StObject {
    
    def clear(): Unit
    @JSName("clear")
    var clear_Original: Clear
    
    def getDependants(args: Any*): js.Array[Any]
    @JSName("getDependants")
    var getDependants_Original: GetDependants
  }
  object EnhancedSelector {
    
    inline def apply(clear: () => Unit, getDependants: GetDependants): EnhancedSelector = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getDependants = getDependants.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedSelector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnhancedSelector] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGetDependants(value: GetDependants): Self = StObject.set(x, "getDependants", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetDependants extends StObject {
    
    def apply(args: Any*): js.Array[Any] = js.native
  }
}
