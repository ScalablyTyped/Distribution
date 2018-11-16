package typings
package senchaUnderscoreTouchLib.ExtNs.fxNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Config Option] (Object) */
  var before: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of after
  		* @returns Object
  		*/
  var getAfter: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of before
  		* @returns Object
  		*/
  var getBefore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of delay
  		* @returns Number
  		*/
  var getDelay: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of duration
  		* @returns Number
  		*/
  var getDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of easing
  		* @returns String
  		*/
  var getEasing: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of element
  		* @returns Object
  		*/
  var getElement: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of iteration
  		* @returns Number
  		*/
  var getIteration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of onBeforeEnd
  		* @returns Object
  		*/
  var getOnBeforeEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of onBeforeStart
  		* @returns Object
  		*/
  var getOnBeforeStart: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of onEnd
  		* @returns Object
  		*/
  var getOnEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of preserveEndState
  		* @returns Boolean
  		*/
  var getPreserveEndState: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of replacePrevious
  		* @returns Boolean
  		*/
  var getReplacePrevious: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of reverse
  		* @returns Object
  		*/
  var getReverse: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of after
  		* @param after Object The new value.
  		*/
  var setAfter: js.UndefOr[js.Function1[/* after */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of before
  		* @param before Object The new value.
  		*/
  var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of delay
  		* @param delay Number The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of duration
  		* @param duration Number The new value.
  		*/
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of easing
  		* @param easing String The new value.
  		*/
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of element
  		* @param element Object The new value.
  		*/
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of iteration
  		* @param iteration Number The new value.
  		*/
  var setIteration: js.UndefOr[js.Function1[/* iteration */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of onBeforeEnd
  		* @param onBeforeEnd Object The new value.
  		*/
  var setOnBeforeEnd: js.UndefOr[js.Function1[/* onBeforeEnd */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of onBeforeStart
  		* @param onBeforeStart Object The new value.
  		*/
  var setOnBeforeStart: js.UndefOr[js.Function1[/* onBeforeStart */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of onEnd
  		* @param onEnd Object The new value.
  		*/
  var setOnEnd: js.UndefOr[js.Function1[/* onEnd */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of preserveEndState
  		* @param preserveEndState Boolean The new value.
  		*/
  var setPreserveEndState: js.UndefOr[js.Function1[/* preserveEndState */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of replacePrevious
  		* @param replacePrevious Boolean The new value.
  		*/
  var setReplacePrevious: js.UndefOr[js.Function1[/* replacePrevious */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of reverse
  		* @param reverse Object The new value.
  		*/
  var setReverse: js.UndefOr[js.Function1[/* reverse */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

