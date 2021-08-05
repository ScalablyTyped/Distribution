package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPlanMod {
  
  @JSImport("@pulumi/aws/backup/getPlan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlan(args: GetPlanArgs): js.Promise[GetPlanResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlan")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPlanResult]]
  inline def getPlan(args: GetPlanArgs, opts: InvokeOptions): js.Promise[GetPlanResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlan")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPlanResult]]
  
  trait GetPlanArgs extends StObject {
    
    /**
      * The backup plan ID.
      */
    val planId: String
    
    /**
      * Metadata that you can assign to help organize the plans you create.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetPlanArgs {
    
    inline def apply(planId: String): GetPlanArgs = {
      val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPlanArgs]
    }
    
    extension [Self <: GetPlanArgs](x: Self) {
      
      inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetPlanResult extends StObject {
    
    /**
      * The ARN of the backup plan.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The display name of a backup plan.
      */
    val name: String
    
    val planId: String
    
    /**
      * Metadata that you can assign to help organize the plans you create.
      */
    val tags: StringDictionary[String]
    
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
      */
    val version: String
  }
  object GetPlanResult {
    
    inline def apply(
      arn: String,
      id: String,
      name: String,
      planId: String,
      tags: StringDictionary[String],
      version: String
    ): GetPlanResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPlanResult]
    }
    
    extension [Self <: GetPlanResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
