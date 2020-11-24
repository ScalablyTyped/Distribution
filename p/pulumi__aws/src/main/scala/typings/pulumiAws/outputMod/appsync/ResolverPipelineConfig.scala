package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverPipelineConfig extends js.Object {
  
  /**
    * The list of Function ID.
    */
  var functions: js.UndefOr[js.Array[String]] = js.native
}
object ResolverPipelineConfig {
  
  @scala.inline
  def apply(): ResolverPipelineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverPipelineConfig]
  }
  
  @scala.inline
  implicit class ResolverPipelineConfigOps[Self <: ResolverPipelineConfig] (val x: Self) extends AnyVal {
    
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
    def setFunctionsVarargs(value: String*): Self = this.set("functions", js.Array(value :_*))
    
    @scala.inline
    def setFunctions(value: js.Array[String]): Self = this.set("functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
  }
}
