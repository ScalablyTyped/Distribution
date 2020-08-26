package typings.reactPlacesAutocomplete.mod

import typings.react.mod.ReactNode
import typings.reactPlacesAutocomplete.anon.Bounds
import typings.reactPlacesAutocomplete.anon.Readonlyloadingbooleansug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropTypes extends js.Object {
  var debounce: js.UndefOr[Double] = js.native
  var googleCallbackName: js.UndefOr[String] = js.native
  var highlightFirstSuggestion: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onError: js.UndefOr[
    js.Function2[/* status */ String, /* clearSuggestion */ js.Function0[Unit], Unit]
  ] = js.native
  var onSelect: js.UndefOr[js.Function2[/* address */ String, /* placeID */ String, Unit]] = js.native
  var searchOptions: js.UndefOr[Bounds] = js.native
  var shouldFetchSuggestions: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
  def children(opts: Readonlyloadingbooleansug): ReactNode = js.native
}

object PropTypes {
  @scala.inline
  def apply(children: Readonlyloadingbooleansug => ReactNode): PropTypes = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[PropTypes]
  }
  @scala.inline
  implicit class PropTypesOps[Self <: PropTypes] (val x: Self) extends AnyVal {
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
    def setChildren(value: Readonlyloadingbooleansug => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    @scala.inline
    def setGoogleCallbackName(value: String): Self = this.set("googleCallbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleCallbackName: Self = this.set("googleCallbackName", js.undefined)
    @scala.inline
    def setHighlightFirstSuggestion(value: Boolean): Self = this.set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightFirstSuggestion: Self = this.set("highlightFirstSuggestion", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnError(value: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* address */ String, /* placeID */ String) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setSearchOptions(value: Bounds): Self = this.set("searchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchOptions: Self = this.set("searchOptions", js.undefined)
    @scala.inline
    def setShouldFetchSuggestions(value: Boolean): Self = this.set("shouldFetchSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldFetchSuggestions: Self = this.set("shouldFetchSuggestions", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

