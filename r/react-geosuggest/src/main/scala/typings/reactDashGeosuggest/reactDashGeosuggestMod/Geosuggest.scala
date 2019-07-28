package typings.reactDashGeosuggest.reactDashGeosuggestMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geosuggest
  extends Component[GeosuggestProps, js.Object, js.Any] {
  def blur(): Unit = js.native
  def clear(): Unit = js.native
  def focus(): Unit = js.native
  def selectSuggest(): Unit = js.native
  def selectSuggest(value: Suggest): Unit = js.native
  def update(value: String): Unit = js.native
}

