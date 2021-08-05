package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HP extends StObject {
  
  def Close(): Unit
  
  var CommonActions: String
  
  var CommonBody: String
  
  var CommonHeader: String
  
  def Follow(): Unit
  
  def GetAuthorsHtml(): String
  
  def GetBodySectionContent(): String
  
  def GetBodySectionHeading(): String
  
  def GetEmailLink(title: String, path: String, client: String, url: String): String
  
  def GetFriendlyNameForFileType(fileType: js.Any): String
  
  def GetNowDateTimeDifference(): String
  
  def GetPeopleFollowingControl(): String
  
  def Hide(): Unit
  
  def Init(): Unit
  
  def InitPostLoad(): Unit
  
  def IsNumeric(): Boolean
  
  def Resize(): Unit
  
  def SetPreviewOnHideCallback(): Unit
  
  def SetWidth(width: Double): Unit
  
  def Show(): Unit
  
  def ViewDuplicates(): Boolean
  
  def getDateString(): String
  
  def getStringFromDate(): String
  
  var ids: HPIds
  
  def loadSiteViewer(id: String, idinner: String, idviewer: String, path: String, idglass: String): Unit
  
  def loadViewer(
    id: String,
    idinner: String,
    idviewer: String,
    idpreview: String,
    embedUrl: String,
    previewUrl: String
  ): Unit
  
  var postActionEventName: String
}
object HP {
  
  inline def apply(
    Close: () => Unit,
    CommonActions: String,
    CommonBody: String,
    CommonHeader: String,
    Follow: () => Unit,
    GetAuthorsHtml: () => String,
    GetBodySectionContent: () => String,
    GetBodySectionHeading: () => String,
    GetEmailLink: (String, String, String, String) => String,
    GetFriendlyNameForFileType: js.Any => String,
    GetNowDateTimeDifference: () => String,
    GetPeopleFollowingControl: () => String,
    Hide: () => Unit,
    Init: () => Unit,
    InitPostLoad: () => Unit,
    IsNumeric: () => Boolean,
    Resize: () => Unit,
    SetPreviewOnHideCallback: () => Unit,
    SetWidth: Double => Unit,
    Show: () => Unit,
    ViewDuplicates: () => Boolean,
    getDateString: () => String,
    getStringFromDate: () => String,
    ids: HPIds,
    loadSiteViewer: (String, String, String, String, String) => Unit,
    loadViewer: (String, String, String, String, String, String) => Unit,
    postActionEventName: String
  ): HP = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), CommonActions = CommonActions.asInstanceOf[js.Any], CommonBody = CommonBody.asInstanceOf[js.Any], CommonHeader = CommonHeader.asInstanceOf[js.Any], Follow = js.Any.fromFunction0(Follow), GetAuthorsHtml = js.Any.fromFunction0(GetAuthorsHtml), GetBodySectionContent = js.Any.fromFunction0(GetBodySectionContent), GetBodySectionHeading = js.Any.fromFunction0(GetBodySectionHeading), GetEmailLink = js.Any.fromFunction4(GetEmailLink), GetFriendlyNameForFileType = js.Any.fromFunction1(GetFriendlyNameForFileType), GetNowDateTimeDifference = js.Any.fromFunction0(GetNowDateTimeDifference), GetPeopleFollowingControl = js.Any.fromFunction0(GetPeopleFollowingControl), Hide = js.Any.fromFunction0(Hide), Init = js.Any.fromFunction0(Init), InitPostLoad = js.Any.fromFunction0(InitPostLoad), IsNumeric = js.Any.fromFunction0(IsNumeric), Resize = js.Any.fromFunction0(Resize), SetPreviewOnHideCallback = js.Any.fromFunction0(SetPreviewOnHideCallback), SetWidth = js.Any.fromFunction1(SetWidth), Show = js.Any.fromFunction0(Show), ViewDuplicates = js.Any.fromFunction0(ViewDuplicates), getDateString = js.Any.fromFunction0(getDateString), getStringFromDate = js.Any.fromFunction0(getStringFromDate), ids = ids.asInstanceOf[js.Any], loadSiteViewer = js.Any.fromFunction5(loadSiteViewer), loadViewer = js.Any.fromFunction6(loadViewer), postActionEventName = postActionEventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HP]
  }
  
  extension [Self <: HP](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    inline def setCommonActions(value: String): Self = StObject.set(x, "CommonActions", value.asInstanceOf[js.Any])
    
    inline def setCommonBody(value: String): Self = StObject.set(x, "CommonBody", value.asInstanceOf[js.Any])
    
    inline def setCommonHeader(value: String): Self = StObject.set(x, "CommonHeader", value.asInstanceOf[js.Any])
    
    inline def setFollow(value: () => Unit): Self = StObject.set(x, "Follow", js.Any.fromFunction0(value))
    
    inline def setGetAuthorsHtml(value: () => String): Self = StObject.set(x, "GetAuthorsHtml", js.Any.fromFunction0(value))
    
    inline def setGetBodySectionContent(value: () => String): Self = StObject.set(x, "GetBodySectionContent", js.Any.fromFunction0(value))
    
    inline def setGetBodySectionHeading(value: () => String): Self = StObject.set(x, "GetBodySectionHeading", js.Any.fromFunction0(value))
    
    inline def setGetDateString(value: () => String): Self = StObject.set(x, "getDateString", js.Any.fromFunction0(value))
    
    inline def setGetEmailLink(value: (String, String, String, String) => String): Self = StObject.set(x, "GetEmailLink", js.Any.fromFunction4(value))
    
    inline def setGetFriendlyNameForFileType(value: js.Any => String): Self = StObject.set(x, "GetFriendlyNameForFileType", js.Any.fromFunction1(value))
    
    inline def setGetNowDateTimeDifference(value: () => String): Self = StObject.set(x, "GetNowDateTimeDifference", js.Any.fromFunction0(value))
    
    inline def setGetPeopleFollowingControl(value: () => String): Self = StObject.set(x, "GetPeopleFollowingControl", js.Any.fromFunction0(value))
    
    inline def setGetStringFromDate(value: () => String): Self = StObject.set(x, "getStringFromDate", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "Hide", js.Any.fromFunction0(value))
    
    inline def setIds(value: HPIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "Init", js.Any.fromFunction0(value))
    
    inline def setInitPostLoad(value: () => Unit): Self = StObject.set(x, "InitPostLoad", js.Any.fromFunction0(value))
    
    inline def setIsNumeric(value: () => Boolean): Self = StObject.set(x, "IsNumeric", js.Any.fromFunction0(value))
    
    inline def setLoadSiteViewer(value: (String, String, String, String, String) => Unit): Self = StObject.set(x, "loadSiteViewer", js.Any.fromFunction5(value))
    
    inline def setLoadViewer(value: (String, String, String, String, String, String) => Unit): Self = StObject.set(x, "loadViewer", js.Any.fromFunction6(value))
    
    inline def setPostActionEventName(value: String): Self = StObject.set(x, "postActionEventName", value.asInstanceOf[js.Any])
    
    inline def setResize(value: () => Unit): Self = StObject.set(x, "Resize", js.Any.fromFunction0(value))
    
    inline def setSetPreviewOnHideCallback(value: () => Unit): Self = StObject.set(x, "SetPreviewOnHideCallback", js.Any.fromFunction0(value))
    
    inline def setSetWidth(value: Double => Unit): Self = StObject.set(x, "SetWidth", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
    
    inline def setViewDuplicates(value: () => Boolean): Self = StObject.set(x, "ViewDuplicates", js.Any.fromFunction0(value))
  }
}
