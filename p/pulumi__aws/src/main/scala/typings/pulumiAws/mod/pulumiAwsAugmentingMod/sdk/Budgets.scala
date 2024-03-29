package typings.pulumiAws.mod.pulumiAwsAugmentingMod.sdk

import typings.awsSdk.budgetsMod.Budget
import typings.awsSdk.budgetsMod.ClientConfiguration
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "@pulumi/aws.sdk.Budgets")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Budgets ()
  extends StObject
     with Array[Budget] {
  def this(options: ClientConfiguration) = this()
}
