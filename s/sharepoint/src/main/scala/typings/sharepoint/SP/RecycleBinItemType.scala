package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecycleBinItemType extends js.Object

@JSGlobal("SP.RecycleBinItemType")
@js.native
object RecycleBinItemType extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecycleBinItemType with Double] = js.native
  /* 7 */ @js.native
  object attachment extends TopLevel[attachment with Double]
  
  /* 9 */ @js.native
  object cascadeParent extends TopLevel[cascadeParent with Double]
  
  /* 1 */ @js.native
  object file extends TopLevel[file with Double]
  
  /* 2 */ @js.native
  object fileVersion extends TopLevel[fileVersion with Double]
  
  /* 5 */ @js.native
  object folder extends TopLevel[folder with Double]
  
  /* 6 */ @js.native
  object folderWithLists extends TopLevel[folderWithLists with Double]
  
  /* 4 */ @js.native
  object list extends TopLevel[list with Double]
  
  /* 3 */ @js.native
  object listItem extends TopLevel[listItem with Double]
  
  /* 8 */ @js.native
  object listItemVersion extends TopLevel[listItemVersion with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 10 */ @js.native
  object web extends TopLevel[web with Double]
  
}

