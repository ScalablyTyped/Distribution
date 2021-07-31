package typings.reactInstantsearch

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-instantsearch-dom.react-instantsearch-dom.SearchBoxProps> */
  trait ReadonlySearchBoxProps extends StObject {
    
    val autoFocus: js.UndefOr[Boolean] = js.undefined
    
    val defaultRefinement: js.UndefOr[String] = js.undefined
    
    val focusShortcuts: js.UndefOr[js.Array[String]] = js.undefined
    
    val loadingIndicator: js.UndefOr[Element] = js.undefined
    
    val onChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLInputElement, Event], js.Any]] = js.undefined
    
    val onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLFormElement, Event], js.Any]] = js.undefined
    
    val onSubmit: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLFormElement, Event], js.Any]] = js.undefined
    
    val reset: js.UndefOr[Element] = js.undefined
    
    val searchAsYouType: js.UndefOr[Boolean] = js.undefined
    
    val showLoadingIndicator: js.UndefOr[Boolean] = js.undefined
    
    val submit: js.UndefOr[Element] = js.undefined
    
    val translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ js.Any, js.Any])]] = js.undefined
  }
  object ReadonlySearchBoxProps {
    
    @scala.inline
    def apply(): ReadonlySearchBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySearchBoxProps]
    }
    
    @scala.inline
    implicit class ReadonlySearchBoxPropsMutableBuilder[Self <: ReadonlySearchBoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
      
      @scala.inline
      def setFocusShortcuts(value: js.Array[String]): Self = StObject.set(x, "focusShortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusShortcutsUndefined: Self = StObject.set(x, "focusShortcuts", js.undefined)
      
      @scala.inline
      def setFocusShortcutsVarargs(value: String*): Self = StObject.set(x, "focusShortcuts", js.Array(value :_*))
      
      @scala.inline
      def setLoadingIndicator(value: Element): Self = StObject.set(x, "loadingIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ SyntheticEvent[HTMLInputElement, Event] => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: /* event */ SyntheticEvent[HTMLFormElement, Event] => js.Any): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* event */ SyntheticEvent[HTMLFormElement, Event] => js.Any): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setReset(value: Element): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setSearchAsYouType(value: Boolean): Self = StObject.set(x, "searchAsYouType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchAsYouTypeUndefined: Self = StObject.set(x, "searchAsYouType", js.undefined)
      
      @scala.inline
      def setShowLoadingIndicator(value: Boolean): Self = StObject.set(x, "showLoadingIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLoadingIndicatorUndefined: Self = StObject.set(x, "showLoadingIndicator", js.undefined)
      
      @scala.inline
      def setSubmit(value: Element): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      @scala.inline
      def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ js.Any, js.Any])]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-dom.anon.Translations> */
  trait ReadonlyTranslations extends StObject {
    
    val translations: js.UndefOr[StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]] = js.undefined
  }
  object ReadonlyTranslations {
    
    @scala.inline
    def apply(): ReadonlyTranslations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyTranslations]
    }
    
    @scala.inline
    implicit class ReadonlyTranslationsMutableBuilder[Self <: ReadonlyTranslations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslations(value: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
