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

