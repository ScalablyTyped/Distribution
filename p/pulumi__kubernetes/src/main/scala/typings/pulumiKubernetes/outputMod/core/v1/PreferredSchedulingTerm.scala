package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
  */
@js.native
trait PreferredSchedulingTerm extends js.Object {
  /**
    * A node selector term, associated with the corresponding weight.
    */
  var preference: NodeSelectorTerm = js.native
  /**
    * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    */
  var weight: Double = js.native
}

object PreferredSchedulingTerm {
  @scala.inline
  def apply(preference: NodeSelectorTerm, weight: Double): PreferredSchedulingTerm = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredSchedulingTerm]
  }
  @scala.inline
  implicit class PreferredSchedulingTermOps[Self <: PreferredSchedulingTerm] (val x: Self) extends AnyVal {
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
    def setPreference(value: NodeSelectorTerm): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

