package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZoneCollection extends ClientObjectCollection[TimeZone] {
  
  def getById(id: Double): TimeZone = js.native
  
  def get_item(index: Double): TimeZone = js.native
  
  def itemAt(index: Double): TimeZone = js.native
}
