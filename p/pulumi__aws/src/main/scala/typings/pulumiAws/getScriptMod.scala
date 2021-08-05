package typings.pulumiAws

import typings.pulumiAws.inputMod.glue.GetScriptDagEdge
import typings.pulumiAws.inputMod.glue.GetScriptDagNode
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getScriptMod {
  
  @JSImport("@pulumi/aws/glue/getScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScript(args: GetScriptArgs): js.Promise[GetScriptResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScript")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetScriptResult]]
  inline def getScript(args: GetScriptArgs, opts: InvokeOptions): js.Promise[GetScriptResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScript")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptResult]]
  
  trait GetScriptArgs extends StObject {
    
    /**
      * A list of the edges in the DAG. Defined below.
      */
    val dagEdges: js.Array[GetScriptDagEdge]
    
    /**
      * A list of the nodes in the DAG. Defined below.
      */
    val dagNodes: js.Array[GetScriptDagNode]
    
    /**
      * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
      */
    val language: js.UndefOr[String] = js.undefined
  }
  object GetScriptArgs {
    
    inline def apply(dagEdges: js.Array[GetScriptDagEdge], dagNodes: js.Array[GetScriptDagNode]): GetScriptArgs = {
      val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetScriptArgs]
    }
    
    extension [Self <: GetScriptArgs](x: Self) {
      
      inline def setDagEdges(value: js.Array[GetScriptDagEdge]): Self = StObject.set(x, "dagEdges", value.asInstanceOf[js.Any])
      
      inline def setDagEdgesVarargs(value: GetScriptDagEdge*): Self = StObject.set(x, "dagEdges", js.Array(value :_*))
      
      inline def setDagNodes(value: js.Array[GetScriptDagNode]): Self = StObject.set(x, "dagNodes", value.asInstanceOf[js.Any])
      
      inline def setDagNodesVarargs(value: GetScriptDagNode*): Self = StObject.set(x, "dagNodes", js.Array(value :_*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  trait GetScriptResult extends StObject {
    
    val dagEdges: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagEdge]
    
    val dagNodes: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagNode]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val language: js.UndefOr[String] = js.undefined
    
    /**
      * The Python script generated from the DAG when the `language` argument is set to `PYTHON`.
      */
    val pythonScript: String
    
    /**
      * The Scala code generated from the DAG when the `language` argument is set to `SCALA`.
      */
    val scalaCode: String
  }
  object GetScriptResult {
    
    inline def apply(
      dagEdges: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagEdge],
      dagNodes: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagNode],
      id: String,
      pythonScript: String,
      scalaCode: String
    ): GetScriptResult = {
      val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pythonScript = pythonScript.asInstanceOf[js.Any], scalaCode = scalaCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetScriptResult]
    }
    
    extension [Self <: GetScriptResult](x: Self) {
      
      inline def setDagEdges(value: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagEdge]): Self = StObject.set(x, "dagEdges", value.asInstanceOf[js.Any])
      
      inline def setDagEdgesVarargs(value: typings.pulumiAws.outputMod.glue.GetScriptDagEdge*): Self = StObject.set(x, "dagEdges", js.Array(value :_*))
      
      inline def setDagNodes(value: js.Array[typings.pulumiAws.outputMod.glue.GetScriptDagNode]): Self = StObject.set(x, "dagNodes", value.asInstanceOf[js.Any])
      
      inline def setDagNodesVarargs(value: typings.pulumiAws.outputMod.glue.GetScriptDagNode*): Self = StObject.set(x, "dagNodes", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPythonScript(value: String): Self = StObject.set(x, "pythonScript", value.asInstanceOf[js.Any])
      
      inline def setScalaCode(value: String): Self = StObject.set(x, "scalaCode", value.asInstanceOf[js.Any])
    }
  }
}
