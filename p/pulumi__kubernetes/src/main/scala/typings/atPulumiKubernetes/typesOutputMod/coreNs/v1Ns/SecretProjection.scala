package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adapts a secret into a projected volume.
  *
  * The contents of the target Secret's Data field will be presented in a projected volume as
  * files using the keys in the Data field as the file names. Note that this is identical to a
  * secret volume source without the default mode.
  */
trait SecretProjection extends js.Object {
  /**
    * If unspecified, each key-value pair in the Data field of the referenced Secret will be
    * projected into the volume as a file whose name is the key and content is the value. If
    * specified, the listed keys will be projected into the specified paths, and unlisted keys
    * will not be present. If a key is specified which is not present in the Secret, the volume
    * setup will error unless it is marked optional. Paths must be relative and may not contain
    * the '..' path or start with '..'.
    */
  val items: js.Array[KeyToPath]
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String
  /**
    * Specify whether the Secret or its key must be defined
    */
  val optional: Boolean
}

object SecretProjection {
  @scala.inline
  def apply(items: js.Array[KeyToPath], name: String, optional: Boolean): SecretProjection = {
    val __obj = js.Dynamic.literal(items = items, name = name, optional = optional)
  
    __obj.asInstanceOf[SecretProjection]
  }
}

