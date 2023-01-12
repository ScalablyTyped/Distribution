package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowStateInstanceProps[D /* <: js.Object */] extends StObject {
  
  def setCellState(rowPath: js.Array[String], columnId: IdType[D], updater: UseRowUpdater[Any]): Unit
  
  def setRowState(rowPath: js.Array[String], updater: UseRowUpdater[Any]): Unit
}
object UseRowStateInstanceProps {
  
  inline def apply[D /* <: js.Object */](
    setCellState: (js.Array[String], IdType[D], UseRowUpdater[Any]) => Unit,
    setRowState: (js.Array[String], UseRowUpdater[Any]) => Unit
  ): UseRowStateInstanceProps[D] = {
    val __obj = js.Dynamic.literal(setCellState = js.Any.fromFunction3(setCellState), setRowState = js.Any.fromFunction2(setRowState))
    __obj.asInstanceOf[UseRowStateInstanceProps[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseRowStateInstanceProps[?], D /* <: js.Object */] (val x: Self & UseRowStateInstanceProps[D]) extends AnyVal {
    
    inline def setSetCellState(value: (js.Array[String], IdType[D], UseRowUpdater[Any]) => Unit): Self = StObject.set(x, "setCellState", js.Any.fromFunction3(value))
    
    inline def setSetRowState(value: (js.Array[String], UseRowUpdater[Any]) => Unit): Self = StObject.set(x, "setRowState", js.Any.fromFunction2(value))
  }
}
