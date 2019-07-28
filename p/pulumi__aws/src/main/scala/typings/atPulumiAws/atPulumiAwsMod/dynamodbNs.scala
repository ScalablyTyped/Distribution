package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventHandler
import typings.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs
import typings.atPulumiAws.dynamodbGetTableMod.GetTableArgs
import typings.atPulumiAws.dynamodbGetTableMod.GetTableResult
import typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTableArgs
import typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTableState
import typings.atPulumiAws.dynamodbTableItemMod.TableItemArgs
import typings.atPulumiAws.dynamodbTableItemMod.TableItemState
import typings.atPulumiAws.dynamodbTableMod.TableArgs
import typings.atPulumiAws.dynamodbTableMod.TableState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dynamodb")
@js.native
object dynamodbNs extends js.Object {
  @js.native
  class GlobalTable protected ()
    extends typings.atPulumiAws.dynamodbMod.GlobalTable {
    /**
      * Create a GlobalTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GlobalTableArgs) = this()
    def this(name: String, args: GlobalTableArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Table protected ()
    extends typings.atPulumiAws.dynamodbMod.Table {
    /**
      * Create a Table resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TableArgs) = this()
    def this(name: String, args: TableArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TableEventSubscription protected ()
    extends typings.atPulumiAws.dynamodbMod.TableEventSubscription {
    def this(
      name: String,
      table: typings.atPulumiAws.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table,
      handler: TableEventHandler,
      args: TableEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      table: typings.atPulumiAws.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table,
      handler: TableEventHandler,
      args: TableEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @js.native
  class TableItem protected ()
    extends typings.atPulumiAws.dynamodbMod.TableItem {
    /**
      * Create a TableItem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TableItemArgs) = this()
    def this(name: String, args: TableItemArgs, opts: CustomResourceOptions) = this()
  }
  
  def getTable(args: GetTableArgs): js.Promise[GetTableResult] with GetTableResult = js.native
  def getTable(args: GetTableArgs, opts: InvokeOptions): js.Promise[GetTableResult] with GetTableResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTable = js.native
    def get(name: String, id: Input[ID], state: GlobalTableState): typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTable = js.native
    def get(name: String, id: Input[ID], state: GlobalTableState, opts: CustomResourceOptions): typings.atPulumiAws.dynamodbGlobalTableMod.GlobalTable = js.native
    /**
      * Returns true if the given object is an instance of GlobalTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
    def get(name: String, id: Input[ID], state: TableState): typings.atPulumiAws.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
    def get(name: String, id: Input[ID], state: TableState, opts: CustomResourceOptions): typings.atPulumiAws.dynamodbDynamodbMixinsMod.dynamodbTableMod.Table = js.native
    /**
      * Returns true if the given object is an instance of Table.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/dynamodbMixins.@pulumi/aws/dynamodb/table.Table */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dynamodbTableItemMod.TableItem = js.native
    def get(name: String, id: Input[ID], state: TableItemState): typings.atPulumiAws.dynamodbTableItemMod.TableItem = js.native
    def get(name: String, id: Input[ID], state: TableItemState, opts: CustomResourceOptions): typings.atPulumiAws.dynamodbTableItemMod.TableItem = js.native
    /**
      * Returns true if the given object is an instance of TableItem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/tableItem.TableItem */ Boolean = js.native
  }
  
}

