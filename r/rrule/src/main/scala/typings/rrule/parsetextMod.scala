package typings.rrule

import typings.rrule.i18nMod.Language
import typings.rrule.typesMod.Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/nlp/parsetext", JSImport.Namespace)
@js.native
object parsetextMod extends js.Object {
  def default(text: String): Partial[Options] | Null = js.native
  def default(text: String, language: Language): Partial[Options] | Null = js.native
}

