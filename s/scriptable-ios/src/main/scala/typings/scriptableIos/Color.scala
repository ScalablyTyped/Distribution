package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Stores color data including opacity._
  *
  * Constructs a new color with a hex value and optionally an alpha value. The hex value may specify the alpha value but this will be ignored if the alpha value parameter is provided.
  * Examples of valid hex values: #ff0000, #00ff0080 #00f and #ff. The hashtag is optional.
  * @see https://docs.scriptable.app/color/#-new-color
  */
@JSGlobal("Color")
@js.native
class Color protected () extends js.Object {
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
  /**
    * _Alpha of the color._
    * @see https://docs.scriptable.app/color/#alpha
    */
  var alpha: Double = js.native
  /**
    * _Amount of blue in the color._
    * @see https://docs.scriptable.app/color/#blue
    */
  var blue: Double = js.native
  /**
    * _Amount of green in the color._
    * @see https://docs.scriptable.app/color/#green
    */
  var green: Double = js.native
  /**
    * _HEX representation._
    * @see https://docs.scriptable.app/color/#hex
    */
  var hex: String = js.native
  /**
    * _Amount of red in the color._
    * @see https://docs.scriptable.app/color/#red
    */
  var red: Double = js.native
}

/* static members */
@JSGlobal("Color")
@js.native
object Color extends js.Object {
  /**
    * _Constructs a black color._
    * @see https://docs.scriptable.app/color/#black
    */
  def black(): Color = js.native
  /**
    * _Constructs a blue color._
    * @see https://docs.scriptable.app/color/#blue
    */
  def blue(): Color = js.native
  /**
    * _Constructs a brown color._
    * @see https://docs.scriptable.app/color/#brown
    */
  def brown(): Color = js.native
  /**
    * _Constructs a transparent color._
    * @see https://docs.scriptable.app/color/#clear
    */
  def clear(): Color = js.native
  /**
    * _Constructs a cyan color._
    * @see https://docs.scriptable.app/color/#cyan
    */
  def cyan(): Color = js.native
  /**
    * _Constructs a dark gray color._
    * @see https://docs.scriptable.app/color/#darkgray
    */
  def darkGray(): Color = js.native
  /**
    * _Constructs a gray color._
    * @see https://docs.scriptable.app/color/#gray
    */
  def gray(): Color = js.native
  /**
    * _Constructs a green color._
    * @see https://docs.scriptable.app/color/#green
    */
  def green(): Color = js.native
  /**
    * _Constructs a light gray color._
    * @see https://docs.scriptable.app/color/#lightgray
    */
  def lightGray(): Color = js.native
  /**
    * _Constructs a magenta color._
    * @see https://docs.scriptable.app/color/#magenta
    */
  def magenta(): Color = js.native
  /**
    * _Constructs a orange color._
    * @see https://docs.scriptable.app/color/#orange
    */
  def orange(): Color = js.native
  /**
    * _Constructs a purple color._
    * @see https://docs.scriptable.app/color/#purple
    */
  def purple(): Color = js.native
  /**
    * _Constructs a red color._
    * @see https://docs.scriptable.app/color/#red
    */
  def red(): Color = js.native
  /**
    * _Constructs a white color._
    * @see https://docs.scriptable.app/color/#white
    */
  def white(): Color = js.native
  /**
    * _Constructs a yellow color._
    * @see https://docs.scriptable.app/color/#yellow
    */
  def yellow(): Color = js.native
}

