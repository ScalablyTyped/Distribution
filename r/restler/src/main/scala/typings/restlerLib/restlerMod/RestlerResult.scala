package typings
package restlerLib.restlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for restler result.
     * @interface
     */

trait RestlerResult extends js.Object {
  /**
           * Adds the listener function to the end of the listeners array for the event named eventName.
           * @param {string}    eventName   The name of the event.
           * @param {Function}  listener    The callback function
           */
  def on(
    eventName: java.lang.String,
    listener: js.Function2[
      /* data */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[nodeLib.httpMod.ServerResponse], 
      scala.Unit
    ]
  ): RestlerResult
}

