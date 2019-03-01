package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISorter
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of id
  		* @returns Mixed
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of property
  		* @returns String
  		*/
  var getProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of root
  		* @returns String
  		*/
  var getRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of sorterFn
  		* @returns Function
  		*/
  var getSorterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of transform
  		* @returns Function
  		*/
  var getTransform: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Mixed) */
  var id: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var property: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of id
  		* @param id Mixed The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of property
  		* @param property String The new value.
  		*/
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of root
  		* @param root String The new value.
  		*/
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sorterFn
  		* @param sorterFn Function The new value.
  		*/
  var setSorterFn: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of transform
  		* @param transform Function The new value.
  		*/
  var setTransform: js.UndefOr[js.Function1[/* transform */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Toggles the direction of this Sorter  */
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var transform: js.UndefOr[js.Any] = js.undefined
}

object ISorter {
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
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getProperty: js.Function0[java.lang.String] = null,
    getRoot: js.Function0[java.lang.String] = null,
    getSorterFn: js.Function0[_] = null,
    getTransform: js.Function0[_] = null,
    id: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    property: java.lang.String = null,
    root: java.lang.String = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setDirection: js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setId: js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit] = null,
    setProperty: js.Function1[/* property */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRoot: js.Function1[/* root */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSorterFn: js.Function1[/* sorterFn */ js.UndefOr[js.Any], scala.Unit] = null,
    setTransform: js.Function1[/* transform */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sorterFn: js.Any = null,
    statics: js.Any = null,
    toggle: js.Function0[scala.Unit] = null,
    transform: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISorter = {
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
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getProperty != null) __obj.updateDynamic("getProperty")(getProperty)
    if (getRoot != null) __obj.updateDynamic("getRoot")(getRoot)
    if (getSorterFn != null) __obj.updateDynamic("getSorterFn")(getSorterFn)
    if (getTransform != null) __obj.updateDynamic("getTransform")(getTransform)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (property != null) __obj.updateDynamic("property")(property)
    if (root != null) __obj.updateDynamic("root")(root)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDirection != null) __obj.updateDynamic("setDirection")(setDirection)
    if (setId != null) __obj.updateDynamic("setId")(setId)
    if (setProperty != null) __obj.updateDynamic("setProperty")(setProperty)
    if (setRoot != null) __obj.updateDynamic("setRoot")(setRoot)
    if (setSorterFn != null) __obj.updateDynamic("setSorterFn")(setSorterFn)
    if (setTransform != null) __obj.updateDynamic("setTransform")(setTransform)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sorterFn != null) __obj.updateDynamic("sorterFn")(sorterFn)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISorter]
  }
}

