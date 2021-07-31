package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecycleBinItemType extends StObject
@JSGlobal("SP.RecycleBinItemType")
@js.native
object RecycleBinItemType extends StObject {
  
  @js.native
  sealed trait attachment
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait cascadeParent
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait file
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait fileVersion
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait folder
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait folderWithLists
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait list
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait listItem
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait listItemVersion
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait none
    extends StObject
       with RecycleBinItemType
  
  @js.native
  sealed trait web
    extends StObject
       with RecycleBinItemType
}
