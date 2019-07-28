package typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns

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
  val name: String
}

object Initializer {
  @scala.inline
  def apply(name: String): Initializer = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[Initializer]
  }
}

