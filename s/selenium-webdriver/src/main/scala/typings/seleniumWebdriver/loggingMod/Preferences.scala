package typings.seleniumWebdriver.loggingMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/lib/logging", "Preferences")
@js.native
class Preferences () extends js.Object {
  var prefs_ : Map[String, Level] = js.native
  /**
    * Sets the desired logging level for a particular log type.
    * @param {(string|Type)} type The log type.
    * @param {(!Level|string|number)} level The desired log level.
    * @throws {TypeError} if `type` is not a `string`.
    */
  def setLevel(`type`: String, level: Level): Unit = js.native
  def setLevel(`type`: IType, level: Level): Unit = js.native
  /**
    * Converts this instance to its JSON representation.
    * @return {!Object<string, string>} The JSON representation of this set of
    *     preferences.
    */
  def toJSON(): StringDictionary[String] = js.native
}

