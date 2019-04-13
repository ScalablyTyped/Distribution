package typings
package psDashListLib.psDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessDescriptor extends js.Object {
  /**
  		Not supported on Windows.
  		*/
  val cmd: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Not supported on Windows.
  		*/
  val cpu: js.UndefOr[scala.Double] = js.undefined
  /**
  		Not supported on Windows.
  		*/
  val memory: js.UndefOr[scala.Double] = js.undefined
  val name: java.lang.String
  val pid: scala.Double
  val ppid: scala.Double
  /**
  		Not supported on Windows.
  		*/
  val uid: js.UndefOr[scala.Double] = js.undefined
}

object ProcessDescriptor {
  @scala.inline
  def apply(
    name: java.lang.String,
    pid: scala.Double,
    ppid: scala.Double,
    cmd: java.lang.String = null,
    cpu: scala.Int | scala.Double = null,
    memory: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null
  ): ProcessDescriptor = {
    val __obj = js.Dynamic.literal(name = name, pid = pid, ppid = ppid)
    if (cmd != null) __obj.updateDynamic("cmd")(cmd)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDescriptor]
  }
}

