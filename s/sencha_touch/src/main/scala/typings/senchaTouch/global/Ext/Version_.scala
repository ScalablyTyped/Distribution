package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Version")
@js.native
class Version_ () extends Version
/* static members */
@JSGlobal("Ext.Version")
@js.native
object Version_ extends js.Object {
  
  /** [Method] Compare 2 specified versions starting from left to right
    * @param current String The current version to compare to.
    * @param target String The target version to compare to.
    * @returns Number Returns -1 if the current version is smaller than the target version, 1 if greater, and 0 if they're equivalent.
    */
  def compare(): Double = js.native
  def compare(current: js.UndefOr[scala.Nothing], target: java.lang.String): Double = js.native
  def compare(current: java.lang.String): Double = js.native
  def compare(current: java.lang.String, target: java.lang.String): Double = js.native
  
  /** [Method] Converts a version component to a comparable value
    * @param value Object The value to convert
    * @returns Object
    */
  def getComponentValue(): js.Any = js.native
  def getComponentValue(value: js.Any): js.Any = js.native
}
