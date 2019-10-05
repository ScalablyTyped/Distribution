package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientResult
import typings.sharepoint.SP.Site
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.DesignPackage")
@js.native
class DesignPackage () extends js.Object

/* static members */
@JSGlobal("SP.Publishing.DesignPackage")
@js.native
object DesignPackage extends js.Object {
  @JSName("apply")
  def apply(context: ClientContext, site: Site, info: DesignPackageInfo): Unit = js.native
  def exportEnterprise(context: ClientContext, site: Site, includeSearchConfiguration: Boolean): ClientResult[DesignPackageInfo] = js.native
  def exportSmallBusiness(context: ClientContext, site: Site, packageName: String, includeSearchConfiguration: Boolean): ClientResult[DesignPackageInfo] = js.native
  def install(context: ClientContext, site: Site, info: DesignPackageInfo, path: String): Unit = js.native
  def uninstall(context: ClientContext, site: Site, info: DesignPackageInfo): Unit = js.native
}

