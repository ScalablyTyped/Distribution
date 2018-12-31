package typings
package atPulumiAwsLib.ssmGetDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentArgs extends js.Object {
  /**
    * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
    */
  val documentFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The document version for which you want information.
    */
  val documentVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  val name: java.lang.String
}

