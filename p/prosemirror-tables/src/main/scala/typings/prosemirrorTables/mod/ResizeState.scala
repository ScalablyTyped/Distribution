package typings.prosemirrorTables.mod

import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTables.prosemirrorTablesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
@JSImport("prosemirror-tables", "ResizeState")
@js.native
open class ResizeState protected () extends StObject {
  def this(activeHandle: Double, dragging: Dragging) = this()
  def this(activeHandle: Double, dragging: `false`) = this()
  
  var activeHandle: Double = js.native
  
  @JSName("apply")
  def apply(tr: Transaction): ResizeState = js.native
  
  var dragging: Dragging | `false` = js.native
}
