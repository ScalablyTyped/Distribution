package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var items: js.UndefOr[Input[js.Array[Input[KeyToPath]]]] = js.undefined
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specify whether the ConfigMap or its keys must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.undefined
}

object ConfigMapProjection {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[KeyToPath]]] = null,
    name: Input[String] = null,
    optional: Input[Boolean] = null
  ): ConfigMapProjection = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapProjection]
  }
}

