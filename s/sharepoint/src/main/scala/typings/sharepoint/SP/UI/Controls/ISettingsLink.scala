package typings.sharepoint.SP.UI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISettingsLink extends js.Object {
  var displayName: String
  var linkUrl: String
}

object ISettingsLink {
  @scala.inline
  def apply(displayName: String, linkUrl: String): ISettingsLink = {
    val __obj = js.Dynamic.literal(displayName = displayName, linkUrl = linkUrl)
  
    __obj.asInstanceOf[ISettingsLink]
  }
}

