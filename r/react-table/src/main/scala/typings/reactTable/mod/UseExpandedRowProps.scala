package typings.reactTable.mod

import typings.reactTable.anon.PartialTableExpandedToggl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseExpandedRowProps[D /* <: js.Object */] extends StObject {
  
  var canExpand: Boolean = js.native
  
  var depth: Double = js.native
  
  def getToggleRowExpandedProps(): TableExpandedToggleProps = js.native
  def getToggleRowExpandedProps(props: PartialTableExpandedToggl): TableExpandedToggleProps = js.native
  
  var isExpanded: Boolean = js.native
  
  var subRows: js.Array[Row[D]] = js.native
  
  def toggleRowExpanded(): Unit = js.native
  def toggleRowExpanded(value: Boolean): Unit = js.native
}
