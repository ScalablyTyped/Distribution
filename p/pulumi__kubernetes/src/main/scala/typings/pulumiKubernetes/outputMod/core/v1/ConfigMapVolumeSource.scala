package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adapts a ConfigMap into a volume.
  *
  * The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
  */
@js.native
trait ConfigMapVolumeSource extends js.Object {
  /**
    * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: Double = js.native
  /**
    * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
    */
  var items: js.Array[KeyToPath] = js.native
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String = js.native
  /**
    * Specify whether the ConfigMap or its keys must be defined
    */
  var optional: Boolean = js.native
}

object ConfigMapVolumeSource {
  @scala.inline
  def apply(defaultMode: Double, items: js.Array[KeyToPath], name: String, optional: Boolean): ConfigMapVolumeSource = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapVolumeSource]
  }
  @scala.inline
  implicit class ConfigMapVolumeSourceOps[Self <: ConfigMapVolumeSource] (val x: Self) extends AnyVal {
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
    def setDefaultMode(value: Double): Self = this.set("defaultMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: KeyToPath*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[KeyToPath]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
  }
  
}

