package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the media files. Is the layout for MediaListDef.
  *
  * Note: This struct is deprecated.
  */
trait IMediaList extends js.Object {
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
  @scala.inline
  def apply(qItems: js.Array[IMediaListItem]): IMediaList = {
    val __obj = js.Dynamic.literal(qItems = qItems)
  
    __obj.asInstanceOf[IMediaList]
  }
}

