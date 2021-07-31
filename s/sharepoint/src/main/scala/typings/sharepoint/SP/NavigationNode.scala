package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationNode
  extends StObject
     with ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_children(): NavigationNodeCollection = js.native
  
  def get_id(): Double = js.native
  
  def get_isDocLib(): Boolean = js.native
  
  def get_isExternal(): Boolean = js.native
  
  def get_isVisible(): Boolean = js.native
  
  def get_title(): String = js.native
  
  def get_url(): String = js.native
  
  def set_isVisible(value: Boolean): Unit = js.native
  
  def set_title(value: String): Unit = js.native
  
  def set_url(value: String): Unit = js.native
  
  def update(): Unit = js.native
}
