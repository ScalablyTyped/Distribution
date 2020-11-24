package typings.pulumiAws.mod.dynamodb

import typings.pulumiAws.dynamodbMixinsMod.TableEventHandler
import typings.pulumiAws.dynamodbMixinsMod.TableEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("@pulumi/aws/dynamodb/table", JSImport.Namespace)
@js.native
object pulumiAwsDynamodbTableAugmentingMod extends js.Object {
  
  @js.native
  trait Table extends js.Object {
    
    /**
      * Creates a new subscription to events fired from this Table to the handler provided,
      * along with options to control the behavior of the subscription.
      *
      * In order to receive events the [Table] must have been created with the `streamEnabled: true`
      * value as well as an appropriate `streamViewType`.
      */
    def onEvent(name: String, handler: TableEventHandler, args: TableEventSubscriptionArgs): typings.pulumiAws.dynamodbMixinsMod.TableEventSubscription = js.native
    def onEvent(
      name: String,
      handler: TableEventHandler,
      args: TableEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typings.pulumiAws.dynamodbMixinsMod.TableEventSubscription = js.native
  }
}
