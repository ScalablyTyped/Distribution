package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation extends ClientObject {
  
  def getNodeById(id: Double): NavigationNode = js.native
  
  def get_quickLaunch(): NavigationNodeCollection = js.native
  
  def get_topNavigationBar(): NavigationNodeCollection = js.native
  
  def get_useShared(): Boolean = js.native
  
  def set_useShared(value: Boolean): Unit = js.native
}
