package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSolutionStackMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/getSolutionStack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSolutionStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSolutionStackResult]]
  inline def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSolutionStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSolutionStackResult]]
  
  trait GetSolutionStackArgs extends StObject {
    
    /**
      * If more than one result is returned, use the most
      * recent solution stack.
      */
    val mostRecent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A regex string to apply to the solution stack list returned
      * by AWS. See [Elastic Beanstalk Supported Platforms][beanstalk-platforms] from
      * AWS documentation for reference solution stack names.
      */
    val nameRegex: String
  }
  object GetSolutionStackArgs {
    
    inline def apply(nameRegex: String): GetSolutionStackArgs = {
      val __obj = js.Dynamic.literal(nameRegex = nameRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSolutionStackArgs]
    }
    
    extension [Self <: GetSolutionStackArgs](x: Self) {
      
      inline def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      inline def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      inline def setNameRegex(value: String): Self = StObject.set(x, "nameRegex", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetSolutionStackResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val mostRecent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the solution stack.
      */
    val name: String
    
    val nameRegex: String
  }
  object GetSolutionStackResult {
    
    inline def apply(id: String, name: String, nameRegex: String): GetSolutionStackResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRegex = nameRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSolutionStackResult]
    }
    
    extension [Self <: GetSolutionStackResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMostRecent(value: Boolean): Self = StObject.set(x, "mostRecent", value.asInstanceOf[js.Any])
      
      inline def setMostRecentUndefined: Self = StObject.set(x, "mostRecent", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameRegex(value: String): Self = StObject.set(x, "nameRegex", value.asInstanceOf[js.Any])
    }
  }
}
