package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStackMod {
  
  @JSImport("@pulumi/aws/cloudformation/getStack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStack(args: GetStackArgs): js.Promise[GetStackResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetStackResult]]
  inline def getStack(args: GetStackArgs, opts: InvokeOptions): js.Promise[GetStackResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetStackResult]]
  
  trait GetStackArgs extends StObject {
    
    /**
      * The name of the stack
      */
    val name: String
    
    /**
      * A map of tags associated with this stack.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetStackArgs {
    
    inline def apply(name: String): GetStackArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStackArgs]
    }
    
    extension [Self <: GetStackArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetStackResult extends StObject {
    
    /**
      * A list of capabilities
      */
    val capabilities: js.Array[String]
    
    /**
      * Description of the stack
      */
    val description: String
    
    /**
      * Whether the rollback of the stack is disabled when stack creation fails
      */
    val disableRollback: Boolean
    
    /**
      * The ARN of the IAM role used to create the stack.
      */
    val iamRoleArn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * A list of SNS topic ARNs to publish stack related events
      */
    val notificationArns: js.Array[String]
    
    /**
      * A map of outputs from the stack.
      */
    val outputs: StringDictionary[String]
    
    /**
      * A map of parameters that specify input parameters for the stack.
      */
    val parameters: StringDictionary[String]
    
    /**
      * A map of tags associated with this stack.
      */
    val tags: StringDictionary[String]
    
    /**
      * Structure containing the template body.
      */
    val templateBody: String
    
    /**
      * The amount of time that can pass before the stack status becomes `CREATE_FAILED`
      */
    val timeoutInMinutes: Double
  }
  object GetStackResult {
    
    inline def apply(
      capabilities: js.Array[String],
      description: String,
      disableRollback: Boolean,
      iamRoleArn: String,
      id: String,
      name: String,
      notificationArns: js.Array[String],
      outputs: StringDictionary[String],
      parameters: StringDictionary[String],
      tags: StringDictionary[String],
      templateBody: String,
      timeoutInMinutes: Double
    ): GetStackResult = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disableRollback = disableRollback.asInstanceOf[js.Any], iamRoleArn = iamRoleArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notificationArns = notificationArns.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStackResult]
    }
    
    extension [Self <: GetStackResult](x: Self) {
      
      inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisableRollback(value: Boolean): Self = StObject.set(x, "disableRollback", value.asInstanceOf[js.Any])
      
      inline def setIamRoleArn(value: String): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotificationArns(value: js.Array[String]): Self = StObject.set(x, "notificationArns", value.asInstanceOf[js.Any])
      
      inline def setNotificationArnsVarargs(value: String*): Self = StObject.set(x, "notificationArns", js.Array(value :_*))
      
      inline def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTemplateBody(value: String): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
      
      inline def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
    }
  }
}
