package typings.reactSvg

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterInjection extends StObject {
    
    def afterInjection(): Unit
    
    def beforeInjection(): Unit
    
    var evalScripts: String
    
    var fallback: Null
    
    var httpRequestWithCredentials: Boolean
    
    var loading: Null
    
    var renumerateIRIElements: Boolean
    
    var useRequestCache: Boolean
    
    var wrapper: String
  }
  object AfterInjection {
    
    inline def apply(
      afterInjection: () => Unit,
      beforeInjection: () => Unit,
      evalScripts: String,
      fallback: Null,
      httpRequestWithCredentials: Boolean,
      loading: Null,
      renumerateIRIElements: Boolean,
      useRequestCache: Boolean,
      wrapper: String
    ): AfterInjection = {
      val __obj = js.Dynamic.literal(afterInjection = js.Any.fromFunction0(afterInjection), beforeInjection = js.Any.fromFunction0(beforeInjection), evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], httpRequestWithCredentials = httpRequestWithCredentials.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], useRequestCache = useRequestCache.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterInjection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterInjection] (val x: Self) extends AnyVal {
      
      inline def setAfterInjection(value: () => Unit): Self = StObject.set(x, "afterInjection", js.Any.fromFunction0(value))
      
      inline def setBeforeInjection(value: () => Unit): Self = StObject.set(x, "beforeInjection", js.Any.fromFunction0(value))
      
      inline def setEvalScripts(value: String): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: Null): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestWithCredentials(value: Boolean): Self = StObject.set(x, "httpRequestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Null): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCache(value: Boolean): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeInjection extends StObject {
    
    var afterInjection: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var beforeInjection: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var evalScripts: Requireable[String]
    
    var fallback: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]]
    
    var httpRequestWithCredentials: Requireable[Boolean]
    
    var loading: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]]
    
    var renumerateIRIElements: Requireable[Boolean]
    
    var src: Validator[String]
    
    var useRequestCache: Requireable[Boolean]
    
    var wrapper: Requireable[String]
  }
  object BeforeInjection {
    
    inline def apply(
      afterInjection: Requireable[js.Function1[/* repeated */ Any, Any]],
      beforeInjection: Requireable[js.Function1[/* repeated */ Any, Any]],
      evalScripts: Requireable[String],
      fallback: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]],
      httpRequestWithCredentials: Requireable[Boolean],
      loading: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]],
      renumerateIRIElements: Requireable[Boolean],
      src: Validator[String],
      useRequestCache: Requireable[Boolean],
      wrapper: Requireable[String]
    ): BeforeInjection = {
      val __obj = js.Dynamic.literal(afterInjection = afterInjection.asInstanceOf[js.Any], beforeInjection = beforeInjection.asInstanceOf[js.Any], evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], httpRequestWithCredentials = httpRequestWithCredentials.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], useRequestCache = useRequestCache.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeInjection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeInjection] (val x: Self) extends AnyVal {
      
      inline def setAfterInjection(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "afterInjection", value.asInstanceOf[js.Any])
      
      inline def setBeforeInjection(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "beforeInjection", value.asInstanceOf[js.Any])
      
      inline def setEvalScripts(value: Requireable[String]): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestWithCredentials(value: Requireable[Boolean]): Self = StObject.set(x, "httpRequestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElements(value: Requireable[Boolean]): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: Validator[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCache(value: Requireable[Boolean]): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: Requireable[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasError extends StObject {
    
    var hasError: Boolean
    
    var isLoading: Boolean
  }
  object HasError {
    
    inline def apply(hasError: Boolean, isLoading: Boolean): HasError = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasError] (val x: Self) extends AnyVal {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
}
