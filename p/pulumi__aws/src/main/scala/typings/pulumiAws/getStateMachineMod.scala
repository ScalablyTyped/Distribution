package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getStateMachineMod {
  
  @JSImport("@pulumi/aws/sfn/getStateMachine", "getStateMachine")
  @js.native
  def getStateMachine(args: GetStateMachineArgs): js.Promise[GetStateMachineResult] = js.native
  @JSImport("@pulumi/aws/sfn/getStateMachine", "getStateMachine")
  @js.native
  def getStateMachine(args: GetStateMachineArgs, opts: InvokeOptions): js.Promise[GetStateMachineResult] = js.native
  
  @js.native
  trait GetStateMachineArgs extends StObject {
    
    /**
      * The friendly name of the state machine to match.
      */
    val name: String = js.native
  }
  object GetStateMachineArgs {
    
    @scala.inline
    def apply(name: String): GetStateMachineArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStateMachineArgs]
    }
    
    @scala.inline
    implicit class GetStateMachineArgsMutableBuilder[Self <: GetStateMachineArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetStateMachineResult extends StObject {
    
    /**
      * Set to the arn of the state function.
      */
    val arn: String = js.native
    
    /**
      * The date the state machine was created.
      */
    val creationDate: String = js.native
    
    /**
      * Set to the state machine definition.
      */
    val definition: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * Set to the roleArn used by the state function.
      */
    val roleArn: String = js.native
    
    /**
      * Set to the current status of the state machine.
      */
    val status: String = js.native
  }
  object GetStateMachineResult {
    
    @scala.inline
    def apply(
      arn: String,
      creationDate: String,
      definition: String,
      id: String,
      name: String,
      roleArn: String,
      status: String
    ): GetStateMachineResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStateMachineResult]
    }
    
    @scala.inline
    implicit class GetStateMachineResultMutableBuilder[Self <: GetStateMachineResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
