package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdRevision extends js.Object {
  var id: java.lang.String
  var revision: scala.Double
}

object Anon_IdRevision {
  @scala.inline
  def apply(id: java.lang.String, revision: scala.Double): Anon_IdRevision = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[Anon_IdRevision]
  }
}

