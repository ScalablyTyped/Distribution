package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionName extends js.Object {
  var connectionName: java.lang.String
  var exclusions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var path: java.lang.String
}

object Anon_ConnectionName {
  @scala.inline
  def apply(
    connectionName: java.lang.String,
    path: java.lang.String,
    exclusions: js.Array[java.lang.String] = null
  ): Anon_ConnectionName = {
    val __obj = js.Dynamic.literal(connectionName = connectionName, path = path)
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    __obj.asInstanceOf[Anon_ConnectionName]
  }
}

