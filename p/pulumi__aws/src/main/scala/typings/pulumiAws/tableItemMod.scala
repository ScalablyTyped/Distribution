package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing TableItem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem.get")
    @js.native
    def get(name: String, id: Input[ID]): TableItem = js.native
    @JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TableItem = js.native
    @JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem.get")
    @js.native
    def get(name: String, id: Input[ID], state: TableItemState): TableItem = js.native
    @JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem.get")
    @js.native
    def get(name: String, id: Input[ID], state: TableItemState, opts: CustomResourceOptions): TableItem = js.native
    
    /**
      * Returns true if the given object is an instance of TableItem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dynamodb/tableItem", "TableItem.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dynamodb/tableItem.TableItem */ Boolean = js.native
  }
  
  @js.native
  trait TableItemArgs extends StObject {
    
    /**
      * Hash key to use for lookups and identification of the item
      */
    val hashKey: Input[String] = js.native
    
    /**
      * JSON representation of a map of attribute name/value pairs, one for each attribute.
      * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
      */
    val item: Input[String] = js.native
    
    /**
      * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
      */
    val rangeKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the table to contain the item.
      */
    val tableName: Input[String] = js.native
  }
  object TableItemArgs {
    
    @scala.inline
    def apply(hashKey: Input[String], item: Input[String], tableName: Input[String]): TableItemArgs = {
      val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableItemArgs]
    }
    
    @scala.inline
    implicit class TableItemArgsMutableBuilder[Self <: TableItemArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashKey(value: Input[String]): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: Input[String]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      @scala.inline
      def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableItemState extends StObject {
    
    /**
      * Hash key to use for lookups and identification of the item
      */
    val hashKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * JSON representation of a map of attribute name/value pairs, one for each attribute.
      * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
      */
    val item: js.UndefOr[Input[String]] = js.native
    
    /**
      * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
      */
    val rangeKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the table to contain the item.
      */
    val tableName: js.UndefOr[Input[String]] = js.native
  }
  object TableItemState {
    
    @scala.inline
    def apply(): TableItemState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableItemState]
    }
    
    @scala.inline
    implicit class TableItemStateMutableBuilder[Self <: TableItemState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashKey(value: Input[String]): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashKeyUndefined: Self = StObject.set(x, "hashKey", js.undefined)
      
      @scala.inline
      def setItem(value: Input[String]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setRangeKey(value: Input[String]): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
      
      @scala.inline
      def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
}
