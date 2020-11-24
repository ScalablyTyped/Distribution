package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColor extends IBase {
  
  /** [Method] Return a new color that is darker than this color
    * @param factor Number Darker factor (0..1).
    * @returns Ext.draw.Color
    */
  var createDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], this.type]] = js.native
  
  /** [Method] Return a new color that is lighter than this color
    * @param factor Number Lighter factor (0..1).
    * @returns Ext.draw.Color
    */
  var createLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], this.type]] = js.native
  
  /** [Method] Returns the gray value 0 to 255 of the color
    * @returns Number
    */
  var getGrayscale: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Get the equivalent HSL components of the color
    * @param target Array Optional array to receive the values.
    * @returns Array
    */
  var getHSL: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Array]] = js.native
  
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[Double] = js.native
  
  /** [Method] Parse the string and set current color
    * @param str String Color in string.
    * @returns Object this
    */
  var setFromString: js.UndefOr[js.Function1[/* str */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Set current color based on the specified HSL values
    * @param h Number Hue component (0..359)
    * @param s Number Saturation component (0..1)
    * @param l Number Lightness component (0..1)
    * @returns Object this
    */
  var setHSL: js.UndefOr[
    js.Function3[/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double], _]
  ] = js.native
  
  /** [Method] Convert a color to hexadecimal format
    * @param color String/Array The color value (i.e 'rgb(255, 255, 255)', 'color: #ffffff'). Can also be an Array, in this case the function handles the first member.
    * @returns String The color in hexadecimal format.
    */
  var toHex: js.UndefOr[js.Function1[/* color */ js.UndefOr[js.Any], String]] = js.native
  
  /** [Method] Return the color in the hex format i e
    * @returns String
    */
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[String]] = js.native
}
object IColor {
  
  @scala.inline
  def apply(): IColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColor]
  }
  
  @scala.inline
  implicit class IColorOps[Self <: IColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateDarker(value: /* factor */ js.UndefOr[Double] => IColor): Self = this.set("createDarker", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateDarker: Self = this.set("createDarker", js.undefined)
    
    @scala.inline
    def setCreateLighter(value: /* factor */ js.UndefOr[Double] => IColor): Self = this.set("createLighter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateLighter: Self = this.set("createLighter", js.undefined)
    
    @scala.inline
    def setGetGrayscale(value: () => Double): Self = this.set("getGrayscale", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGrayscale: Self = this.set("getGrayscale", js.undefined)
    
    @scala.inline
    def setGetHSL(value: /* target */ js.UndefOr[Array] => Array): Self = this.set("getHSL", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetHSL: Self = this.set("getHSL", js.undefined)
    
    @scala.inline
    def setLightnessFactor(value: Double): Self = this.set("lightnessFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightnessFactor: Self = this.set("lightnessFactor", js.undefined)
    
    @scala.inline
    def setSetFromString(value: /* str */ js.UndefOr[String] => _): Self = this.set("setFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFromString: Self = this.set("setFromString", js.undefined)
    
    @scala.inline
    def setSetHSL(value: (/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double]) => _): Self = this.set("setHSL", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetHSL: Self = this.set("setHSL", js.undefined)
    
    @scala.inline
    def setToHex(value: /* color */ js.UndefOr[js.Any] => String): Self = this.set("toHex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToHex: Self = this.set("toHex", js.undefined)
    
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
}
