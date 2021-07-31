package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getExportMod {
  
  @JSImport("@pulumi/aws/cloudformation/getExport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getExport(args: GetExportArgs): js.Promise[GetExportResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExport")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetExportResult]]
  @scala.inline
  def getExport(args: GetExportArgs, opts: InvokeOptions): js.Promise[GetExportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExport")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetExportResult]]
  
  trait GetExportArgs extends StObject {
    
    /**
      * The name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
      */
    val name: String
  }
  object GetExportArgs {
    
    @scala.inline
    def apply(name: String): GetExportArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetExportArgs]
    }
    
    @scala.inline
    implicit class GetExportArgsMutableBuilder[Self <: GetExportArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetExportResult extends StObject {
    
    /**
      * The exportingStackId (AWS ARNs) equivalent `ExportingStackId` from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
      */
    val exportingStackId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * The value from Cloudformation export identified by the export name found from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
      */
    val value: String
  }
  object GetExportResult {
    
    @scala.inline
    def apply(exportingStackId: String, id: String, name: String, value: String): GetExportResult = {
      val __obj = js.Dynamic.literal(exportingStackId = exportingStackId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetExportResult]
    }
    
    @scala.inline
    implicit class GetExportResultMutableBuilder[Self <: GetExportResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportingStackId(value: String): Self = StObject.set(x, "exportingStackId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
