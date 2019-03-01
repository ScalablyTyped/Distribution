package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
trait HTTPHeader extends js.Object {
  /**
    * The header field name
    */
  val name: java.lang.String
  /**
    * The header field value
    */
  val value: java.lang.String
}

object HTTPHeader {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): HTTPHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[HTTPHeader]
  }
}

