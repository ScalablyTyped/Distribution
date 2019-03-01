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

object IDecorator {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    component: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    getComponent: js.Function0[_] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null
  ): IDecorator = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (component != null) __obj.updateDynamic("component")(component)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    __obj.asInstanceOf[IDecorator]
  }
}

