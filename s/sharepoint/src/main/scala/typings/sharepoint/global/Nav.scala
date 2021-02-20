package typings.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.AjaxNavigate
import typings.std.Event
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object Nav {
  
  @JSGlobal("Nav.ajaxNavigate")
  @js.native
  val ajaxNavigate: AjaxNavigate = js.native
  
  @JSGlobal("Nav.convertRegularURLtoMDSURL")
  @js.native
  def convertRegularURLtoMDSURL(webUrl: String, fullPath: String): String = js.native
  
  @JSGlobal("Nav.getAjaxLocationWindow")
  @js.native
  def getAjaxLocationWindow(): String = js.native
  
  @JSGlobal("Nav.getGoToLinkUrl")
  @js.native
  def getGoToLinkUrl(el: HTMLAnchorElement): String = js.native
  
  @JSGlobal("Nav.getSource")
  @js.native
  def getSource(): String = js.native
  @JSGlobal("Nav.getSource")
  @js.native
  def getSource(defaultSource: String): String = js.native
  
  @JSGlobal("Nav.getUrlKeyValue")
  @js.native
  def getUrlKeyValue(keyName: String, bNoDecode: Boolean, url: String, bCaseInsensitive: Boolean): String = js.native
  
  @JSGlobal("Nav.getWindowLocationNoHash")
  @js.native
  def getWindowLocationNoHash(hre: String): String = js.native
  
  @JSGlobal("Nav.goToDiscussion")
  @js.native
  def goToDiscussion(url: String): Unit = js.native
  
  @JSGlobal("Nav.goToHistoryLink")
  @js.native
  def goToHistoryLink(el: HTMLAnchorElement, strVersion: String): Unit = js.native
  
  @JSGlobal("Nav.goToLink")
  @js.native
  def goToLink(el: HTMLAnchorElement): Unit = js.native
  
  @JSGlobal("Nav.goToLinkOrDialogNewWindow")
  @js.native
  def goToLinkOrDialogNewWindow(el: HTMLAnchorElement): Unit = js.native
  
  @JSGlobal("Nav.isMDSUrl")
  @js.native
  def isMDSUrl(url: String): Boolean = js.native
  
  @JSGlobal("Nav.isPageUrlValid")
  @js.native
  def isPageUrlValid(url: String): Boolean = js.native
  
  @JSGlobal("Nav.isPortalTemplatePage")
  @js.native
  def isPortalTemplatePage(url: String): Boolean = js.native
  
  @JSGlobal("Nav.navigate")
  @js.native
  def navigate(url: String): Unit = js.native
  
  @JSGlobal("Nav.onClickHook")
  @js.native
  def onClickHook(evt: Event, topElm: HTMLElement): Unit = js.native
  
  @JSGlobal("Nav.pageUrlValidation")
  @js.native
  def pageUrlValidation(url: String, alertString: String): String = js.native
  
  @JSGlobal("Nav.parseHash")
  @js.native
  def parseHash(hash: String): StringDictionary[String] = js.native
  
  @JSGlobal("Nav.removeMDSQueryParametersFromUrl")
  @js.native
  def removeMDSQueryParametersFromUrl(url: String): String = js.native
  
  @JSGlobal("Nav.urlFromHashBag")
  @js.native
  def urlFromHashBag(hashObject: StringDictionary[String]): String = js.native
  
  @JSGlobal("Nav.wantsNewTab")
  @js.native
  def wantsNewTab(evt: Event): Boolean = js.native
}
