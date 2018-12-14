package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("Nav")
@js.native
object NavNs extends js.Object {
  val ajaxNavigate: sharepointLib.AjaxNavigate = js.native
  def convertRegularURLtoMDSURL(webUrl: java.lang.String, fullPath: java.lang.String): java.lang.String = js.native
  def getAjaxLocationWindow(): java.lang.String = js.native
  def getGoToLinkUrl(el: stdLib.HTMLAnchorElement): java.lang.String = js.native
  def getSource(): java.lang.String = js.native
  def getSource(defaultSource: java.lang.String): java.lang.String = js.native
  def getUrlKeyValue(
    keyName: java.lang.String,
    bNoDecode: scala.Boolean,
    url: java.lang.String,
    bCaseInsensitive: scala.Boolean
  ): java.lang.String = js.native
  def getWindowLocationNoHash(hre: java.lang.String): java.lang.String = js.native
  def goToDiscussion(url: java.lang.String): scala.Unit = js.native
  def goToHistoryLink(el: stdLib.HTMLAnchorElement, strVersion: java.lang.String): scala.Unit = js.native
  def goToLink(el: stdLib.HTMLAnchorElement): scala.Unit = js.native
  def goToLinkOrDialogNewWindow(el: stdLib.HTMLAnchorElement): scala.Unit = js.native
  def isMDSUrl(url: java.lang.String): scala.Boolean = js.native
  def isPageUrlValid(url: java.lang.String): scala.Boolean = js.native
  def isPortalTemplatePage(url: java.lang.String): scala.Boolean = js.native
  def navigate(url: java.lang.String): scala.Unit = js.native
  def onClickHook(evt: stdLib.Event, topElm: stdLib.HTMLElement): scala.Unit = js.native
  def pageUrlValidation(url: java.lang.String, alertString: java.lang.String): java.lang.String = js.native
  def parseHash(hash: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def removeMDSQueryParametersFromUrl(url: java.lang.String): java.lang.String = js.native
  def urlFromHashBag(hashObject: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def wantsNewTab(evt: stdLib.Event): scala.Boolean = js.native
}

