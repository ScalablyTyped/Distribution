package typings
package atPulumiAwsLib.opsworksRdsDbInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RdsDbInstanceArgs extends js.Object {
  /**
    * A db password
    */
  val dbPassword: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A db username
    */
  val dbUser: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The db instance to register for this stack. Changing this will force a new resource.
    */
  val rdsDbInstanceArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The stack to register a db inatance for. Changing this will force a new resource.
    */
  val stackId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

