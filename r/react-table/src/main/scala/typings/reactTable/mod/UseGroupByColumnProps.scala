package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGroupByColumnProps[D /* <: js.Object */] extends StObject {
  
  var canGroupBy: Boolean = js.native
  
  def getGroupByToggleProps(): TableGroupByToggleProps = js.native
  def getGroupByToggleProps(props: js.Object): TableGroupByToggleProps = js.native
  
  var groupedIndex: Double = js.native
  
  var isGrouped: Boolean = js.native
  
  def toggleGroupBy(): Unit = js.native
}
