package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HierarchyMode extends StObject
@JSGlobal("SP.JsGrid.HierarchyMode")
@js.native
object HierarchyMode extends StObject {
  
  // 1,
  @js.native
  sealed trait Grouping extends HierarchyMode
  
  @js.native
  sealed trait None extends HierarchyMode
  
  // 0,
  @js.native
  sealed trait Standard extends HierarchyMode
}
