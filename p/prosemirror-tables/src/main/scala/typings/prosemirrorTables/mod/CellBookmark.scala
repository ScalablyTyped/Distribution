package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorTransform.mod.Mappable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
@JSImport("prosemirror-tables", "CellBookmark")
@js.native
open class CellBookmark protected () extends StObject {
  def this(anchor: Double, head: Double) = this()
  
  var anchor: Double = js.native
  
  var head: Double = js.native
  
  def map(mapping: Mappable): CellBookmark = js.native
  
  def resolve(doc: Node): CellSelection | Selection = js.native
}
