package typings.squirrelly.squirrellyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("squirrelly", "Render")
@js.native
object Render extends js.Object {
  def apply(template: String, options: TemplateOptions): String = js.native
  def apply(template: SqrlFn, options: TemplateOptions): String = js.native
}

