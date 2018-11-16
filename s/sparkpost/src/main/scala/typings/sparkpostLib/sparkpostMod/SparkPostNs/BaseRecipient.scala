package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseRecipient extends js.Object {
  /** Key/value pairs associated with a recipient. */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /** SparkPost Enterprise API only. Email to use for envelope FROM. */
  var return_path: js.UndefOr[java.lang.String] = js.undefined
  /** Key/value pairs associated with a recipient that are provided to the substitution engine. */
  var substitution_data: js.UndefOr[js.Any] = js.undefined
  /** Array of text labels associated with a recipient. */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

