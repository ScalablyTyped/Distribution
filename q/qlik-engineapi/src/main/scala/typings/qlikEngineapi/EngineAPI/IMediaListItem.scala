package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MediaListItem...
  */
trait IMediaListItem extends StObject {
  
  /**
    * Relative path to the media file.
    * Media files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrl: String
  
  /**
    * Relative path to the media file.
    * The URL is static.
    * Media files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrlDef: String
}
object IMediaListItem {
  
  inline def apply(qUrl: String, qUrlDef: String): IMediaListItem = {
    val __obj = js.Dynamic.literal(qUrl = qUrl.asInstanceOf[js.Any], qUrlDef = qUrlDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMediaListItem] (val x: Self) extends AnyVal {
    
    inline def setQUrl(value: String): Self = StObject.set(x, "qUrl", value.asInstanceOf[js.Any])
    
    inline def setQUrlDef(value: String): Self = StObject.set(x, "qUrlDef", value.asInstanceOf[js.Any])
  }
}
