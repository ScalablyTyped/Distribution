package typings.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.AjaxNavigate
import typings.std.Event
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object Nav {
  
  @JSGlobal("Nav")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Nav.ajaxNavigate")
  @js.native
  val ajaxNavigate: AjaxNavigate = js.native
  
  inline def convertRegularURLtoMDSURL(webUrl: String, fullPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertRegularURLtoMDSURL")(webUrl.asInstanceOf[js.Any], fullPath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAjaxLocationWindow(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAjaxLocationWindow")().asInstanceOf[String]
  
  inline def getGoToLinkUrl(el: HTMLAnchorElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoToLinkUrl")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSource(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSource")().asInstanceOf[String]
  inline def getSource(defaultSource: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSource")(defaultSource.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getUrlKeyValue(keyName: String, bNoDecode: Boolean, url: String, bCaseInsensitive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrlKeyValue")(keyName.asInstanceOf[js.Any], bNoDecode.asInstanceOf[js.Any], url.asInstanceOf[js.Any], bCaseInsensitive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWindowLocationNoHash(hre: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowLocationNoHash")(hre.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def goToDiscussion(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goToDiscussion")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goToHistoryLink(el: HTMLAnchorElement, strVersion: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goToHistoryLink")(el.asInstanceOf[js.Any], strVersion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def goToLink(el: HTMLAnchorElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goToLink")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goToLinkOrDialogNewWindow(el: HTMLAnchorElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goToLinkOrDialogNewWindow")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isMDSUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMDSUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPageUrlValid(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPageUrlValid")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPortalTemplatePage(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPortalTemplatePage")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def navigate(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onClickHook(evt: Event, topElm: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onClickHook")(evt.asInstanceOf[js.Any], topElm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pageUrlValidation(url: String, alertString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageUrlValidation")(url.asInstanceOf[js.Any], alertString.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseHash(hash: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHash")(hash.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def removeMDSQueryParametersFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMDSQueryParametersFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlFromHashBag(hashObject: StringDictionary[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlFromHashBag")(hashObject.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wantsNewTab(evt: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("wantsNewTab")(evt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
