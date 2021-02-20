package typings.pulumiAws

import typings.pulumiAws.inputMod.glue.GetScriptDagEdge
import typings.pulumiAws.inputMod.glue.GetScriptDagNode
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getScriptMod {
  
  @JSImport("@pulumi/aws/glue/getScript", "getScript")
  @js.native
  def getScript(args: GetScriptArgs): js.Promise[GetScriptResult] = js.native
  @JSImport("@pulumi/aws/glue/getScript", "getScript")
  @js.native
  def getScript(args: GetScriptArgs, opts: InvokeOptions): js.Promise[GetScriptResult] = js.native
  
  @js.native
  trait GetScriptArgs extends StObject {
    
    /**
      * A list of the edges in the DAG. Defined below.
      */
    val dagEdges: js.Array[GetScriptDagEdge] = js.native
    
    /**
      * A list of the nodes in the DAG. Defined below.
      */
    val dagNodes: js.Array[GetScriptDagNode] = js.native
    
    /**
      * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
      */
    val language: js.UndefOr[String] = js.native
  }
  object GetScriptArgs {
    
    @scala.inline
    def apply(dagEdges: js.Array[GetScriptDagEdge], dagNodes: js.Array[GetScriptDagNode]): GetScriptArgs = {
      val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetScriptArgs]
    }
    
    @scala.inline
    implicit class GetScriptArgsMutableBuilder[Self <: GetScriptArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDagEdges(value: js.Array[GetScriptDagEdge]): Self = StObject.set(x, "dagEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDagEdgesVarargs(value: GetScriptDagEdge*): Self = StObject.set(x, "dagEdges", js.Array(value :_*))
      
      @scala.inline
      def setDagNodes(value: js.Array[GetScriptDagNode]): Self = StObject.set(x, "dagNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDagNodesVarargs(value: GetScriptDagNode*): Self = StObject.set(x, "dagNodes", js.Array(value :_*))
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  @js.native
  trait GetScriptResult extends StObject {
    
    val dagEdges: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagEdge] = js.native
    
    val dagNodes: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagNode] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val language: js.UndefOr[String] = js.native
    
    /**
      * The Python script generated from the DAG when the `language` argument is set to `PYTHON`.
      */
    val pythonScript: String = js.native
    
    /**
      * The Scala code generated from the DAG when the `language` argument is set to `SCALA`.
      */
    val scalaCode: String = js.native
  }
  object GetScriptResult {
    
    @scala.inline
    def apply(
      dagEdges: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagEdge],
      dagNodes: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagNode],
      id: String,
      pythonScript: String,
      scalaCode: String
    ): GetScriptResult = {
      val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pythonScript = pythonScript.asInstanceOf[js.Any], scalaCode = scalaCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetScriptResult]
    }
    
    @scala.inline
    implicit class GetScriptResultMutableBuilder[Self <: GetScriptResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDagEdges(value: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagEdge]): Self = StObject.set(x, "dagEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDagEdgesVarargs(value: typings.pulumiAws.outputMod.glue.GetScriptDagEdge*): Self = StObject.set(x, "dagEdges", js.Array(value :_*))
      
      @scala.inline
      def setDagNodes(value: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagNode]): Self = StObject.set(x, "dagNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDagNodesVarargs(value: typings.pulumiAws.outputMod.glue.GetScriptDagNode*): Self = StObject.set(x, "dagNodes", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setPythonScript(value: String): Self = StObject.set(x, "pythonScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalaCode(value: String): Self = StObject.set(x, "scalaCode", value.asInstanceOf[js.Any])
    }
  }
}
