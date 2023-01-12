package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerraformPlanExpression extends StObject {
  
  var references: js.Array[String]
}
object TerraformPlanExpression {
  
  inline def apply(references: js.Array[String]): TerraformPlanExpression = {
    val __obj = js.Dynamic.literal(references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerraformPlanExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerraformPlanExpression] (val x: Self) extends AnyVal {
    
    inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value*))
  }
}
