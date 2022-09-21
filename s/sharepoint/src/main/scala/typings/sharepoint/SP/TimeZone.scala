package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZone
  extends StObject
     with ClientObject {
  
  def get_description(): String = js.native
  
  def get_id(): Double = js.native
  
  def get_information(): TimeZoneInformation = js.native
  
  def localTimeToUTC(date: js.Date): DateTimeResult = js.native
  
  def utcToLocalTime(date: js.Date): DateTimeResult = js.native
}
