package typings.reactSvg

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactType
import typings.reactSvg.reactSvgStrings.div
import typings.reactSvg.reactSvgStrings.span
import typings.std.Error
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import typings.std.SVGElement
import typings.tanemSvgInjector.typesMod.BeforeEach
import typings.tanemSvgInjector.typesMod.Errback
import typings.tanemSvgInjector.typesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait BaseProps
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var afterInjection: js.UndefOr[Errback] = js.undefined
    
    var beforeInjection: js.UndefOr[BeforeEach] = js.undefined
    
    var evalScripts: js.UndefOr[EvalScripts] = js.undefined
    
    var fallback: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var loading: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
    
    var src: String
    
    var useRequestCache: js.UndefOr[Boolean] = js.undefined
    
    var wrapper: js.UndefOr[div | span] = js.undefined
  }
  object BaseProps {
    
    inline def apply(src: String): BaseProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProps]
    }
    
    extension [Self <: BaseProps](x: Self) {
      
      inline def setAfterInjection(value: (/* error */ Error | Null, /* svg */ js.UndefOr[SVGElement]) => Unit): Self = StObject.set(x, "afterInjection", js.Any.fromFunction2(value))
      
      inline def setAfterInjectionUndefined: Self = StObject.set(x, "afterInjection", js.undefined)
      
      inline def setBeforeInjection(value: /* svg */ SVGElement => Unit): Self = StObject.set(x, "beforeInjection", js.Any.fromFunction1(value))
      
      inline def setBeforeInjectionUndefined: Self = StObject.set(x, "beforeInjection", js.undefined)
      
      inline def setEvalScripts(value: EvalScripts): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      inline def setFallback(value: ReactType[js.Any]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setLoading(value: ReactType[js.Any]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElementsUndefined: Self = StObject.set(x, "renumerateIRIElements", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCache(value: Boolean): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCacheUndefined: Self = StObject.set(x, "useRequestCache", js.undefined)
      
      inline def setWrapper(value: div | span): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type Props = BaseProps & (DetailedHTMLProps[HTMLAttributes[WrapperType], WrapperType])
  
  trait State extends StObject {
    
    var hasError: Boolean
    
    var isLoading: Boolean
  }
  object State {
    
    inline def apply(hasError: Boolean, isLoading: Boolean): State = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
  
  type WrapperType = HTMLSpanElement | HTMLDivElement
}
