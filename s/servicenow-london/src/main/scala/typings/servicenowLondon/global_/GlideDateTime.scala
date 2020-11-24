package typings.servicenowLondon.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
/* static members */
@JSGlobal("GlideDateTime")
@js.native
object GlideDateTime extends js.Object {
  
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
  def subtract(start: typings.servicenowLondon.GlideDateTime): typings.servicenowLondon.GlideDuration = js.native
  def subtract(start: typings.servicenowLondon.GlideDateTime, end: typings.servicenowLondon.GlideDateTime): typings.servicenowLondon.GlideDuration = js.native
}
