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
    
    @scala.inline
    def apply(src: String): BaseProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProps]
    }
    
    @scala.inline
    implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterInjection(value: (/* error */ Error | Null, /* svg */ js.UndefOr[SVGElement]) => Unit): Self = StObject.set(x, "afterInjection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterInjectionUndefined: Self = StObject.set(x, "afterInjection", js.undefined)
      
      @scala.inline
      def setBeforeInjection(value: /* svg */ SVGElement => Unit): Self = StObject.set(x, "beforeInjection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeInjectionUndefined: Self = StObject.set(x, "beforeInjection", js.undefined)
      
      @scala.inline
      def setEvalScripts(value: EvalScripts): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      @scala.inline
      def setFallback(value: ReactType[js.Any]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setLoading(value: ReactType[js.Any]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenumerateIRIElementsUndefined: Self = StObject.set(x, "renumerateIRIElements", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseRequestCache(value: Boolean): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseRequestCacheUndefined: Self = StObject.set(x, "useRequestCache", js.undefined)
      
      @scala.inline
      def setWrapper(value: div | span): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type Props = BaseProps & (DetailedHTMLProps[HTMLAttributes[WrapperType], WrapperType])
  
  trait State extends StObject {
    
    var hasError: Boolean
    
    var isLoading: Boolean
  }
  object State {
    
    @scala.inline
    def apply(hasError: Boolean, isLoading: Boolean): State = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
  
  type WrapperType = HTMLSpanElement | HTMLDivElement
}
