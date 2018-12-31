package typings
package atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceStatus contains derived information about an API server
  */
trait APIServiceStatus extends js.Object {
  /**
    * Current service state of apiService.
    */
  val conditions: js.Array[APIServiceCondition]
}

