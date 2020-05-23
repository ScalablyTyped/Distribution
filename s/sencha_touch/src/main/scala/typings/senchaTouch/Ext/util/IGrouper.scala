package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
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
  var getSortProperty: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Function) */
  var groupFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of groupFn
    * @param groupFn Function The new value.
    */
  var setGroupFn: js.UndefOr[js.Function1[/* groupFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of sortProperty
    * @param sortProperty String The new value.
    */
  var setSortProperty: js.UndefOr[js.Function1[/* sortProperty */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var sortProperty: js.UndefOr[String] = js.undefined
}

object IGrouper {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    direction: String = null,
    extend: String = null,
    getDirection: () => String = null,
    getGroupFn: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getProperty: () => String = null,
    getRoot: () => String = null,
    getSortProperty: () => String = null,
    getSorterFn: () => _ = null,
    getTransform: () => _ = null,
    groupFn: js.Any = null,
    id: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    property: String = null,
    root: String = null,
    self: IClass = null,
    setDirection: /* direction */ js.UndefOr[String] => Unit = null,
    setGroupFn: /* groupFn */ js.UndefOr[js.Any] => Unit = null,
    setId: /* id */ js.UndefOr[js.Any] => Unit = null,
    setProperty: /* property */ js.UndefOr[String] => Unit = null,
    setRoot: /* root */ js.UndefOr[String] => Unit = null,
    setSortProperty: /* sortProperty */ js.UndefOr[String] => Unit = null,
    setSorterFn: /* sorterFn */ js.UndefOr[js.Any] => Unit = null,
    setTransform: /* transform */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortProperty: String = null,
    sorterFn: js.Any = null,
    statics: js.Any = null,
    toggle: () => Unit = null,
    transform: js.Any = null,
    uses: Array = null
  ): IGrouper = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDirection != null) __obj.updateDynamic("getDirection")(js.Any.fromFunction0(getDirection))
    if (getGroupFn != null) __obj.updateDynamic("getGroupFn")(js.Any.fromFunction0(getGroupFn))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProperty != null) __obj.updateDynamic("getProperty")(js.Any.fromFunction0(getProperty))
    if (getRoot != null) __obj.updateDynamic("getRoot")(js.Any.fromFunction0(getRoot))
    if (getSortProperty != null) __obj.updateDynamic("getSortProperty")(js.Any.fromFunction0(getSortProperty))
    if (getSorterFn != null) __obj.updateDynamic("getSorterFn")(js.Any.fromFunction0(getSorterFn))
    if (getTransform != null) __obj.updateDynamic("getTransform")(js.Any.fromFunction0(getTransform))
    if (groupFn != null) __obj.updateDynamic("groupFn")(groupFn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1(setDirection))
    if (setGroupFn != null) __obj.updateDynamic("setGroupFn")(js.Any.fromFunction1(setGroupFn))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1(setId))
    if (setProperty != null) __obj.updateDynamic("setProperty")(js.Any.fromFunction1(setProperty))
    if (setRoot != null) __obj.updateDynamic("setRoot")(js.Any.fromFunction1(setRoot))
    if (setSortProperty != null) __obj.updateDynamic("setSortProperty")(js.Any.fromFunction1(setSortProperty))
    if (setSorterFn != null) __obj.updateDynamic("setSorterFn")(js.Any.fromFunction1(setSorterFn))
    if (setTransform != null) __obj.updateDynamic("setTransform")(js.Any.fromFunction1(setTransform))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (sortProperty != null) __obj.updateDynamic("sortProperty")(sortProperty.asInstanceOf[js.Any])
    if (sorterFn != null) __obj.updateDynamic("sorterFn")(sorterFn.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrouper]
  }
}

