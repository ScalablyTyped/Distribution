package typings.servicenowLondon

import typings.servicenowLondon.anon.Get
import typings.servicenowLondon.anon.Name
import typings.servicenowLondon.snWs.RestHTTPMethods
import typings.servicenowLondon.snWs.SOAPResponseV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global_ {
  
  object Class {
    
    @JSGlobal("Class")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * `Class.create` creates a class and returns a constructor function for instances of the class.
      * Calling the constructor function (typically as part of a `new` statement) will invoke the
      * class's `initialize` method.
      */
    @scala.inline
    def create(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Function0[Unit]]
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
    extends StObject
       with typings.servicenowLondon.GlideDBFunctionBuilder {
    
    /**
      * Adds the values of two or more integer fields.
      *
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var myAddingFunction = functionBuilder.add();
      * myAddingFunction = functionBuilder.field('order');
      * myAddingFunction = functionBuilder.field('priority');
      * myAddingFunction = functionBuilder.build();
      */
    /* CompleteClass */
    override def add(): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Builds the database function defined by the GlideDBFunctionBuilder object.
      *
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var myAddingFunction = functionBuilder.add();
      * myAddingFunction = functionBuilder.field('order');
      * myAddingFunction = functionBuilder.field('priority');
      * myAddingFunction = functionBuilder.build();
      * gs.print(myAddingFunction);
      */
    /* CompleteClass */
    override def build(): String = js.native
    
    /**
      * Concatenates the values of two or more fields.
      * Use the `field(String field)` method to define fields on which the operation is performed.
      *
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var myConcatFunction = functionBuilder.concat();
      * myConcatFunction = functionBuilder.field('short_description');
      * myConcatFunction = functionBuilder.field('caller_id.name');
      * myConcatFunction = functionBuilder.build();
      */
    /* CompleteClass */
    override def concat(): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Defines a constant value to use in the function. If used with the `dayofweek()` method, the
      * string defines whether to use Sunday or Monday as the first day of the week.
      *
      * @param constant A constant value used in a function.
      *
      * When used with the `dayofweek()` method, the value defines whether the week starts on a Sunday or
      * Monday.
      *
      * - 1: Week begins on Sunday.
      * - 2: Week begins on Monday.
      *
      * This definition enables the `dayofweek()` method to return the correct day of the week from a
      * given date. If a value other than 1 or 2 is provided, the `dayofweek()` method uses Sunday as
      * the first day of the week.
      */
    /* CompleteClass */
    override def constant(constant: String): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Determines the duration using a given start date/time and end date/time.
      * Use the `field(String field)` method to define start and end date/time fields.
      */
    /* CompleteClass */
    override def datediff(): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Returns an integer representing the day of the week for a given date.
      *
      * @returns If the first day of the week is set to Sunday in the constant(String
      * constant) method, return values are associated with the following days
      * of the week:
      *
      * - 1: Sunday
      * - 2: Monday
      * - 3: Tuesday
      * - 4: Wednesday
      * - 5: Thursday
      * - 6: Friday
      * - 7: Saturday
      *
      * If the first day of the week is set to Monday:
      *
      * - 1: Monday
      * - 2: Tuesday
      * - 3: Wednesday
      * - 4: Thursday
      * - 5: Friday
      * - 6: Saturday
      * - 7: Sunday
      *
      * If a value other than 1 or 2 is provided in the `constant(String constant)` method, the
      * `dayofweek()` method uses Sunday as the first day of the week.
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var dayOfWeekFunction = functionBuilder.dayofweek();
      * dayOfWeekFunction = functionBuilder.field('opened_at');
      * dayOfWeekFunction = functionBuilder.constant('2');
      * dayOfWeekFunction = functionBuilder.build();
      *
      * var gr = new GlideRecord('incident');
      * gr.addFunction(dayOfWeekFunction);
      * gr.query();
      * while(gr.next())
      *   gs.log(gr.getValue(dayOfWeekFunction));
      *
      */
    /* CompleteClass */
    override def dayofweek(): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Divides the value of one integer field by another.
      * Use the `field(String field)` method to define fields on which the operation is performed.
      *
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var myDivideFunction = functionBuilder.divide();
      * myDivideFunction = functionBuilder.field('order');
      * myDivideFunction = functionBuilder.field('priority');
      * myDivideFunction = functionBuilder.build();
      */
    /* CompleteClass */
    override def divide(): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Defines a field on which a SQL operation is performed.
      *
      * @param field The field on which you are performing the SQL operation.
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var myAddingFunction = functionBuilder.add();
      * myAddingFunction = functionBuilder.field('order');
      * myAddingFunction = functionBuilder.field('priority');
      * myAddingFunction = functionBuilder.build();
      */
    /* CompleteClass */
    override def field(field: String): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Determines the number of code units in a field.
      * Use the `field(String field)` method to define fields on which the operation is performed.
      *
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var myLengthFunction = functionBuilder.length();
      * myLengthFunction = functionBuilder.field('short_description');
      * myLengthFunction = functionBuilder.build();
      *
      */
    /* CompleteClass */
    override def length(): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Multiplies the values of two integer fields.
      * Use the `field(String field)` method to define fields on which the operation is performed.
      *
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var myMultiplyFunction = functionBuilder.multiply();
      * myMultiplyFunction = functionBuilder.field('order');
      * myMultiplyFunction = functionBuilder.field('priority');
      * myMultiplyFunction = functionBuilder.build();
      */
    /* CompleteClass */
    override def multiply(): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
    
    /**
      * Subtracts the value of one integer field from another.
      * Use the `field(String field)` method to define fields on which the operation is performed.
      *
      * @example
      *
      * var functionBuilder = new GlideDBFunctionBuilder();
      * var mySubtractFunction = functionBuilder.subtract();
      * mySubtractFunction = functionBuilder.field('order');
      * mySubtractFunction = functionBuilder.field('priority');
      * mySubtractFunction = functionBuilder.build();
      */
    /* CompleteClass */
    override def subtract(): typings.servicenowLondon.GlideDBFunctionBuilder = js.native
  }
  
  @JSGlobal("GlideDate")
  @js.native
  /**
    * Creates a GlideDate object with the current date time.
    */
  class GlideDate ()
    extends StObject
       with typings.servicenowLondon.GlideDate {
    
    /**
      * Gets the date in the specified date format.
      *
      * @param format the desired date format
      * @returns the date in the specified format
      * @example
      *
      * var gd = new GlideDate();
      * gd.setValue('2015-01-01');
      * gs.info(gd.getByFormat('dd-MM-yyyy'));
      * // 01-01-2015
      */
    /* CompleteClass */
    override def getByFormat(format: String): String = js.native
    
    /**
      * Gets the day of the month stored by the GlideDate object, expressed in the UTC time
      * zone.
      *
      * @returns The day of the month in the UTC time zone, from 1 to 31.
      * @example
      *
      * // Today's date is 2016-05-13
      * var gd = new GlideDate('2016-05-13');
      * gs.info(gd.getDayOfMonthNoTZ());
      * // 13
      */
    /* CompleteClass */
    override def getDayOfMonthNoTZ(): Double = js.native
    
    /**
      * Gets the date in the current user's display format and time zone.
      *
      * @returns The date in the user's format and time zone. Keep in mind when designing
      * business rules or script includes that this method may return values in different
      * formats for different users.
      * @example
      *
      * var gd = new GlideDate();
      * gd.setValue('2015-01-01');
      * gs.info(gd.getDisplayValue());
      * // 2015-01-01
      */
    /* CompleteClass */
    override def getDisplayValue(): String = js.native
    
    /**
      * Gets the display value in the internal format (yyyy-MM-dd).
      *
      * @returns The date values for the GlideDate object in the current user's time zone and
      * the internal time format of yyyy-MM-dd.
      * @example
      *
      * var gd = new GlideDate();
      * gs.info(gd.getDisplayValueInternal());
      * // 2014-10-22
      */
    /* CompleteClass */
    override def getDisplayValueInternal(): String = js.native
    
    /**
      * Gets the month stored by the GlideDate object, expressed in the UTC time zone.
      * @returns The numerical value of the month from 1 to 12.
      *
      * @example
      *
      * // Today's date is 2016-05-13
      * var gd = new GlideDate();
      * gs.info(gd.getMonthNoTZ());
      * // 5
      */
    /* CompleteClass */
    override def getMonthNoTZ(): Double = js.native
    
    /**
      * Gets the date value stored in the database by the GlideDate object in the internal
      * format, yyyy-MM-dd, and the system time zone, UTC by default.
      *
      * @returns The date value in the internal format and system time zone.
      * @example
      *
      * var gd = new GlideDate();
      * gd.setValue('2015-01-01');
      * gs.info(gd.getValue());
      * // 2015-01-01
      */
    /* CompleteClass */
    override def getValue(): String = js.native
    
    /**
      * Gets the year stored by the GlideDate object, expressed in the UTC time zone.
      *
      * @returns The numerical value of the year.
      * @example
      *
      * // Today's date is 2016-05-13
      * var gd = new GlideDate();
      * gs.info(gd.getYearNoTZ());
      * // 5
      */
    /* CompleteClass */
    override def getYearNoTZ(): Double = js.native
    
    /**
      * Sets a date value using the current user's display format and time zone.
      *
      * @param asDisplayed The date in the current user's display format and time zone. The parameter must
      * be formatted using the current user's preferred display format, such as yyyy-MM-dd.
      * @returns Method does not return a value
      * @example
      *
      * var gd = new GlideDate();
      * gd.setDisplayValue('2011-01-01');
      * gs.info(gd.getValue());
      * // 2011-01-01
      */
    /* CompleteClass */
    override def setDisplayValue(asDisplayed: String): Unit = js.native
    
    /**
      * Sets the date of the GlideDate object.
      *
      * @param o The date and time to use.
      * @returns Method does not return a value
      * @example
      *
      * var gd = new GlideDate();
      * gd.setValue('2015-01-01');
      * gs.info(gd.getValue());
      * // 2015-01-01
      */
    /* CompleteClass */
    override def setValue(o: String): Unit = js.native
  }
  object GlideDate {
    
    @JSGlobal("GlideDate")
    @js.native
    val ^ : js.Any = js.native
    
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
    @scala.inline
    def subtract(start: typings.servicenowLondon.GlideDate, end: typings.servicenowLondon.GlideDate): typings.servicenowLondon.GlideDuration = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.servicenowLondon.GlideDuration]
    @scala.inline
    def subtract(start: typings.servicenowLondon.GlideDate, end: typings.servicenowLondon.GlideTime): typings.servicenowLondon.GlideDuration = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.servicenowLondon.GlideDuration]
    @scala.inline
    def subtract(start: typings.servicenowLondon.GlideTime, end: typings.servicenowLondon.GlideDate): typings.servicenowLondon.GlideDuration = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.servicenowLondon.GlideDuration]
    @scala.inline
    def subtract(start: typings.servicenowLondon.GlideTime, end: typings.servicenowLondon.GlideTime): typings.servicenowLondon.GlideDuration = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.servicenowLondon.GlideDuration]
  }
  
  @JSGlobal("GlideDateTime")
  @js.native
  /**
    * Instantiates a new GlideDateTime object with the current date and time in Greenwich Mean Time
    * (GMT).
    */
  class GlideDateTime ()
    extends StObject
       with typings.servicenowLondon.GlideDateTime {
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
    
    @JSGlobal("GlideDateTime")
    @js.native
    val ^ : js.Any = js.native
    
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
    @scala.inline
    def subtract(start: typings.servicenowLondon.GlideDateTime): typings.servicenowLondon.GlideDuration = ^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(start.asInstanceOf[js.Any]).asInstanceOf[typings.servicenowLondon.GlideDuration]
    @scala.inline
    def subtract(start: typings.servicenowLondon.GlideDateTime, end: typings.servicenowLondon.GlideDateTime): typings.servicenowLondon.GlideDuration = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.servicenowLondon.GlideDuration]
  }
  
  @JSGlobal("GlideDuration")
  @js.native
  /**
    * Instantiates a GlideDuration object.
    */
  class GlideDuration ()
    extends StObject
       with typings.servicenowLondon.GlideDuration {
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
    
    /**
      * Add the specified duration to the object.
      *
      * @param duration The value to add to the object.
      * @returns The sum of the current and the added duration.
      * @example
      *
      * var duration = new GlideDuration('3 12:00:00');
      * var duration2 = new GlideDuration('3:00:00');
      * var answer = duration.add(duration2);
      * gs.info(answer.getDisplayValue());
      */
    /* CompleteClass */
    override def add(value: typings.servicenowLondon.GlideDuration): typings.servicenowLondon.GlideDuration = js.native
    
    /**
      * Gets the duration in the specified format.
      *
      * @param format The duration format.
      * @returns The current duration in the specified format.
      * @example
      *
      * var dur = new GlideDuration('3 22:00:00');
      * gs.info(dur.getByFormat('HH:mm'));
      */
    /* CompleteClass */
    override def getByFormat(format: String): String = js.native
    
    /**
      * Gets the number of days.
      *
      * @returns The number of days.
      * @example
      *
      * var dur = new GlideDuration('3 12:00:00');
      * gs.info(dur.getDayPart());
      */
    /* CompleteClass */
    override def getDayPart(): Double = js.native
    
    /**
      * Gets the display value of the duration in number of days, hours, and
      * minutes.
      *
      * @returns The number of days, hours, and minutes.
      * @example
      *
      * var dur = new GlideDuration('3 12:00:00');
      * gs.info(dur.getDisplayValue());
      */
    /* CompleteClass */
    override def getDisplayValue(): String = js.native
    
    /**
      * Gets the duration value in "d HH:mm:ss" format.
      *
      * @returns The duration value.
      * @example
      *
      * var dur = new GlideDuration('3 12:00:00');
      * gs.info(dur.getDurationValue());
      */
    /* CompleteClass */
    override def getDurationValue(): String = js.native
    
    /**
      * Gets the rounded number of days. If the time part is more than 12 hours, the return value is
      * rounded up. Otherwise, it is rounded down.
      *
      * @returns The day part, rounded.
      * @example
      *
      * var dur = new GlideDuration('3 11:00:00');
      * gs.info(dur.getRoundedDayPart());
      */
    /* CompleteClass */
    override def getRoundedDayPart(): Double = js.native
    
    /**
      * Gets the internal value of the GlideDuration object.
      *
      * @returns The duration in the object's internal format, which is the date and time from
      * January 1, 1970, 00:00:00.
      * @example
      *
      * var dur = new GlideDuration('3 12:00:00');
      * gs.info(dur.getValue());
      */
    /* CompleteClass */
    override def getValue(): String = js.native
    
    /**
      * Sets the display value.
      *
      * @param asDisplayed The duration in "d HH:mm:ss" format.
      * @returns Method does not return a value
      * @example
      *
      * var dur = new GlideDuration();
      * dur.setDisplayValue('3 08:00:00');
      * gs.info(dur.getDisplayValue());
      */
    /* CompleteClass */
    override def setDisplayValue(asDisplayed: String): Unit = js.native
    
    /**
      * Sets the internal value of the GlideDuration object.
      *
      * @param value The duration in the object's internal format, which is the date and time from
      * January 1, 1970, 00:00:00.
      * @example
      *
      * var dur = new GlideDuration();
      * // Sets internal DateTime value. The String will be parsed into a GlideDateTime object.
      * dur.setValue('1970-01-05 08:00:00');
      * gs.info(dur.getDisplayValue());
      */
    /* CompleteClass */
    override def setValue(value: String): Unit = js.native
    
    /**
      * Subtracts the specified duration from the current duration.
      *
      * @param duration The duration to subtract.
      * @returns GlideDuration of the difference.
      * @example
      *
      * var duration = new GlideDuration('3 12:00:00');
      * var duration2 = new GlideDuration('3:00:00');
      * var answer = duration.subtract(duration2);
      * gs.info(answer.getDisplayValue());
      */
    /* CompleteClass */
    override def subtract(value: typings.servicenowLondon.GlideDuration): typings.servicenowLondon.GlideDuration = js.native
  }
  
  @JSGlobal("GlideEmailOutbound")
  @js.native
  /**
    * Instantiates a scoped GlideEmailOutbound object.
    */
  class GlideEmailOutbound ()
    extends StObject
       with typings.servicenowLondon.GlideEmailOutbound
  
  object GlideFilter {
    
    @JSGlobal("GlideFilter")
    @js.native
    val ^ : js.Any = js.native
    
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
    @scala.inline
    def checkRecord(gr: ScopedGlideRecord, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkRecord")(gr.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def checkRecord(gr: ScopedGlideRecord, filter: String, matchAll: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkRecord")(gr.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], matchAll.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSGlobal("GlideLocale")
  @js.native
  class GlideLocale ()
    extends StObject
       with typings.servicenowLondon.GlideLocale {
    
    /**
      * Returns the decimal separator.
      *
      * @returns The decimal separator.
      * @example
      *
      * var locale = GlideLocale.get();
      * var decimalSeparator = locale.getDecimalSeparator();
      * gs.info( "The decimal separator is " + decimalSeparator);
      * // The decimal separator is .
      */
    /* CompleteClass */
    override def getDecimalSeparator(): String = js.native
    
    /**
      * Returns the grouping separator.
      *
      * @returns The grouping separator.
      * @example
      *
      * var locale = GlideLocale.get();
      * var groupingSeparator = locale.getGroupingSeparator();
      * gs.info( "The grouping separator is " + groupingSeparator);
      */
    /* CompleteClass */
    override def getGroupingSeparator(): String = js.native
  }
  object GlideLocale {
    
    @JSGlobal("GlideLocale")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the GlideLocale object.
      *
      * @returns The GlideLocale object.
      * @example
      *
      * var locale = GlideLocale.get();
      */
    /* static member */
    @scala.inline
    def get(): typings.servicenowLondon.GlideLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[typings.servicenowLondon.GlideLocale]
  }
  
  @JSGlobal("GlidePluginManager")
  @js.native
  class GlidePluginManager ()
    extends StObject
       with typings.servicenowLondon.GlidePluginManager {
    
    /**
      * Determines if the specified plugin has been activated.
      *
      * @param pluginId The plugin ID
      * @returns True if the plugin has been activated.
      * @example
      *
      * var gr = new GlideRecord('sys_plugins');
      * var queryString = "active=0^ORactive=1";
      * gr.addEncodedQuery(queryString);
      * gr.query();
      * pMgr = new GlidePluginManager();
      * while (gr.next()) {
      *   var name = gr.getValue('name');
      *   var pID = gr.getValue('source');
      *   isActive = pMgr.isActive(pID);
      *   if (isActive)
      *     gs.info('The plugin ' + name + " is  active"  );
      * }
      * // The plugin Country Lookup Data is active
      * // The plugin Database Replication is active
      * // The plugin REST API Provider is active
      * // The plugin Ten Cool Things is active
      * // ...
      */
    /* CompleteClass */
    override def isActive(pluginId: String): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecord")
  @js.native
  class GlideRecord protected ()
    extends StObject
       with ScopedGlideRecord {
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
  class GlideRecordSecure protected ()
    extends StObject
       with ScopedGlideRecord {
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
    extends StObject
       with typings.servicenowLondon.GlideSchedule {
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
    extends StObject
       with typings.servicenowLondon.GlideScopedEvaluator
  
  object GlideSecureRandomUtil {
    
    @JSGlobal("GlideSecureRandomUtil")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generates a pseudo-random integer.
      *
      * @returns The pseudo-randomly generated integer.
      * @example
      *
      * gs.info(GlideSecureRandomUtil.getSecureRandomInt());
      */
    @scala.inline
    def getSecureRandomInt(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecureRandomInt")().asInstanceOf[Double]
    
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
    @scala.inline
    def getSecureRandomIntBound(bound: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecureRandomIntBound")(bound.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Generates pseudo-random long value.
      *
      * @returns The pseudo-randomly generated 64-bit integer.
      * @example
      *
      * gs.info(GlideSecureRandomUtil.getSecureRandomLong());
      */
    @scala.inline
    def getSecureRandomLong(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecureRandomLong")().asInstanceOf[Double]
    
    /**
      * Generates a random alpha-numeric String with the specified length.
      *
      * @param length The length of the string in number of characters.
      * @returns The randomly generated string.
      * @example
      *
      * gs.info(GlideSecureRandomUtil.getSecureRandomString(12));
      */
    @scala.inline
    def getSecureRandomString(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecureRandomString")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object GlideStringUtil {
    
    @JSGlobal("GlideStringUtil")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def dotToUnderBar(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dotToUnderBar")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def escapeAllQuotes(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeAllQuotes")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def escapeForHomePage(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeForHomePage")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def escapeHTML(htmlString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHTML")(htmlString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def escapeNonPrintable(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeNonPrintable")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def escapeQueryTermSeparator(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeQueryTermSeparator")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def escapeTicks(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeTicks")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def getHTMLValue(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHTMLValue")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def getNumeric(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumeric")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def isBase64(sourceString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(sourceString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isEligibleSysID(sourceString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEligibleSysID")(sourceString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def newLinesToBreaks(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newLinesToBreaks")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def normalizeWhitespace(sourceString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeWhitespace")(sourceString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def unescapeHTML(htmlString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeHTML")(htmlString.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("GlideSysAttachment")
  @js.native
  class GlideSysAttachment ()
    extends StObject
       with typings.servicenowLondon.GlideSysAttachment {
    
    /* CompleteClass */
    override def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit = js.native
    
    /* CompleteClass */
    override def deleteAttachment(sysId: String): Unit = js.native
    
    /* CompleteClass */
    override def getContent(record: ScopedGlideRecord): js.Any = js.native
    
    /* CompleteClass */
    override def getContentBase64(record: ScopedGlideRecord): String = js.native
    
    /* CompleteClass */
    override def getContentStream(sysId: String): js.Object = js.native
    
    /* CompleteClass */
    override def write(record: ScopedGlideRecord, fileName: String, contentType: String, data: js.Any): String = js.native
    
    /* CompleteClass */
    override def writeBase64(record: ScopedGlideRecord, fileName: String, contentType: String, base64Content: String): String = js.native
    
    /* CompleteClass */
    override def writeContentStream(record: ScopedGlideRecord, fileName: String, contentType: String, inputStream: js.Object): String = js.native
  }
  
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
    extends StObject
       with typings.servicenowLondon.GlideTime {
    /**
      * Instantiates a GlideTime object with the specified time.
      *
      * @example
      *
      * var gt = new GlideTime(10000);
      * gs.info(gt.getDisplayValue());
      */
    def this(milliseconds: Double) = this()
    
    /**
      * Gets the time in the specified format.
      *
      * @param format The time format.
      * @returns The time in the specified format.
      * @example
      *
      * var gt = new GlideTime();
      * gt.setValue('12:00:00');
      * gs.info(gt.getByFormat("HH:mm"));
      */
    /* CompleteClass */
    override def getByFormat(format: String): String = js.native
    
    /**
      * Gets the time in the current user's display format and time zone.
      *
      * @returns The time in the user's format and time zone.
      * @example
      *
      * var gt = new GlideTime();
      * gt.setDisplayValue("12:00:00"); // User Time Zone
      * gs.info(gt.getDisplayValue()); // User Time Zone
      */
    /* CompleteClass */
    override def getDisplayValue(): String = js.native
    
    /**
      * Gets the display value in the current user's time zone and the internal format
      * (HH:mm:ss).
      *
      * @returns The time value for the GlideTime object in the current user's time zone and the
      * internal time format of HH:mm:ss.
      * @example
      *
      * var gt = new GlideTime();
      * gt.setValue("01:00:00"); //Internal Time Zone , UTC
      * gs.info(gt.getDisplayValueInternal()); //User Time Zone
      */
    /* CompleteClass */
    override def getDisplayValueInternal(): String = js.native
    
    /**
      * Returns the hours part of the time using the local time zone.
      *
      * @returns The hours using the local time zone.
      */
    /* CompleteClass */
    override def getHourLocalTime(): Double = js.native
    
    /**
      * Returns the hours part of the time using the local time zone. The number of hours is
      * based on a 24 hour clock.
      *
      * @returns The hours using the local time zone. The number of hours is based on a 24 hour
      * clock.
      */
    /* CompleteClass */
    override def getHourOfDayLocalTime(): Double = js.native
    
    /**
      * Returns the hours part of the time using the UTC time zone. The number of hours is
      * based on a 24 hour clock.
      *
      * @returns The hours using the UTC time zone. The number of hours is based on a 24 hour
      * clock.
      */
    /* CompleteClass */
    override def getHourOfDayUTC(): Double = js.native
    
    /**
      * Returns the hours part of the time using the UTC time zone. The number of hours is
      * based on a 12 hour clock. Noon and midnight are represented by 0, not 12.
      *
      * @returns The hours using the UTC time zone. The number of hours is based on a 12 hour
      * clock. Noon and midnight are represented by 0, not 12.
      */
    /* CompleteClass */
    override def getHourUTC(): Double = js.native
    
    /**
      * Returns the number of minutes using the local time zone.
      *
      * @returns The number of minutes using the local time zone.
      */
    /* CompleteClass */
    override def getMinutesLocalTime(): Double = js.native
    
    /**
      * Returns the number of minutes in the hour based on the UTC time zone.
      *
      * @returns The number of minutes in the hour using the UTC time zone.
      */
    /* CompleteClass */
    override def getMinutesUTC(): Double = js.native
    
    /**
      * Returns the number of seconds in the current minute.
      *
      * @returns The number of seconds in the minute.
      */
    /* CompleteClass */
    override def getSeconds(): Double = js.native
    
    /**
      * Gets the time value stored in the database by the GlideTime object in the internal
      * format, HH:mm:ss, and the system time zone.
      *
      * @returns The time value in the internal fomat and system time zone.
      * @example
      *
      * var gt = new GlideTime();
      * gs.info(gt.getValue()); // Internal Time Zone, UTC
      */
    /* CompleteClass */
    override def getValue(): String = js.native
    
    /**
      * Sets a time value using the current user's display format and time zone.
      *
      * @param asDisplayed The time in the current user's display format and time zone. The parameter
      * must be formatted using the current user's preferred display format, such as HH:mm:ss.
      * @returns Method does not return a value
      * @example
      *
      * var gt = new GlideTime();
      * gt.setDisplayValue('01:00:00');   // User Time Zone
      * gs.info(gt.getDisplayValueInternal()); // User Time Zone
      */
    /* CompleteClass */
    override def setDisplayValue(asDisplayed: String): Unit = js.native
    
    /**
      * Sets the time of the GlideTime object in the internal time zone.
      *
      * @param o The time in hh:mm:ss format.
      * @returns Method does not return a value
      * @example
      *
      * var gt = new GlideTime();
      * gt.setValue('01:00:00');  //Internal Time Zone, UTC
      * gs.info("time is "+ gt.getByFormat('hh:mm:ss'));
      */
    /* CompleteClass */
    override def setValue(o: String): Unit = js.native
    
    /**
      * Gets the duration difference between two GlideTime object values.
      *
      * @param startTime The start value.
      * @param endTime The end value.
      * @returns The duration between the two values.
      * @example
      *
      * var gd1 = new GlideTime();
      * gd1.setDisplayValue("09:00:00");
      * var gd2 = new GlideTime();
      * gd2.setDisplayValue("09:10:00");
      * var dur = GlideDate.subtract(gd1, gd2); //the difference between gdt1 and gdt2
      * gs.info(dur.getDisplayValue());
      */
    /* CompleteClass */
    override def subtract(start: typings.servicenowLondon.GlideTime, end: typings.servicenowLondon.GlideTime): typings.servicenowLondon.GlideDuration = js.native
  }
  
  @JSGlobal("RP")
  @js.native
  val RP: RenderProperties = js.native
  
  @JSGlobal("XMLDocument2")
  @js.native
  class XMLDocument2 ()
    extends StObject
       with typings.servicenowLondon.XMLDocument2 {
    
    /* CompleteClass */
    override def createElement(name: String): XMLNode = js.native
    
    /* CompleteClass */
    override def createElementWithTextValue(name: String, value: String): XMLNode = js.native
    
    /* CompleteClass */
    override def getDocumentElement(): XMLNode = js.native
    
    /* CompleteClass */
    override def getFirstNode(xpath: String): XMLNode = js.native
    
    /* CompleteClass */
    override def getNextNode(prev: js.Object): XMLNode = js.native
    
    /* CompleteClass */
    override def getNode(xpath: String): XMLNode = js.native
    
    /* CompleteClass */
    override def getNodeText(xpath: String): String = js.native
    
    /* CompleteClass */
    override def parseXML(xmlDoc: String): Unit = js.native
    
    /* CompleteClass */
    override def setCurrentElement(element: XMLNode): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("current")
  @js.native
  class current protected ()
    extends StObject
       with ScopedGlideRecord {
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
      extends StObject
         with typings.servicenowLondon.global.Workflow
  }
  
  @JSGlobal("gs")
  @js.native
  val gs: GlideSystem = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("previous")
  @js.native
  class previous protected ()
    extends StObject
       with ScopedGlideRecord {
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
      extends StObject
         with typings.servicenowLondon.snWs.RESTMessageV2 {
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
      extends StObject
         with typings.servicenowLondon.snWs.RESTResponseV2 {
      
      /**
        * Returns all headers contained in the response, including any duplicate headers.
        *
        * @returns The list of headers contained in the response. Each header is represented as a
        * GlideHTTPHeader object which contains the header `name` and `value`.
        * @example
        *
        * var r = new sn_ws.RESTMessageV2('<A REST message>', 'get');
        * var response = r.execute();
        * var headers = response.getAllHeaders();
        * for(var i in headers){
        *   gs.info(headers[i].name + ': ' + headers[i].value);
        * }
        */
      /* CompleteClass */
      override def getAllHeaders(): js.Array[Name] = js.native
      
      /**
        * Get the content of the REST response body.
        *
        * Use this function when you want to get the request body as text content. Do not use this
        * method when saving the response as a binary attachment. If a RESTMessageV2 object called
        * the `saveResponseBodyAsAttachment(...)` function, using `getBody()` on the associated
        * RESTResponseV2 object will cause an error. When saving the response as an attachment,
        * if the outbound REST message fails, call `getErrorMessage()` on the response to retrieve
        * the body content.
        *
        * @returns The REST response body.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
        * var response = sm.execute();
        * var responseBody = response.getBody();
        */
      /* CompleteClass */
      override def getBody(): String = js.native
      
      /**
        * Returns all cookies included in the response.
        *
        * @returns The list of cookies. Iterate through the list to perform operations on each cookie.
        * @example
        *
        * var cookies = response.getCookies();
        * var i;
        * for (var i = 0; i < cookies.size(); i++) {
        *   gs.info('cookie: ' + cookies.get(i));
        * }
        */
      /* CompleteClass */
      override def getCookies(): Get = js.native
      
      /**
        * Get the numeric error code if there was an error during the REST transaction.
        *
        * This error code is specific to the Now Platform, it is not an HTTP error code. Provide this
        * error code if you require assistance from ServiceNow Customer Support.
        *
        * @returns The numeric error code, such as 1 for socket timeout.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
        * var response = sm.execute();
        * var errorCode = response.getErrorCode();
        */
      /* CompleteClass */
      override def getErrorCode(): Double = js.native
      
      /**
        * Get the error message if there was an error during the REST transaction.
        *
        * @returns The error message.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
        * var response = sm.execute();
        * var errorMsg = response.getErrorMessage();
        */
      /* CompleteClass */
      override def getErrorMessage(): String = js.native
      
      /**
        * Get the value for a specified header.
        *
        * @param name The name of the header that you want the value for, such as Set-Cookie.
        * @returns The value of the specified header.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
        * var response = sm.execute();
        * var headerVal = response.getHeader('Content-Type');
        */
      /* CompleteClass */
      override def getHeader(name: String): String = js.native
      
      /**
        * Get all headers returned in the REST response and the associated values.
        *
        * **Note:** If a header is present more than once in the response, such as a Set-Cookie header,
        * this function returns only the last of the duplicate headers. To return all headers
        * including duplicates, use the `getAllHeaders()` function.
        *
        * @returns An Object that maps the name of each header to the associated value.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
        * var response = sm.execute();
        * var headers = response.getHeaders();
        */
      /* CompleteClass */
      override def getHeaders(): js.Object = js.native
      
      /**
        * Get the fully-resolved query sent to the REST endpoint.
        *
        * This query contains the endpoint URL as well as any values assigned to variables in the
        * REST message. Use this method only with responses to direct requests. This method is not
        * supported for requests sent asynchronously, or requests sent using a MID server.
        *
        * @returns The fully-resolved query.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
        * var response = sm.execute();
        * var queryString = response.getQueryString();
        */
      /* CompleteClass */
      override def getQueryString(): String = js.native
      
      /**
        * Get the sys_id value of the attachment created from the response body content.
        *
        * If the RESTMessageV2 object associated with this response called the
        * `saveResponseBodyAsAttachment(...)` function, use `getResponseAttachmentSysid()` to get the
        * sys_id of the created attachment record. Use this function when you want to perform
        * additional operations with the new attachment record.
        *
        * @returns The sys_id of the new attachment record.
        */
      /* CompleteClass */
      override def getResponseAttachmentSysid(): String = js.native
      
      /**
        * Get the numeric HTTP status code returned by the REST provider.
        *
        * @returns The numeric status code returned by the REST provider, such as 200 for a
        * successful response.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
        * var response = sm.execute();
        * var statusCode = response.getStatusCode();
        */
      /* CompleteClass */
      override def getStatusCode(): Double = js.native
      
      /**
        * Indicate if there was an error during the REST transaction.
        *
        * @returns Returns true if there was an error, false if there was no error.
        * @example
        *
        * // Might throw exception if message doesn't exist or not visible due to scope.
        * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
        * var response = sm.execute();
        * var error = response.haveError();
        */
      /* CompleteClass */
      override def haveError(): Boolean = js.native
      
      /**
        * Set the amount of time the instance waits for a response from the web service provider.
        *
        * This method overrides the property glide.rest.outbound.ecc_response.timeout for this REST
        * response.
        *
        * @param timeoutSecs The amount of time, in seconds, to wait for this response.
        * @example
        *
        * var sm = new sn_ws.RESTMessageV2("Yahoo Finance","get"); //Might throw exception if message doesn't exist or not visible due to scope.
        * var response = sm.executeAsync();
        * response.waitForResponse(60);
        */
      /* CompleteClass */
      override def waitForResponse(timeoutSecs: Double): Unit = js.native
    }
    
    @JSGlobal("sn_ws.SOAPMessageV2")
    @js.native
    class SOAPMessageV2 ()
      extends StObject
         with typings.servicenowLondon.snWs.SOAPMessageV2 {
      def this(soapMessage: String, soapFunction: String) = this()
      
      /* CompleteClass */
      override def execute(): SOAPResponseV2 = js.native
      
      /* CompleteClass */
      override def executeAsync(): SOAPResponseV2 = js.native
      
      /* CompleteClass */
      override def getEndpoint(): String = js.native
      
      /* CompleteClass */
      override def getRequestBody(): String = js.native
      
      /* CompleteClass */
      override def getRequestHeader(headerName: String): String = js.native
      
      /* CompleteClass */
      override def getRequestHeaders(): js.Object = js.native
      
      /* CompleteClass */
      override def setBasicAuth(userName: String, userPass: String): Unit = js.native
      
      /* CompleteClass */
      override def setEccCorrelator(correlator: String): Unit = js.native
      
      /* CompleteClass */
      override def setEccParameter(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      override def setEndpoint(endpoint: String): Unit = js.native
      
      /* CompleteClass */
      override def setHttpMethod(method: String): Unit = js.native
      
      /* CompleteClass */
      override def setHttpTimeout(timeoutMs: Double): Unit = js.native
      
      /* CompleteClass */
      override def setMIDServer(midServer: String): Unit = js.native
      
      /* CompleteClass */
      override def setMutualAuth(profileName: String): Unit = js.native
      
      /* CompleteClass */
      override def setRequestBody(body: String): Unit = js.native
      
      /* CompleteClass */
      override def setRequestHeader(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      override def setSOAPAction(soapAction: String): Unit = js.native
      
      /* CompleteClass */
      override def setStringParameter(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      override def setStringParameterNoEscape(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      override def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit = js.native
    }
  }
}
