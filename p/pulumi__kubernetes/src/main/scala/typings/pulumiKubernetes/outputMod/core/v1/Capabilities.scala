package typings.pulumiKubernetes.outputMod.core.v1

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
  var add: js.Array[String] = js.native
  /**
    * Removed capabilities
    */
  var drop: js.Array[String] = js.native
}

object Capabilities {
  @scala.inline
  def apply(add: js.Array[String], drop: js.Array[String]): Capabilities = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
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
    def setAddVarargs(value: String*): Self = this.set("add", js.Array(value :_*))
    @scala.inline
    def setAdd(value: js.Array[String]): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropVarargs(value: String*): Self = this.set("drop", js.Array(value :_*))
    @scala.inline
    def setDrop(value: js.Array[String]): Self = this.set("drop", value.asInstanceOf[js.Any])
  }
  
}

