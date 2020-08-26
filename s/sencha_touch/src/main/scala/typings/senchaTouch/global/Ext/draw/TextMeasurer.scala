package typings.senchaTouch.global.Ext.draw

import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.draw.TextMeasurer")
@js.native
class TextMeasurer ()
  extends typings.senchaTouch.Ext.draw.TextMeasurer

/* static members */
@JSGlobal("Ext.draw.TextMeasurer")
@js.native
object TextMeasurer extends js.Object {
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Measure a text with specific font
    * @param text String
    * @param font String
    * @returns Object An object with width, height and sizes properties.
    */
  def measureText(): js.Any = js.native
  def measureText(text: js.UndefOr[scala.Nothing], font: String): js.Any = js.native
  def measureText(text: String): js.Any = js.native
  def measureText(text: String, font: String): js.Any = js.native
  /** [Method] Measure a single line text with specific font
    * @param text String
    * @param font String
    * @returns Object An object with width and height properties.
    */
  def measureTextSingleLine(): js.Any = js.native
  def measureTextSingleLine(text: js.UndefOr[scala.Nothing], font: String): js.Any = js.native
  def measureTextSingleLine(text: String): js.Any = js.native
  def measureTextSingleLine(text: String, font: String): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  def statics(): IClass = js.native
}

