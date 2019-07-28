package typings.prettyDashFormat.prettyDashFormatMod

import typings.prettyDashFormat.prettyDashFormatStrings.AsymmetricMatcher
import typings.prettyDashFormat.prettyDashFormatStrings.ConvertAnsi
import typings.prettyDashFormat.prettyDashFormatStrings.HTMLElement
import typings.prettyDashFormat.prettyDashFormatStrings.Immutable
import typings.prettyDashFormat.prettyDashFormatStrings.ReactElement
import typings.prettyDashFormat.prettyDashFormatStrings.ReactTestComponent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val plugins: Record[
    AsymmetricMatcher | ConvertAnsi | HTMLElement | Immutable | ReactElement | ReactTestComponent, 
    Plugin
  ] = js.native
  def apply(value: js.Any): String = js.native
  def apply(value: js.Any, options: Options): String = js.native
}

