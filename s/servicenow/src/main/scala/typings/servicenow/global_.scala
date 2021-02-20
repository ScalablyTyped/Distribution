package typings.servicenow

import typings.servicenow.servicenow.GlideEmailOutbound
import typings.servicenow.servicenow.GlideScriptedProcessor
import typings.servicenow.servicenow.GlideServletRequest
import typings.servicenow.servicenow.GlideServletResponse
import typings.servicenow.servicenow.GlideSystem
import typings.servicenow.servicenow.RestHTTPMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global_ {
  
  @JSGlobal("GlideDateTime")
  @js.native
  class GlideDateTime ()
    extends typings.servicenow.GlideDateTime {
    def this(value: String) = this()
    def this(value: typings.servicenow.GlideDateTime) = this()
  }
  
  @JSGlobal("GlideDuration")
  @js.native
  class GlideDuration ()
    extends typings.servicenow.GlideDuration {
    def this(value: String) = this()
    def this(value: Double) = this()
    def this(value: typings.servicenow.GlideDuration) = this()
  }
  
  @JSGlobal("GlideEvaluator")
  @js.native
  class GlideEvaluator ()
    extends typings.servicenow.GlideEvaluator
  
  object GlideFilter {
    
    @JSGlobal("GlideFilter.checkRecord")
    @js.native
    def checkRecord(gr: typings.servicenow.servicenow.GlideRecord, filter: String): Boolean = js.native
    @JSGlobal("GlideFilter.checkRecord")
    @js.native
    def checkRecord(gr: typings.servicenow.servicenow.GlideRecord, filter: String, matchAll: js.Object): Boolean = js.native
  }
  
  object GlideGuid {
    
    @JSGlobal("GlideGuid.generate")
    @js.native
    def generate(): String = js.native
  }
  
  @JSGlobal("GlideLocale")
  @js.native
  class GlideLocale ()
    extends typings.servicenow.GlideLocale
  object GlideLocale {
    
    /* static member */
    @JSGlobal("GlideLocale.get")
    @js.native
    def get(): typings.servicenow.GlideLocale = js.native
  }
  
  object GlidePluginManager {
    
    @JSGlobal("GlidePluginManager.isActive")
    @js.native
    def isActive(pluginId: String): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecord")
  @js.native
  class GlideRecord protected ()
    extends typings.servicenow.servicenow.GlideRecord {
    def this(`type`: String) = this()
  }
  @JSGlobal("GlideRecord")
  @js.native
  val GlideRecord: typings.servicenow.servicenow.GlideRecord = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecordSecure")
  @js.native
  class GlideRecordSecure protected ()
    extends typings.servicenow.servicenow.GlideRecord {
    def this(`type`: String) = this()
  }
  @JSGlobal("GlideRecordSecure")
  @js.native
  val GlideRecordSecure: typings.servicenow.servicenow.GlideRecord = js.native
  
  @JSGlobal("GlideSchedule")
  @js.native
  class GlideSchedule ()
    extends typings.servicenow.GlideSchedule {
    def this(sysId: String, timeZone: String) = this()
  }
  
  object GlideSecureRandomUtil {
    
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomInt")
    @js.native
    def getSecureRandomInt(): Double = js.native
    
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomIntBound")
    @js.native
    def getSecureRandomIntBound(bound: Double): Double = js.native
    
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomLong")
    @js.native
    def getSecureRandomLong(): Double = js.native
    
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomString")
    @js.native
    def getSecureRandomString(length: Double): String = js.native
  }
  
  @JSGlobal("GlideSysAttachment")
  @js.native
  class GlideSysAttachment ()
    extends typings.servicenow.GlideSysAttachment
  
  @JSGlobal("GlideTime")
  @js.native
  class GlideTime protected ()
    extends typings.servicenow.GlideTime {
    def this(milliseconds: Double) = this()
  }
  
  object RP {
    
    @JSGlobal("RP.getParameterValue")
    @js.native
    def getParameterValue(value: String): String = js.native
    
    @JSGlobal("RP.getParameters")
    @js.native
    def getParameters(): js.Array[String] = js.native
    
    @JSGlobal("RP.getReferringURL")
    @js.native
    def getReferringURL(): String = js.native
    
    @JSGlobal("RP.getViewID")
    @js.native
    def getViewID(): String = js.native
    
    @JSGlobal("RP.isDialog")
    @js.native
    def isDialog(): Boolean = js.native
    
    @JSGlobal("RP.isHomePage")
    @js.native
    def isHomePage(): Boolean = js.native
    
    @JSGlobal("RP.isMobile")
    @js.native
    def isMobile(): Boolean = js.native
    
    @JSGlobal("RP.isPrint")
    @js.native
    def isPrint(): Boolean = js.native
  }
  
  @JSGlobal("XMLDocument2")
  @js.native
  class XMLDocument2 ()
    extends typings.servicenow.XMLDocument2
  
  @JSGlobal("email")
  @js.native
  val email: GlideEmailOutbound = js.native
  
  @JSGlobal("g_processor")
  @js.native
  val gProcessor: GlideScriptedProcessor = js.native
  
  @JSGlobal("g_request")
  @js.native
  val gRequest: GlideServletRequest = js.native
  
  @JSGlobal("g_response")
  @js.native
  val gResponse: GlideServletResponse = js.native
  
  object global {
    
    object Class {
      
      @JSGlobal("global.Class.create")
      @js.native
      def create(): js.Any = js.native
    }
    
    object GlideStringUtil {
      
      @JSGlobal("global.GlideStringUtil.base64Decode")
      @js.native
      def base64Decode(value: String): String = js.native
      
      @JSGlobal("global.GlideStringUtil.base64DecodeAsBytes")
      @js.native
      def base64DecodeAsBytes(value: String): js.Any = js.native
      
      @JSGlobal("global.GlideStringUtil.escapeHTML")
      @js.native
      def escapeHTML(value: String): String = js.native
      
      @JSGlobal("global.GlideStringUtil.getStringFromStream")
      @js.native
      def getStringFromStream(stream: js.Object): String = js.native
    }
    
    @JSGlobal("global.Workflow")
    @js.native
    class Workflow ()
      extends typings.servicenow.global.Workflow
  }
  
  @JSGlobal("gs")
  @js.native
  val gs: GlideSystem = js.native
  
  object snWs {
    
    @JSGlobal("sn_ws.RESTMessageV2")
    @js.native
    class RESTMessageV2 ()
      extends typings.servicenow.snWs.RESTMessageV2 {
      def this(name: String, methodName: RestHTTPMethods) = this()
    }
    
    @JSGlobal("sn_ws.SOAPMessageV2")
    @js.native
    class SOAPMessageV2 ()
      extends typings.servicenow.snWs.SOAPMessageV2 {
      def this(soapMessage: String, soapFunction: String) = this()
    }
  }
}
