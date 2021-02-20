package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSolutionStackMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/getSolutionStack", "getSolutionStack")
  @js.native
  def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] = js.native
  @JSImport("@pulumi/aws/elasticbeanstalk/getSolutionStack", "getSolutionStack")
  @js.native
  def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] = js.native
  
  @js.native
  trait GetSolutionStackArgs extends StObject {
    
    /**
      * If more than one result is returned, use the most
      * recent solution stack.
      */
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * A regex string to apply to the solution stack list returned
      * by AWS. See [Elastic Beanstalk Supported Platforms][beanstalk-platforms] from
      * AWS documentation for reference solution stack names.
      */
    val nameRegex: String = js.native
  }
  object GetSolutionStackArgs {
    
    @scala.inline
    def apply(nameRegex: String): GetSolutionStackArgs = {
      val __obj = js.Dynamic.literal(nameRegex = nameRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSolutionStackArgs]
    }
    
    @scala.inline
    implicit class GetSolutionStackArgsMutableBuilder[Self <: GetSolutionStackArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setNameRegex(value: String): Self = StObject.set(x, "nameRegex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetSolutionStackResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val mostRecent: js.UndefOr[Boolean] = js.native
    
    /**
      * The name of the solution stack.
      */
    val name: String = js.native
    
    val nameRegex: String = js.native
  }
  object GetSolutionStackResult {
    
    @scala.inline
    def apply(id: String, name: String, nameRegex: String): GetSolutionStackResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRegex = nameRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSolutionStackResult]
    }
    
    @scala.inline
    implicit class GetSolutionStackResultMutableBuilder[Self <: GetSolutionStackResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameRegex(value: String): Self = StObject.set(x, "nameRegex", value.asInstanceOf[js.Any])
    }
  }
}
