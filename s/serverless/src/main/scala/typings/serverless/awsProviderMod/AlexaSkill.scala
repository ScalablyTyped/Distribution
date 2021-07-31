package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlexaSkill extends StObject {
  
  var appId: String
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AlexaSkill {
  
  @scala.inline
  def apply(appId: String): AlexaSkill = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlexaSkill]
  }
  
  @scala.inline
  implicit class AlexaSkillMutableBuilder[Self <: AlexaSkill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
