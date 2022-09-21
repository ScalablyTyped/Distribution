package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`docs-vscode`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputTargetDocsVscode
  extends StObject
     with OutputTargetBase
     with OutputTarget {
  
  /**
    * The location on disk to write the JSON file.
    */
  var file: String
  
  /**
    * A base URL to find the source code of the component(s) described in the JSON file.
    */
  var sourceCodeBaseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Designates this output target to be used for generating VS Code custom data.
    * @see OutputTargetBase#type
    */
  @JSName("type")
  var type_OutputTargetDocsVscode: `docs-vscode`
}
object OutputTargetDocsVscode {
  
  inline def apply(file: String): OutputTargetDocsVscode = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("docs-vscode")
    __obj.asInstanceOf[OutputTargetDocsVscode]
  }
  
  extension [Self <: OutputTargetDocsVscode](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeBaseUrl(value: String): Self = StObject.set(x, "sourceCodeBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeBaseUrlUndefined: Self = StObject.set(x, "sourceCodeBaseUrl", js.undefined)
    
    inline def setType(value: `docs-vscode`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
