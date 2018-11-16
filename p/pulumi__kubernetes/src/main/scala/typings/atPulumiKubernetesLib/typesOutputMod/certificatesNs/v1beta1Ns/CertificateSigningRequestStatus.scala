package typings
package atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CertificateSigningRequestStatus extends js.Object {
  /**
               * If request was approved, the controller will place the issued certificate here.
               */
  val certificate: java.lang.String
  /**
               * Conditions applied to the request, such as approval or denial.
               */
  val conditions: js.Array[CertificateSigningRequestCondition]
}

