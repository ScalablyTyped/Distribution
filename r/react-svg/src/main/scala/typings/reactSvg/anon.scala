package typings.reactSvg

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterInjection extends StObject {
    
    def afterInjection(): Unit
    
    def beforeInjection(): Unit
    
    var evalScripts: String
    
    var fallback: Null
    
    var loading: Null
    
    var renumerateIRIElements: Boolean
    
    var useRequestCache: Boolean
    
    var wrapper: String
  }
  object AfterInjection {
    
    @scala.inline
    def apply(
      afterInjection: () => Unit,
      beforeInjection: () => Unit,
      evalScripts: String,
      fallback: Null,
      loading: Null,
      renumerateIRIElements: Boolean,
      useRequestCache: Boolean,
      wrapper: String
    ): AfterInjection = {
      val __obj = js.Dynamic.literal(afterInjection = js.Any.fromFunction0(afterInjection), beforeInjection = js.Any.fromFunction0(beforeInjection), evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], useRequestCache = useRequestCache.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterInjection]
    }
    
    @scala.inline
    implicit class AfterInjectionMutableBuilder[Self <: AfterInjection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterInjection(value: () => Unit): Self = StObject.set(x, "afterInjection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeInjection(value: () => Unit): Self = StObject.set(x, "beforeInjection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEvalScripts(value: String): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallback(value: Null): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: Null): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseRequestCache(value: Boolean): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeInjection extends StObject {
    
    var afterInjection: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
    
    var beforeInjection: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
    
    var evalScripts: Requireable[String]
    
    var fallback: Requireable[String | js.Object]
    
    var loading: Requireable[String | js.Object]
    
    var renumerateIRIElements: Requireable[Boolean]
    
    var src: Validator[String]
    
    var useRequestCache: Requireable[Boolean]
    
    var wrapper: Requireable[String]
  }
  object BeforeInjection {
    
    @scala.inline
    def apply(
      afterInjection: Requireable[js.Function1[/* repeated */ js.Any, js.Any]],
      beforeInjection: Requireable[js.Function1[/* repeated */ js.Any, js.Any]],
      evalScripts: Requireable[String],
      fallback: Requireable[String | js.Object],
      loading: Requireable[String | js.Object],
      renumerateIRIElements: Requireable[Boolean],
      src: Validator[String],
      useRequestCache: Requireable[Boolean],
      wrapper: Requireable[String]
    ): BeforeInjection = {
      val __obj = js.Dynamic.literal(afterInjection = afterInjection.asInstanceOf[js.Any], beforeInjection = beforeInjection.asInstanceOf[js.Any], evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], useRequestCache = useRequestCache.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeInjection]
    }
    
    @scala.inline
    implicit class BeforeInjectionMutableBuilder[Self <: BeforeInjection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterInjection(value: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "afterInjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeInjection(value: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "beforeInjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalScripts(value: Requireable[String]): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallback(value: Requireable[String | js.Object]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: Requireable[String | js.Object]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenumerateIRIElements(value: Requireable[Boolean]): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: Validator[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseRequestCache(value: Requireable[Boolean]): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: Requireable[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasError extends StObject {
    
    var hasError: Boolean
    
    var isLoading: Boolean
  }
  object HasError {
    
    @scala.inline
    def apply(hasError: Boolean, isLoading: Boolean): HasError = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasError]
    }
    
    @scala.inline
    implicit class HasErrorMutableBuilder[Self <: HasError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
}
