package typings.reReselect

import typings.reReselect.mod.ICacheObject
import typings.reReselect.mod.OutputParametricSelector
import typings.reReselect.mod.OutputSelector
import typings.reReselect.mod.ParametricKeySelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cache[S, R, C, D] extends StObject {
    
    var cache: ICacheObject = js.native
    
    def clearCache(): Unit = js.native
    
    def getMatchingSelector(state: S, args: js.Any*): OutputSelector[S, R, C, D] = js.native
    
    def keySelector(state: S, args: js.Any*): js.Any = js.native
    @JSName("keySelector")
    var keySelector_Original: typings.reReselect.mod.KeySelector[S] = js.native
    
    def removeMatchingSelector(state: S, args: js.Any*): Unit = js.native
  }
  
  @js.native
  trait CacheSize extends StObject {
    
    var cacheSize: Double = js.native
  }
  object CacheSize {
    
    @scala.inline
    def apply(cacheSize: Double): CacheSize = {
      val __obj = js.Dynamic.literal(cacheSize = cacheSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheSize]
    }
    
    @scala.inline
    implicit class CacheSizeMutableBuilder[Self <: CacheSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClearCache[S, P, R, C, D] extends StObject {
    
    var cache: ICacheObject = js.native
    
    def clearCache(): Unit = js.native
    
    def getMatchingSelector(state: S, props: P, args: js.Any*): OutputParametricSelector[S, P, R, C, D] = js.native
    
    def keySelector(state: S, props: P, args: js.Any*): js.Any = js.native
    @JSName("keySelector")
    var keySelector_Original: ParametricKeySelector[S, P] = js.native
    
    def removeMatchingSelector(state: S, props: P, args: js.Any*): Unit = js.native
  }
  
  @js.native
  trait Dependencies[C, D] extends StObject {
    
    var dependencies: D = js.native
    
    def recomputations(): Double = js.native
    
    def resetRecomputations(): Double = js.native
    
    var resultFunc: C = js.native
  }
  object Dependencies {
    
    @scala.inline
    def apply[C, D](dependencies: D, recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): Dependencies[C, D] = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependencies[C, D]]
    }
    
    @scala.inline
    implicit class DependenciesMutableBuilder[Self <: Dependencies[_, _], C, D] (val x: Self with (Dependencies[C, D])) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: D): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecomputations(value: () => Double): Self = StObject.set(x, "recomputations", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetRecomputations(value: () => Double): Self = StObject.set(x, "resetRecomputations", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResultFunc(value: C): Self = StObject.set(x, "resultFunc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InputSelectors[D, C, S] extends StObject {
    
    var inputSelectors: D = js.native
    
    def keySelector(state: S, args: js.Any*): js.Any = js.native
    @JSName("keySelector")
    var keySelector_Original: typings.reReselect.mod.KeySelector[S] = js.native
    
    var resultFunc: C = js.native
  }
  
  @js.native
  trait KeySelector[D, C, S, P] extends StObject {
    
    var inputSelectors: D = js.native
    
    def keySelector(state: S, props: P, args: js.Any*): js.Any = js.native
    @JSName("keySelector")
    var keySelector_Original: ParametricKeySelector[S, P] = js.native
    
    var resultFunc: C = js.native
  }
}
