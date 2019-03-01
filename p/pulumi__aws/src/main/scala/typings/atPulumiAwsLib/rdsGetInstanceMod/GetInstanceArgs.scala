package typings
package atPulumiAwsLib.rdsGetInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceArgs extends js.Object {
  /**
    * The name of the RDS instance
    */
  val dbInstanceIdentifier: java.lang.String
}

object GetInstanceArgs {
  @scala.inline
  def apply(dbInstanceIdentifier: java.lang.String): GetInstanceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dbInstanceIdentifier")(dbInstanceIdentifier)
    __obj.asInstanceOf[GetInstanceArgs]
  }
}

