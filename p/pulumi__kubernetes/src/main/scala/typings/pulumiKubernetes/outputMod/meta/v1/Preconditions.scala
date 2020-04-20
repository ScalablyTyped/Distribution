package typings.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
  */
trait Preconditions extends js.Object {
  /**
    * Specifies the target ResourceVersion
    */
  val resourceVersion: String
  /**
    * Specifies the target UID.
    */
  val uid: String
}

object Preconditions {
  @scala.inline
  def apply(resourceVersion: String, uid: String): Preconditions = {
    val __obj = js.Dynamic.literal(resourceVersion = resourceVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preconditions]
  }
}

