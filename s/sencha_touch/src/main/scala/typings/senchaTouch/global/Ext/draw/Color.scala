package typings.senchaTouch.global.Ext.draw

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.draw.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.draw.Color")
@js.native
class Color ()
  extends typings.senchaTouch.Ext.draw.Color
/* static members */
@JSGlobal("Ext.draw.Color")
@js.native
object Color extends js.Object {
  
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  def addMembers(): Unit = js.native
  def addMembers(members: js.Any): Unit = js.native
  
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  def addStatics(): IBase = js.native
  def addStatics(members: js.Any): IBase = js.native
  
  /** [Method]
    * @param args Object
    */
  def callParent(): Unit = js.native
  def callParent(args: js.Any): Unit = js.native
  
  /** [Method] Convenience method for creating a color
    * @param red Ext.draw.Color/String/Number[]/Number Red component (0..255), CSS color string or array of all components.
    * @param green Number Green component (0..255)
    * @param blue Number Blue component (0..255)
    * @param alpha Number Alpha component (0..1)
    * @returns Ext.draw.Color
    */
  def create(): IColor = js.native
  def create(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: Double
  ): IColor = js.native
  def create(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double): IColor = js.native
  def create(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): IColor = js.native
  def create(red: js.UndefOr[scala.Nothing], green: Double): IColor = js.native
  def create(red: js.UndefOr[scala.Nothing], green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
  def create(red: js.UndefOr[scala.Nothing], green: Double, blue: Double): IColor = js.native
  def create(red: js.UndefOr[scala.Nothing], green: Double, blue: Double, alpha: Double): IColor = js.native
  def create(red: js.Any): IColor = js.native
  def create(red: js.Any, green: js.UndefOr[scala.Nothing], blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
  def create(red: js.Any, green: js.UndefOr[scala.Nothing], blue: Double): IColor = js.native
  def create(red: js.Any, green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): IColor = js.native
  def create(red: js.Any, green: Double): IColor = js.native
  def create(red: js.Any, green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
  def create(red: js.Any, green: Double, blue: Double): IColor = js.native
  def create(red: js.Any, green: Double, blue: Double, alpha: Double): IColor = js.native
  
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  def createAlias(): Unit = js.native
  def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  
  /** [Method] Returns a flyweight instance of Ext draw Color
    * @param red Number/String Red component (0..255) or CSS color string.
    * @param green Number Green component (0..255)
    * @param blue Number Blue component (0..255)
    * @param alpha Number Alpha component (0..1)
    * @returns Ext.draw.Color
    */
  def fly(): IColor = js.native
  def fly(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: Double
  ): IColor = js.native
  def fly(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double): IColor = js.native
  def fly(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): IColor = js.native
  def fly(red: js.UndefOr[scala.Nothing], green: Double): IColor = js.native
  def fly(red: js.UndefOr[scala.Nothing], green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
  def fly(red: js.UndefOr[scala.Nothing], green: Double, blue: Double): IColor = js.native
  def fly(red: js.UndefOr[scala.Nothing], green: Double, blue: Double, alpha: Double): IColor = js.native
  def fly(red: js.Any): IColor = js.native
  def fly(red: js.Any, green: js.UndefOr[scala.Nothing], blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
  def fly(red: js.Any, green: js.UndefOr[scala.Nothing], blue: Double): IColor = js.native
  def fly(red: js.Any, green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): IColor = js.native
  def fly(red: js.Any, green: Double): IColor = js.native
  def fly(red: js.Any, green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): IColor = js.native
  def fly(red: js.Any, green: Double, blue: Double): IColor = js.native
  def fly(red: js.Any, green: Double, blue: Double, alpha: Double): IColor = js.native
  
  /** [Method] Create a new color based on the specified HSL values
    * @param h Number Hue component (0..359)
    * @param s Number Saturation component (0..1)
    * @param l Number Lightness component (0..1)
    * @returns Ext.draw.Color
    */
  def fromHSL(): IColor = js.native
  def fromHSL(h: js.UndefOr[scala.Nothing], s: js.UndefOr[scala.Nothing], l: Double): IColor = js.native
  def fromHSL(h: js.UndefOr[scala.Nothing], s: Double): IColor = js.native
  def fromHSL(h: js.UndefOr[scala.Nothing], s: Double, l: Double): IColor = js.native
  def fromHSL(h: Double): IColor = js.native
  def fromHSL(h: Double, s: js.UndefOr[scala.Nothing], l: Double): IColor = js.native
  def fromHSL(h: Double, s: Double): IColor = js.native
  def fromHSL(h: Double, s: Double, l: Double): IColor = js.native
  
  /** [Method] Parse the string and create a new color
    * @param string String Color in string.
    * @returns Ext.draw.Color
    */
  def fromString(): IColor = js.native
  def fromString(string: String): IColor = js.native
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): String = js.native
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
}
