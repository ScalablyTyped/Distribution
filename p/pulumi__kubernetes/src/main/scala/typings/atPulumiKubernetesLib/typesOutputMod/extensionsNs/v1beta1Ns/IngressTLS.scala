package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressTLS describes the transport layer security associated with an Ingress.
  */
trait IngressTLS extends js.Object {
  /**
    * Hosts are a list of hosts included in the TLS certificate. The values in this list must
    * match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the
    * loadbalancer controller fulfilling this Ingress, if left unspecified.
    */
  val hosts: js.Array[java.lang.String]
  /**
    * SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left
    * optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener
    * conflicts with the "Host" header field used by an IngressRule, the SNI host is used for
    * termination and value of the Host header is used for routing.
    */
  val secretName: java.lang.String
}

object IngressTLS {
  @scala.inline
  def apply(hosts: js.Array[java.lang.String], secretName: java.lang.String): IngressTLS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hosts")(hosts)
    __obj.updateDynamic("secretName")(secretName)
    __obj.asInstanceOf[IngressTLS]
  }
}

