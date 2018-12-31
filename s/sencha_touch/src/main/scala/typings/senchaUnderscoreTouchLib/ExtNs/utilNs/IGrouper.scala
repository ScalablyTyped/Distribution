package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrouper extends ISorter {
  /** [Method] Returns the value of groupFn
  		* @returns Function
  		*/
  var getGroupFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sortProperty
  		* @returns String
  		*/
  var getSortProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function) */
  var groupFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of groupFn
  		* @param groupFn Function The new value.
  		*/
  var setGroupFn: js.UndefOr[js.Function1[/* groupFn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sortProperty
  		* @param sortProperty String The new value.
  		*/
  var setSortProperty: js.UndefOr[js.Function1[/* sortProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var sortProperty: js.UndefOr[java.lang.String] = js.undefined
}

