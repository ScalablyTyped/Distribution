package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fix extends js.Object {
  /**
    * One or more artifact changes that comprise a fix for a result.
    */
  var artifactChanges: js.Array[ArtifactChange]
  /**
    * A message that describes the proposed fix, enabling viewers to present the proposed change to an end user.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the fix.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Fix {
  @scala.inline
  def apply(
    artifactChanges: js.Array[ArtifactChange],
    description: Message = null,
    properties: PropertyBag = null
  ): Fix = {
    val __obj = js.Dynamic.literal(artifactChanges = artifactChanges)
    if (description != null) __obj.updateDynamic("description")(description)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Fix]
  }
}

