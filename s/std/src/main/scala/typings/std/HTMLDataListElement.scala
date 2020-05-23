package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond the HTMLElement object interface it also has available to it by inheritance) to manipulate <datalist> elements and their content. */
@js.native
trait HTMLDataListElement extends HTMLElement {
  val options: HTMLCollectionOf[HTMLOptionElement] = js.native
}

