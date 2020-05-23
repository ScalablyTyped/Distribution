package typings.senchaTouch.Ext.event

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent
  extends IBase
     with IDom {
  /** [Property] (Number) */
  var angle: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var direction: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var duration: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var rotation: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var scale: js.UndefOr[Double] = js.undefined
  /** [Method] Stop the event preventDefault and stopPropagation
    * @returns Ext.event.Event this
    */
  var stopEvent: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Cancels bubbling of the event
    * @returns Ext.event.Event this
    */
  var stopPropagation: js.UndefOr[js.Function0[this.type]] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    angle: js.UndefOr[Double] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    direction: js.UndefOr[Double] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getPageX: () => Double = null,
    getPageY: () => Double = null,
    getTarget: (/* selector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement = null,
    getTime: () => _ = null,
    getXY: () => Array = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    pageX: js.UndefOr[Double] = js.undefined,
    pageY: js.UndefOr[Double] = js.undefined,
    platformConfig: js.Any = null,
    preventDefault: () => Unit = null,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stopEvent: () => IEvent = null,
    stopPropagation: () => IEvent = null,
    target: HTMLElement = null,
    uses: Array = null
  ): IEvent = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getPageX != null) __obj.updateDynamic("getPageX")(js.Any.fromFunction0(getPageX))
    if (getPageY != null) __obj.updateDynamic("getPageY")(js.Any.fromFunction0(getPageY))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction3(getTarget))
    if (getTime != null) __obj.updateDynamic("getTime")(js.Any.fromFunction0(getTime))
    if (getXY != null) __obj.updateDynamic("getXY")(js.Any.fromFunction0(getXY))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY.get.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stopEvent != null) __obj.updateDynamic("stopEvent")(js.Any.fromFunction0(stopEvent))
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

