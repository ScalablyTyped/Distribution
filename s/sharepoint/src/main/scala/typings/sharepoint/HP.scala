package typings.sharepoint

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("HP")
@js.native
object HP extends TopLevel[HP]

