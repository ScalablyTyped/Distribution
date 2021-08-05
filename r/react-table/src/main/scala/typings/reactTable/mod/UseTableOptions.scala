package typings.reactTable.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  columns :std.Array<react-table.react-table.Column<D>>,   data :std.Array<D>} & std.Partial<{  initialState :std.Partial<react-table.react-table.TableState<D>>, stateReducer (newState : react-table.react-table.TableState<D>, action : react-table.react-table.ActionType, previousState : react-table.react-table.TableState<D>, instance : react-table.react-table.TableInstance<D> | undefined): react-table.react-table.TableState<D>, useControlledState (state : react-table.react-table.TableState<D>, meta : react-table.react-table.Meta<D, never, react-table.react-table.MetaBase<D>>): react-table.react-table.TableState<D>,   defaultColumn :std.Partial<react-table.react-table.Column<D>>, getSubRows (originalRow : D, relativeIndex : number): std.Array<D>, getRowId (originalRow : D, relativeIndex : number, parent : react-table.react-table.Row<D> | undefined): string}> */
trait UseTableOptions[D /* <: js.Object */] extends StObject {
  
  var columns: js.Array[Column[D]]
  
  var data: js.Array[D]
  
  var defaultColumn: js.UndefOr[Partial[Column[D]]] = js.undefined
  
  var getRowId: js.UndefOr[
    js.Function3[
      /* originalRow */ D, 
      /* relativeIndex */ Double, 
      /* parent */ js.UndefOr[Row[D]], 
      String
    ]
  ] = js.undefined
  
  var getSubRows: js.UndefOr[js.Function2[/* originalRow */ D, /* relativeIndex */ Double, js.Array[D]]] = js.undefined
  
  var initialState: js.UndefOr[Partial[TableState[D]]] = js.undefined
  
  var stateReducer: js.UndefOr[
    js.Function4[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ TableState[D], 
      /* instance */ js.UndefOr[TableInstance[D]], 
      TableState[D]
    ]
  ] = js.undefined
  
  var useControlledState: js.UndefOr[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ] = js.undefined
}
object UseTableOptions {
  
  inline def apply[D /* <: js.Object */](columns: js.Array[Column[D]], data: js.Array[D]): UseTableOptions[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTableOptions[D]]
  }
  
  extension [Self <: UseTableOptions[?], D /* <: js.Object */](x: Self & UseTableOptions[D]) {
    
    inline def setColumns(value: js.Array[Column[D]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Column[D]*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDefaultColumn(value: Partial[Column[D]]): Self = StObject.set(x, "defaultColumn", value.asInstanceOf[js.Any])
    
    inline def setDefaultColumnUndefined: Self = StObject.set(x, "defaultColumn", js.undefined)
    
    inline def setGetRowId(
      value: (/* originalRow */ D, /* relativeIndex */ Double, /* parent */ js.UndefOr[Row[D]]) => String
    ): Self = StObject.set(x, "getRowId", js.Any.fromFunction3(value))
    
    inline def setGetRowIdUndefined: Self = StObject.set(x, "getRowId", js.undefined)
    
    inline def setGetSubRows(value: (/* originalRow */ D, /* relativeIndex */ Double) => js.Array[D]): Self = StObject.set(x, "getSubRows", js.Any.fromFunction2(value))
    
    inline def setGetSubRowsUndefined: Self = StObject.set(x, "getSubRows", js.undefined)
    
    inline def setInitialState(value: Partial[TableState[D]]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setStateReducer(
      value: (/* newState */ TableState[D], /* action */ ActionType, /* previousState */ TableState[D], /* instance */ js.UndefOr[TableInstance[D]]) => TableState[D]
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction4(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
    inline def setUseControlledState(
      value: (/* state */ TableState[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]]) => TableState[D]
    ): Self = StObject.set(x, "useControlledState", js.Any.fromFunction2(value))
    
    inline def setUseControlledStateUndefined: Self = StObject.set(x, "useControlledState", js.undefined)
  }
}
