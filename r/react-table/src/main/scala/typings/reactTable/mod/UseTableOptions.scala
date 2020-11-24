package typings.reactTable.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  columns :std.Array<react-table.react-table.Column<D>>,   data :std.Array<D>} & std.Partial<{  initialState :std.Partial<react-table.react-table.TableState<D>>, stateReducer (newState : react-table.react-table.TableState<D>, action : react-table.react-table.ActionType, previousState : react-table.react-table.TableState<D>, instance : react-table.react-table.TableInstance<D> | undefined): react-table.react-table.TableState<D>, useControlledState (state : react-table.react-table.TableState<D>, meta : react-table.react-table.Meta<D, never, react-table.react-table.MetaBase<D>>): react-table.react-table.TableState<D>,   defaultColumn :std.Partial<react-table.react-table.Column<D>>, getSubRows (originalRow : D, relativeIndex : number): std.Array<D>, getRowId (originalRow : D, relativeIndex : number, parent : react-table.react-table.Row<D> | undefined): string}> */
@js.native
trait UseTableOptions[D /* <: js.Object */] extends js.Object {
  
  var columns: js.Array[Column[D]] = js.native
  
  var data: js.Array[D] = js.native
  
  var defaultColumn: js.UndefOr[Partial[Column[D]]] = js.native
  
  var getRowId: js.UndefOr[
    js.Function3[
      /* originalRow */ D, 
      /* relativeIndex */ Double, 
      /* parent */ js.UndefOr[Row[D]], 
      String
    ]
  ] = js.native
  
  var getSubRows: js.UndefOr[js.Function2[/* originalRow */ D, /* relativeIndex */ Double, js.Array[D]]] = js.native
  
  var initialState: js.UndefOr[Partial[TableState[D]]] = js.native
  
  var stateReducer: js.UndefOr[
    js.Function4[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ TableState[D], 
      /* instance */ js.UndefOr[TableInstance[D]], 
      TableState[D]
    ]
  ] = js.native
  
  var useControlledState: js.UndefOr[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ] = js.native
}
object UseTableOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](columns: js.Array[Column[D]], data: js.Array[D]): UseTableOptions[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTableOptions[D]]
  }
  
  @scala.inline
  implicit class UseTableOptionsOps[Self <: UseTableOptions[_], D /* <: js.Object */] (val x: Self with UseTableOptions[D]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnsVarargs(value: Column[D]*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Column[D]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: D*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[D]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColumn(value: Partial[Column[D]]): Self = this.set("defaultColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColumn: Self = this.set("defaultColumn", js.undefined)
    
    @scala.inline
    def setGetRowId(
      value: (/* originalRow */ D, /* relativeIndex */ Double, /* parent */ js.UndefOr[Row[D]]) => String
    ): Self = this.set("getRowId", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetRowId: Self = this.set("getRowId", js.undefined)
    
    @scala.inline
    def setGetSubRows(value: (/* originalRow */ D, /* relativeIndex */ Double) => js.Array[D]): Self = this.set("getSubRows", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetSubRows: Self = this.set("getSubRows", js.undefined)
    
    @scala.inline
    def setInitialState(value: Partial[TableState[D]]): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* newState */ TableState[D], /* action */ ActionType, /* previousState */ TableState[D], /* instance */ js.UndefOr[TableInstance[D]]) => TableState[D]
    ): Self = this.set("stateReducer", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
    
    @scala.inline
    def setUseControlledState(
      value: (/* state */ TableState[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]]) => TableState[D]
    ): Self = this.set("useControlledState", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUseControlledState: Self = this.set("useControlledState", js.undefined)
  }
}
