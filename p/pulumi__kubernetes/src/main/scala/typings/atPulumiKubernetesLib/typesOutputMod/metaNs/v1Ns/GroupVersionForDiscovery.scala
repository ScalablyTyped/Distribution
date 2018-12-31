package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GroupVersion contains the "group/version" and "version" string of a version. It is made a
  * struct to keep extensibility.
  */
trait GroupVersionForDiscovery extends js.Object {
  /**
    * groupVersion specifies the API group and version in the form "group/version"
    */
  val groupVersion: java.lang.String
  /**
    * version specifies the version in the form of "version". This is to save the clients the
    * trouble of splitting the GroupVersion.
    */
  val version: java.lang.String
}

