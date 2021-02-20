package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getActivityMod {
  
  @JSImport("@pulumi/aws/sfn/getActivity", "getActivity")
  @js.native
  def getActivity(): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn/getActivity", "getActivity")
  @js.native
  def getActivity(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn/getActivity", "getActivity")
  @js.native
  def getActivity(args: GetActivityArgs): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn/getActivity", "getActivity")
  @js.native
  def getActivity(args: GetActivityArgs, opts: InvokeOptions): js.Promise[GetActivityResult] = js.native
  
  @js.native
  trait GetActivityArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the activity.
      */
    val arn: js.UndefOr[String] = js.native
    
    /**
      * The name that identifies the activity.
      */
    val name: js.UndefOr[String] = js.native
  }
  object GetActivityArgs {
    
    @scala.inline
    def apply(): GetActivityArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetActivityArgs]
    }
    
    @scala.inline
    implicit class GetActivityArgsMutableBuilder[Self <: GetActivityArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait GetActivityResult extends StObject {
    
    val arn: String = js.native
    
    /**
      * The date the activity was created.
      */
    val creationDate: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
  }
  object GetActivityResult {
    
    @scala.inline
    def apply(arn: String, creationDate: String, id: String, name: String): GetActivityResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetActivityResult]
    }
    
    @scala.inline
    implicit class GetActivityResultMutableBuilder[Self <: GetActivityResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
