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

object IGrouper {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    direction: java.lang.String = null,
    extend: java.lang.String = null,
    getDirection: js.Function0[java.lang.String] = null,
    getGroupFn: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getProperty: js.Function0[java.lang.String] = null,
    getRoot: js.Function0[java.lang.String] = null,
    getSortProperty: js.Function0[java.lang.String] = null,
    getSorterFn: js.Function0[_] = null,
    getTransform: js.Function0[_] = null,
    groupFn: js.Any = null,
    id: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    property: java.lang.String = null,
    root: java.lang.String = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setDirection: js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setGroupFn: js.Function1[/* groupFn */ js.UndefOr[js.Any], scala.Unit] = null,
    setId: js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit] = null,
    setProperty: js.Function1[/* property */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRoot: js.Function1[/* root */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSortProperty: js.Function1[/* sortProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSorterFn: js.Function1[/* sorterFn */ js.UndefOr[js.Any], scala.Unit] = null,
    setTransform: js.Function1[/* transform */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sortProperty: java.lang.String = null,
    sorterFn: js.Any = null,
    statics: js.Any = null,
    toggle: js.Function0[scala.Unit] = null,
    transform: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IGrouper = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDirection != null) __obj.updateDynamic("getDirection")(getDirection)
    if (getGroupFn != null) __obj.updateDynamic("getGroupFn")(getGroupFn)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getProperty != null) __obj.updateDynamic("getProperty")(getProperty)
    if (getRoot != null) __obj.updateDynamic("getRoot")(getRoot)
    if (getSortProperty != null) __obj.updateDynamic("getSortProperty")(getSortProperty)
    if (getSorterFn != null) __obj.updateDynamic("getSorterFn")(getSorterFn)
    if (getTransform != null) __obj.updateDynamic("getTransform")(getTransform)
    if (groupFn != null) __obj.updateDynamic("groupFn")(groupFn)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (property != null) __obj.updateDynamic("property")(property)
    if (root != null) __obj.updateDynamic("root")(root)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDirection != null) __obj.updateDynamic("setDirection")(setDirection)
    if (setGroupFn != null) __obj.updateDynamic("setGroupFn")(setGroupFn)
    if (setId != null) __obj.updateDynamic("setId")(setId)
    if (setProperty != null) __obj.updateDynamic("setProperty")(setProperty)
    if (setRoot != null) __obj.updateDynamic("setRoot")(setRoot)
    if (setSortProperty != null) __obj.updateDynamic("setSortProperty")(setSortProperty)
    if (setSorterFn != null) __obj.updateDynamic("setSorterFn")(setSorterFn)
    if (setTransform != null) __obj.updateDynamic("setTransform")(setTransform)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sortProperty != null) __obj.updateDynamic("sortProperty")(sortProperty)
    if (sorterFn != null) __obj.updateDynamic("sorterFn")(sorterFn)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IGrouper]
  }
}

