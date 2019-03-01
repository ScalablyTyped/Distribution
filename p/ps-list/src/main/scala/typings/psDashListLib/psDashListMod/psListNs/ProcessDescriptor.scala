package typings
package psDashListLib.psDashListMod.psListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessDescriptor extends js.Object {
  var cmd: js.UndefOr[java.lang.String] = js.undefined
  var cpu: js.UndefOr[scala.Double] = js.undefined
  var memory: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var pid: scala.Double
  var ppid: scala.Double
}

object ProcessDescriptor {
  @scala.inline
  def apply(
    name: java.lang.String,
    pid: scala.Double,
    ppid: scala.Double,
    cmd: java.lang.String = null,
    cpu: scala.Int | scala.Double = null,
    memory: scala.Int | scala.Double = null
  ): ProcessDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("ppid")(ppid)
    if (cmd != null) __obj.updateDynamic("cmd")(cmd)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDescriptor]
  }
}

