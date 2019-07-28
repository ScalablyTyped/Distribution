package typings.senchaUnderscoreTouch.ExtNs.layoutNs.wrapperNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IBase
import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDock extends IBase {
  /** [Method] Returns the value of bodyElement
  		* @returns Object
  		*/
  var getBodyElement: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of container
  		* @returns Object
  		*/
  var getContainer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of element
  		* @returns Object
  		*/
  var getElement: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of innerWrapper
  		* @returns Object
  		*/
  var getInnerWrapper: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sizeState
  		* @returns Boolean
  		*/
  var getSizeState: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Sets the value of bodyElement
  		* @param bodyElement Object The new value.
  		*/
  var setBodyElement: js.UndefOr[js.Function1[/* bodyElement */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of container
  		* @param container Object The new value.
  		*/
  var setContainer: js.UndefOr[js.Function1[/* container */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of element
  		* @param element Object The new value.
  		*/
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of innerWrapper
  		* @param innerWrapper Object The new value.
  		*/
  var setInnerWrapper: js.UndefOr[js.Function1[/* innerWrapper */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of sizeState
  		* @param sizeState Boolean The new value.
  		*/
  var setSizeState: js.UndefOr[js.Function1[/* sizeState */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IDock {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getBodyElement: () => _ = null,
    getContainer: () => _ = null,
    getDirection: () => java.lang.String = null,
    getElement: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getInnerWrapper: () => _ = null,
    getSizeState: () => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setBodyElement: /* bodyElement */ js.UndefOr[js.Any] => Unit = null,
    setContainer: /* container */ js.UndefOr[js.Any] => Unit = null,
    setDirection: /* direction */ js.UndefOr[java.lang.String] => Unit = null,
    setElement: /* element */ js.UndefOr[js.Any] => Unit = null,
    setInnerWrapper: /* innerWrapper */ js.UndefOr[js.Any] => Unit = null,
    setSizeState: /* sizeState */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDock = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getBodyElement != null) __obj.updateDynamic("getBodyElement")(js.Any.fromFunction0(getBodyElement))
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (getDirection != null) __obj.updateDynamic("getDirection")(js.Any.fromFunction0(getDirection))
    if (getElement != null) __obj.updateDynamic("getElement")(js.Any.fromFunction0(getElement))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getInnerWrapper != null) __obj.updateDynamic("getInnerWrapper")(js.Any.fromFunction0(getInnerWrapper))
    if (getSizeState != null) __obj.updateDynamic("getSizeState")(js.Any.fromFunction0(getSizeState))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBodyElement != null) __obj.updateDynamic("setBodyElement")(js.Any.fromFunction1(setBodyElement))
    if (setContainer != null) __obj.updateDynamic("setContainer")(js.Any.fromFunction1(setContainer))
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1(setDirection))
    if (setElement != null) __obj.updateDynamic("setElement")(js.Any.fromFunction1(setElement))
    if (setInnerWrapper != null) __obj.updateDynamic("setInnerWrapper")(js.Any.fromFunction1(setInnerWrapper))
    if (setSizeState != null) __obj.updateDynamic("setSizeState")(js.Any.fromFunction1(setSizeState))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDock]
  }
}

