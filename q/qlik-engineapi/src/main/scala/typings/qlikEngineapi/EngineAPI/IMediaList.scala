package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the media files. Is the layout for MediaListDef.
  *
  * Note: This struct is deprecated.
  */
trait IMediaList extends StObject {
  
  /**
    * Information about the list of media files.
    * In Qlik Sense Desktop, the media files are retrieved from:
    *
    * %userprofile%\Documents\Qlik\Sense\Content\Default
    * In Qlik Sense Enterprise, the media files are retrieved from:
    *
    * <installation_directory>\Qlik\Sense\Repository\Content\Default
    * The default installation directory is ProgramData.
    */
  var qItems: js.Array[IMediaListItem]
}
object IMediaList {
  
  inline def apply(qItems: js.Array[IMediaListItem]): IMediaList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaList]
  }
  
  extension [Self <: IMediaList](x: Self) {
    
    inline def setQItems(value: js.Array[IMediaListItem]): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
    
    inline def setQItemsVarargs(value: IMediaListItem*): Self = StObject.set(x, "qItems", js.Array(value*))
  }
}
