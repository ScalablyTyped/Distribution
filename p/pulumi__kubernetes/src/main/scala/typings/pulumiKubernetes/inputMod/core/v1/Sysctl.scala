package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sysctl defines a kernel parameter to be set
  */
@js.native
trait Sysctl extends js.Object {
  /**
    * Name of a property to set
    */
  var name: Input[String] = js.native
  /**
    * Value of a property to set
    */
  var value: Input[String] = js.native
}

object Sysctl {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): Sysctl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sysctl]
  }
  @scala.inline
  implicit class SysctlOps[Self <: Sysctl] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

