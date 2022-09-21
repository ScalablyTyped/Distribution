package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Stores color data including opacity._
  *
  * Constructs a new color with a hex value and optionally an alpha value. The hex value may specify the alpha value but this will be ignored if the alpha value parameter is provided.
  * Examples of valid hex values: #ff0000, #00ff0080 #00f and #ff. The hashtag is optional.
  * @see https://docs.scriptable.app/color/#-new-color
  */
@JSGlobal("Color")
@js.native
open class Color protected ()
  extends StObject
     with typings.scriptableIos.Color {
  /**
    * _Stores color data including opacity._
    *
    * Constructs a new color with a hex value and optionally an alpha value. The hex value may specify the alpha value but this will be ignored if the alpha value parameter is provided.
    * Examples of valid hex values: #ff0000, #00ff0080 #00f and #ff. The hashtag is optional.
    * @param hex - Hex value.
    * @param alpha - Alpha value.
    * @see https://docs.scriptable.app/color/#-new-color
    */
  def this(hex: String) = this()
  def this(hex: String, alpha: Double) = this()
  
  /**
    * _Alpha of the color._
    * @see https://docs.scriptable.app/color/#alpha
    */
  /* CompleteClass */
  var alpha: Double = js.native
  
  /**
    * _Amount of blue in the color._
    * @see https://docs.scriptable.app/color/#blue
    */
  /* CompleteClass */
  var blue: Double = js.native
  
  /**
    * _Amount of green in the color._
    * @see https://docs.scriptable.app/color/#green
    */
  /* CompleteClass */
  var green: Double = js.native
  
  /**
    * _HEX representation._
    * @see https://docs.scriptable.app/color/#hex
    */
  /* CompleteClass */
  var hex: String = js.native
  
  /**
    * _Amount of red in the color._
    * @see https://docs.scriptable.app/color/#red
    */
  /* CompleteClass */
  var red: Double = js.native
}
object Color {
  
  @JSGlobal("Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Constructs a black color._
    * @see https://docs.scriptable.app/color/#black
    */
  /* static member */
  inline def black(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("black")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a blue color._
    * @see https://docs.scriptable.app/color/#blue
    */
  /* static member */
  inline def blue(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("blue")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a brown color._
    * @see https://docs.scriptable.app/color/#brown
    */
  /* static member */
  inline def brown(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("brown")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a transparent color._
    * @see https://docs.scriptable.app/color/#clear
    */
  /* static member */
  inline def clear(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a cyan color._
    * @see https://docs.scriptable.app/color/#cyan
    */
  /* static member */
  inline def cyan(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("cyan")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a dark gray color._
    * @see https://docs.scriptable.app/color/#darkgray
    */
  /* static member */
  inline def darkGray(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("darkGray")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Creates a dynamic color._
    *
    * The dynamic color will use either its light or dark variant depending on the appearance of the system.
    *
    * Dynamic colors are not supported when used with `DrawContext`.
    * @param lightColor - Color used in light appearance.
    * @param darkColor - Color used in dark appearance.
    * @see https://docs.scriptable.app/color/#dynamic
    */
  /* static member */
  inline def dynamic(lightColor: typings.scriptableIos.Color, darkColor: typings.scriptableIos.Color): typings.scriptableIos.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamic")(lightColor.asInstanceOf[js.Any], darkColor.asInstanceOf[js.Any])).asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a gray color._
    * @see https://docs.scriptable.app/color/#gray
    */
  /* static member */
  inline def gray(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("gray")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a green color._
    * @see https://docs.scriptable.app/color/#green
    */
  /* static member */
  inline def green(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("green")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a light gray color._
    * @see https://docs.scriptable.app/color/#lightgray
    */
  /* static member */
  inline def lightGray(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("lightGray")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a magenta color._
    * @see https://docs.scriptable.app/color/#magenta
    */
  /* static member */
  inline def magenta(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("magenta")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a orange color._
    * @see https://docs.scriptable.app/color/#orange
    */
  /* static member */
  inline def orange(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("orange")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a purple color._
    * @see https://docs.scriptable.app/color/#purple
    */
  /* static member */
  inline def purple(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("purple")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a red color._
    * @see https://docs.scriptable.app/color/#red
    */
  /* static member */
  inline def red(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("red")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a white color._
    * @see https://docs.scriptable.app/color/#white
    */
  /* static member */
  inline def white(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("white")().asInstanceOf[typings.scriptableIos.Color]
  
  /**
    * _Constructs a yellow color._
    * @see https://docs.scriptable.app/color/#yellow
    */
  /* static member */
  inline def yellow(): typings.scriptableIos.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("yellow")().asInstanceOf[typings.scriptableIos.Color]
}
