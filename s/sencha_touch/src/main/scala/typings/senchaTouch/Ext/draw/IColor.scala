package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColor
  extends StObject
     with IBase {
  
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
  var setFromString: js.UndefOr[js.Function1[/* str */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Method] Set current color based on the specified HSL values
    * @param h Number Hue component (0..359)
    * @param s Number Saturation component (0..1)
    * @param l Number Lightness component (0..1)
    * @returns Object this
    */
  var setHSL: js.UndefOr[
    js.Function3[
      /* h */ js.UndefOr[Double], 
      /* s */ js.UndefOr[Double], 
      /* l */ js.UndefOr[Double], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Convert a color to hexadecimal format
    * @param color String/Array The color value (i.e 'rgb(255, 255, 255)', 'color: #ffffff'). Can also be an Array, in this case the function handles the first member.
    * @returns String The color in hexadecimal format.
    */
  var toHex: js.UndefOr[js.Function1[/* color */ js.UndefOr[js.Any], String]] = js.undefined
  
  /** [Method] Return the color in the hex format i e
    * @returns String
    */
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[String]] = js.undefined
}
object IColor {
  
  @scala.inline
  def apply(): IColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColor]
  }
  
  @scala.inline
  implicit class IColorMutableBuilder[Self <: IColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDarker(value: /* factor */ js.UndefOr[Double] => IColor): Self = StObject.set(x, "createDarker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateDarkerUndefined: Self = StObject.set(x, "createDarker", js.undefined)
    
    @scala.inline
    def setCreateLighter(value: /* factor */ js.UndefOr[Double] => IColor): Self = StObject.set(x, "createLighter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateLighterUndefined: Self = StObject.set(x, "createLighter", js.undefined)
    
    @scala.inline
    def setGetGrayscale(value: () => Double): Self = StObject.set(x, "getGrayscale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGrayscaleUndefined: Self = StObject.set(x, "getGrayscale", js.undefined)
    
    @scala.inline
    def setGetHSL(value: /* target */ js.UndefOr[Array] => Array): Self = StObject.set(x, "getHSL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHSLUndefined: Self = StObject.set(x, "getHSL", js.undefined)
    
    @scala.inline
    def setLightnessFactor(value: Double): Self = StObject.set(x, "lightnessFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightnessFactorUndefined: Self = StObject.set(x, "lightnessFactor", js.undefined)
    
    @scala.inline
    def setSetFromString(value: /* str */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "setFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFromStringUndefined: Self = StObject.set(x, "setFromString", js.undefined)
    
    @scala.inline
    def setSetHSL(
      value: (/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double]) => js.Any
    ): Self = StObject.set(x, "setHSL", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetHSLUndefined: Self = StObject.set(x, "setHSL", js.undefined)
    
    @scala.inline
    def setToHex(value: /* color */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "toHex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToHexUndefined: Self = StObject.set(x, "toHex", js.undefined)
    
    @scala.inline
    def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
  }
}
