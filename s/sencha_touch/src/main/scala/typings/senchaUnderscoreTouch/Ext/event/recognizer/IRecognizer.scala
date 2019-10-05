package typings.senchaUnderscoreTouch.Ext.event.recognizer

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.mixin.IIdentifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRecognizer extends IIdentifiable {
  /** [Method] Returns the value of callbackScope
  		* @returns Object
  		*/
  var getCallbackScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Retrieves the id of this component
  		* @returns String id
  		*/
  @JSName("getId")
  var getId_IRecognizer: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of onFailed
  		* @returns Object
  		*/
  var getOnFailed: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of onRecognized
  		* @returns Object
  		*/
  var getOnRecognized: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of callbackScope
  		* @param callbackScope Object The new value.
  		*/
  var setCallbackScope: js.UndefOr[js.Function1[/* callbackScope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of onFailed
  		* @param onFailed Object The new value.
  		*/
  var setOnFailed: js.UndefOr[js.Function1[/* onFailed */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of onRecognized
  		* @param onRecognized Object The new value.
  		*/
  var setOnRecognized: js.UndefOr[js.Function1[/* onRecognized */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IRecognizer {
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
    getCallbackScope: () => _ = null,
    getId: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getOnFailed: () => _ = null,
    getOnRecognized: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setCallbackScope: /* callbackScope */ js.UndefOr[js.Any] => Unit = null,
    setOnFailed: /* onFailed */ js.UndefOr[js.Any] => Unit = null,
    setOnRecognized: /* onRecognized */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IRecognizer = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCallbackScope != null) __obj.updateDynamic("getCallbackScope")(js.Any.fromFunction0(getCallbackScope))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getOnFailed != null) __obj.updateDynamic("getOnFailed")(js.Any.fromFunction0(getOnFailed))
    if (getOnRecognized != null) __obj.updateDynamic("getOnRecognized")(js.Any.fromFunction0(getOnRecognized))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCallbackScope != null) __obj.updateDynamic("setCallbackScope")(js.Any.fromFunction1(setCallbackScope))
    if (setOnFailed != null) __obj.updateDynamic("setOnFailed")(js.Any.fromFunction1(setOnFailed))
    if (setOnRecognized != null) __obj.updateDynamic("setOnRecognized")(js.Any.fromFunction1(setOnRecognized))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRecognizer]
  }
}

