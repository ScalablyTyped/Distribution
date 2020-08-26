package typings.psList.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessDescriptor extends js.Object {
  /**
  		Not supported on Windows.
  		*/
  val cmd: js.UndefOr[String] = js.native
  /**
  		Not supported on Windows.
  		*/
  val cpu: js.UndefOr[Double] = js.native
  /**
  		Not supported on Windows.
  		*/
  val memory: js.UndefOr[Double] = js.native
  val name: String = js.native
  val pid: Double = js.native
  val ppid: Double = js.native
  /**
  		Not supported on Windows.
  		*/
  val uid: js.UndefOr[Double] = js.native
}

object ProcessDescriptor {
  @scala.inline
  def apply(name: String, pid: Double, ppid: Double): ProcessDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDescriptor]
  }
  @scala.inline
  implicit class ProcessDescriptorOps[Self <: ProcessDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPpid(value: Double): Self = this.set("ppid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmd: Self = this.set("cmd", js.undefined)
    @scala.inline
    def setCpu(value: Double): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

