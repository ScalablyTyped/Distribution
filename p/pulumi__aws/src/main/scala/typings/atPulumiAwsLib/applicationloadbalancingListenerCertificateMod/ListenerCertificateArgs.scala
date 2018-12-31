package typings
package atPulumiAwsLib.applicationloadbalancingListenerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerCertificateArgs extends js.Object {
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

