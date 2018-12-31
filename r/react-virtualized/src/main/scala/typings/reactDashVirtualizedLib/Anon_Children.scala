package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var `aria-label`: reactLib.reactMod.ReactNs.Requireable[java.lang.String]
  var autoHeight: reactLib.reactMod.ReactNs.Requireable[scala.Boolean]
  var children: reactLib.reactMod.ReactNs.Validator[reactDashVirtualizedLib.distEsTableMod.Column]
  var className: reactLib.reactMod.ReactNs.Requireable[java.lang.String]
  var disableHeader: reactLib.reactMod.ReactNs.Requireable[scala.Boolean]
  var estimatedRowSize: reactLib.reactMod.ReactNs.Validator[scala.Double]
  var gridClassName: reactLib.reactMod.ReactNs.Requireable[java.lang.String]
  var gridStyle: reactLib.reactMod.ReactNs.Requireable[reactLib.reactMod.ReactNs.CSSProperties]
  var headerClassName: reactLib.reactMod.ReactNs.Requireable[java.lang.String]
  var headerHeight: reactLib.reactMod.ReactNs.Validator[scala.Double]
  var headerRowRenderer: reactLib.reactMod.ReactNs.Requireable[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer]
  var headerStyle: reactLib.reactMod.ReactNs.Requireable[reactLib.reactMod.ReactNs.CSSProperties]
  var height: reactLib.reactMod.ReactNs.Validator[scala.Double]
  var id: reactLib.reactMod.ReactNs.Requireable[java.lang.String]
  var noRowsRenderer: reactLib.reactMod.ReactNs.Requireable[js.Function0[reactLib.reactMod.Global.JSXNs.Element]]
  var onHeaderClick: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.HeaderMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowClick: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowDoubleClick: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowMouseOut: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowMouseOver: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onRowsRendered: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ]
  var onScroll: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollEventData, 
      scala.Unit
    ]
  ]
  var overscanRowCount: reactLib.reactMod.ReactNs.Validator[scala.Double]
  var rowClassName: reactLib.reactMod.ReactNs.Requireable[
    java.lang.String | (js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      java.lang.String
    ])
  ]
  var rowCount: reactLib.reactMod.ReactNs.Validator[scala.Double]
  var rowGetter: reactLib.reactMod.ReactNs.Validator[
    js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, _]
  ]
  var rowHeight: reactLib.reactMod.ReactNs.Validator[
    scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
  ]
  var rowRenderer: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsTableMod.TableRowProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ]
  var rowStyle: reactLib.reactMod.ReactNs.Validator[
    reactLib.reactMod.ReactNs.CSSProperties | (js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      reactLib.reactMod.ReactNs.CSSProperties
    ])
  ]
  var scrollToAlignment: reactLib.reactMod.ReactNs.Validator[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment]
  var scrollToIndex: reactLib.reactMod.ReactNs.Validator[scala.Double]
  var scrollTop: reactLib.reactMod.ReactNs.Requireable[scala.Double]
  var sort: reactLib.reactMod.ReactNs.Requireable[js.Function1[/* params */ Anon_SortBy, scala.Unit]]
  var sortBy: reactLib.reactMod.ReactNs.Requireable[java.lang.String]
  var sortDirection: reactLib.reactMod.ReactNs.Validator[reactDashVirtualizedLib.distEsTableMod.SortDirectionType]
  var style: reactLib.reactMod.ReactNs.Requireable[reactLib.reactMod.ReactNs.CSSProperties]
  var tabIndex: reactLib.reactMod.ReactNs.Requireable[scala.Double]
  var width: reactLib.reactMod.ReactNs.Validator[scala.Double]
}

