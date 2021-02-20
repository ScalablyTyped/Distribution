package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HP extends StObject {
  
  def Close(): Unit = js.native
  
  var CommonActions: String = js.native
  
  var CommonBody: String = js.native
  
  var CommonHeader: String = js.native
  
  def Follow(): Unit = js.native
  
  def GetAuthorsHtml(): String = js.native
  
  def GetBodySectionContent(): String = js.native
  
  def GetBodySectionHeading(): String = js.native
  
  def GetEmailLink(title: String, path: String, client: String, url: String): String = js.native
  
  def GetFriendlyNameForFileType(fileType: js.Any): String = js.native
  
  def GetNowDateTimeDifference(): String = js.native
  
  def GetPeopleFollowingControl(): String = js.native
  
  def Hide(): Unit = js.native
  
  def Init(): Unit = js.native
  
  def InitPostLoad(): Unit = js.native
  
  def IsNumeric(): Boolean = js.native
  
  def Resize(): Unit = js.native
  
  def SetPreviewOnHideCallback(): Unit = js.native
  
  def SetWidth(width: Double): Unit = js.native
  
  def Show(): Unit = js.native
  
  def ViewDuplicates(): Boolean = js.native
  
  def getDateString(): String = js.native
  
  def getStringFromDate(): String = js.native
  
  var ids: HPIds = js.native
  
  def loadSiteViewer(id: String, idinner: String, idviewer: String, path: String, idglass: String): Unit = js.native
  
  def loadViewer(
    id: String,
    idinner: String,
    idviewer: String,
    idpreview: String,
    embedUrl: String,
    previewUrl: String
  ): Unit = js.native
  
  var postActionEventName: String = js.native
}
object HP {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class HPMutableBuilder[Self <: HP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommonActions(value: String): Self = StObject.set(x, "CommonActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonBody(value: String): Self = StObject.set(x, "CommonBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonHeader(value: String): Self = StObject.set(x, "CommonHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollow(value: () => Unit): Self = StObject.set(x, "Follow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAuthorsHtml(value: () => String): Self = StObject.set(x, "GetAuthorsHtml", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBodySectionContent(value: () => String): Self = StObject.set(x, "GetBodySectionContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBodySectionHeading(value: () => String): Self = StObject.set(x, "GetBodySectionHeading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDateString(value: () => String): Self = StObject.set(x, "getDateString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEmailLink(value: (String, String, String, String) => String): Self = StObject.set(x, "GetEmailLink", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFriendlyNameForFileType(value: js.Any => String): Self = StObject.set(x, "GetFriendlyNameForFileType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNowDateTimeDifference(value: () => String): Self = StObject.set(x, "GetNowDateTimeDifference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPeopleFollowingControl(value: () => String): Self = StObject.set(x, "GetPeopleFollowingControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStringFromDate(value: () => String): Self = StObject.set(x, "getStringFromDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "Hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIds(value: HPIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "Init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitPostLoad(value: () => Unit): Self = StObject.set(x, "InitPostLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNumeric(value: () => Boolean): Self = StObject.set(x, "IsNumeric", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadSiteViewer(value: (String, String, String, String, String) => Unit): Self = StObject.set(x, "loadSiteViewer", js.Any.fromFunction5(value))
    
    @scala.inline
    def setLoadViewer(value: (String, String, String, String, String, String) => Unit): Self = StObject.set(x, "loadViewer", js.Any.fromFunction6(value))
    
    @scala.inline
    def setPostActionEventName(value: String): Self = StObject.set(x, "postActionEventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: () => Unit): Self = StObject.set(x, "Resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPreviewOnHideCallback(value: () => Unit): Self = StObject.set(x, "SetPreviewOnHideCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetWidth(value: Double => Unit): Self = StObject.set(x, "SetWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViewDuplicates(value: () => Boolean): Self = StObject.set(x, "ViewDuplicates", js.Any.fromFunction0(value))
  }
}
