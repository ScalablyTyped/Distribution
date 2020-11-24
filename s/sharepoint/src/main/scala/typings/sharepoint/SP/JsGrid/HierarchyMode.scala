package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HierarchyMode extends js.Object
@JSGlobal("SP.JsGrid.HierarchyMode")
@js.native
object HierarchyMode extends js.Object {
  
  @js.native
  sealed trait Grouping extends HierarchyMode
  
   // 0,
  @js.native
  sealed trait None extends HierarchyMode
  
   // 1,
  @js.native
  sealed trait Standard extends HierarchyMode
}
