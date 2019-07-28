package typings.psDashList.psDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessDescriptor extends js.Object {
  /**
  		Not supported on Windows.
  		*/
  val cmd: js.UndefOr[String] = js.undefined
  /**
  		Not supported on Windows.
  		*/
  val cpu: js.UndefOr[Double] = js.undefined
  /**
  		Not supported on Windows.
  		*/
  val memory: js.UndefOr[Double] = js.undefined
  val name: String
  val pid: Double
  val ppid: Double
  /**
  		Not supported on Windows.
  		*/
  val uid: js.UndefOr[Double] = js.undefined
}

object ProcessDescriptor {
  @scala.inline
  def apply(
    name: String,
    pid: Double,
    ppid: Double,
    cmd: String = null,
    cpu: Int | Double = null,
    memory: Int | Double = null,
    uid: Int | Double = null
  ): ProcessDescriptor = {
    val __obj = js.Dynamic.literal(name = name, pid = pid, ppid = ppid)
    if (cmd != null) __obj.updateDynamic("cmd")(cmd)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDescriptor]
  }
}

