package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPlanMod {
  
  @JSImport("@pulumi/aws/backup/getPlan", "getPlan")
  @js.native
  def getPlan(args: GetPlanArgs): js.Promise[GetPlanResult] = js.native
  @JSImport("@pulumi/aws/backup/getPlan", "getPlan")
  @js.native
  def getPlan(args: GetPlanArgs, opts: InvokeOptions): js.Promise[GetPlanResult] = js.native
  
  @js.native
  trait GetPlanArgs extends StObject {
    
    /**
      * The backup plan ID.
      */
    val planId: String = js.native
    
    /**
      * Metadata that you can assign to help organize the plans you create.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetPlanArgs {
    
    @scala.inline
    def apply(planId: String): GetPlanArgs = {
      val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPlanArgs]
    }
    
    @scala.inline
    implicit class GetPlanArgsMutableBuilder[Self <: GetPlanArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetPlanResult extends StObject {
    
    /**
      * The ARN of the backup plan.
      */
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The display name of a backup plan.
      */
    val name: String = js.native
    
    val planId: String = js.native
    
    /**
      * Metadata that you can assign to help organize the plans you create.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
      */
    val version: String = js.native
  }
  object GetPlanResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetPlanResultMutableBuilder[Self <: GetPlanResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
