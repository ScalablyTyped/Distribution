package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PortworxVolumeSource represents a Portworx volume resource.
  */
trait PortworxVolumeSource extends js.Object {
  /**
    * FSType represents the filesystem type to mount Must be a filesystem type supported by the
    * host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: String
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean
  /**
    * VolumeID uniquely identifies a Portworx volume
    */
  val volumeID: String
}

object PortworxVolumeSource {
  @scala.inline
  def apply(fsType: String, readOnly: Boolean, volumeID: String): PortworxVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType, readOnly = readOnly, volumeID = volumeID)
  
    __obj.asInstanceOf[PortworxVolumeSource]
  }
}

