package typings.stringifyObject

import typings.stringifyObject.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stringify-object", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(input: js.Any): String = js.native
  def apply(input: js.Any, options: js.UndefOr[scala.Nothing], pad: String): String = js.native
  def apply(input: js.Any, options: Filter): String = js.native
  def apply(input: js.Any, options: Filter, pad: String): String = js.native
}

