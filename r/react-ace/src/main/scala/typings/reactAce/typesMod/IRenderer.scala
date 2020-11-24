package typings.reactAce.typesMod

import typings.aceBuilds.mod.Ace.VirtualRenderer
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRenderer extends VirtualRenderer {
  
  var placeholderNode: js.UndefOr[HTMLDivElement] = js.native
  
  var scroller: js.UndefOr[HTMLDivElement] = js.native
}
