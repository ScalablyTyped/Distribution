package typings.pulumiKubernetes.outputMod.node.v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overhead structure represents the resource overhead associated with running a pod.
  */
@js.native
trait Overhead extends js.Object {
  /**
    * PodFixed represents the fixed resource overhead associated with running a pod.
    */
  var podFixed: StringDictionary[String] = js.native
}

object Overhead {
  @scala.inline
  def apply(podFixed: StringDictionary[String]): Overhead = {
    val __obj = js.Dynamic.literal(podFixed = podFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overhead]
  }
  @scala.inline
  implicit class OverheadOps[Self <: Overhead] (val x: Self) extends AnyVal {
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
    def setPodFixed(value: StringDictionary[String]): Self = this.set("podFixed", value.asInstanceOf[js.Any])
  }
  
}

