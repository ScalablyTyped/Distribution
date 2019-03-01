package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImg extends IComponent {
  /** [Config Option] (String) */
  var backgroundCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of backgroundCls
  		* @returns String
  		*/
  var getBackgroundCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of imageCls
  		* @returns String
  		*/
  var getImageCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of src
  		* @returns String
  		*/
  var getSrc: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Hides this Component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("hide")
  var hide_IImg: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (String) */
  var imageCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of backgroundCls
  		* @param backgroundCls String The new value.
  		*/
  var setBackgroundCls: js.UndefOr[js.Function1[/* backgroundCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of imageCls
  		* @param imageCls String The new value.
  		*/
  var setImageCls: js.UndefOr[js.Function1[/* imageCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of src
  		* @param src String The new value.
  		*/
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Shows this component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("show")
  var show_IImg: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object IImg {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    backgroundCls: java.lang.String = null,
    baseCls: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    getBackgroundCls: js.Function0[java.lang.String] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getImageCls: js.Function0[java.lang.String] = null,
    getMode: js.Function0[java.lang.String] = null,
    getSrc: js.Function0[java.lang.String] = null,
    hide: js.Function0[IComponent] = null,
    imageCls: java.lang.String = null,
    initialize: js.Function0[scala.Unit] = null,
    mode: java.lang.String = null,
    setBackgroundCls: js.Function1[/* backgroundCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setImageCls: js.Function1[/* imageCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMode: js.Function1[/* mode */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSrc: js.Function1[/* src */ js.UndefOr[java.lang.String], scala.Unit] = null,
    show: js.Function0[IComponent] = null,
    src: java.lang.String = null
  ): IImg = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (backgroundCls != null) __obj.updateDynamic("backgroundCls")(backgroundCls)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (getBackgroundCls != null) __obj.updateDynamic("getBackgroundCls")(getBackgroundCls)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getImageCls != null) __obj.updateDynamic("getImageCls")(getImageCls)
    if (getMode != null) __obj.updateDynamic("getMode")(getMode)
    if (getSrc != null) __obj.updateDynamic("getSrc")(getSrc)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (imageCls != null) __obj.updateDynamic("imageCls")(imageCls)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (setBackgroundCls != null) __obj.updateDynamic("setBackgroundCls")(setBackgroundCls)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setImageCls != null) __obj.updateDynamic("setImageCls")(setImageCls)
    if (setMode != null) __obj.updateDynamic("setMode")(setMode)
    if (setSrc != null) __obj.updateDynamic("setSrc")(setSrc)
    if (show != null) __obj.updateDynamic("show")(show)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[IImg]
  }
}

