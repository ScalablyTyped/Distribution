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
    
    inline def apply(): ReadonlySearchBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySearchBoxProps]
    }
    
    extension [Self <: ReadonlySearchBoxProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
      
      inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
      
      inline def setFocusShortcuts(value: js.Array[String]): Self = StObject.set(x, "focusShortcuts", value.asInstanceOf[js.Any])
      
      inline def setFocusShortcutsUndefined: Self = StObject.set(x, "focusShortcuts", js.undefined)
      
      inline def setFocusShortcutsVarargs(value: String*): Self = StObject.set(x, "focusShortcuts", js.Array(value :_*))
      
      inline def setLoadingIndicator(value: Element): Self = StObject.set(x, "loadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
      
      inline def setOnChange(value: /* event */ SyntheticEvent[HTMLInputElement, Event] => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnReset(value: /* event */ SyntheticEvent[HTMLFormElement, Event] => js.Any): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSubmit(value: /* event */ SyntheticEvent[HTMLFormElement, Event] => js.Any): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setReset(value: Element): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setSearchAsYouType(value: Boolean): Self = StObject.set(x, "searchAsYouType", value.asInstanceOf[js.Any])
      
      inline def setSearchAsYouTypeUndefined: Self = StObject.set(x, "searchAsYouType", js.undefined)
      
      inline def setShowLoadingIndicator(value: Boolean): Self = StObject.set(x, "showLoadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowLoadingIndicatorUndefined: Self = StObject.set(x, "showLoadingIndicator", js.undefined)
      
      inline def setSubmit(value: Element): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      inline def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ js.Any, js.Any])]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-dom.anon.Translations> */
  trait ReadonlyTranslations extends StObject {
    
    val translations: js.UndefOr[StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]] = js.undefined
  }
  object ReadonlyTranslations {
    
    inline def apply(): ReadonlyTranslations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyTranslations]
    }
    
    extension [Self <: ReadonlyTranslations](x: Self) {
      
      inline def setTranslations(value: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
