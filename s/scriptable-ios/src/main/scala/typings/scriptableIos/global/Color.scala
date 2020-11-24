package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
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
class Color protected ()
  extends typings.scriptableIos.Color {
  /**
    * _Stores color data including opacity._
    *
    * Constructs a new color with a hex value and optionally an alpha value. The hex value may specify the alpha value but this will be ignored if the alpha value parameter is provided.
    * Examples of valid hex values: #ff0000, #00ff0080 #00f and #ff. The hashtag is optional.
    * @param hex - Hex value.
    * @param alpha - Alpha value.
    * @see https://docs.scriptable.app/color/#-new-color
    */
  def this(hex: String, alpha: Double) = this()
}
/* static members */
@JSGlobal("Color")
@js.native
object Color extends js.Object {
  
  /**
    * _Constructs a black color._
    * @see https://docs.scriptable.app/color/#black
    */
  def black(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a blue color._
    * @see https://docs.scriptable.app/color/#blue
    */
  def blue(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a brown color._
    * @see https://docs.scriptable.app/color/#brown
    */
  def brown(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a transparent color._
    * @see https://docs.scriptable.app/color/#clear
    */
  def clear(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a cyan color._
    * @see https://docs.scriptable.app/color/#cyan
    */
  def cyan(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a dark gray color._
    * @see https://docs.scriptable.app/color/#darkgray
    */
  def darkGray(): typings.scriptableIos.Color = js.native
  
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
  def dynamic(lightColor: typings.scriptableIos.Color, darkColor: typings.scriptableIos.Color): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a gray color._
    * @see https://docs.scriptable.app/color/#gray
    */
  def gray(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a green color._
    * @see https://docs.scriptable.app/color/#green
    */
  def green(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a light gray color._
    * @see https://docs.scriptable.app/color/#lightgray
    */
  def lightGray(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a magenta color._
    * @see https://docs.scriptable.app/color/#magenta
    */
  def magenta(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a orange color._
    * @see https://docs.scriptable.app/color/#orange
    */
  def orange(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a purple color._
    * @see https://docs.scriptable.app/color/#purple
    */
  def purple(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a red color._
    * @see https://docs.scriptable.app/color/#red
    */
  def red(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a white color._
    * @see https://docs.scriptable.app/color/#white
    */
  def white(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a yellow color._
    * @see https://docs.scriptable.app/color/#yellow
    */
  def yellow(): typings.scriptableIos.Color = js.native
}
