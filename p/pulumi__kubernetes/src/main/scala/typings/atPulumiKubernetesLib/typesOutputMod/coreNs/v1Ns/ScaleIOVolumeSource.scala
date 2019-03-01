package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleIOVolumeSource represents a persistent ScaleIO volume
  */
trait ScaleIOVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Default is "xfs".
    */
  val fsType: java.lang.String
  /**
    * The host address of the ScaleIO API Gateway.
    */
  val gateway: java.lang.String
  /**
    * The name of the ScaleIO Protection Domain for the configured storage.
    */
  val protectionDomain: java.lang.String
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: scala.Boolean
  /**
    * SecretRef references to the secret for ScaleIO user and other sensitive information. If
    * this is not provided, Login operation will fail.
    */
  val secretRef: LocalObjectReference
  /**
    * Flag to enable/disable SSL communication with Gateway, default false
    */
  val sslEnabled: scala.Boolean
  /**
    * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
    * Default is ThinProvisioned.
    */
  val storageMode: java.lang.String
  /**
    * The ScaleIO Storage Pool associated with the protection domain.
    */
  val storagePool: java.lang.String
  /**
    * The name of the storage system as configured in ScaleIO.
    */
  val system: java.lang.String
  /**
    * The name of a volume already created in the ScaleIO system that is associated with this
    * volume source.
    */
  val volumeName: java.lang.String
}

object ScaleIOVolumeSource {
  @scala.inline
  def apply(
    fsType: java.lang.String,
    gateway: java.lang.String,
    protectionDomain: java.lang.String,
    readOnly: scala.Boolean,
    secretRef: LocalObjectReference,
    sslEnabled: scala.Boolean,
    storageMode: java.lang.String,
    storagePool: java.lang.String,
    system: java.lang.String,
    volumeName: java.lang.String
  ): ScaleIOVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fsType")(fsType)
    __obj.updateDynamic("gateway")(gateway)
    __obj.updateDynamic("protectionDomain")(protectionDomain)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.updateDynamic("secretRef")(secretRef)
    __obj.updateDynamic("sslEnabled")(sslEnabled)
    __obj.updateDynamic("storageMode")(storageMode)
    __obj.updateDynamic("storagePool")(storagePool)
    __obj.updateDynamic("system")(system)
    __obj.updateDynamic("volumeName")(volumeName)
    __obj.asInstanceOf[ScaleIOVolumeSource]
  }
}

