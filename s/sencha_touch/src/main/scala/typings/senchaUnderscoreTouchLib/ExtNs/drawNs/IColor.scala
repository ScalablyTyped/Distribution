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

