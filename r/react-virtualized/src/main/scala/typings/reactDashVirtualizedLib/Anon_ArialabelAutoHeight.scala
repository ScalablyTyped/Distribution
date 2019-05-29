package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelAutoHeight extends js.Object {
  var `aria-label`: reactLib.reactMod.Requireable[java.lang.String]
  var autoHeight: reactLib.reactMod.Requireable[scala.Boolean]
  var children: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsTableMod.Column]
  var className: reactLib.reactMod.Requireable[java.lang.String]
  var disableHeader: reactLib.reactMod.Requireable[scala.Boolean]
  var estimatedRowSize: reactLib.reactMod.Validator[scala.Double]
  var gridClassName: reactLib.reactMod.Requireable[java.lang.String]
  var gridStyle: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties]
  var headerClassName: reactLib.reactMod.Requireable[java.lang.String]
  var headerHeight: reactLib.reactMod.Validator[scala.Double]
  var headerRowRenderer: reactLib.reactMod.Requireable[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer]
  var headerStyle: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties]
  var height: reactLib.reactMod.Validator[scala.Double]
  var id: reactLib.reactMod.Requireable[java.lang.String]
  var noRowsRenderer: reactLib.reactMod.Requireable[js.Function0[reactLib.reactMod.Global.JSXNs.Element]]
  var onHeaderClick: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.HeaderMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowClick: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowDoubleClick: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowMouseOut: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowMouseOver: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowsRendered: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange with reactDashVirtualizedLib.reactDashVirtualizedMod.OverscanIndexRange, 
      scala.Unit
    ]
  ]
  var onScroll: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollEventData, 
      scala.Unit
    ]
  ]
  var overscanRowCount: reactLib.reactMod.Validator[scala.Double]
  var rowClassName: reactLib.reactMod.Requireable[
    java.lang.String | (js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      java.lang.String
    ])
  ]
  var rowCount: reactLib.reactMod.Validator[scala.Double]
  var rowGetter: reactLib.reactMod.Validator[
    js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, _]
  ]
  var rowHeight: reactLib.reactMod.Validator[
    scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
  ]
  var rowRenderer: reactLib.reactMod.Requireable[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsTableMod.TableRowProps, 
      reactLib.reactMod.ReactNode
    ]
  ]
  var rowStyle: reactLib.reactMod.Validator[
    reactLib.reactMod.CSSProperties | (js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      reactLib.reactMod.CSSProperties
    ])
  ]
  var scrollToAlignment: reactLib.reactMod.Validator[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment]
  var scrollToIndex: reactLib.reactMod.Validator[scala.Double]
  var scrollTop: reactLib.reactMod.Requireable[scala.Double]
  var sort: reactLib.reactMod.Requireable[js.Function1[/* params */ Anon_SortBy, scala.Unit]]
  var sortBy: reactLib.reactMod.Requireable[java.lang.String]
  var sortDirection: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsTableMod.SortDirectionType]
  var style: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties]
  var tabIndex: reactLib.reactMod.Requireable[scala.Double]
  var width: reactLib.reactMod.Validator[scala.Double]
}

object Anon_ArialabelAutoHeight {
  @scala.inline
  def apply(
    `aria-label`: reactLib.reactMod.Requireable[java.lang.String],
    autoHeight: reactLib.reactMod.Requireable[scala.Boolean],
    children: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsTableMod.Column],
    className: reactLib.reactMod.Requireable[java.lang.String],
    disableHeader: reactLib.reactMod.Requireable[scala.Boolean],
    estimatedRowSize: reactLib.reactMod.Validator[scala.Double],
    gridClassName: reactLib.reactMod.Requireable[java.lang.String],
    gridStyle: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties],
    headerClassName: reactLib.reactMod.Requireable[java.lang.String],
    headerHeight: reactLib.reactMod.Validator[scala.Double],
    headerRowRenderer: reactLib.reactMod.Requireable[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer],
    headerStyle: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties],
    height: reactLib.reactMod.Validator[scala.Double],
    id: reactLib.reactMod.Requireable[java.lang.String],
    noRowsRenderer: reactLib.reactMod.Requireable[js.Function0[reactLib.reactMod.Global.JSXNs.Element]],
    onHeaderClick: reactLib.reactMod.Requireable[
      js.Function1[
        /* params */ reactDashVirtualizedLib.distEsTableMod.HeaderMouseEventHandlerParams, 
        scala.Unit
      ]
    ],
    onRowClick: reactLib.reactMod.Requireable[
      js.Function1[
        /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
        scala.Unit
      ]
    ],
    onRowDoubleClick: reactLib.reactMod.Requireable[
      js.Function1[
        /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
        scala.Unit
      ]
    ],
    onRowMouseOut: reactLib.reactMod.Requireable[
      js.Function1[
        /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
        scala.Unit
      ]
    ],
    onRowMouseOver: reactLib.reactMod.Requireable[
      js.Function1[
        /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
        scala.Unit
      ]
    ],
    onRowsRendered: reactLib.reactMod.Requireable[
      js.Function1[
        /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange with reactDashVirtualizedLib.reactDashVirtualizedMod.OverscanIndexRange, 
        scala.Unit
      ]
    ],
    onScroll: reactLib.reactMod.Requireable[
      js.Function1[
        /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollEventData, 
        scala.Unit
      ]
    ],
    overscanRowCount: reactLib.reactMod.Validator[scala.Double],
    rowClassName: reactLib.reactMod.Requireable[
      java.lang.String | (js.Function1[
        /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
        java.lang.String
      ])
    ],
    rowCount: reactLib.reactMod.Validator[scala.Double],
    rowGetter: reactLib.reactMod.Validator[
      js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, _]
    ],
    rowHeight: reactLib.reactMod.Validator[
      scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
    ],
    rowRenderer: reactLib.reactMod.Requireable[
      js.Function1[
        /* props */ reactDashVirtualizedLib.distEsTableMod.TableRowProps, 
        reactLib.reactMod.ReactNode
      ]
    ],
    rowStyle: reactLib.reactMod.Validator[
      reactLib.reactMod.CSSProperties | (js.Function1[
        /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
        reactLib.reactMod.CSSProperties
      ])
    ],
    scrollToAlignment: reactLib.reactMod.Validator[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment],
    scrollToIndex: reactLib.reactMod.Validator[scala.Double],
    scrollTop: reactLib.reactMod.Requireable[scala.Double],
    sort: reactLib.reactMod.Requireable[js.Function1[/* params */ Anon_SortBy, scala.Unit]],
    sortBy: reactLib.reactMod.Requireable[java.lang.String],
    sortDirection: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsTableMod.SortDirectionType],
    style: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties],
    tabIndex: reactLib.reactMod.Requireable[scala.Double],
    width: reactLib.reactMod.Validator[scala.Double]
  ): Anon_ArialabelAutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, children = children, className = className, disableHeader = disableHeader, estimatedRowSize = estimatedRowSize, gridClassName = gridClassName, gridStyle = gridStyle, headerClassName = headerClassName, headerHeight = headerHeight, headerRowRenderer = headerRowRenderer, headerStyle = headerStyle, height = height, id = id, noRowsRenderer = noRowsRenderer, onHeaderClick = onHeaderClick, onRowClick = onRowClick, onRowDoubleClick = onRowDoubleClick, onRowMouseOut = onRowMouseOut, onRowMouseOver = onRowMouseOver, onRowsRendered = onRowsRendered, onScroll = onScroll, overscanRowCount = overscanRowCount, rowClassName = rowClassName, rowCount = rowCount, rowGetter = rowGetter, rowHeight = rowHeight, rowRenderer = rowRenderer, rowStyle = rowStyle, scrollToAlignment = scrollToAlignment, scrollToIndex = scrollToIndex, scrollTop = scrollTop, sort = sort, sortBy = sortBy, sortDirection = sortDirection, style = style, tabIndex = tabIndex, width = width)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.asInstanceOf[Anon_ArialabelAutoHeight]
  }
}

