package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adapts a Secret into a volume.
  *
  * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
  */
@js.native
trait SecretVolumeSource extends js.Object {
  /**
    * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: Double = js.native
  /**
    * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
    */
  var items: js.Array[KeyToPath] = js.native
  /**
    * Specify whether the Secret or its keys must be defined
    */
  var optional: Boolean = js.native
  /**
    * Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secretName: String = js.native
}

object SecretVolumeSource {
  @scala.inline
  def apply(defaultMode: Double, items: js.Array[KeyToPath], optional: Boolean, secretName: String): SecretVolumeSource = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretVolumeSource]
  }
  @scala.inline
  implicit class SecretVolumeSourceOps[Self <: SecretVolumeSource] (val x: Self) extends AnyVal {
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
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretName(value: String): Self = this.set("secretName", value.asInstanceOf[js.Any])
  }
  
}

