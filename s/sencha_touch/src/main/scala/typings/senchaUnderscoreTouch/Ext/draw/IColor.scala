package typings.senchaUnderscoreTouch.Ext.draw

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor extends IBase {
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1).
  		* @returns Ext.draw.Color
  		*/
  var createDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1).
  		* @returns Ext.draw.Color
  		*/
  var createLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the equivalent HSL components of the color
  		* @param target Array Optional array to receive the values.
  		* @returns Array
  		*/
  var getHSL: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Array]] = js.undefined
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[Double] = js.undefined
  /** [Method] Parse the string and set current color
  		* @param str String Color in string.
  		* @returns Object this
  		*/
  var setFromString: js.UndefOr[js.Function1[/* str */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Set current color based on the specified HSL values
  		* @param h Number Hue component (0..359)
  		* @param s Number Saturation component (0..1)
  		* @param l Number Lightness component (0..1)
  		* @returns Object this
  		*/
  var setHSL: js.UndefOr[
    js.Function3[/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double], _]
  ] = js.undefined
  /** [Method] Convert a color to hexadecimal format
  		* @param color String/Array The color value (i.e 'rgb(255, 255, 255)', 'color: #ffffff'). Can also be an Array, in this case the function handles the first member.
  		* @returns String The color in hexadecimal format.
  		*/
  var toHex: js.UndefOr[js.Function1[/* color */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Return the color in the hex format i e
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object IColor {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    createDarker: /* factor */ js.UndefOr[Double] => IColor = null,
    createLighter: /* factor */ js.UndefOr[Double] => IColor = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getGrayscale: () => Double = null,
    getHSL: /* target */ js.UndefOr[Array] => Array = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    lightnessFactor: Int | Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setFromString: /* str */ js.UndefOr[java.lang.String] => _ = null,
    setHSL: (/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double]) => _ = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toHex: /* color */ js.UndefOr[js.Any] => java.lang.String = null,
    toString: () => java.lang.String = null,
    uses: Array = null
  ): IColor = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (createDarker != null) __obj.updateDynamic("createDarker")(js.Any.fromFunction1(createDarker))
    if (createLighter != null) __obj.updateDynamic("createLighter")(js.Any.fromFunction1(createLighter))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getGrayscale != null) __obj.updateDynamic("getGrayscale")(js.Any.fromFunction0(getGrayscale))
    if (getHSL != null) __obj.updateDynamic("getHSL")(js.Any.fromFunction1(getHSL))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (lightnessFactor != null) __obj.updateDynamic("lightnessFactor")(lightnessFactor.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFromString != null) __obj.updateDynamic("setFromString")(js.Any.fromFunction1(setFromString))
    if (setHSL != null) __obj.updateDynamic("setHSL")(js.Any.fromFunction3(setHSL))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toHex != null) __obj.updateDynamic("toHex")(js.Any.fromFunction1(toHex))
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IColor]
  }
}

