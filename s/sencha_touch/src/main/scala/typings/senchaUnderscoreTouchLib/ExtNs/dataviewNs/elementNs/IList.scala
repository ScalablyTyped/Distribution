package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs.elementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IList extends IContainer

object IList {
  @scala.inline
  def apply(IContainer: IContainer = null, destroy: js.Function0[scala.Unit] = null): IList = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    __obj.asInstanceOf[IList]
  }
}

