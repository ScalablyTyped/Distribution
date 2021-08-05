package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getActivityMod {
  
  @JSImport("@pulumi/aws/sfn/getActivity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActivity(): js.Promise[GetActivityResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")().asInstanceOf[js.Promise[GetActivityResult]]
  inline def getActivity(args: Unit, opts: InvokeOptions): js.Promise[GetActivityResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetActivityResult]]
  inline def getActivity(args: GetActivityArgs): js.Promise[GetActivityResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetActivityResult]]
  inline def getActivity(args: GetActivityArgs, opts: InvokeOptions): js.Promise[GetActivityResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetActivityResult]]
  
  trait GetActivityArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the activity.
      */
    val arn: js.UndefOr[String] = js.undefined
    
    /**
      * The name that identifies the activity.
      */
    val name: js.UndefOr[String] = js.undefined
  }
  object GetActivityArgs {
    
    inline def apply(): GetActivityArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetActivityArgs]
    }
    
    extension [Self <: GetActivityArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait GetActivityResult extends StObject {
    
    val arn: String
    
    /**
      * The date the activity was created.
      */
    val creationDate: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetActivityResult {
    
    inline def apply(arn: String, creationDate: String, id: String, name: String): GetActivityResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetActivityResult]
    }
    
    extension [Self <: GetActivityResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
