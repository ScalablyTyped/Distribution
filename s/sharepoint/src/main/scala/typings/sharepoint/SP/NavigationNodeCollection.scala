package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationNodeCollection
  extends StObject
     with ClientObjectCollection[NavigationNode] {
  
  def add(parameters: NavigationNodeCreationInformation): NavigationNode = js.native
  
  def get_item(index: Double): NavigationNode = js.native
  
  def itemAt(index: Double): NavigationNode = js.native
}
