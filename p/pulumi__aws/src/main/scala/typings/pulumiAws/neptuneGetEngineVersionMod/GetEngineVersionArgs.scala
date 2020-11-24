package typings.pulumiAws.neptuneGetEngineVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEngineVersionArgs extends js.Object {
  
  /**
    * DB engine. (Default: `neptune`)
    */
  val engine: js.UndefOr[String] = js.native
  
  /**
    * The name of a specific DB parameter group family. An example parameter group family is `neptune1`.
    */
  val parameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
    */
  val preferredVersions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Version of the DB engine. For example, `1.0.1.0`, `1.0.2.2`, and `1.0.3.0`. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
    */
  val version: js.UndefOr[String] = js.native
}
object GetEngineVersionArgs {
  
  @scala.inline
  def apply(): GetEngineVersionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEngineVersionArgs]
  }
  
  @scala.inline
  implicit class GetEngineVersionArgsOps[Self <: GetEngineVersionArgs] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setParameterGroupFamily(value: String): Self = this.set("parameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupFamily: Self = this.set("parameterGroupFamily", js.undefined)
    
    @scala.inline
    def setPreferredVersionsVarargs(value: String*): Self = this.set("preferredVersions", js.Array(value :_*))
    
    @scala.inline
    def setPreferredVersions(value: js.Array[String]): Self = this.set("preferredVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredVersions: Self = this.set("preferredVersions", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
