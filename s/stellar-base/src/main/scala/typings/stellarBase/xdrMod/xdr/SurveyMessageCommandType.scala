package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.surveyTopology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurveyMessageCommandType extends StObject {
  
  val name: surveyTopology = js.native
  
  val value: `0` = js.native
}
object SurveyMessageCommandType {
  
  @scala.inline
  def apply(name: surveyTopology, value: `0`): SurveyMessageCommandType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveyMessageCommandType]
  }
  
  @scala.inline
  implicit class SurveyMessageCommandTypeMutableBuilder[Self <: SurveyMessageCommandType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: surveyTopology): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
