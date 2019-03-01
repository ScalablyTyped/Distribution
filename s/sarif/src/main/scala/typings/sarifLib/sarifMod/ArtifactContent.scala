package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactContent extends js.Object {
  /**
    * MIME Base64-encoded content from a binary artifact, or from a text artifact in its original encoding.
    */
  var binary: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the artifact content.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * UTF-8-encoded content from a text artifact.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ArtifactContent {
  @scala.inline
  def apply(binary: java.lang.String = null, properties: PropertyBag = null, text: java.lang.String = null): ArtifactContent = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ArtifactContent]
  }
}

