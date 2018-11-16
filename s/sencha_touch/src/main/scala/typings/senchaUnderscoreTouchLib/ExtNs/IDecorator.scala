package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDecorator extends IComponent {
  /** [Config Option] (Object) */
  var component: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of component
  		* @returns Object
  		*/
  var getComponent: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of component
  		* @param component Object The new value.
  		*/
  var setComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

