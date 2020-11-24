package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.characters
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.none
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.sentences
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Searchable extends js.Object {
  
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
  implicit class SearchableOps[Self <: Searchable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoCapitalize(value: none | sentences | words | characters): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setOnChangeText(value: /* text */ String => Unit): Self = this.set("onChangeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeText: Self = this.set("onChangeText", js.undefined)
    
    @scala.inline
    def setOnSearchCloseRequested(value: () => Unit): Self = this.set("onSearchCloseRequested", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSearchCloseRequested: Self = this.set("onSearchCloseRequested", js.undefined)
    
    @scala.inline
    def setOnSearchClosed(value: () => Unit): Self = this.set("onSearchClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSearchClosed: Self = this.set("onSearchClosed", js.undefined)
    
    @scala.inline
    def setOnSearchPressed(value: () => Unit): Self = this.set("onSearchPressed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSearchPressed: Self = this.set("onSearchPressed", js.undefined)
    
    @scala.inline
    def setOnSubmitEditing(value: () => Unit): Self = this.set("onSubmitEditing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSubmitEditing: Self = this.set("onSubmitEditing", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
}
