package typings.servicenowLondon

import typings.servicenowLondon.snWs.RestHTTPMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global_ {
  
  object Class {
    
    /**
      * `Class.create` creates a class and returns a constructor function for instances of the class.
      * Calling the constructor function (typically as part of a `new` statement) will invoke the
      * class's `initialize` method.
      */
    @JSGlobal("Class.create")
    @js.native
    def create(): js.Function0[Unit] = js.native
  }
  
  @JSGlobal("GlideDBFunctionBuilder")
  @js.native
  /**
    * Instantiates a GlideDBFunctionBuilder object.
    *
    * @example
    *
    * var builder = new GlideDBFunctionBuilder();
    */
  class GlideDBFunctionBuilder ()
    extends typings.servicenowLondon.GlideDBFunctionBuilder
  
  @JSGlobal("GlideDate")
  @js.native
  /**
    * Creates a GlideDate object with the current date time.
    */
  class GlideDate ()
    extends typings.servicenowLondon.GlideDate
  object GlideDate {
    
    /**
      * Gets the duration difference between two GlideDate values.
      *
      * @param start The start value.
      * @param end The end value.
      * @returns The duration between the two values.
      * @example
      *
      * var sgd1 = new GlideDate();
      * sgd1.setDisplayValue('2014-07-18');
      * var sgd2 = new GlideDate();
      * sgd2.setDisplayValue('2014-07-19');
      * var duration = GlideDate.subtract(sgd1, sgd2);
      * gs.info(duration.getDisplayValue());
      * // 1 Day
      */
    /* static member */
    @JSGlobal("GlideDate.subtract")
    @js.native
    def subtract(start: typings.servicenowLondon.GlideDate, end: typings.servicenowLondon.GlideDate): typings.servicenowLondon.GlideDuration = js.native
    @JSGlobal("GlideDate.subtract")
    @js.native
    def subtract(start: typings.servicenowLondon.GlideDate, end: typings.servicenowLondon.GlideTime): typings.servicenowLondon.GlideDuration = js.native
    @JSGlobal("GlideDate.subtract")
    @js.native
    def subtract(start: typings.servicenowLondon.GlideTime, end: typings.servicenowLondon.GlideDate): typings.servicenowLondon.GlideDuration = js.native
    @JSGlobal("GlideDate.subtract")
    @js.native
    def subtract(start: typings.servicenowLondon.GlideTime, end: typings.servicenowLondon.GlideTime): typings.servicenowLondon.GlideDuration = js.native
  }
  
  @JSGlobal("GlideDateTime")
  @js.native
  /**
    * Instantiates a new GlideDateTime object with the current date and time in Greenwich Mean Time
    * (GMT).
    */
  class GlideDateTime ()
    extends typings.servicenowLondon.GlideDateTime {
    /**
      * Instantiates a new GlideDateTime object with the current date and time in Greenwich Mean Time
      * (GMT).
      *
      * @param g The GlideDateTime object to use for setting the time of the new object.
      */
    def this(g: typings.servicenowLondon.GlideDateTime) = this()
    /**
      * Instantiates a new GlideDateTime object with the current date and time in Greenwich Mean Time
      * (GMT).
      *
      * @param value A UTC date and time using the internal format yyyy-MM-dd HH:mm:ss.
      */
    def this(value: String) = this()
  }
  object GlideDateTime {
    
    /**
      * Gets the duration difference between two GlideDateTime values.
      *
      * @param Start The start value.
      * @param End The end value.
      * @returns The duration between the two values.
      * @example
      *
      * var gdt1 = new GlideDateTime('2011-08-28 09:00:00');
      * var gdt2 = new GlideDateTime('2011-08-31 08:00:00');
      * var dur = GlideDateTime.subtract(gdt1, gdt2); //the difference between gdt1 and gdt2
      * gs.info(dur.getDisplayValue());
      */
    /* static member */
    @JSGlobal("GlideDateTime.subtract")
    @js.native
    def subtract(start: typings.servicenowLondon.GlideDateTime): typings.servicenowLondon.GlideDuration = js.native
    @JSGlobal("GlideDateTime.subtract")
    @js.native
    def subtract(start: typings.servicenowLondon.GlideDateTime, end: typings.servicenowLondon.GlideDateTime): typings.servicenowLondon.GlideDuration = js.native
  }
  
  @JSGlobal("GlideDuration")
  @js.native
  /**
    * Instantiates a GlideDuration object.
    */
  class GlideDuration ()
    extends typings.servicenowLondon.GlideDuration {
    /**
      * Instantiates a GlideDuration object by cloning the value of another GlideDuration object.
      *
      * @param another Another scoped GlideDuration object.
      */
    def this(another: typings.servicenowLondon.GlideDuration) = this()
    /**
      * Instantiates a GlideDuration object with the specified display value.
      *
      * @param displayValue The display value.
      */
    def this(displayValue: String) = this()
    /**
      * Instantiates a GlideDuration object with the specified duration.
      *
      * @param milliseconds The duration value in milliseconds.
      */
    def this(milliseconds: Double) = this()
  }
  
  @JSGlobal("GlideEmailOutbound")
  @js.native
  /**
    * Instantiates a scoped GlideEmailOutbound object.
    */
  class GlideEmailOutbound ()
    extends typings.servicenowLondon.GlideEmailOutbound
  
  object GlideFilter {
    
    /**
      * The filter parameter is an encoded query string.
      *
      * The method returns true when the record meets the filter condition. If the filter is composed
      * of one or more "AND" conditions for example `active=true^number=abc^category=request` and the
      * matchAll parameter is set to false, then if any of the conditions is true then true is
      * returned. If the matchAll parameter is true, then all conditions in the filter must be true
      * in order to return true.
      *
      * @param gr The GlideRecord to be evaluated.
      * @param filter An encoded query string.
      * @param matchAll (Optional) If true and the encoded query string contains multiple conditions
      * then all conditions must be true for the method to return true. If false and the encoded
      * query string contains multiple conditions then only one condition needs to be true for the
      * method to return true. If the encoded query string has only one condition, this parameter has
      * no impact.
      * @returns True when the record meets the filter conditions.
      * @example
      *
      * var rec = new GlideRecord('incident');
      * rec.query();
      * var bool = true;
      * while(rec.next()) {
      *   bool = GlideFilter.checkRecord(rec, 'active=true');
      *   gs.info('number ' + rec. number + ' is ' + bool);
      * }
      */
    @JSGlobal("GlideFilter.checkRecord")
    @js.native
    def checkRecord(gr: ScopedGlideRecord, filter: String): Boolean = js.native
    @JSGlobal("GlideFilter.checkRecord")
    @js.native
    def checkRecord(gr: ScopedGlideRecord, filter: String, matchAll: js.Object): Boolean = js.native
  }
  
  @JSGlobal("GlideLocale")
  @js.native
  class GlideLocale ()
    extends typings.servicenowLondon.GlideLocale
  object GlideLocale {
    
    /**
      * Returns the GlideLocale object.
      *
      * @returns The GlideLocale object.
      * @example
      *
      * var locale = GlideLocale.get();
      */
    /* static member */
    @JSGlobal("GlideLocale.get")
    @js.native
    def get(): typings.servicenowLondon.GlideLocale = js.native
  }
  
  @JSGlobal("GlidePluginManager")
  @js.native
  class GlidePluginManager ()
    extends typings.servicenowLondon.GlidePluginManager
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecord")
  @js.native
  class GlideRecord protected () extends ScopedGlideRecord {
    /**
      * Creates an instance of the GlideRecord class for the specified table.
      *
      * @param tableName The table to be used.
      * @example
      *
      * var gr = new GlideRecord('incident');
      */
    def this(tableName: String) = this()
  }
  @JSGlobal("GlideRecord")
  @js.native
  val GlideRecord: ScopedGlideRecord = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecordSecure")
  @js.native
  class GlideRecordSecure protected () extends ScopedGlideRecord {
    /**
      * Creates an instance of the GlideRecord class for the specified table.
      *
      * @param tableName The table to be used.
      * @example
      *
      * var gr = new GlideRecord('incident');
      */
    def this(tableName: String) = this()
  }
  @JSGlobal("GlideRecordSecure")
  @js.native
  val GlideRecordSecure: ScopedGlideRecord = js.native
  
  @JSGlobal("GlideSchedule")
  @js.native
  /**
    * Instantiates an empty GlideSchedule object.
    */
  class GlideSchedule ()
    extends typings.servicenowLondon.GlideSchedule {
    /**
      * Instantiates a GlideSchedule object and loads the schedule information. If a timezone is not
      * specified or is nil, the current session timezone is used.
      *
      * @param sysId The system ID for the schedule.
      * @param timeZone The time zone. (Optional)
      * @example
      *
      * var schedule = new GlideSchedule('090eecae0a0a0b260077e1dfa71da828', 'US/Pacific');
      */
    def this(sysId: String) = this()
    def this(sysId: String, timeZone: String) = this()
  }
  
  @JSGlobal("GlideScopedEvaluator")
  @js.native
  /**
    * Instantiates a GlideScopedEvaluator object.
    */
  class GlideScopedEvaluator ()
    extends typings.servicenowLondon.GlideScopedEvaluator
  
  object GlideSecureRandomUtil {
    
    /**
      * Generates a pseudo-random integer.
      *
      * @returns The pseudo-randomly generated integer.
      * @example
      *
      * gs.info(GlideSecureRandomUtil.getSecureRandomInt());
      */
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomInt")
    @js.native
    def getSecureRandomInt(): Double = js.native
    
    /**
      * Generates a pseudo-random integer between 0 (inclusive) and the bound (exclusive) value that
      * you pass into the method.
      *
      * @param bound The bound value.
      * @returns The pseudo-randomly generated integer.
      * @example
      *
      * gs.info(GlideSecureRandomUtil.getSecureRandomIntBound(100));
      */
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomIntBound")
    @js.native
    def getSecureRandomIntBound(bound: Double): Double = js.native
    
    /**
      * Generates pseudo-random long value.
      *
      * @returns The pseudo-randomly generated 64-bit integer.
      * @example
      *
      * gs.info(GlideSecureRandomUtil.getSecureRandomLong());
      */
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomLong")
    @js.native
    def getSecureRandomLong(): Double = js.native
    
    /**
      * Generates a random alpha-numeric String with the specified length.
      *
      * @param length The length of the string in number of characters.
      * @returns The randomly generated string.
      * @example
      *
      * gs.info(GlideSecureRandomUtil.getSecureRandomString(12));
      */
    @JSGlobal("GlideSecureRandomUtil.getSecureRandomString")
    @js.native
    def getSecureRandomString(length: Double): String = js.native
  }
  
  object GlideStringUtil {
    
    @JSGlobal("GlideStringUtil.dotToUnderBar")
    @js.native
    def dotToUnderBar(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.escapeAllQuotes")
    @js.native
    def escapeAllQuotes(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.escapeForHomePage")
    @js.native
    def escapeForHomePage(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.escapeHTML")
    @js.native
    def escapeHTML(htmlString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.escapeNonPrintable")
    @js.native
    def escapeNonPrintable(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.escapeQueryTermSeparator")
    @js.native
    def escapeQueryTermSeparator(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.escapeTicks")
    @js.native
    def escapeTicks(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.getHTMLValue")
    @js.native
    def getHTMLValue(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.getNumeric")
    @js.native
    def getNumeric(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.isBase64")
    @js.native
    def isBase64(sourceString: String): Boolean = js.native
    
    @JSGlobal("GlideStringUtil.isEligibleSysID")
    @js.native
    def isEligibleSysID(sourceString: String): Boolean = js.native
    
    @JSGlobal("GlideStringUtil.newLinesToBreaks")
    @js.native
    def newLinesToBreaks(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.normalizeWhitespace")
    @js.native
    def normalizeWhitespace(sourceString: String): String = js.native
    
    @JSGlobal("GlideStringUtil.unescapeHTML")
    @js.native
    def unescapeHTML(htmlString: String): String = js.native
  }
  
  @JSGlobal("GlideSysAttachment")
  @js.native
  class GlideSysAttachment ()
    extends typings.servicenowLondon.GlideSysAttachment
  
  @JSGlobal("GlideTime")
  @js.native
  /**
    * Instantiates a GlideTime object with the current time.
    *
    * @example
    *
    * var gt = new GlideTime();
    * gs.info(gt.getDisplayValue());
    */
  class GlideTime ()
    extends typings.servicenowLondon.GlideTime {
    /**
      * Instantiates a GlideTime object with the specified time.
      *
      * @example
      *
      * var gt = new GlideTime(10000);
      * gs.info(gt.getDisplayValue());
      */
    def this(milliseconds: Double) = this()
  }
  
  @JSGlobal("RP")
  @js.native
  val RP: RenderProperties = js.native
  
  @JSGlobal("XMLDocument2")
  @js.native
  class XMLDocument2 ()
    extends typings.servicenowLondon.XMLDocument2
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("current")
  @js.native
  class current protected () extends ScopedGlideRecord {
    /**
      * Creates an instance of the GlideRecord class for the specified table.
      *
      * @param tableName The table to be used.
      * @example
      *
      * var gr = new GlideRecord('incident');
      */
    def this(tableName: String) = this()
  }
  @JSGlobal("current")
  @js.native
  val current: ScopedGlideRecord = js.native
  
  @JSGlobal("email")
  @js.native
  val email: typings.servicenowLondon.GlideEmailOutbound = js.native
  
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
    
    @JSGlobal("global.Workflow")
    @js.native
    class Workflow ()
      extends typings.servicenowLondon.global.Workflow
  }
  
  @JSGlobal("gs")
  @js.native
  val gs: GlideSystem = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("previous")
  @js.native
  class previous protected () extends ScopedGlideRecord {
    /**
      * Creates an instance of the GlideRecord class for the specified table.
      *
      * @param tableName The table to be used.
      * @example
      *
      * var gr = new GlideRecord('incident');
      */
    def this(tableName: String) = this()
  }
  @JSGlobal("previous")
  @js.native
  val previous: ScopedGlideRecord = js.native
  
  object snWs {
    
    /**
      * The RESTMessageV2 API allows you to send outbound REST messages using JavaScript.
      * Use the RESTResponseV2 API to manage the response returned by the REST provider.
      *
      * You can use this API in scoped applications, or within the global scope.
      */
    @JSGlobal("sn_ws.RESTMessageV2")
    @js.native
    /**
      * Instantiates an empty RESTMessageV2 object.
      *
      * When using an object instantiated this way, you must manually specify an HTTP method an
      * endpoint.
      * @example
      *
      * var sm = new sn_ws.RESTMessageV2();
      */
    class RESTMessageV2 ()
      extends typings.servicenowLondon.snWs.RESTMessageV2 {
      /**
        * Instantiates a RESTMessageV2 object using information from a REST message record.
        *
        * You must have a REST message record defined before you can use this constructor.
        *
        * In the following example, replace `REST_message_record` with the name of the REST message
        * record from your instance.
        *
        * @param name The name of the REST message record.
        * @param methodName The name of the HTTP method to use, such as GET or PUT.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
        */
      def this(name: String, methodName: RestHTTPMethods) = this()
    }
    
    /**
      * The RESTResponseV2 API allows you to use the data returned by an outbound REST message
      * in JavaScript code.
      */
    @JSGlobal("sn_ws.RESTResponseV2")
    @js.native
    class RESTResponseV2 ()
      extends typings.servicenowLondon.snWs.RESTResponseV2
    
    @JSGlobal("sn_ws.SOAPMessageV2")
    @js.native
    class SOAPMessageV2 ()
      extends typings.servicenowLondon.snWs.SOAPMessageV2 {
      def this(soapMessage: String, soapFunction: String) = this()
    }
  }
}
