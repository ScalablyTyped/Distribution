package typings.select2.mod

import typings.jquery.BaseJQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event[TElement, T] extends BaseJQueryEventObject {
  var params: T = js.native
}

