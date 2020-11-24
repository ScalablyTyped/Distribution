package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conversion extends js.Object {
  
  /**
    * The locations of the analysis tool's per-run log files.
    */
  var analysisToolLogFiles: js.UndefOr[js.Array[ArtifactLocation]] = js.native
  
  /**
    * An invocation object that describes the invocation of the converter.
    */
  var invocation: js.UndefOr[Invocation] = js.native
  
  /**
    * Key/value pairs that provide additional information about the conversion.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * A tool object that describes the converter.
    */
  var tool: Tool = js.native
}
object Conversion {
  
  @scala.inline
  def apply(tool: Tool): Conversion = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversion]
  }
  
  @scala.inline
  implicit class ConversionOps[Self <: Conversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTool(value: Tool): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisToolLogFilesVarargs(value: ArtifactLocation*): Self = this.set("analysisToolLogFiles", js.Array(value :_*))
    
    @scala.inline
    def setAnalysisToolLogFiles(value: js.Array[ArtifactLocation]): Self = this.set("analysisToolLogFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisToolLogFiles: Self = this.set("analysisToolLogFiles", js.undefined)
    
    @scala.inline
    def setInvocation(value: Invocation): Self = this.set("invocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocation: Self = this.set("invocation", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
