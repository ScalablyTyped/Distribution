package typings.seleniumWebdriver.mod.logging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hash describing log preferences.
  * @typedef {Object.<logging.Type, logging.LevelName>}
  */
@JSImport("selenium-webdriver", "logging.Preferences")
@js.native
class Preferences () extends js.Object {
  def setLevel(`type`: String, level: String): Unit = js.native
  def setLevel(`type`: String, level: Double): Unit = js.native
  def setLevel(`type`: String, level: Level): Unit = js.native
  def toJSON(): StringDictionary[String] = js.native
}

