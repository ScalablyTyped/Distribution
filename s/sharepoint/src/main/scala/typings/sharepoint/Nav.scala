package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("Nav")
@js.native
object Nav extends js.Object {
  val ajaxNavigate: AjaxNavigate_ = js.native
  def convertRegularURLtoMDSURL(webUrl: String, fullPath: String): String = js.native
  def getAjaxLocationWindow(): String = js.native
  def getGoToLinkUrl(el: HTMLAnchorElement): String = js.native
  def getSource(): String = js.native
  def getSource(defaultSource: String): String = js.native
  def getUrlKeyValue(keyName: String, bNoDecode: Boolean, url: String, bCaseInsensitive: Boolean): String = js.native
  def getWindowLocationNoHash(hre: String): String = js.native
  def goToDiscussion(url: String): Unit = js.native
  def goToHistoryLink(el: HTMLAnchorElement, strVersion: String): Unit = js.native
  def goToLink(el: HTMLAnchorElement): Unit = js.native
  def goToLinkOrDialogNewWindow(el: HTMLAnchorElement): Unit = js.native
  def isMDSUrl(url: String): Boolean = js.native
  def isPageUrlValid(url: String): Boolean = js.native
  def isPortalTemplatePage(url: String): Boolean = js.native
  def navigate(url: String): Unit = js.native
  def onClickHook(evt: Event_, topElm: HTMLElement): Unit = js.native
  def pageUrlValidation(url: String, alertString: String): String = js.native
  def parseHash(hash: String): StringDictionary[String] = js.native
  def removeMDSQueryParametersFromUrl(url: String): String = js.native
  def urlFromHashBag(hashObject: StringDictionary[String]): String = js.native
  def wantsNewTab(evt: Event_): Boolean = js.native
}

