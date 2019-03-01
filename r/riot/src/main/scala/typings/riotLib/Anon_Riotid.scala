package typings
package riotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Riotid extends js.Object {
  var _riot_id: scala.Double
  var tagName: java.lang.String
}

object Anon_Riotid {
  @scala.inline
  def apply(_riot_id: scala.Double, tagName: java.lang.String): Anon_Riotid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_riot_id")(_riot_id)
    __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[Anon_Riotid]
  }
}

