package typings.senchaUnderscoreTouch.Ext.dataview.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer
  extends typings.senchaUnderscoreTouch.Ext.IContainer

object IContainer {
  @scala.inline
  def apply(IContainer: typings.senchaUnderscoreTouch.Ext.IContainer = null, destroy: () => Unit = null): IContainer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IContainer]
  }
}

