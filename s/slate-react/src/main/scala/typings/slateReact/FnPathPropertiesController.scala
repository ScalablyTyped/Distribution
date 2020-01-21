package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.InlineProperties
import typings.slate.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnPathPropertiesController extends js.Object {
  def apply(path: Path, properties: String): Editor = js.native
  def apply(path: Path, properties: InlineProperties): Editor = js.native
}

