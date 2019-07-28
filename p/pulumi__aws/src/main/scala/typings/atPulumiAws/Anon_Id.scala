package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var name: String
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: String, name: String, version: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Id]
  }
}

