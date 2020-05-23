package typings.psList.mod

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
    cpu: js.UndefOr[Double] = js.undefined,
    memory: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined
  ): ProcessDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
    if (cmd != null) __obj.updateDynamic("cmd")(cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDescriptor]
  }
}

