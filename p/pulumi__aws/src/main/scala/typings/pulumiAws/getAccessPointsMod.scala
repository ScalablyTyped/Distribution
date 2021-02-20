package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccessPointsMod {
  
  @JSImport("@pulumi/aws/efs/getAccessPoints", "getAccessPoints")
  @js.native
  def getAccessPoints(args: GetAccessPointsArgs): js.Promise[GetAccessPointsResult] = js.native
  @JSImport("@pulumi/aws/efs/getAccessPoints", "getAccessPoints")
  @js.native
  def getAccessPoints(args: GetAccessPointsArgs, opts: InvokeOptions): js.Promise[GetAccessPointsResult] = js.native
  
  @js.native
  trait GetAccessPointsArgs extends StObject {
    
    /**
      * EFS File System identifier.
      */
    val fileSystemId: String = js.native
  }
  object GetAccessPointsArgs {
    
    @scala.inline
    def apply(fileSystemId: String): GetAccessPointsArgs = {
      val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointsArgs]
    }
    
    @scala.inline
    implicit class GetAccessPointsArgsMutableBuilder[Self <: GetAccessPointsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAccessPointsResult extends StObject {
    
    /**
      * Set of Amazon Resource Names (ARNs).
      */
    val arns: js.Array[String] = js.native
    
    val fileSystemId: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Set of identifiers.
      */
    val ids: js.Array[String] = js.native
  }
  object GetAccessPointsResult {
    
    @scala.inline
    def apply(arns: js.Array[String], fileSystemId: String, id: String, ids: js.Array[String]): GetAccessPointsResult = {
      val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointsResult]
    }
    
    @scala.inline
    implicit class GetAccessPointsResultMutableBuilder[Self <: GetAccessPointsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      @scala.inline
      def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    }
  }
}
