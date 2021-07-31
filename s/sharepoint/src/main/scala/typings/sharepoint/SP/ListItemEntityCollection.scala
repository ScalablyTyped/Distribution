package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemEntityCollection[T]
  extends StObject
     with ClientObjectCollection[ListItem[T]] {
  
  def get_item(index: Double): ListItem[T] = js.native
  
  def itemAt(index: Double): ListItem[T] = js.native
}
