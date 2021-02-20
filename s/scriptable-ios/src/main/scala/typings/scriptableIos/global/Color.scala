package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
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
object Color {
  
  /**
    * _Constructs a black color._
    * @see https://docs.scriptable.app/color/#black
    */
  /* static member */
  @JSGlobal("Color.black")
  @js.native
  def black(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a blue color._
    * @see https://docs.scriptable.app/color/#blue
    */
  /* static member */
  @JSGlobal("Color.blue")
  @js.native
  def blue(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a brown color._
    * @see https://docs.scriptable.app/color/#brown
    */
  /* static member */
  @JSGlobal("Color.brown")
  @js.native
  def brown(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a transparent color._
    * @see https://docs.scriptable.app/color/#clear
    */
  /* static member */
  @JSGlobal("Color.clear")
  @js.native
  def clear(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a cyan color._
    * @see https://docs.scriptable.app/color/#cyan
    */
  /* static member */
  @JSGlobal("Color.cyan")
  @js.native
  def cyan(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a dark gray color._
    * @see https://docs.scriptable.app/color/#darkgray
    */
  /* static member */
  @JSGlobal("Color.darkGray")
  @js.native
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
  /* static member */
  @JSGlobal("Color.dynamic")
  @js.native
  def dynamic(lightColor: typings.scriptableIos.Color, darkColor: typings.scriptableIos.Color): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a gray color._
    * @see https://docs.scriptable.app/color/#gray
    */
  /* static member */
  @JSGlobal("Color.gray")
  @js.native
  def gray(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a green color._
    * @see https://docs.scriptable.app/color/#green
    */
  /* static member */
  @JSGlobal("Color.green")
  @js.native
  def green(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a light gray color._
    * @see https://docs.scriptable.app/color/#lightgray
    */
  /* static member */
  @JSGlobal("Color.lightGray")
  @js.native
  def lightGray(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a magenta color._
    * @see https://docs.scriptable.app/color/#magenta
    */
  /* static member */
  @JSGlobal("Color.magenta")
  @js.native
  def magenta(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a orange color._
    * @see https://docs.scriptable.app/color/#orange
    */
  /* static member */
  @JSGlobal("Color.orange")
  @js.native
  def orange(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a purple color._
    * @see https://docs.scriptable.app/color/#purple
    */
  /* static member */
  @JSGlobal("Color.purple")
  @js.native
  def purple(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a red color._
    * @see https://docs.scriptable.app/color/#red
    */
  /* static member */
  @JSGlobal("Color.red")
  @js.native
  def red(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a white color._
    * @see https://docs.scriptable.app/color/#white
    */
  /* static member */
  @JSGlobal("Color.white")
  @js.native
  def white(): typings.scriptableIos.Color = js.native
  
  /**
    * _Constructs a yellow color._
    * @see https://docs.scriptable.app/color/#yellow
    */
  /* static member */
  @JSGlobal("Color.yellow")
  @js.native
  def yellow(): typings.scriptableIos.Color = js.native
}
