package typings.rrule

import typings.rrule.datetimeMod.Time
import typings.rrule.typesMod.Options
import typings.rrule.typesMod.ParsedOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/parseoptions", JSImport.Namespace)
@js.native
object parseoptionsMod extends js.Object {
  def buildTimeset(opts: ParsedOptions): js.Array[Time] = js.native
  def initializeOptions(options: Partial[Options]): AnonByeaster = js.native
  def parseOptions(options: Partial[Options]): AnonParsedOptions = js.native
}

