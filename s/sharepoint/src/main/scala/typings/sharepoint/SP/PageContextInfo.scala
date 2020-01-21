package typings.sharepoint.SP

import typings.sharepoint.AnonHigh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageContextInfo")
@js.native
class PageContextInfo () extends js.Object

/* static members */
@JSGlobal("SP.PageContextInfo")
@js.native
object PageContextInfo extends js.Object {
  def get_clientServerTimeDelta(): Double = js.native
  def get_currentCultureName(): String = js.native
  def get_currentLanguage(): Double = js.native
  def get_currentUICultureName(): String = js.native
  def get_isAppWeb(): Boolean = js.native
  def get_pageItemId(): Double = js.native
  def get_pageListId(): String = js.native
  def get_pagePersonalizationScope(): String = js.native
  def get_serverRequestPath(): String = js.native
  def get_siteAbsoluteUrl(): String = js.native
  def get_siteServerRelativeUrl(): String = js.native
  def get_tenantAppVersion(): String = js.native
  def get_userLoginName(): String = js.native
  def get_webAbsoluteUrl(): String = js.native
  def get_webLanguage(): Double = js.native
  def get_webLogoUrl(): String = js.native
  def get_webPermMasks(): AnonHigh = js.native
  def get_webServerRelativeUrl(): String = js.native
  def get_webTemplate(): String = js.native
  def get_webTitle(): String = js.native
}

