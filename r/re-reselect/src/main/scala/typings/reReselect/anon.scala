package typings.reReselect

import typings.reReselect.mod.ICacheObject
import typings.reReselect.mod.OutputParametricSelector
import typings.reReselect.mod.OutputSelector
import typings.reReselect.mod.ParametricKeySelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cache[S, R, C, D] extends StObject {
    
    var cache: ICacheObject
    
    def clearCache(): Unit
    
    def getMatchingSelector(state: S, args: Any*): OutputSelector[S, R, C, D]
    
    def keySelector(state: S, args: Any*): Any
    @JSName("keySelector")
    var keySelector_Original: typings.reReselect.mod.KeySelector[S]
    
    def removeMatchingSelector(state: S, args: Any*): Unit
  }
  object Cache {
    
    inline def apply[S, R, C, D](
      cache: ICacheObject,
      clearCache: () => Unit,
      getMatchingSelector: (S, /* repeated */ Any) => OutputSelector[S, R, C, D],
      keySelector: typings.reReselect.mod.KeySelector[S],
      removeMatchingSelector: (S, /* repeated */ Any) => Unit
    ): Cache[S, R, C, D] = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], clearCache = js.Any.fromFunction0(clearCache), getMatchingSelector = js.Any.fromFunction2(getMatchingSelector), keySelector = keySelector.asInstanceOf[js.Any], removeMatchingSelector = js.Any.fromFunction2(removeMatchingSelector))
      __obj.asInstanceOf[Cache[S, R, C, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache[?, ?, ?, ?], S, R, C, D] (val x: Self & (Cache[S, R, C, D])) extends AnyVal {
      
      inline def setCache(value: ICacheObject): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      inline def setGetMatchingSelector(value: (S, /* repeated */ Any) => OutputSelector[S, R, C, D]): Self = StObject.set(x, "getMatchingSelector", js.Any.fromFunction2(value))
      
      inline def setKeySelector(value: typings.reReselect.mod.KeySelector[S]): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      inline def setRemoveMatchingSelector(value: (S, /* repeated */ Any) => Unit): Self = StObject.set(x, "removeMatchingSelector", js.Any.fromFunction2(value))
    }
  }
  
  trait CacheSize extends StObject {
    
    var cacheSize: Double
  }
  object CacheSize {
    
    inline def apply(cacheSize: Double): CacheSize = {
      val __obj = js.Dynamic.literal(cacheSize = cacheSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheSize] (val x: Self) extends AnyVal {
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClearCache[S, P, R, C, D] extends StObject {
    
    var cache: ICacheObject
    
    def clearCache(): Unit
    
    def getMatchingSelector(state: S, props: P, args: Any*): OutputParametricSelector[S, P, R, C, D]
    
    def keySelector(state: S, props: P, args: Any*): Any
    @JSName("keySelector")
    var keySelector_Original: ParametricKeySelector[S, P]
    
    def removeMatchingSelector(state: S, props: P, args: Any*): Unit
  }
  object ClearCache {
    
    inline def apply[S, P, R, C, D](
      cache: ICacheObject,
      clearCache: () => Unit,
      getMatchingSelector: (S, P, /* repeated */ Any) => OutputParametricSelector[S, P, R, C, D],
      keySelector: ParametricKeySelector[S, P],
      removeMatchingSelector: (S, P, /* repeated */ Any) => Unit
    ): ClearCache[S, P, R, C, D] = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], clearCache = js.Any.fromFunction0(clearCache), getMatchingSelector = js.Any.fromFunction3(getMatchingSelector), keySelector = keySelector.asInstanceOf[js.Any], removeMatchingSelector = js.Any.fromFunction3(removeMatchingSelector))
      __obj.asInstanceOf[ClearCache[S, P, R, C, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearCache[?, ?, ?, ?, ?], S, P, R, C, D] (val x: Self & (ClearCache[S, P, R, C, D])) extends AnyVal {
      
      inline def setCache(value: ICacheObject): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      inline def setGetMatchingSelector(value: (S, P, /* repeated */ Any) => OutputParametricSelector[S, P, R, C, D]): Self = StObject.set(x, "getMatchingSelector", js.Any.fromFunction3(value))
      
      inline def setKeySelector(value: ParametricKeySelector[S, P]): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      inline def setRemoveMatchingSelector(value: (S, P, /* repeated */ Any) => Unit): Self = StObject.set(x, "removeMatchingSelector", js.Any.fromFunction3(value))
    }
  }
  
  trait InputSelectors[D, C, S] extends StObject {
    
    var inputSelectors: D
    
    def keySelector(state: S, args: Any*): Any
    @JSName("keySelector")
    var keySelector_Original: typings.reReselect.mod.KeySelector[S]
    
    var resultFunc: C
  }
  object InputSelectors {
    
    inline def apply[D, C, S](inputSelectors: D, keySelector: typings.reReselect.mod.KeySelector[S], resultFunc: C): InputSelectors[D, C, S] = {
      val __obj = js.Dynamic.literal(inputSelectors = inputSelectors.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], resultFunc = resultFunc.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputSelectors[D, C, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputSelectors[?, ?, ?], D, C, S] (val x: Self & (InputSelectors[D, C, S])) extends AnyVal {
      
      inline def setInputSelectors(value: D): Self = StObject.set(x, "inputSelectors", value.asInstanceOf[js.Any])
      
      inline def setKeySelector(value: typings.reReselect.mod.KeySelector[S]): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      inline def setResultFunc(value: C): Self = StObject.set(x, "resultFunc", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeySelector[D, C, S, P] extends StObject {
    
    var inputSelectors: D
    
    def keySelector(state: S, props: P, args: Any*): Any
    @JSName("keySelector")
    var keySelector_Original: ParametricKeySelector[S, P]
    
    var resultFunc: C
  }
  object KeySelector {
    
    inline def apply[D, C, S, P](inputSelectors: D, keySelector: ParametricKeySelector[S, P], resultFunc: C): KeySelector[D, C, S, P] = {
      val __obj = js.Dynamic.literal(inputSelectors = inputSelectors.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], resultFunc = resultFunc.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeySelector[D, C, S, P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeySelector[?, ?, ?, ?], D, C, S, P] (val x: Self & (KeySelector[D, C, S, P])) extends AnyVal {
      
      inline def setInputSelectors(value: D): Self = StObject.set(x, "inputSelectors", value.asInstanceOf[js.Any])
      
      inline def setKeySelector(value: ParametricKeySelector[S, P]): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      inline def setResultFunc(value: C): Self = StObject.set(x, "resultFunc", value.asInstanceOf[js.Any])
    }
  }
}
