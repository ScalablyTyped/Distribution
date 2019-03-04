package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, version: java.lang.String = null): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Id]
  }
}

