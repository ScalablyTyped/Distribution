package typings.servicenowLondon.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

