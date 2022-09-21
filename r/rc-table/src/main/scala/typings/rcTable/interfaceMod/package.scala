package typings.rcTable.interfaceMod

import typings.rcTable.anon.OnScroll
import typings.rcTable.anon.ShowTitle
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TdHTMLAttributes
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CellEllipsisType = ShowTitle | Boolean

type ColumnsType[RecordType] = js.Array[ColumnGroupType[RecordType] | ColumnType[RecordType]]

/* Rewritten from type alias, can be one of: 
  - typings.react.mod.ComponentType[P]
  - typings.react.mod.ForwardRefExoticComponent[P]
  - typings.react.mod.FC[P]
  - typings.rcTable.rcTableStrings.a
  - typings.rcTable.rcTableStrings.abbr
  - typings.rcTable.rcTableStrings.address
  - typings.rcTable.rcTableStrings.area
  - typings.rcTable.rcTableStrings.article
  - typings.rcTable.rcTableStrings.aside
  - typings.rcTable.rcTableStrings.audio
  - typings.rcTable.rcTableStrings.b
  - typings.rcTable.rcTableStrings.base
  - typings.rcTable.rcTableStrings.bdi
  - typings.rcTable.rcTableStrings.bdo
  - typings.rcTable.rcTableStrings.big
  - typings.rcTable.rcTableStrings.blockquote
  - typings.rcTable.rcTableStrings.body
  - typings.rcTable.rcTableStrings.br
  - typings.rcTable.rcTableStrings.button
  - typings.rcTable.rcTableStrings.canvas
  - typings.rcTable.rcTableStrings.caption
  - typings.rcTable.rcTableStrings.cite
  - typings.rcTable.rcTableStrings.code
  - typings.rcTable.rcTableStrings.col
  - typings.rcTable.rcTableStrings.colgroup
  - typings.rcTable.rcTableStrings.data
  - typings.rcTable.rcTableStrings.datalist
  - typings.rcTable.rcTableStrings.dd
  - typings.rcTable.rcTableStrings.del
  - typings.rcTable.rcTableStrings.details
  - typings.rcTable.rcTableStrings.dfn
  - typings.rcTable.rcTableStrings.dialog
  - typings.rcTable.rcTableStrings.div
  - typings.rcTable.rcTableStrings.dl
  - typings.rcTable.rcTableStrings.dt
  - typings.rcTable.rcTableStrings.em
  - typings.rcTable.rcTableStrings.embed
  - typings.rcTable.rcTableStrings.fieldset
  - typings.rcTable.rcTableStrings.figcaption
  - typings.rcTable.rcTableStrings.figure
  - typings.rcTable.rcTableStrings.footer
  - typings.rcTable.rcTableStrings.form
  - typings.rcTable.rcTableStrings.h1
  - typings.rcTable.rcTableStrings.h2
  - typings.rcTable.rcTableStrings.h3
  - typings.rcTable.rcTableStrings.h4
  - typings.rcTable.rcTableStrings.h5
  - typings.rcTable.rcTableStrings.h6
  - typings.rcTable.rcTableStrings.head
  - typings.rcTable.rcTableStrings.header
  - typings.rcTable.rcTableStrings.hgroup
  - typings.rcTable.rcTableStrings.hr
  - typings.rcTable.rcTableStrings.html
  - typings.rcTable.rcTableStrings.i
  - typings.rcTable.rcTableStrings.iframe
  - typings.rcTable.rcTableStrings.img
  - typings.rcTable.rcTableStrings.input
  - typings.rcTable.rcTableStrings.ins
  - typings.rcTable.rcTableStrings.kbd
  - typings.rcTable.rcTableStrings.keygen
  - typings.rcTable.rcTableStrings.label
  - typings.rcTable.rcTableStrings.legend
  - typings.rcTable.rcTableStrings.li
  - typings.rcTable.rcTableStrings.link
  - typings.rcTable.rcTableStrings.main
  - typings.rcTable.rcTableStrings.map
  - typings.rcTable.rcTableStrings.mark
  - typings.rcTable.rcTableStrings.menu
  - typings.rcTable.rcTableStrings.menuitem
  - typings.rcTable.rcTableStrings.meta
  - typings.rcTable.rcTableStrings.meter
  - typings.rcTable.rcTableStrings.nav
  - typings.rcTable.rcTableStrings.noscript
  - typings.rcTable.rcTableStrings.`object`
  - typings.rcTable.rcTableStrings.ol
  - typings.rcTable.rcTableStrings.optgroup
  - typings.rcTable.rcTableStrings.option
  - typings.rcTable.rcTableStrings.output
  - typings.rcTable.rcTableStrings.p
  - typings.rcTable.rcTableStrings.param
  - typings.rcTable.rcTableStrings.picture
  - typings.rcTable.rcTableStrings.pre
  - typings.rcTable.rcTableStrings.progress
  - typings.rcTable.rcTableStrings.q
  - typings.rcTable.rcTableStrings.rp
  - typings.rcTable.rcTableStrings.rt
  - typings.rcTable.rcTableStrings.ruby
  - typings.rcTable.rcTableStrings.s
  - typings.rcTable.rcTableStrings.samp
  - typings.rcTable.rcTableStrings.slot
  - typings.rcTable.rcTableStrings.script
  - typings.rcTable.rcTableStrings.section
  - typings.rcTable.rcTableStrings.select
  - typings.rcTable.rcTableStrings.small
  - typings.rcTable.rcTableStrings.source
  - typings.rcTable.rcTableStrings.span
  - typings.rcTable.rcTableStrings.strong
  - typings.rcTable.rcTableStrings.style
  - typings.rcTable.rcTableStrings.sub
  - typings.rcTable.rcTableStrings.summary
  - typings.rcTable.rcTableStrings.sup
  - typings.rcTable.rcTableStrings.table
  - typings.rcTable.rcTableStrings.template
  - typings.rcTable.rcTableStrings.tbody
  - typings.rcTable.rcTableStrings.td
  - typings.rcTable.rcTableStrings.textarea
  - typings.rcTable.rcTableStrings.tfoot
  - typings.rcTable.rcTableStrings.th
  - typings.rcTable.rcTableStrings.thead
  - typings.rcTable.rcTableStrings.time
  - typings.rcTable.rcTableStrings.title
  - typings.rcTable.rcTableStrings.tr
  - typings.rcTable.rcTableStrings.track
  - typings.rcTable.rcTableStrings.u
  - typings.rcTable.rcTableStrings.ul
  - typings.rcTable.rcTableStrings.`var`
  - typings.rcTable.rcTableStrings.video
  - typings.rcTable.rcTableStrings.wbr
  - typings.rcTable.rcTableStrings.webview
*/
type Component[P] = _Component[P] | ComponentType[P] | ForwardRefExoticComponent[P] | FC[P]

type CustomizeComponent = Component[Any]

type CustomizeScrollBody[RecordType] = js.Function2[/* data */ js.Array[RecordType], /* info */ OnScroll, ReactNode]

type DataIndex = String | Double | (js.Array[String | Double])

type DefaultRecordType = Record[String, Any]

type ExpandedRowRender[ValueType] = js.Function4[
/* record */ ValueType, 
/* index */ Double, 
/* indent */ Double, 
/* expanded */ Boolean, 
ReactNode]

/* Rewritten from type alias, can be one of: 
  - typings.rcTable.rcTableStrings.left
  - typings.rcTable.rcTableStrings.right
  - scala.Boolean
*/
type FixedType = _FixedType | Boolean

type GetComponent = js.Function2[
/* path */ js.Array[String], 
/* defaultComponent */ js.UndefOr[CustomizeComponent], 
CustomizeComponent]

type GetComponentProps[DataType] = js.Function2[
/* data */ DataType, 
/* index */ js.UndefOr[Double], 
HTMLAttributes[Any] | TdHTMLAttributes[Any]]

type GetRowKey[RecordType] = js.Function2[/* record */ RecordType, /* index */ js.UndefOr[Double], Key]

type Key = typings.react.mod.Key

type PanelRender[RecordType] = js.Function1[/* data */ js.Array[RecordType], ReactNode]

type RenderExpandIcon[RecordType] = js.Function1[/* props */ RenderExpandIconProps[RecordType], ReactNode]

type RowClassName[RecordType] = js.Function3[/* record */ RecordType, /* index */ Double, /* indent */ Double, String]

type TriggerEventHandler[RecordType] = js.Function2[/* record */ RecordType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
