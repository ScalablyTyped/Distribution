package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfficeVersion extends js.Object {
  var assemblyVersion: String
  var majorBuildVersion: Double
  var majorVersion: String
  var majorVersionDotZero: String
  var previousMajorBuildVersion: Double
  var previousVersion: String
  var previousVersionDotZero: String
  var wssMajorVersion: String
}

object OfficeVersion {
  @scala.inline
  def apply(
    assemblyVersion: String,
    majorBuildVersion: Double,
    majorVersion: String,
    majorVersionDotZero: String,
    previousMajorBuildVersion: Double,
    previousVersion: String,
    previousVersionDotZero: String,
    wssMajorVersion: String
  ): OfficeVersion = {
    val __obj = js.Dynamic.literal(assemblyVersion = assemblyVersion.asInstanceOf[js.Any], majorBuildVersion = majorBuildVersion.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], majorVersionDotZero = majorVersionDotZero.asInstanceOf[js.Any], previousMajorBuildVersion = previousMajorBuildVersion.asInstanceOf[js.Any], previousVersion = previousVersion.asInstanceOf[js.Any], previousVersionDotZero = previousVersionDotZero.asInstanceOf[js.Any], wssMajorVersion = wssMajorVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeVersion]
  }
}

