package typings.sharepoint.SP

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SiteHealth {
  
  @js.native
  sealed trait SiteHealthStatusType extends StObject
  @JSGlobal("SP.SiteHealth.SiteHealthStatusType")
  @js.native
  object SiteHealthStatusType extends StObject {
    
    @js.native
    sealed trait failedError
      extends StObject
         with SiteHealthStatusType
    
    @js.native
    sealed trait failedWarning
      extends StObject
         with SiteHealthStatusType
    
    @js.native
    sealed trait passed
      extends StObject
         with SiteHealthStatusType
  }
  
  trait SiteHealthResult
    extends StObject
       with ClientValueObject {
    
    def get_messageAsText(): String
    
    def get_ruleHelpLink(): String
    
    def get_ruleId(): Guid
    
    def get_ruleIsRepairable(): Boolean
    
    def get_ruleName(): String
    
    def get_status(): SiteHealthStatusType
    
    def get_timeStamp(): Date
    
    def set_status(value: SiteHealthStatusType): Unit
    
    def set_timeStamp(value: Date): Unit
  }
  object SiteHealthResult {
    
    inline def apply(
      customFromJson: js.Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: js.Any => Unit,
      get_messageAsText: () => String,
      get_ruleHelpLink: () => String,
      get_ruleId: () => Guid,
      get_ruleIsRepairable: () => Boolean,
      get_ruleName: () => String,
      get_status: () => SiteHealthStatusType,
      get_timeStamp: () => Date,
      get_typeId: () => String,
      set_status: SiteHealthStatusType => Unit,
      set_timeStamp: Date => Unit,
      writeToXml: (XmlWriter, SerializationContext) => Unit
    ): SiteHealthResult = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_messageAsText = js.Any.fromFunction0(get_messageAsText), get_ruleHelpLink = js.Any.fromFunction0(get_ruleHelpLink), get_ruleId = js.Any.fromFunction0(get_ruleId), get_ruleIsRepairable = js.Any.fromFunction0(get_ruleIsRepairable), get_ruleName = js.Any.fromFunction0(get_ruleName), get_status = js.Any.fromFunction0(get_status), get_timeStamp = js.Any.fromFunction0(get_timeStamp), get_typeId = js.Any.fromFunction0(get_typeId), set_status = js.Any.fromFunction1(set_status), set_timeStamp = js.Any.fromFunction1(set_timeStamp), writeToXml = js.Any.fromFunction2(writeToXml))
      __obj.asInstanceOf[SiteHealthResult]
    }
    
    extension [Self <: SiteHealthResult](x: Self) {
      
      inline def setGet_messageAsText(value: () => String): Self = StObject.set(x, "get_messageAsText", js.Any.fromFunction0(value))
      
      inline def setGet_ruleHelpLink(value: () => String): Self = StObject.set(x, "get_ruleHelpLink", js.Any.fromFunction0(value))
      
      inline def setGet_ruleId(value: () => Guid): Self = StObject.set(x, "get_ruleId", js.Any.fromFunction0(value))
      
      inline def setGet_ruleIsRepairable(value: () => Boolean): Self = StObject.set(x, "get_ruleIsRepairable", js.Any.fromFunction0(value))
      
      inline def setGet_ruleName(value: () => String): Self = StObject.set(x, "get_ruleName", js.Any.fromFunction0(value))
      
      inline def setGet_status(value: () => SiteHealthStatusType): Self = StObject.set(x, "get_status", js.Any.fromFunction0(value))
      
      inline def setGet_timeStamp(value: () => Date): Self = StObject.set(x, "get_timeStamp", js.Any.fromFunction0(value))
      
      inline def setSet_status(value: SiteHealthStatusType => Unit): Self = StObject.set(x, "set_status", js.Any.fromFunction1(value))
      
      inline def setSet_timeStamp(value: Date => Unit): Self = StObject.set(x, "set_timeStamp", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SiteHealthSummary
    extends StObject
       with ClientObject {
    
    def get_failedErrorCount(): Double = js.native
    
    def get_failedWarningCount(): Double = js.native
    
    def get_passedCount(): Double = js.native
    
    def get_results(): js.Array[SiteHealthResult] = js.native
  }
}
