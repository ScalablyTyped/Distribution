package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HP extends js.Object {
  var CommonActions: String
  var CommonBody: String
  var CommonHeader: String
  var ids: HPIds
  var postActionEventName: String
  def Close(): Unit
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
  def loadSiteViewer(id: String, idinner: String, idviewer: String, path: String, idglass: String): Unit
  def loadViewer(
    id: String,
    idinner: String,
    idviewer: String,
    idpreview: String,
    embedUrl: String,
    previewUrl: String
  ): Unit
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
}

