package typings.sammy.Sammy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  def formFor(name: String, `object`: js.Any, content_callback: js.Function): FormBuilder
}

@JSGlobal("Sammy.Form")
@js.native
object Form extends js.Object {
  def apply(app: js.Any): js.Any = js.native
}

