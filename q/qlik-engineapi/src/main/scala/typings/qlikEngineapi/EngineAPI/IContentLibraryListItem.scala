package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContentLibraryListItem...
  */
@js.native
trait IContentLibraryListItem extends StObject {
  
  /**
    * Is set to true if the library is specific to the app (not a global content library).
    */
  var qAppSpecific: Boolean = js.native
  
  /**
    * Information about publishing and permissions.
    */
  var qMeta: INxMeta = js.native
  
  /**
    * Name of the library.
    */
  var qName: String = js.native
}
object IContentLibraryListItem {
  
  @scala.inline
  def apply(qAppSpecific: Boolean, qMeta: INxMeta, qName: String): IContentLibraryListItem = {
    val __obj = js.Dynamic.literal(qAppSpecific = qAppSpecific.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentLibraryListItem]
  }
  
  @scala.inline
  implicit class IContentLibraryListItemMutableBuilder[Self <: IContentLibraryListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAppSpecific(value: Boolean): Self = StObject.set(x, "qAppSpecific", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
