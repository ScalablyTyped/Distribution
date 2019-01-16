package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSNavigatorDoNotTrack extends js.Object {
  def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean
  def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean
  def removeSiteSpecificTrackingException(args: ExceptionInformation): scala.Unit
  def removeWebWideTrackingException(args: ExceptionInformation): scala.Unit
  def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): scala.Unit
  def storeWebWideTrackingException(args: StoreExceptionsInformation): scala.Unit
}

