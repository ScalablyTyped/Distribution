package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a
  * no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
  */
trait PreferredSchedulingTerm extends js.Object {
  /**
    * A node selector term, associated with the corresponding weight.
    */
  val preference: NodeSelectorTerm
  /**
    * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    */
  val weight: scala.Double
}

object PreferredSchedulingTerm {
  @scala.inline
  def apply(preference: NodeSelectorTerm, weight: scala.Double): PreferredSchedulingTerm = {
    val __obj = js.Dynamic.literal(preference = preference, weight = weight)
  
    __obj.asInstanceOf[PreferredSchedulingTerm]
  }
}

