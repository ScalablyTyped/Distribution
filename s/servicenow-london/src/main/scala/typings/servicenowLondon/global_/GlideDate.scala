package typings.servicenowLondon.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GlideDate")
@js.native
/**
  * Creates a GlideDate object with the current date time.
  */
class GlideDate ()
  extends typings.servicenowLondon.GlideDate
/* static members */
@JSGlobal("GlideDate")
@js.native
object GlideDate extends js.Object {
  
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
  def subtract(start: typings.servicenowLondon.GlideDate, end: typings.servicenowLondon.GlideDate): typings.servicenowLondon.GlideDuration = js.native
  def subtract(start: typings.servicenowLondon.GlideDate, end: typings.servicenowLondon.GlideTime): typings.servicenowLondon.GlideDuration = js.native
  def subtract(start: typings.servicenowLondon.GlideTime, end: typings.servicenowLondon.GlideDate): typings.servicenowLondon.GlideDuration = js.native
  def subtract(start: typings.servicenowLondon.GlideTime, end: typings.servicenowLondon.GlideTime): typings.servicenowLondon.GlideDuration = js.native
}
