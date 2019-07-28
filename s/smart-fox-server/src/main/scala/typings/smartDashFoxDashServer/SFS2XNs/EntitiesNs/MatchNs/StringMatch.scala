package typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Match.StringMatch")
@js.native
class StringMatch () extends js.Object

/* static members */
@JSGlobal("SFS2X.Entities.Match.StringMatch")
@js.native
object StringMatch extends js.Object {
  /** @type {StringMatch} An instance of StringMatch representing the following condition: string1.indexOf(string2) != -1 */
  var CONTAINS: StringMatch = js.native
  /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 ends with characters contained in string2. */
  var ENDS_WITH: StringMatch = js.native
  /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 == string2. */
  var EQUALS: StringMatch = js.native
  /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 != string2. */
  var NOT_EQUALS: StringMatch = js.native
  /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 starts with characters contained in string2. */
  var STARTS_WITH: StringMatch = js.native
}

