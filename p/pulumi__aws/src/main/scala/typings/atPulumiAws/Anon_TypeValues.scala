package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValues extends js.Object {
  var `type`: String
  var values: js.Array[String]
}

object Anon_TypeValues {
  @scala.inline
  def apply(`type`: String, values: js.Array[String]): Anon_TypeValues = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeValues]
  }
}

