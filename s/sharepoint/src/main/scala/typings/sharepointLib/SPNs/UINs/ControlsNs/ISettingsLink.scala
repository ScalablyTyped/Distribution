package typings
package sharepointLib.SPNs.UINs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISettingsLink extends js.Object {
  var displayName: java.lang.String
  var linkUrl: java.lang.String
}

object ISettingsLink {
  @scala.inline
  def apply(displayName: java.lang.String, linkUrl: java.lang.String): ISettingsLink = {
    val __obj = js.Dynamic.literal(displayName = displayName, linkUrl = linkUrl)
  
    __obj.asInstanceOf[ISettingsLink]
  }
}

