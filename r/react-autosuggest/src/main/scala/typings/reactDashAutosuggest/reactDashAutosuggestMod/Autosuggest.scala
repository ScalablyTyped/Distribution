package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.react.reactMod.Component
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autosuggest[T]
  extends Component[AutosuggestProps[T], AutosuggestState[T], js.Any] {
  /**
    * Autosuggest exposes these class properties to the parent component.
    * They can be accessed through `ref`.
    */
  var input: js.UndefOr[HTMLInputElement] = js.native
}

