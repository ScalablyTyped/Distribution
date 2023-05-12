package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorView.mod.DOMNode
import typings.prosemirrorView.mod.NodeView
import typings.std.HTMLDivElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableSectionElement
import typings.std.MutationRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
@JSImport("prosemirror-tables", "TableView")
@js.native
open class TableView protected ()
  extends StObject
     with NodeView {
  def this(node: Node, cellMinWidth: Double) = this()
  
  var cellMinWidth: Double = js.native
  
  var colgroup: HTMLTableColElement = js.native
  
  @JSName("contentDOM")
  var contentDOM_TableView: HTMLTableSectionElement = js.native
  
  /**
    The outer DOM node that represents the document node.
    */
  /* CompleteClass */
  var dom: DOMNode = js.native
  @JSName("dom")
  var dom_TableView: HTMLDivElement = js.native
  
  @JSName("ignoreMutation")
  def ignoreMutation_MTableView(record: MutationRecord): Boolean = js.native
  
  var node: Node = js.native
  
  var table: HTMLTableElement = js.native
  
  @JSName("update")
  def update_MTableView(node: Node): Boolean = js.native
}
