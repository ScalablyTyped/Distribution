package typings.rosbag.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeUtil {
  
  @JSImport("rosbag", "TimeUtil")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Computes the sum of two times or durations and returns a new time
    * throws an exception if the resulting time is negative
    * @param left
    * @param right
    */
  inline def add(left: Time, right: Time): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Time]
  
  /**
    * Returns true if both times have the same number of seconds and nanoseconds
    * @param left
    * @param right
    */
  inline def areSame(left: Time, right: Time): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSame")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Compares two times, returning a negative value if the right is greater
    * or a positive value if the left is greater or 0 if the times are equal
    * useful to supply to Array.prototype.sort.
    * @param left
    * @param right
    */
  inline def compare(left: Time, right: Time): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Converts Date object to ROS digestable Time format
    * @param date - Date object
    */
  inline def fromDate(date: js.Date): Time = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[Time]
  
  /**
    * Returns true if the left time is greater than the right time, otherwise false
    * @param left
    * @param right
    */
  inline def isGreaterThan(left: Time, right: Time): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isGreaterThan")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true if the left time is less than the right time, otherwise false
    * @param left
    * @param right
    */
  inline def isLessThan(left: Time, right: Time): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLessThan")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Converts Time from ROSBAG to Date object
    * @param time
    */
  inline def toDate(time: Time): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
