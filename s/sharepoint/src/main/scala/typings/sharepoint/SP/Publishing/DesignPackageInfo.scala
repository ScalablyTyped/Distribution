package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.DesignPackageInfo")
@js.native
class DesignPackageInfo () extends ClientValueObject {
  def get_majorVersion(): Double = js.native
  def get_minorVersion(): Double = js.native
  def get_packageGuid(): Guid = js.native
  def get_packageName(): String = js.native
  def set_majorVersion(value: Double): Double = js.native
  def set_minorVersion(value: Double): Double = js.native
  def set_packageGuid(value: Guid): Guid = js.native
  def set_packageName(value: String): String = js.native
}

