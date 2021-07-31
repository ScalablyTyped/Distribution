package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adapts a Secret into a volume.
  *
  * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
  */
trait SecretVolumeSource extends StObject {
  
  /**
    * Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: Double
  
  /**
    * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
    */
  var items: js.Array[KeyToPath]
  
  /**
    * Specify whether the Secret or its keys must be defined
    */
  var optional: Boolean
  
  /**
    * Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secretName: String
}
object SecretVolumeSource {
  
  @scala.inline
  def apply(defaultMode: Double, items: js.Array[KeyToPath], optional: Boolean, secretName: String): SecretVolumeSource = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretVolumeSource]
  }
  
  @scala.inline
  implicit class SecretVolumeSourceMutableBuilder[Self <: SecretVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMode(value: Double): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[KeyToPath]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: KeyToPath*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretName(value: String): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
  }
}
