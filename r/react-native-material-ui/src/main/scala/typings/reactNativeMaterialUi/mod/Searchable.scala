package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.characters
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.none
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.sentences
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Searchable extends StObject {
  
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.undefined
  
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  var onSearchCloseRequested: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSearchClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSearchPressed: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
}
object Searchable {
  
  inline def apply(): Searchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchable]
  }
  
  extension [Self <: Searchable](x: Self) {
    
    inline def setAutoCapitalize(value: none | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnSearchCloseRequested(value: () => Unit): Self = StObject.set(x, "onSearchCloseRequested", js.Any.fromFunction0(value))
    
    inline def setOnSearchCloseRequestedUndefined: Self = StObject.set(x, "onSearchCloseRequested", js.undefined)
    
    inline def setOnSearchClosed(value: () => Unit): Self = StObject.set(x, "onSearchClosed", js.Any.fromFunction0(value))
    
    inline def setOnSearchClosedUndefined: Self = StObject.set(x, "onSearchClosed", js.undefined)
    
    inline def setOnSearchPressed(value: () => Unit): Self = StObject.set(x, "onSearchPressed", js.Any.fromFunction0(value))
    
    inline def setOnSearchPressedUndefined: Self = StObject.set(x, "onSearchPressed", js.undefined)
    
    inline def setOnSubmitEditing(value: () => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction0(value))
    
    inline def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
