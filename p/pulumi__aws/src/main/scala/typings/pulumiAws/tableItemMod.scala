package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableItemMod {
  
  @JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem")
  @js.native
  class TableItem protected () extends CustomResource {
    /**
      * Create a TableItem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TableItemArgs) = this()
    def this(name: String, args: TableItemArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Hash key to use for lookups and identification of the item
      */
    val hashKey: Output_[String] = js.native
    
    /**
      * JSON representation of a map of attribute name/value pairs, one for each attribute.
      * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
      */
    val item: Output_[String] = js.native
    
    /**
      * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
      */
    val rangeKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the table to contain the item.
      */
    val tableName: Output_[String] = js.native
  }
  /* static members */
  object TableItem {
    
    @JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem")
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
    inline def get(name: String, id: Input[ID]): TableItem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TableItem]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): TableItem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TableItem]
    inline def get(name: String, id: Input[ID], state: TableItemState): TableItem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TableItem]
    inline def get(name: String, id: Input[ID], state: TableItemState, opts: CustomResourceOptions): TableItem = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TableItem]
    
    /**
      * Returns true if the given object is an instance of TableItem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/tableItem.TableItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dynamodb/tableItem.TableItem */ Boolean]
  }
  
  trait TableItemArgs extends StObject {
    
    /**
      * Hash key to use for lookups and identification of the item
      */
    val hashKey: Input[String]
    
    /**
      * JSON representation of a map of attribute name/value pairs, one for each attribute.
      * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
      */
    val item: Input[String]
    
    /**
      * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
      */
    val rangeKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the table to contain the item.
      */
    val tableName: Input[String]
  }
  object TableItemArgs {
    
    inline def apply(hashKey: Input[String], item: Input[String], tableName: Input[String]): TableItemArgs = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableItemArgs]
    }
    
    extension [Self <: TableItemArgs](x: Self) {
      
      inline def setHashKey(value: Input[String]): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      inline def setItem(value: Input[String]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      inline def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableItemState extends StObject {
    
    /**
      * Hash key to use for lookups and identification of the item
      */
    val hashKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * JSON representation of a map of attribute name/value pairs, one for each attribute.
      * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
      */
    val item: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
      */
    val rangeKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the table to contain the item.
      */
    val tableName: js.UndefOr[Input[String]] = js.undefined
  }
  object TableItemState {
    
    inline def apply(): TableItemState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableItemState]
    }
    
    extension [Self <: TableItemState](x: Self) {
      
      inline def setHashKey(value: Input[String]): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      inline def setHashKeyUndefined: Self = StObject.set(x, "hashKey", js.undefined)
      
      inline def setItem(value: Input[String]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      inline def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      inline def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
}
