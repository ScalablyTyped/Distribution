package typings.sanctuary

import typings.sanctuary.mod.Maybe
import typings.sanctuary.mod.NonNegativeInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var namespace: Maybe[String]
  var version: NonNegativeInteger
}

object AnonName {
  @scala.inline
  def apply(name: String, namespace: Maybe[String], version: NonNegativeInteger): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

