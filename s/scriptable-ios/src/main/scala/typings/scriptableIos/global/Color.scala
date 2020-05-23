package typings.scriptableIos.global

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
  /**
    * _Alpha of the color._
    * @see https://docs.scriptable.app/color/#alpha
    */
  /* CompleteClass */
  override var alpha: Double = js.native
  /**
    * _Amount of blue in the color._
    * @see https://docs.scriptable.app/color/#blue
    */
  /* CompleteClass */
  override var blue: Double = js.native
  /**
    * _Amount of green in the color._
    * @see https://docs.scriptable.app/color/#green
    */
  /* CompleteClass */
  override var green: Double = js.native
  /**
    * _HEX representation._
    * @see https://docs.scriptable.app/color/#hex
    */
  /* CompleteClass */
  override var hex: String = js.native
  /**
    * _Amount of red in the color._
    * @see https://docs.scriptable.app/color/#red
    */
  /* CompleteClass */
  override var red: Double = js.native
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

