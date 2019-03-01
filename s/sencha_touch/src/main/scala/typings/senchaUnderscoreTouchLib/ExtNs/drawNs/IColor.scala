package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1).
  		* @returns Ext.draw.Color
  		*/
  var createDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1).
  		* @returns Ext.draw.Color
  		*/
  var createLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get the equivalent HSL components of the color
  		* @param target Array Optional array to receive the values.
  		* @returns Array
  		*/
  var getHSL: js.UndefOr[
    js.Function1[
      /* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[scala.Double] = js.undefined
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
    js.Function3[
      /* h */ js.UndefOr[scala.Double], 
      /* s */ js.UndefOr[scala.Double], 
      /* l */ js.UndefOr[scala.Double], 
      _
    ]
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
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    createDarker: js.Function1[/* factor */ js.UndefOr[scala.Double], IColor] = null,
    createLighter: js.Function1[/* factor */ js.UndefOr[scala.Double], IColor] = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getGrayscale: js.Function0[scala.Double] = null,
    getHSL: js.Function1[
      /* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    lightnessFactor: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setFromString: js.Function1[/* str */ js.UndefOr[java.lang.String], _] = null,
    setHSL: js.Function3[
      /* h */ js.UndefOr[scala.Double], 
      /* s */ js.UndefOr[scala.Double], 
      /* l */ js.UndefOr[scala.Double], 
      _
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    toHex: js.Function1[/* color */ js.UndefOr[js.Any], java.lang.String] = null,
    toString: js.Function0[java.lang.String] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IColor = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (createDarker != null) __obj.updateDynamic("createDarker")(createDarker)
    if (createLighter != null) __obj.updateDynamic("createLighter")(createLighter)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getGrayscale != null) __obj.updateDynamic("getGrayscale")(getGrayscale)
    if (getHSL != null) __obj.updateDynamic("getHSL")(getHSL)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (lightnessFactor != null) __obj.updateDynamic("lightnessFactor")(lightnessFactor.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFromString != null) __obj.updateDynamic("setFromString")(setFromString)
    if (setHSL != null) __obj.updateDynamic("setHSL")(setHSL)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toHex != null) __obj.updateDynamic("toHex")(toHex)
    if (toString != null) __obj.updateDynamic("toString")(toString)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IColor]
  }
}

