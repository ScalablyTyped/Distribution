package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait UseTableHooks[D /* <: js.Object */] extends js.Object {
  var columns: js.Array[
    js.Function2[
      /* columns */ js.Array[Column[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ]
  var columnsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ]
  var flatColumns: js.Array[
    js.Function2[
      /* flatColumns */ js.Array[Column[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ]
  var flatColumnsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ]
  var getCellProps: js.Array[CellPropGetter[D]]
  var getFooterGroupProps: js.Array[FooterGroupPropGetter[D]]
  var getFooterProps: js.Array[FooterPropGetter[D]]
  var getHeaderGroupProps: js.Array[HeaderGroupPropGetter[D]]
  var getHeaderProps: js.Array[HeaderPropGetter[D]]
  var getRowProps: js.Array[RowPropGetter[D]]
  var getTableBodyProps: js.Array[TableBodyPropGetter[D]]
  var getTableProps: js.Array[TablePropGetter[D]]
  var headerGroupDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ]
  var headerGroups: js.Array[
    js.Function2[
      /* flatColumns */ js.Array[HeaderGroup[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[HeaderGroup[D]]
    ]
  ]
  var prepareRow: js.Array[
    js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
  ]
  var stateReducers: js.Array[
    js.Function4[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ js.UndefOr[TableState[D]], 
      /* instance */ js.UndefOr[TableInstance[D]], 
      js.UndefOr[ReducerTableState[D]]
    ]
  ]
  var useControlledState: js.Array[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ]
  var useFinalInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]
  var useInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]
  var useInstanceBeforeDimensions: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]
  var useOptions: js.Array[
    js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
  ]
  var useRows: js.Array[
    js.Function2[
      /* rows */ js.Array[Row[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Row[D]]
    ]
  ]
}

object UseTableHooks {
  @scala.inline
  def apply[D /* <: js.Object */](
    columns: js.Array[
      js.Function2[
        /* columns */ js.Array[Column[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    columnsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ],
    flatColumns: js.Array[
      js.Function2[
        /* flatColumns */ js.Array[Column[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    flatColumnsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ],
    getCellProps: js.Array[CellPropGetter[D]],
    getFooterGroupProps: js.Array[FooterGroupPropGetter[D]],
    getFooterProps: js.Array[FooterPropGetter[D]],
    getHeaderGroupProps: js.Array[HeaderGroupPropGetter[D]],
    getHeaderProps: js.Array[HeaderPropGetter[D]],
    getRowProps: js.Array[RowPropGetter[D]],
    getTableBodyProps: js.Array[TableBodyPropGetter[D]],
    getTableProps: js.Array[TablePropGetter[D]],
    headerGroupDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ],
    headerGroups: js.Array[
      js.Function2[
        /* flatColumns */ js.Array[HeaderGroup[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[HeaderGroup[D]]
      ]
    ],
    prepareRow: js.Array[
      js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
    ],
    stateReducers: js.Array[
      js.Function4[
        /* newState */ TableState[D], 
        /* action */ ActionType, 
        /* previousState */ js.UndefOr[TableState[D]], 
        /* instance */ js.UndefOr[TableInstance[D]], 
        js.UndefOr[ReducerTableState[D]]
      ]
    ],
    useControlledState: js.Array[
      js.Function2[
        /* state */ TableState[D], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        TableState[D]
      ]
    ],
    useFinalInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useInstanceBeforeDimensions: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]],
    useOptions: js.Array[
      js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
    ],
    useRows: js.Array[
      js.Function2[
        /* rows */ js.Array[Row[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Row[D]]
      ]
    ]
  ): UseTableHooks[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], columnsDeps = columnsDeps.asInstanceOf[js.Any], flatColumns = flatColumns.asInstanceOf[js.Any], flatColumnsDeps = flatColumnsDeps.asInstanceOf[js.Any], getCellProps = getCellProps.asInstanceOf[js.Any], getFooterGroupProps = getFooterGroupProps.asInstanceOf[js.Any], getFooterProps = getFooterProps.asInstanceOf[js.Any], getHeaderGroupProps = getHeaderGroupProps.asInstanceOf[js.Any], getHeaderProps = getHeaderProps.asInstanceOf[js.Any], getRowProps = getRowProps.asInstanceOf[js.Any], getTableBodyProps = getTableBodyProps.asInstanceOf[js.Any], getTableProps = getTableProps.asInstanceOf[js.Any], headerGroupDeps = headerGroupDeps.asInstanceOf[js.Any], headerGroups = headerGroups.asInstanceOf[js.Any], prepareRow = prepareRow.asInstanceOf[js.Any], stateReducers = stateReducers.asInstanceOf[js.Any], useControlledState = useControlledState.asInstanceOf[js.Any], useFinalInstance = useFinalInstance.asInstanceOf[js.Any], useInstance = useInstance.asInstanceOf[js.Any], useInstanceBeforeDimensions = useInstanceBeforeDimensions.asInstanceOf[js.Any], useOptions = useOptions.asInstanceOf[js.Any], useRows = useRows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseTableHooks[D]]
  }
}

