package typings
package senchaUnderscoreTouchLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBox extends IDefault {
  /** [Config Option] (String) */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of align
  		* @returns String
  		*/
  var getAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of orient
  		* @returns String
  		*/
  var getOrient: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pack
  		* @returns String
  		*/
  var getPack: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method]
  		* @param item Object
  		* @param isInner Object
  		*/
  @JSName("onItemInnerStateChange")
  var onItemInnerStateChange_IBox: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var pack: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of align
  		* @param align String The new value.
  		*/
  var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of orient
  		* @param orient String The new value.
  		*/
  var setOrient: js.UndefOr[js.Function1[/* orient */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pack
  		* @param pack String The new value.
  		*/
  var setPack: js.UndefOr[js.Function1[/* pack */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

