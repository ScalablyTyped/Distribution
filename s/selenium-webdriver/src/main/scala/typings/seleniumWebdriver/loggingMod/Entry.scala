package typings.seleniumWebdriver.loggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver/lib/logging", "Entry")
@js.native
class Entry protected () extends js.Object {
  def this(level: String, message: String) = this()
  def this(level: Double, message: String) = this()
  /**
    * @param {(!logging.Level|string)} level The entry level.
    * @param {string} message The log message.
    * @param {number=} opt_timestamp The time this entry was generated, in
    *     milliseconds since 0:00:00, January 1, 1970 UTC. If omitted, the
    *     current time will be used.
    * @param {string=} opt_type The log type, if known.
    * @constructor
    */
  def this(level: Level, message: String) = this()
  def this(level: String, message: String, opt_timestamp: Double) = this()
  def this(level: Double, message: String, opt_timestamp: Double) = this()
  def this(level: Level, message: String, opt_timestamp: Double) = this()
  def this(level: String, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: String) = this()
  def this(level: String, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: IType) = this()
  def this(level: String, message: String, opt_timestamp: Double, opt_type: String) = this()
  def this(level: String, message: String, opt_timestamp: Double, opt_type: IType) = this()
  def this(level: Double, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: String) = this()
  def this(level: Double, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: IType) = this()
  def this(level: Double, message: String, opt_timestamp: Double, opt_type: String) = this()
  def this(level: Double, message: String, opt_timestamp: Double, opt_type: IType) = this()
  def this(level: Level, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: String) = this()
  def this(level: Level, message: String, opt_timestamp: js.UndefOr[scala.Nothing], opt_type: IType) = this()
  def this(level: Level, message: String, opt_timestamp: Double, opt_type: String) = this()
  def this(level: Level, message: String, opt_timestamp: Double, opt_type: IType) = this()
  
  /** @type {!logging.Level} */
  var level: Level = js.native
  
  /** @type {string} */
  var message: String = js.native
  
  /** @type {number} */
  var timestamp: Double = js.native
  
  /**
    * @return {{level: string, message: string, timestamp: number,
    *           type: string}} The JSON representation of this entry.
    */
  def toJSON(): IEntryJSON = js.native
  
  /** @type {string} */
  var `type`: String = js.native
}
