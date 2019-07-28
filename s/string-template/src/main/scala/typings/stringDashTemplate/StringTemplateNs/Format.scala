package typings.stringDashTemplate.StringTemplateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Format
  */
@js.native
trait Format extends js.Object {
  // Escape {} pairs by using double {{}} 
  def apply(string: String): String = js.native
  // Format using optional arguments 
  def apply(string: String, array: js.Any*): String = js.native
  // Format using a number indexed array
  def apply(string: String, array: js.Array[_]): String = js.native
  // Format using an object hash with keys matching [0-9a-zA-Z]+ 
  def apply(string: String, `object`: js.Any): String = js.native
}

