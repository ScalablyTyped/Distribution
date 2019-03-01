package typings
package serveDashIndexLib.serveDashIndexMod.serveIndexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var name: java.lang.String
  var stat: nodeLib.fsMod.Stats
}

object File {
  @scala.inline
  def apply(name: java.lang.String, stat: nodeLib.fsMod.Stats): File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("stat")(stat)
    __obj.asInstanceOf[File]
  }
}

