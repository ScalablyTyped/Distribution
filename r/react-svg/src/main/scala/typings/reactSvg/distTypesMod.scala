package typings.reactSvg

import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.SVGProps
import typings.reactSvg.reactSvgStrings.div
import typings.reactSvg.reactSvgStrings.span
import typings.reactSvg.reactSvgStrings.svg
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.SVGSVGElement
import typings.tanemSvgInjector.distTypesMod.BeforeEach
import typings.tanemSvgInjector.distTypesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait BaseProps extends StObject {
    
    var afterInjection: js.UndefOr[js.Function1[/* svg */ SVGSVGElement, Unit]] = js.undefined
    
    var beforeInjection: js.UndefOr[BeforeEach] = js.undefined
    
    var desc: js.UndefOr[String] = js.undefined
    
    var evalScripts: js.UndefOr[EvalScripts] = js.undefined
    
    var fallback: js.UndefOr[ElementType[Any]] = js.undefined
    
    var httpRequestWithCredentials: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[ElementType[Any]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
    
    var src: String
    
    var title: js.UndefOr[String] = js.undefined
    
    var useRequestCache: js.UndefOr[Boolean] = js.undefined
    
    var wrapper: js.UndefOr[div | span | svg] = js.undefined
  }
  object BaseProps {
    
    inline def apply(src: String): BaseProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
      inline def setAfterInjection(value: /* svg */ SVGSVGElement => Unit): Self = StObject.set(x, "afterInjection", js.Any.fromFunction1(value))
      
      inline def setAfterInjectionUndefined: Self = StObject.set(x, "afterInjection", js.undefined)
      
      inline def setBeforeInjection(value: /* svg */ SVGSVGElement => Unit): Self = StObject.set(x, "beforeInjection", js.Any.fromFunction1(value))
      
      inline def setBeforeInjectionUndefined: Self = StObject.set(x, "beforeInjection", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setEvalScripts(value: EvalScripts): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      inline def setFallback(value: ElementType[Any]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setHttpRequestWithCredentials(value: Boolean): Self = StObject.set(x, "httpRequestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestWithCredentialsUndefined: Self = StObject.set(x, "httpRequestWithCredentials", js.undefined)
      
      inline def setLoading(value: ElementType[Any]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElementsUndefined: Self = StObject.set(x, "renumerateIRIElements", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUseRequestCache(value: Boolean): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCacheUndefined: Self = StObject.set(x, "useRequestCache", js.undefined)
      
      inline def setWrapper(value: div | span | svg): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type HTMLWrapperType = HTMLSpanElement | HTMLDivElement
  
  type Props = BaseProps & (DetailedHTMLProps[HTMLAttributes[HTMLWrapperType], HTMLWrapperType]) & SVGProps[SVGWrapperType]
  
  type SVGWrapperType = SVGSVGElement
  
  trait State extends StObject {
    
    var hasError: Boolean
    
    var isLoading: Boolean
  }
  object State {
    
    inline def apply(hasError: Boolean, isLoading: Boolean): State = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
  
  type WrapperType = HTMLWrapperType | SVGWrapperType
}
