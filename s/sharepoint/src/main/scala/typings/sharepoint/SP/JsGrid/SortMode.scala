package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortMode extends StObject
@JSGlobal("SP.JsGrid.SortMode")
@js.native
object SortMode extends StObject {
  
  @js.native
  sealed trait Ascending extends SortMode
  
  // 1,
  @js.native
  sealed trait Descending extends SortMode
  
  // -1,
  @js.native
  sealed trait None extends SortMode
}
