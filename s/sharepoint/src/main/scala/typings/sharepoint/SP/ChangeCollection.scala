package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeCollection
  extends StObject
     with ClientObjectCollection[Change] {
  
  def get_item(index: Double): Change = js.native
  
  def itemAt(index: Double): Change = js.native
}
