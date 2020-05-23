package typings.snykRpmParser.distTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser/dist/types", "ParserError")
@js.native
class ParserError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, context: js.Any) = this()
  val context: js.UndefOr[js.Any] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

