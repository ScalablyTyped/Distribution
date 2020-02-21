package typings.seleniumWebdriver.loggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/lib/logging", "Level")
@js.native
class Level protected () extends js.Object {
  /**
    * @param {string} name the level's name.
    * @param {number} level the level's numeric value.
    */
  def this(name: String, level: Double) = this()
  /** This logger's name. */
  var name: String = js.native
  var name_ : String = js.native
  /** The numeric log level. */
  var value: Double = js.native
  var value_ : Double = js.native
}

/* static members */
@JSImport("selenium-webdriver/lib/logging", "Level")
@js.native
object Level extends js.Object {
  /**
    * Indicates all log messages should be recorded.
    * @const
    */
  var ALL: Level = js.native
  /**
    * Log messages with a level of `700` or higher.
    * @const
    */
  var DEBUG: Level = js.native
  /**
    * Log messages with a level of `500` or higher.
    * @const
    */
  var FINE: Level = js.native
  /**
    * Log messages with a level of `400` or higher.
    * @const
    */
  var FINER: Level = js.native
  /**
    * Log messages with a level of `300` or higher.
    * @const
    */
  var FINEST: Level = js.native
  /**
    * Log messages with a level of `800` or higher.
    * @const
    */
  var INFO: Level = js.native
  /**
    * Indicates no log messages should be recorded.
    * @const
    */
  var OFF: Level = js.native
  /**
    * Log messages with a level of `1000` or higher.
    * @const
    */
  var SEVERE: Level = js.native
  /**
    * Log messages with a level of `900` or higher.
    * @const
    */
  var WARNING: Level = js.native
}

