package typings.reactTable.mod

import typings.reactTable.anon.PartialTableToggleRowsSel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseRowSelectRowProps[D /* <: js.Object */] extends StObject {
  
  def getToggleRowSelectedProps(): TableToggleRowsSelectedProps = js.native
  def getToggleRowSelectedProps(props: PartialTableToggleRowsSel): TableToggleRowsSelectedProps = js.native
  
  var isSelected: Boolean = js.native
  
  var isSomeSelected: Boolean = js.native
  
  def toggleRowSelected(): Unit = js.native
  def toggleRowSelected(set: Boolean): Unit = js.native
}
