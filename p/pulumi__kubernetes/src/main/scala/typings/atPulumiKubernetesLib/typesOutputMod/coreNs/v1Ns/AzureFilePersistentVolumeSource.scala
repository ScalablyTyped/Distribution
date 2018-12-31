package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
trait AzureFilePersistentVolumeSource extends js.Object {
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: scala.Boolean
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  val secretName: java.lang.String
  /**
    * the namespace of the secret that contains Azure Storage Account Name and Key default is the
    * same as the Pod
    */
  val secretNamespace: java.lang.String
  /**
    * Share Name
    */
  val shareName: java.lang.String
}

