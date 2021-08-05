package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ram.GetResourceShareFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResourceShareMod {
  
  @JSImport("@pulumi/aws/ram/getResourceShare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResourceShare(args: GetResourceShareArgs): js.Promise[GetResourceShareResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceShare")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetResourceShareResult]]
  inline def getResourceShare(args: GetResourceShareArgs, opts: InvokeOptions): js.Promise[GetResourceShareResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourceShare")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResourceShareResult]]
  
  trait GetResourceShareArgs extends StObject {
    
    /**
      * A filter used to scope the list e.g. by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
      */
    val filters: js.UndefOr[js.Array[GetResourceShareFilter]] = js.undefined
    
    /**
      * The name of the tag key to filter on.
      */
    val name: String
    
    /**
      * The owner of the resource share. Valid values are SELF or OTHER-ACCOUNTS
      */
    val resourceOwner: String
    
    /**
      * The Tags attached to the RAM share
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetResourceShareArgs {
    
    inline def apply(name: String, resourceOwner: String): GetResourceShareArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResourceShareArgs]
    }
    
    extension [Self <: GetResourceShareArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetResourceShareFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetResourceShareFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResourceOwner(value: String): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetResourceShareResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val arn: String
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ram.GetResourceShareFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * The ID of the AWS account that owns the resource share.
      */
    val owningAccountId: String
    
    val resourceOwner: String
    
    /**
      * The Status of the RAM share.
      */
    val status: String
    
    /**
      * The Tags attached to the RAM share
      */
    val tags: StringDictionary[String]
  }
  object GetResourceShareResult {
    
    inline def apply(
      arn: String,
      id: String,
      name: String,
      owningAccountId: String,
      resourceOwner: String,
      status: String,
      tags: StringDictionary[String]
    ): GetResourceShareResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owningAccountId = owningAccountId.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResourceShareResult]
    }
    
    extension [Self <: GetResourceShareResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ram.GetResourceShareFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ram.GetResourceShareFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwningAccountId(value: String): Self = StObject.set(x, "owningAccountId", value.asInstanceOf[js.Any])
      
      inline def setResourceOwner(value: String): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
