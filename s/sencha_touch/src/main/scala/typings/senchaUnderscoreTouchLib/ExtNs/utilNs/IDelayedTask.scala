package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedTask
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Cancels any pending timeout and queues a new one
  		* @param delay Number The milliseconds to delay
  		* @param newFn Function Overrides the original function passed when instantiated.
  		* @param newScope Object Overrides the original scope passed when instantiated. Remember that if no scope is specified, this will refer to the browser window.
  		* @param newArgs Array Overrides the original args passed when instantiated.
  		*/
  var delay: js.UndefOr[
    js.Function4[
      /* delay */ js.UndefOr[scala.Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Object
  		*/
  var getArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of delay
  		* @returns Object
  		*/
  var getDelay: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of fn
  		* @returns Object
  		*/
  var getFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of interval
  		* @returns Object
  		*/
  var getInterval: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of delay
  		* @param delay Object The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fn
  		* @param fn Object The new value.
  		*/
  var setFn: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of interval
  		* @param interval Object The new value.
  		*/
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

