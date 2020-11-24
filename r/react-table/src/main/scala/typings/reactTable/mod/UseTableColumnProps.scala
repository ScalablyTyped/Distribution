package typings.reactTable.mod

import typings.react.mod.ReactNode
import typings.reactTable.reactTableStrings.Footer
import typings.reactTable.reactTableStrings.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableColumnProps[D /* <: js.Object */] extends js.Object {
  
  var columns: js.Array[ColumnInstance[D]] = js.native
  
  var depth: Double = js.native
  
  def getFooterProps(): TableFooterProps = js.native
  def getFooterProps(propGetter: FooterPropGetter[D]): TableFooterProps = js.native
  
  def getHeaderProps(): TableHeaderProps = js.native
  def getHeaderProps(propGetter: HeaderPropGetter[D]): TableHeaderProps = js.native
  
   // not documented
  def getToggleHiddenProps(): js.Any = js.native
  def getToggleHiddenProps(userProps: js.Any): js.Any = js.native
  
  var id: IdType[D] = js.native
  
   // not documented
  var index: Double = js.native
  
  var isVisible: Boolean = js.native
  
  var parent: ColumnInstance[D] = js.native
  
   // not documented
  var placeholderOf: js.UndefOr[ColumnInstance[js.Object]] = js.native
  
  def render(`type`: String): ReactNode = js.native
  def render(`type`: String, props: js.Object): ReactNode = js.native
  @JSName("render")
  def render_Footer(`type`: Footer): ReactNode = js.native
  @JSName("render")
  def render_Footer(`type`: Footer, props: js.Object): ReactNode = js.native
  @JSName("render")
  def render_Header(`type`: Header): ReactNode = js.native
  @JSName("render")
  def render_Header(`type`: Header, props: js.Object): ReactNode = js.native
  
  def toggleHidden(): Unit = js.native
  def toggleHidden(value: Boolean): Unit = js.native
  
  var totalLeft: Double = js.native
  
  var totalWidth: Double = js.native
}
