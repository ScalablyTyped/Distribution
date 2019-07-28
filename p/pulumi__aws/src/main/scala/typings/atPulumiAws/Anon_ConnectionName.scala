package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionName extends js.Object {
  var connectionName: String
  var exclusions: js.UndefOr[js.Array[String]] = js.undefined
  var path: String
}

object Anon_ConnectionName {
  @scala.inline
  def apply(connectionName: String, path: String, exclusions: js.Array[String] = null): Anon_ConnectionName = {
    val __obj = js.Dynamic.literal(connectionName = connectionName, path = path)
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    __obj.asInstanceOf[Anon_ConnectionName]
  }
}

