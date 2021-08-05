package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccessPointsMod {
  
  @JSImport("@pulumi/aws/efs/getAccessPoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAccessPoints(args: GetAccessPointsArgs): js.Promise[GetAccessPointsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessPoints")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAccessPointsResult]]
  inline def getAccessPoints(args: GetAccessPointsArgs, opts: InvokeOptions): js.Promise[GetAccessPointsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccessPoints")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAccessPointsResult]]
  
  trait GetAccessPointsArgs extends StObject {
    
    /**
      * EFS File System identifier.
      */
    val fileSystemId: String
  }
  object GetAccessPointsArgs {
    
    inline def apply(fileSystemId: String): GetAccessPointsArgs = {
      val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointsArgs]
    }
    
    extension [Self <: GetAccessPointsArgs](x: Self) {
      
      inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAccessPointsResult extends StObject {
    
    /**
      * Set of Amazon Resource Names (ARNs).
      */
    val arns: js.Array[String]
    
    val fileSystemId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set of identifiers.
      */
    val ids: js.Array[String]
  }
  object GetAccessPointsResult {
    
    inline def apply(arns: js.Array[String], fileSystemId: String, id: String, ids: js.Array[String]): GetAccessPointsResult = {
      val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessPointsResult]
    }
    
    extension [Self <: GetAccessPointsResult](x: Self) {
      
      inline def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      inline def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    }
  }
}
