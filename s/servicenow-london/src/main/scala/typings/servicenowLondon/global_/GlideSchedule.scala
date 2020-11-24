package typings.servicenowLondon.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
