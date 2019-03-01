package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValues extends js.Object {
  var key: java.lang.String
  var values: js.Array[java.lang.String]
}

object Anon_KeyValues {
  @scala.inline
  def apply(key: java.lang.String, values: js.Array[java.lang.String]): Anon_KeyValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Anon_KeyValues]
  }
}

