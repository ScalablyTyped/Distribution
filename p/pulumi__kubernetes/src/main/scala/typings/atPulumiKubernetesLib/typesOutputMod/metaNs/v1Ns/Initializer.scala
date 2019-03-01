package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializer is information about an initializer that has not yet completed.
  */
trait Initializer extends js.Object {
  /**
    * name of the process that is responsible for initializing this object.
    */
  val name: java.lang.String
}

object Initializer {
  @scala.inline
  def apply(name: java.lang.String): Initializer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Initializer]
  }
}

