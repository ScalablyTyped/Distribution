package typings.smartFoxServer.global.SFS2X.Requests.System

import typings.smartFoxServer.SFS2X.Requests.BanMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.BanUserRequest")
@js.native
class BanUserRequest protected ()
  extends typings.smartFoxServer.SFS2X.Requests.System.BanUserRequest {
  /**
    * Creates a new BanUserRequest instance.
    * @param {number}  userId        The id of the user to be banned.
    * @param {string}  [message=null]       A custom message to be delivered to the user before banning them; if null, the default message configured in the SmartFoxServer 2X Administration Tool is used.
    * @param {BanMode} [banMode=BY_NAME]       One of the ban modes defined in the BanMode class.
    * @param {number}  [delaySeconds=5]  The number of seconds after which the user is banned after receiving the ban message.
    * @param {number}  [durationHours=24] The duration of the banishment, expressed in hours.
    */
  def this(userId: Double) = this()
  def this(userId: Double, message: String) = this()
  def this(userId: Double, message: js.UndefOr[scala.Nothing], banMode: BanMode) = this()
  def this(userId: Double, message: String, banMode: BanMode) = this()
  def this(
    userId: Double,
    message: js.UndefOr[scala.Nothing],
    banMode: js.UndefOr[scala.Nothing],
    delaySeconds: Double
  ) = this()
  def this(userId: Double, message: js.UndefOr[scala.Nothing], banMode: BanMode, delaySeconds: Double) = this()
  def this(userId: Double, message: String, banMode: js.UndefOr[scala.Nothing], delaySeconds: Double) = this()
  def this(userId: Double, message: String, banMode: BanMode, delaySeconds: Double) = this()
  def this(
    userId: Double,
    message: js.UndefOr[scala.Nothing],
    banMode: js.UndefOr[scala.Nothing],
    delaySeconds: js.UndefOr[scala.Nothing],
    durationHours: Double
  ) = this()
  def this(
    userId: Double,
    message: js.UndefOr[scala.Nothing],
    banMode: js.UndefOr[scala.Nothing],
    delaySeconds: Double,
    durationHours: Double
  ) = this()
  def this(
    userId: Double,
    message: js.UndefOr[scala.Nothing],
    banMode: BanMode,
    delaySeconds: js.UndefOr[scala.Nothing],
    durationHours: Double
  ) = this()
  def this(
    userId: Double,
    message: js.UndefOr[scala.Nothing],
    banMode: BanMode,
    delaySeconds: Double,
    durationHours: Double
  ) = this()
  def this(
    userId: Double,
    message: String,
    banMode: js.UndefOr[scala.Nothing],
    delaySeconds: js.UndefOr[scala.Nothing],
    durationHours: Double
  ) = this()
  def this(
    userId: Double,
    message: String,
    banMode: js.UndefOr[scala.Nothing],
    delaySeconds: Double,
    durationHours: Double
  ) = this()
  def this(
    userId: Double,
    message: String,
    banMode: BanMode,
    delaySeconds: js.UndefOr[scala.Nothing],
    durationHours: Double
  ) = this()
  def this(userId: Double, message: String, banMode: BanMode, delaySeconds: Double, durationHours: Double) = this()
}
