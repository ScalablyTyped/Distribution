package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adapts a ConfigMap into a projected volume.
  *
  * The contents of the target ConfigMap's Data field will be presented in a projected volume as
  * files using the keys in the Data field as the file names, unless the items element is
  * populated with specific mappings of keys to paths. Note that this is identical to a configmap
  * volume source without the default mode.
  */
trait ConfigMapProjection extends js.Object {
  /**
    * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be
    * projected into the volume as a file whose name is the key and content is the value. If
    * specified, the listed keys will be projected into the specified paths, and unlisted keys
    * will not be present. If a key is specified which is not present in the ConfigMap, the
    * volume setup will error unless it is marked optional. Paths must be relative and may not
    * contain the '..' path or start with '..'.
    */
  val items: js.Array[KeyToPath]
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: java.lang.String
  /**
    * Specify whether the ConfigMap or it's keys must be defined
    */
  val optional: scala.Boolean
}

object ConfigMapProjection {
  @scala.inline
  def apply(items: js.Array[KeyToPath], name: java.lang.String, optional: scala.Boolean): ConfigMapProjection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[ConfigMapProjection]
  }
}

