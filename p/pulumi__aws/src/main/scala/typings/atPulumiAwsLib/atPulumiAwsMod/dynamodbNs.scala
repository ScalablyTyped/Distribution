package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dynamodb")
@js.native
object dynamodbNs extends js.Object {
  @js.native
  class GlobalTable protected ()
    extends atPulumiAwsLib.dynamodbMod.GlobalTable {
    /**
      * Create a GlobalTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTableArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Table protected ()
    extends atPulumiAwsLib.dynamodbMod.Table {
    /**
      * Create a Table resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.dynamodbTableMod.TableArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.dynamodbTableMod.TableArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TableEventSubscription protected ()
    extends atPulumiAwsLib.dynamodbMod.TableEventSubscription {
    def this(name: java.lang.String, table: atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table, handler: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventHandler, args: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs) = this()
    def this(name: java.lang.String, table: atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table, handler: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventHandler, args: atPulumiAwsLib.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class TableItem protected ()
    extends atPulumiAwsLib.dynamodbMod.TableItem {
    /**
      * Create a TableItem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.dynamodbTableItemMod.TableItemArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.dynamodbTableItemMod.TableItemArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getTable(args: atPulumiAwsLib.dynamodbGetTableMod.GetTableArgs): js.Promise[atPulumiAwsLib.dynamodbGetTableMod.GetTableResult] = js.native
  def getTable(
    args: atPulumiAwsLib.dynamodbGetTableMod.GetTableArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.dynamodbGetTableMod.GetTableResult] = js.native
  /* static members */
  @js.native
  object GlobalTable extends js.Object {
    /**
      * Get an existing GlobalTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTableState
    ): atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTable = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTableState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.dynamodbGlobalTableMod.GlobalTable = js.native
  }
  
  /* static members */
  @js.native
  object Table extends js.Object {
    /**
      * Get an existing Table resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dynamodbTableMod.TableState
    ): atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dynamodbTableMod.TableState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
  }
  
  /* static members */
  @js.native
  object TableItem extends js.Object {
    /**
      * Get an existing TableItem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dynamodbTableItemMod.TableItem = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dynamodbTableItemMod.TableItemState
    ): atPulumiAwsLib.dynamodbTableItemMod.TableItem = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dynamodbTableItemMod.TableItemState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.dynamodbTableItemMod.TableItem = js.native
  }
  
}

