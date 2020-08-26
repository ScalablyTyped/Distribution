package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait UseTableHooks[D /* <: js.Object */] extends js.Object {
  var allColumns: js.Array[
    js.Function2[
      /* allColumns */ js.Array[ColumnInstance[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ] = js.native
  var allColumnsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ] = js.native
  var columns: js.Array[
    js.Function2[
      /* columns */ js.Array[Column[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ] = js.native
  var columnsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ] = js.native
  var getCellProps: js.Array[CellPropGetter[D]] = js.native
  var getFooterGroupProps: js.Array[FooterGroupPropGetter[D]] = js.native
  var getFooterProps: js.Array[FooterPropGetter[D]] = js.native
  var getHeaderGroupProps: js.Array[HeaderGroupPropGetter[D]] = js.native
  var getHeaderProps: js.Array[HeaderPropGetter[D]] = js.native
  var getRowProps: js.Array[RowPropGetter[D]] = js.native
  var getTableBodyProps: js.Array[TableBodyPropGetter[D]] = js.native
  var getTableProps: js.Array[TablePropGetter[D]] = js.native
  var headerGroups: js.Array[
    js.Function2[
      /* allColumns */ js.Array[HeaderGroup[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[HeaderGroup[D]]
    ]
  ] = js.native
  var headerGroupsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ] = js.native
  var prepareRow: js.Array[
    js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
  ] = js.native
  var stateReducers: js.Array[
    js.Function4[
      /* newState */ TableState[D], 
      /* action */ ActionType, 
      /* previousState */ js.UndefOr[TableState[D]], 
      /* instance */ js.UndefOr[TableInstance[D]], 
      js.UndefOr[ReducerTableState[D]]
    ]
  ] = js.native
  var useControlledState: js.Array[
    js.Function2[
      /* state */ TableState[D], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      TableState[D]
    ]
  ] = js.native
  var useFinalInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]] = js.native
  var useInstance: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]] = js.native
  var useInstanceBeforeDimensions: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]] = js.native
  var useOptions: js.Array[
    js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
  ] = js.native
  var visibleColumns: js.Array[
    js.Function2[
      /* allColumns */ js.Array[ColumnInstance[D]], 
      /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
      js.Array[Column[D]]
    ]
  ] = js.native
  var visibleColumnsDeps: js.Array[
    js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
  ] = js.native
}

object UseTableHooks {
  @scala.inline
  def apply[/* <: js.Object */ D](
    allColumns: js.Array[
      js.Function2[
        /* allColumns */ js.Array[ColumnInstance[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    allColumnsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ],
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
    getCellProps: js.Array[CellPropGetter[D]],
    getFooterGroupProps: js.Array[FooterGroupPropGetter[D]],
    getFooterProps: js.Array[FooterPropGetter[D]],
    getHeaderGroupProps: js.Array[HeaderGroupPropGetter[D]],
    getHeaderProps: js.Array[HeaderPropGetter[D]],
    getRowProps: js.Array[RowPropGetter[D]],
    getTableBodyProps: js.Array[TableBodyPropGetter[D]],
    getTableProps: js.Array[TablePropGetter[D]],
    headerGroups: js.Array[
      js.Function2[
        /* allColumns */ js.Array[HeaderGroup[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[HeaderGroup[D]]
      ]
    ],
    headerGroupsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
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
    visibleColumns: js.Array[
      js.Function2[
        /* allColumns */ js.Array[ColumnInstance[D]], 
        /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
        js.Array[Column[D]]
      ]
    ],
    visibleColumnsDeps: js.Array[
      js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
    ]
  ): UseTableHooks[D] = {
    val __obj = js.Dynamic.literal(allColumns = allColumns.asInstanceOf[js.Any], allColumnsDeps = allColumnsDeps.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsDeps = columnsDeps.asInstanceOf[js.Any], getCellProps = getCellProps.asInstanceOf[js.Any], getFooterGroupProps = getFooterGroupProps.asInstanceOf[js.Any], getFooterProps = getFooterProps.asInstanceOf[js.Any], getHeaderGroupProps = getHeaderGroupProps.asInstanceOf[js.Any], getHeaderProps = getHeaderProps.asInstanceOf[js.Any], getRowProps = getRowProps.asInstanceOf[js.Any], getTableBodyProps = getTableBodyProps.asInstanceOf[js.Any], getTableProps = getTableProps.asInstanceOf[js.Any], headerGroups = headerGroups.asInstanceOf[js.Any], headerGroupsDeps = headerGroupsDeps.asInstanceOf[js.Any], prepareRow = prepareRow.asInstanceOf[js.Any], stateReducers = stateReducers.asInstanceOf[js.Any], useControlledState = useControlledState.asInstanceOf[js.Any], useFinalInstance = useFinalInstance.asInstanceOf[js.Any], useInstance = useInstance.asInstanceOf[js.Any], useInstanceBeforeDimensions = useInstanceBeforeDimensions.asInstanceOf[js.Any], useOptions = useOptions.asInstanceOf[js.Any], visibleColumns = visibleColumns.asInstanceOf[js.Any], visibleColumnsDeps = visibleColumnsDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTableHooks[D]]
  }
  @scala.inline
  implicit class UseTableHooksOps[Self <: UseTableHooks[_], /* <: js.Object */ D] (val x: Self with UseTableHooks[D]) extends AnyVal {
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
    def setAllColumnsVarargs(
      value: (js.Function2[
          /* allColumns */ js.Array[ColumnInstance[D]], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Column[D]]
        ])*
    ): Self = this.set("allColumns", js.Array(value :_*))
    @scala.inline
    def setAllColumns(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[ColumnInstance[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self = this.set("allColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllColumnsDepsVarargs(
      value: (js.Function2[
          /* deps */ js.Array[js.Any], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[js.Any]
        ])*
    ): Self = this.set("allColumnsDeps", js.Array(value :_*))
    @scala.inline
    def setAllColumnsDeps(
      value: js.Array[
          js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
        ]
    ): Self = this.set("allColumnsDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsVarargs(
      value: (js.Function2[
          /* columns */ js.Array[Column[D]], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Column[D]]
        ])*
    ): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(
      value: js.Array[
          js.Function2[
            /* columns */ js.Array[Column[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsDepsVarargs(
      value: (js.Function2[
          /* deps */ js.Array[js.Any], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[js.Any]
        ])*
    ): Self = this.set("columnsDeps", js.Array(value :_*))
    @scala.inline
    def setColumnsDeps(
      value: js.Array[
          js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
        ]
    ): Self = this.set("columnsDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCellPropsVarargs(value: CellPropGetter[D]*): Self = this.set("getCellProps", js.Array(value :_*))
    @scala.inline
    def setGetCellProps(value: js.Array[CellPropGetter[D]]): Self = this.set("getCellProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFooterGroupPropsVarargs(value: FooterGroupPropGetter[D]*): Self = this.set("getFooterGroupProps", js.Array(value :_*))
    @scala.inline
    def setGetFooterGroupProps(value: js.Array[FooterGroupPropGetter[D]]): Self = this.set("getFooterGroupProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFooterPropsVarargs(value: FooterPropGetter[D]*): Self = this.set("getFooterProps", js.Array(value :_*))
    @scala.inline
    def setGetFooterProps(value: js.Array[FooterPropGetter[D]]): Self = this.set("getFooterProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetHeaderGroupPropsVarargs(value: HeaderGroupPropGetter[D]*): Self = this.set("getHeaderGroupProps", js.Array(value :_*))
    @scala.inline
    def setGetHeaderGroupProps(value: js.Array[HeaderGroupPropGetter[D]]): Self = this.set("getHeaderGroupProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetHeaderPropsVarargs(value: HeaderPropGetter[D]*): Self = this.set("getHeaderProps", js.Array(value :_*))
    @scala.inline
    def setGetHeaderProps(value: js.Array[HeaderPropGetter[D]]): Self = this.set("getHeaderProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRowPropsVarargs(value: RowPropGetter[D]*): Self = this.set("getRowProps", js.Array(value :_*))
    @scala.inline
    def setGetRowProps(value: js.Array[RowPropGetter[D]]): Self = this.set("getRowProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTableBodyPropsVarargs(value: TableBodyPropGetter[D]*): Self = this.set("getTableBodyProps", js.Array(value :_*))
    @scala.inline
    def setGetTableBodyProps(value: js.Array[TableBodyPropGetter[D]]): Self = this.set("getTableBodyProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTablePropsVarargs(value: TablePropGetter[D]*): Self = this.set("getTableProps", js.Array(value :_*))
    @scala.inline
    def setGetTableProps(value: js.Array[TablePropGetter[D]]): Self = this.set("getTableProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderGroupsVarargs(
      value: (js.Function2[
          /* allColumns */ js.Array[HeaderGroup[D]], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[HeaderGroup[D]]
        ])*
    ): Self = this.set("headerGroups", js.Array(value :_*))
    @scala.inline
    def setHeaderGroups(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[HeaderGroup[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[HeaderGroup[D]]
          ]
        ]
    ): Self = this.set("headerGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderGroupsDepsVarargs(
      value: (js.Function2[
          /* deps */ js.Array[js.Any], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[js.Any]
        ])*
    ): Self = this.set("headerGroupsDeps", js.Array(value :_*))
    @scala.inline
    def setHeaderGroupsDeps(
      value: js.Array[
          js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
        ]
    ): Self = this.set("headerGroupsDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrepareRowVarargs(value: (js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit])*): Self = this.set("prepareRow", js.Array(value :_*))
    @scala.inline
    def setPrepareRow(
      value: js.Array[
          js.Function2[/* row */ Row[D], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], Unit]
        ]
    ): Self = this.set("prepareRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateReducersVarargs(
      value: (js.Function4[
          /* newState */ TableState[D], 
          /* action */ ActionType, 
          /* previousState */ js.UndefOr[TableState[D]], 
          /* instance */ js.UndefOr[TableInstance[D]], 
          js.UndefOr[ReducerTableState[D]]
        ])*
    ): Self = this.set("stateReducers", js.Array(value :_*))
    @scala.inline
    def setStateReducers(
      value: js.Array[
          js.Function4[
            /* newState */ TableState[D], 
            /* action */ ActionType, 
            /* previousState */ js.UndefOr[TableState[D]], 
            /* instance */ js.UndefOr[TableInstance[D]], 
            js.UndefOr[ReducerTableState[D]]
          ]
        ]
    ): Self = this.set("stateReducers", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseControlledStateVarargs(
      value: (js.Function2[
          /* state */ TableState[D], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          TableState[D]
        ])*
    ): Self = this.set("useControlledState", js.Array(value :_*))
    @scala.inline
    def setUseControlledState(
      value: js.Array[
          js.Function2[
            /* state */ TableState[D], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            TableState[D]
          ]
        ]
    ): Self = this.set("useControlledState", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseFinalInstanceVarargs(value: (js.Function1[/* instance */ TableInstance[D], Unit])*): Self = this.set("useFinalInstance", js.Array(value :_*))
    @scala.inline
    def setUseFinalInstance(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self = this.set("useFinalInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseInstanceVarargs(value: (js.Function1[/* instance */ TableInstance[D], Unit])*): Self = this.set("useInstance", js.Array(value :_*))
    @scala.inline
    def setUseInstance(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self = this.set("useInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseInstanceBeforeDimensionsVarargs(value: (js.Function1[/* instance */ TableInstance[D], Unit])*): Self = this.set("useInstanceBeforeDimensions", js.Array(value :_*))
    @scala.inline
    def setUseInstanceBeforeDimensions(value: js.Array[js.Function1[/* instance */ TableInstance[D], Unit]]): Self = this.set("useInstanceBeforeDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseOptionsVarargs(value: (js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]])*): Self = this.set("useOptions", js.Array(value :_*))
    @scala.inline
    def setUseOptions(
      value: js.Array[
          js.Function2[/* options */ TableOptions[D], /* args */ TableOptions[D], TableOptions[D]]
        ]
    ): Self = this.set("useOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleColumnsVarargs(
      value: (js.Function2[
          /* allColumns */ js.Array[ColumnInstance[D]], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[Column[D]]
        ])*
    ): Self = this.set("visibleColumns", js.Array(value :_*))
    @scala.inline
    def setVisibleColumns(
      value: js.Array[
          js.Function2[
            /* allColumns */ js.Array[ColumnInstance[D]], 
            /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
            js.Array[Column[D]]
          ]
        ]
    ): Self = this.set("visibleColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleColumnsDepsVarargs(
      value: (js.Function2[
          /* deps */ js.Array[js.Any], 
          /* meta */ Meta[D, scala.Nothing, MetaBase[D]], 
          js.Array[js.Any]
        ])*
    ): Self = this.set("visibleColumnsDeps", js.Array(value :_*))
    @scala.inline
    def setVisibleColumnsDeps(
      value: js.Array[
          js.Function2[/* deps */ js.Array[_], /* meta */ Meta[D, scala.Nothing, MetaBase[D]], js.Array[_]]
        ]
    ): Self = this.set("visibleColumnsDeps", value.asInstanceOf[js.Any])
  }
  
}

