package typings.snykNodejsLockfileParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeVersion extends js.Object {
  var nodeVersion: String
}

object NodeVersion {
  @scala.inline
  def apply(nodeVersion: String): NodeVersion = {
    val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeVersion]
  }
}

