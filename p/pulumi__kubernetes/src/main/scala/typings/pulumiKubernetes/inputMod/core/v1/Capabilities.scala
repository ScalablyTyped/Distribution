package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds and removes POSIX capabilities from running containers.
  */
@js.native
trait Capabilities extends js.Object {
  /**
    * Added capabilities
    */
  var add: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Removed capabilities
    */
  var drop: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object Capabilities {
  @scala.inline
  def apply(): Capabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capabilities]
  }
  @scala.inline
  implicit class CapabilitiesOps[Self <: Capabilities] (val x: Self) extends AnyVal {
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
    def setAddVarargs(value: Input[String]*): Self = this.set("add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: Input[js.Array[Input[String]]]): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setDropVarargs(value: Input[String]*): Self = this.set("drop", js.Array(value :_*))
    @scala.inline
    def setDrop(value: Input[js.Array[Input[String]]]): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
  }
  
}

