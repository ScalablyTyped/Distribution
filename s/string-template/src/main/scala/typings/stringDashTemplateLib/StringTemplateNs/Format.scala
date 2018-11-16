package typings
package stringDashTemplateLib.StringTemplateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Format
     */
@js.native
trait Format extends js.Object {
  // Escape {} pairs by using double {{}} 
  def apply(string: java.lang.String): java.lang.String = js.native
  // Format using optional arguments 
  def apply(string: java.lang.String, array: js.Any*): java.lang.String = js.native
  // Format using a number indexed array
  def apply(string: java.lang.String, array: js.Array[_]): java.lang.String = js.native
  // Format using an object hash with keys matching [0-9a-zA-Z]+ 
  def apply(string: java.lang.String, `object`: js.Any): java.lang.String = js.native
}

