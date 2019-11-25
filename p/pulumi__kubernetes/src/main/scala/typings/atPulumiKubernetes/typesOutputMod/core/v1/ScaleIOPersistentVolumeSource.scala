package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
  */
trait ScaleIOPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Default is "xfs"
    */
  val fsType: String
  /**
    * The host address of the ScaleIO API Gateway.
    */
  val gateway: String
  /**
    * The name of the ScaleIO Protection Domain for the configured storage.
    */
  val protectionDomain: String
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean
  /**
    * SecretRef references to the secret for ScaleIO user and other sensitive information. If
    * this is not provided, Login operation will fail.
    */
  val secretRef: SecretReference
  /**
    * Flag to enable/disable SSL communication with Gateway, default false
    */
  val sslEnabled: Boolean
  /**
    * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
    * Default is ThinProvisioned.
    */
  val storageMode: String
  /**
    * The ScaleIO Storage Pool associated with the protection domain.
    */
  val storagePool: String
  /**
    * The name of the storage system as configured in ScaleIO.
    */
  val system: String
  /**
    * The name of a volume already created in the ScaleIO system that is associated with this
    * volume source.
    */
  val volumeName: String
}

object ScaleIOPersistentVolumeSource {
  @scala.inline
  def apply(
    fsType: String,
    gateway: String,
    protectionDomain: String,
    readOnly: Boolean,
    secretRef: SecretReference,
    sslEnabled: Boolean,
    storageMode: String,
    storagePool: String,
    system: String,
    volumeName: String
  ): ScaleIOPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], protectionDomain = protectionDomain.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], sslEnabled = sslEnabled.asInstanceOf[js.Any], storageMode = storageMode.asInstanceOf[js.Any], storagePool = storagePool.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], volumeName = volumeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaleIOPersistentVolumeSource]
  }
}

