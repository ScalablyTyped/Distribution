package typings.reactUid.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdSourceType extends js.Object {
  var prefix: String = js.native
  var value: Double = js.native
  def uid(item: js.Any): String = js.native
  def uid(item: js.Any, index: Double): String = js.native
}

