package typings.schemaDashUtils.schemaDashUtilsMod.SchemaUtils

import typings.ajv.ajvMod.ErrorObject
import typings.schemaDashUtils.schemaDashUtilsMod.PostFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationErrorConfiguration extends js.Object {
  var baseDataPath: String = js.native
  var name: String = js.native
  @JSName("postFormatter")
  var postFormatter_Original: PostFormatter = js.native
  def postFormatter(formattedError: String, error: ErrorObject): String = js.native
}

