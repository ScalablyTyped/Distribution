package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(senchaUnderscoreTouchLib.ExtNs.utilNs.IObservable because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, platformConfig, alternateClassName, singleton, callSuper, self, getInitialConfig, callParent, destroy, callOverridden, initConfig))*/

trait IBufferedCollection extends ICollection {
  /** [Method] Returns the value of pageSize
  		* @returns Number
  		*/
  var getPageSize: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of totalCount
  		* @returns Number
  		*/
  var getTotalCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Sets the value of pageSize
  		* @param pageSize Number The new value.
  		*/
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of totalCount
  		* @param totalCount Number The new value.
  		*/
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

