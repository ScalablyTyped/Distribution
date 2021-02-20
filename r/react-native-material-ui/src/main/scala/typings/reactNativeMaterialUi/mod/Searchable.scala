package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.characters
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.none
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.sentences
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Searchable extends StObject {
  
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.native
  
  var autoCorrect: js.UndefOr[Boolean] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  
  var onSearchCloseRequested: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSearchClosed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSearchPressed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
}
object Searchable {
  
  @scala.inline
  def apply(): Searchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchable]
  }
  
  @scala.inline
  implicit class SearchableMutableBuilder[Self <: Searchable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCapitalize(value: none | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    @scala.inline
    def setOnSearchCloseRequested(value: () => Unit): Self = StObject.set(x, "onSearchCloseRequested", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSearchCloseRequestedUndefined: Self = StObject.set(x, "onSearchCloseRequested", js.undefined)
    
    @scala.inline
    def setOnSearchClosed(value: () => Unit): Self = StObject.set(x, "onSearchClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSearchClosedUndefined: Self = StObject.set(x, "onSearchClosed", js.undefined)
    
    @scala.inline
    def setOnSearchPressed(value: () => Unit): Self = StObject.set(x, "onSearchPressed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSearchPressedUndefined: Self = StObject.set(x, "onSearchPressed", js.undefined)
    
    @scala.inline
    def setOnSubmitEditing(value: () => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
