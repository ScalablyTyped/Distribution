package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArialabelAutoHeight extends js.Object {
  var `aria-label`: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  var autoHeight: reactLib.reactMod.ReactNs.Requireable[scala.Boolean] = js.native
  @JSName("children")
  var children_Original: reactLib.reactMod.ReactNs.Validator[reactDashVirtualizedLib.distEsTableMod.Column] = js.native
  var className: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  var disableHeader: reactLib.reactMod.ReactNs.Requireable[scala.Boolean] = js.native
  @JSName("estimatedRowSize")
  var estimatedRowSize_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  var gridClassName: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  var gridStyle: reactLib.reactMod.ReactNs.Requireable[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  var headerClassName: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  @JSName("headerHeight")
  var headerHeight_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  var headerRowRenderer: reactLib.reactMod.ReactNs.Requireable[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer] = js.native
  var headerStyle: reactLib.reactMod.ReactNs.Requireable[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  @JSName("height")
  var height_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  var id: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  var noRowsRenderer: reactLib.reactMod.ReactNs.Requireable[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.native
  var onHeaderClick: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.HeaderMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  var onRowClick: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  var onRowDoubleClick: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  var onRowMouseOut: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  var onRowMouseOver: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  var onRowsRendered: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  var onScroll: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollEventData, 
      scala.Unit
    ]
  ] = js.native
  @JSName("overscanRowCount")
  var overscanRowCount_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  var rowClassName: reactLib.reactMod.ReactNs.Requireable[
    java.lang.String | (js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      java.lang.String
    ])
  ] = js.native
  @JSName("rowCount")
  var rowCount_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  @JSName("rowGetter")
  var rowGetter_Original: reactLib.reactMod.ReactNs.Validator[
    js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, _]
  ] = js.native
  @JSName("rowHeight")
  var rowHeight_Original: reactLib.reactMod.ReactNs.Validator[
    scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
  ] = js.native
  var rowRenderer: reactLib.reactMod.ReactNs.Requireable[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsTableMod.TableRowProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.native
  @JSName("rowStyle")
  var rowStyle_Original: reactLib.reactMod.ReactNs.Validator[
    reactLib.reactMod.ReactNs.CSSProperties | (js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      reactLib.reactMod.ReactNs.CSSProperties
    ])
  ] = js.native
  @JSName("scrollToAlignment")
  var scrollToAlignment_Original: reactLib.reactMod.ReactNs.Validator[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment] = js.native
  @JSName("scrollToIndex")
  var scrollToIndex_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  var scrollTop: reactLib.reactMod.ReactNs.Requireable[scala.Double] = js.native
  var sort: reactLib.reactMod.ReactNs.Requireable[js.Function1[/* params */ Anon_SortBy, scala.Unit]] = js.native
  var sortBy: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  @JSName("sortDirection")
  var sortDirection_Original: reactLib.reactMod.ReactNs.Validator[reactDashVirtualizedLib.distEsTableMod.SortDirectionType] = js.native
  var style: reactLib.reactMod.ReactNs.Requireable[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  var tabIndex: reactLib.reactMod.ReactNs.Requireable[scala.Double] = js.native
  @JSName("width")
  var width_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def estimatedRowSize(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def headerHeight(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def height(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def overscanRowCount(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def rowCount(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def rowGetter(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def rowHeight(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def rowStyle(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def scrollToAlignment(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def scrollToIndex(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def sortDirection(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def width(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

