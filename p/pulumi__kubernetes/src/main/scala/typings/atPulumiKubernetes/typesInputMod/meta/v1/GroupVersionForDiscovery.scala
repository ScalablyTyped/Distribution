package typings.atPulumiKubernetes.typesInputMod.meta.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var groupVersion: Input[String]
  /**
    * version specifies the version in the form of "version". This is to save the clients the
    * trouble of splitting the GroupVersion.
    */
  var version: Input[String]
}

object GroupVersionForDiscovery {
  @scala.inline
  def apply(groupVersion: Input[String], version: Input[String]): GroupVersionForDiscovery = {
    val __obj = js.Dynamic.literal(groupVersion = groupVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GroupVersionForDiscovery]
  }
}

