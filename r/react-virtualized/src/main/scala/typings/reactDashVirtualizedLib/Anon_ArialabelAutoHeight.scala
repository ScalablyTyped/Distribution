package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArialabelAutoHeight extends js.Object {
  @JSName("aria-label")
  var `aria-label_Original`: reactLib.reactMod.Requireable[java.lang.String] = js.native
  @JSName("autoHeight")
  var autoHeight_Original: reactLib.reactMod.Requireable[scala.Boolean] = js.native
  @JSName("children")
  var children_Original: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsTableMod.Column] = js.native
  @JSName("className")
  var className_Original: reactLib.reactMod.Requireable[java.lang.String] = js.native
  @JSName("disableHeader")
  var disableHeader_Original: reactLib.reactMod.Requireable[scala.Boolean] = js.native
  @JSName("estimatedRowSize")
  var estimatedRowSize_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  @JSName("gridClassName")
  var gridClassName_Original: reactLib.reactMod.Requireable[java.lang.String] = js.native
  @JSName("gridStyle")
  var gridStyle_Original: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties] = js.native
  @JSName("headerClassName")
  var headerClassName_Original: reactLib.reactMod.Requireable[java.lang.String] = js.native
  @JSName("headerHeight")
  var headerHeight_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  @JSName("headerRowRenderer")
  var headerRowRenderer_Original: reactLib.reactMod.Requireable[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer] = js.native
  @JSName("headerStyle")
  var headerStyle_Original: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties] = js.native
  @JSName("height")
  var height_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  @JSName("id")
  var id_Original: reactLib.reactMod.Requireable[java.lang.String] = js.native
  @JSName("noRowsRenderer")
  var noRowsRenderer_Original: reactLib.reactMod.Requireable[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.native
  @JSName("onHeaderClick")
  var onHeaderClick_Original: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.HeaderMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  @JSName("onRowClick")
  var onRowClick_Original: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  @JSName("onRowDoubleClick")
  var onRowDoubleClick_Original: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  @JSName("onRowMouseOut")
  var onRowMouseOut_Original: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  @JSName("onRowMouseOver")
  var onRowMouseOver_Original: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  @JSName("onRowsRendered")
  var onRowsRendered_Original: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.native
  @JSName("onScroll")
  var onScroll_Original: reactLib.reactMod.Requireable[
    js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollEventData, 
      scala.Unit
    ]
  ] = js.native
  @JSName("overscanRowCount")
  var overscanRowCount_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  @JSName("rowClassName")
  var rowClassName_Original: reactLib.reactMod.Requireable[
    java.lang.String | (js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      java.lang.String
    ])
  ] = js.native
  @JSName("rowCount")
  var rowCount_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  @JSName("rowGetter")
  var rowGetter_Original: reactLib.reactMod.Validator[
    js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, _]
  ] = js.native
  @JSName("rowHeight")
  var rowHeight_Original: reactLib.reactMod.Validator[
    scala.Double | (js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
  ] = js.native
  @JSName("rowRenderer")
  var rowRenderer_Original: reactLib.reactMod.Requireable[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsTableMod.TableRowProps, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.native
  @JSName("rowStyle")
  var rowStyle_Original: reactLib.reactMod.Validator[
    reactLib.reactMod.CSSProperties | (js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      reactLib.reactMod.CSSProperties
    ])
  ] = js.native
  @JSName("scrollToAlignment")
  var scrollToAlignment_Original: reactLib.reactMod.Validator[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment] = js.native
  @JSName("scrollToIndex")
  var scrollToIndex_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  @JSName("scrollTop")
  var scrollTop_Original: reactLib.reactMod.Requireable[scala.Double] = js.native
  @JSName("sortBy")
  var sortBy_Original: reactLib.reactMod.Requireable[java.lang.String] = js.native
  @JSName("sortDirection")
  var sortDirection_Original: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsTableMod.SortDirectionType] = js.native
  @JSName("sort")
  var sort_Original: reactLib.reactMod.Requireable[js.Function1[/* params */ Anon_SortBy, scala.Unit]] = js.native
  @JSName("style")
  var style_Original: reactLib.reactMod.Requireable[reactLib.reactMod.CSSProperties] = js.native
  @JSName("tabIndex")
  var tabIndex_Original: reactLib.reactMod.Requireable[scala.Double] = js.native
  @JSName("width")
  var width_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  def `aria-label`(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def autoHeight(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def className(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def disableHeader(
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
  def gridClassName(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def gridStyle(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def headerClassName(
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
  def headerRowRenderer(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def headerStyle(
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
  def id(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def noRowsRenderer(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def onHeaderClick(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def onRowClick(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def onRowDoubleClick(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def onRowMouseOut(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def onRowMouseOver(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def onRowsRendered(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def onScroll(
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
  def rowClassName(
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
  def rowRenderer(
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
  def scrollTop(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def sort(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def sortBy(
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
  def style(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def tabIndex(
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

