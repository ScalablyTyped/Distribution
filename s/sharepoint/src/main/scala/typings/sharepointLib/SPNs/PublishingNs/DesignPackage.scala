package typings
package sharepointLib.SPNs.PublishingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.DesignPackage")
@js.native
class DesignPackage () extends js.Object

@JSGlobal("SP.Publishing.DesignPackage")
@js.native
object DesignPackage extends js.Object {
  @JSName("apply")
  def apply(
    context: sharepointLib.SPNs.ClientContext,
    site: sharepointLib.SPNs.Site,
    info: sharepointLib.SPNs.PublishingNs.DesignPackageInfo
  ): scala.Unit = js.native
  def exportEnterprise(
    context: sharepointLib.SPNs.ClientContext,
    site: sharepointLib.SPNs.Site,
    includeSearchConfiguration: scala.Boolean
  ): sharepointLib.SPNs.ClientResult[sharepointLib.SPNs.PublishingNs.DesignPackageInfo] = js.native
  def exportSmallBusiness(
    context: sharepointLib.SPNs.ClientContext,
    site: sharepointLib.SPNs.Site,
    packageName: java.lang.String,
    includeSearchConfiguration: scala.Boolean
  ): sharepointLib.SPNs.ClientResult[sharepointLib.SPNs.PublishingNs.DesignPackageInfo] = js.native
  def install(
    context: sharepointLib.SPNs.ClientContext,
    site: sharepointLib.SPNs.Site,
    info: sharepointLib.SPNs.PublishingNs.DesignPackageInfo,
    path: java.lang.String
  ): scala.Unit = js.native
  def uninstall(
    context: sharepointLib.SPNs.ClientContext,
    site: sharepointLib.SPNs.Site,
    info: sharepointLib.SPNs.PublishingNs.DesignPackageInfo
  ): scala.Unit = js.native
}

