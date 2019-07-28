package typings.atPulumiAws.rdsGetInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceArgs extends js.Object {
  /**
    * The name of the RDS instance
    */
  val dbInstanceIdentifier: String
}

object GetInstanceArgs {
  @scala.inline
  def apply(dbInstanceIdentifier: String): GetInstanceArgs = {
    val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier)
  
    __obj.asInstanceOf[GetInstanceArgs]
  }
}

