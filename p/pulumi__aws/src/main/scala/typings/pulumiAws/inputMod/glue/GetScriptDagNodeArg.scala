package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScriptDagNodeArg extends StObject {
  
  /**
    * The name of the argument or property.
    */
  var name: String = js.native
  
  /**
    * Boolean if the value is used as a parameter. Defaults to `false`.
    */
  var param: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the argument or property.
    */
  var value: String = js.native
}
object GetScriptDagNodeArg {
  
  @scala.inline
  def apply(name: String, value: String): GetScriptDagNodeArg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagNodeArg]
  }
  
  @scala.inline
  implicit class GetScriptDagNodeArgMutableBuilder[Self <: GetScriptDagNodeArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: Boolean): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
