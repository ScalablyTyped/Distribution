package typings.pulumiAws

import typings.pulumiAws.dynamodbMixinsMod.TableEventHandler
import typings.pulumiAws.dynamodbMixinsMod.TableEventSubscriptionArgs
import typings.pulumiAws.getTableMod.GetTableArgs
import typings.pulumiAws.getTableMod.GetTableResult
import typings.pulumiAws.globalTableMod.GlobalTableArgs
import typings.pulumiAws.globalTableMod.GlobalTableState
import typings.pulumiAws.tableItemMod.TableItemArgs
import typings.pulumiAws.tableItemMod.TableItemState
import typings.pulumiAws.tableMod.TableArgs
import typings.pulumiAws.tableMod.TableState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamodbMod {
  
  @JSImport("@pulumi/aws/dynamodb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/dynamodb", "GlobalTable")
  @js.native
  class GlobalTable protected ()
    extends typings.pulumiAws.globalTableMod.GlobalTable {
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
  /* static members */
  object GlobalTable {
    
    @JSImport("@pulumi/aws/dynamodb", "GlobalTable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GlobalTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.globalTableMod.GlobalTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalTableMod.GlobalTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.globalTableMod.GlobalTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalTableMod.GlobalTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: GlobalTableState): typings.pulumiAws.globalTableMod.GlobalTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalTableMod.GlobalTable]
    @scala.inline
    def get(name: String, id: Input[ID], state: GlobalTableState, opts: CustomResourceOptions): typings.pulumiAws.globalTableMod.GlobalTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.globalTableMod.GlobalTable]
    
    /**
      * Returns true if the given object is an instance of GlobalTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dynamodb/globalTable.GlobalTable */ Boolean]
  }
  
  @JSImport("@pulumi/aws/dynamodb", "Table")
  @js.native
  class Table protected ()
    extends typings.pulumiAws.tableMod.Table {
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
  /* static members */
  object Table {
    
    @JSImport("@pulumi/aws/dynamodb", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Table resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.tableMod.Table = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tableMod.Table]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.tableMod.Table = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tableMod.Table]
    @scala.inline
    def get(name: String, id: Input[ID], state: TableState): typings.pulumiAws.tableMod.Table = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tableMod.Table]
    @scala.inline
    def get(name: String, id: Input[ID], state: TableState, opts: CustomResourceOptions): typings.pulumiAws.tableMod.Table = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tableMod.Table]
    
    /**
      * Returns true if the given object is an instance of Table.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/table.Table */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dynamodb/table.Table */ Boolean]
  }
  
  @JSImport("@pulumi/aws/dynamodb", "TableEventSubscription")
  @js.native
  class TableEventSubscription protected ()
    extends typings.pulumiAws.dynamodbMixinsMod.TableEventSubscription {
    def this(
      name: String,
      table: typings.pulumiAws.tableMod.Table,
      handler: TableEventHandler,
      args: TableEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      table: typings.pulumiAws.tableMod.Table,
      handler: TableEventHandler,
      args: TableEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws/dynamodb", "TableItem")
  @js.native
  class TableItem protected ()
    extends typings.pulumiAws.tableItemMod.TableItem {
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
  /* static members */
  object TableItem {
    
    @JSImport("@pulumi/aws/dynamodb", "TableItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TableItem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.tableItemMod.TableItem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tableItemMod.TableItem]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.tableItemMod.TableItem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tableItemMod.TableItem]
    @scala.inline
    def get(name: String, id: Input[ID], state: TableItemState): typings.pulumiAws.tableItemMod.TableItem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tableItemMod.TableItem]
    @scala.inline
    def get(name: String, id: Input[ID], state: TableItemState, opts: CustomResourceOptions): typings.pulumiAws.tableItemMod.TableItem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.tableItemMod.TableItem]
    
    /**
      * Returns true if the given object is an instance of TableItem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/tableItem.TableItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dynamodb/tableItem.TableItem */ Boolean]
  }
  
  @scala.inline
  def getTable(args: GetTableArgs): js.Promise[GetTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTable")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTableResult]]
  @scala.inline
  def getTable(args: GetTableArgs, opts: InvokeOptions): js.Promise[GetTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTableResult]]
  
  /* augmented module */
  object pulumiAwsDynamodbTableAugmentingMod {
    
    @js.native
    trait Table extends StObject {
      
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
}
