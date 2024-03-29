package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namedQueryMod {
  
  @JSImport("@pulumi/aws/athena/namedQuery", "NamedQuery")
  @js.native
  class NamedQuery protected () extends CustomResource {
    /**
      * Create a NamedQuery resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NamedQueryArgs) = this()
    def this(name: String, args: NamedQueryArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The database to which the query belongs.
      */
    val database: Output_[String] = js.native
    
    /**
      * A brief explanation of the query. Maximum length of 1024.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The plain language name for the query. Maximum length of 128.
      */
    val name: Output_[String] = js.native
    
    /**
      * The text of the query itself. In other words, all query statements. Maximum length of 262144.
      */
    val query: Output_[String] = js.native
    
    /**
      * The workgroup to which the query belongs. Defaults to `primary`
      */
    val workgroup: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object NamedQuery {
    
    @JSImport("@pulumi/aws/athena/namedQuery", "NamedQuery")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NamedQuery resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): NamedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NamedQuery]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NamedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NamedQuery]
    inline def get(name: String, id: Input[ID], state: NamedQueryState): NamedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NamedQuery]
    inline def get(name: String, id: Input[ID], state: NamedQueryState, opts: CustomResourceOptions): NamedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NamedQuery]
    
    /**
      * Returns true if the given object is an instance of NamedQuery.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/namedQuery.NamedQuery */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/athena/namedQuery.NamedQuery */ Boolean]
  }
  
  trait NamedQueryArgs extends StObject {
    
    /**
      * The database to which the query belongs.
      */
    val database: Input[String]
    
    /**
      * A brief explanation of the query. Maximum length of 1024.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The plain language name for the query. Maximum length of 128.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The text of the query itself. In other words, all query statements. Maximum length of 262144.
      */
    val query: Input[String]
    
    /**
      * The workgroup to which the query belongs. Defaults to `primary`
      */
    val workgroup: js.UndefOr[Input[String]] = js.undefined
  }
  object NamedQueryArgs {
    
    inline def apply(database: Input[String], query: Input[String]): NamedQueryArgs = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedQueryArgs]
    }
    
    extension [Self <: NamedQueryArgs](x: Self) {
      
      inline def setDatabase(value: Input[String]): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQuery(value: Input[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setWorkgroup(value: Input[String]): Self = StObject.set(x, "workgroup", value.asInstanceOf[js.Any])
      
      inline def setWorkgroupUndefined: Self = StObject.set(x, "workgroup", js.undefined)
    }
  }
  
  trait NamedQueryState extends StObject {
    
    /**
      * The database to which the query belongs.
      */
    val database: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A brief explanation of the query. Maximum length of 1024.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The plain language name for the query. Maximum length of 128.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The text of the query itself. In other words, all query statements. Maximum length of 262144.
      */
    val query: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The workgroup to which the query belongs. Defaults to `primary`
      */
    val workgroup: js.UndefOr[Input[String]] = js.undefined
  }
  object NamedQueryState {
    
    inline def apply(): NamedQueryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NamedQueryState]
    }
    
    extension [Self <: NamedQueryState](x: Self) {
      
      inline def setDatabase(value: Input[String]): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQuery(value: Input[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setWorkgroup(value: Input[String]): Self = StObject.set(x, "workgroup", value.asInstanceOf[js.Any])
      
      inline def setWorkgroupUndefined: Self = StObject.set(x, "workgroup", js.undefined)
    }
  }
}
