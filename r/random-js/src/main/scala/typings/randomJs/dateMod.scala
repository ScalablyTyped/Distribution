package typings.randomJs

import typings.randomJs.typesMod.Distribution
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/date", JSImport.Namespace)
@js.native
object dateMod extends js.Object {
  def date(start: Date, end: Date): Distribution[Date] = js.native
}

