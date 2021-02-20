package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecycleBinItemType extends StObject
@JSGlobal("SP.RecycleBinItemType")
@js.native
object RecycleBinItemType extends StObject {
  
  @js.native
  sealed trait attachment extends RecycleBinItemType
  
  @js.native
  sealed trait cascadeParent extends RecycleBinItemType
  
  @js.native
  sealed trait file extends RecycleBinItemType
  
  @js.native
  sealed trait fileVersion extends RecycleBinItemType
  
  @js.native
  sealed trait folder extends RecycleBinItemType
  
  @js.native
  sealed trait folderWithLists extends RecycleBinItemType
  
  @js.native
  sealed trait list extends RecycleBinItemType
  
  @js.native
  sealed trait listItem extends RecycleBinItemType
  
  @js.native
  sealed trait listItemVersion extends RecycleBinItemType
  
  @js.native
  sealed trait none extends RecycleBinItemType
  
  @js.native
  sealed trait web extends RecycleBinItemType
}
