package typings.atPulumiKubernetes.typesOutputMod.meta.v1

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
  val groupVersion: String
  /**
    * version specifies the version in the form of "version". This is to save the clients the
    * trouble of splitting the GroupVersion.
    */
  val version: String
}

object GroupVersionForDiscovery {
  @scala.inline
  def apply(groupVersion: String, version: String): GroupVersionForDiscovery = {
    val __obj = js.Dynamic.literal(groupVersion = groupVersion, version = version)
  
    __obj.asInstanceOf[GroupVersionForDiscovery]
  }
}

