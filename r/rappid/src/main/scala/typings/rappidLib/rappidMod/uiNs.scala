package typings
package rappidLib.rappidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rappid", "ui")
@js.native
object uiNs extends js.Object {
  trait Handle extends js.Object {
    var icon: java.lang.String
    var name: java.lang.String
    var position: java.lang.String
  }
  
  @js.native
  class SelectionView protected ()
    extends backboneLib.backboneMod.Model {
    def this(opt: rappidLib.Anon_Paper) = this()
    var graph: jointjsLib.jointjsMod.diaNs.Graph = js.native
    var model: backboneLib.backboneMod.Collection[jointjsLib.jointjsMod.diaNs.Cell] = js.native
    var paper: jointjsLib.jointjsMod.diaNs.Paper = js.native
    def addHandle(handle: Handle): scala.Unit = js.native
    def cancelSelection(): scala.Unit = js.native
    def changeHandle(name: java.lang.String, handle: Handle): scala.Unit = js.native
    def createSelectionBox(cellView: jointjsLib.jointjsMod.diaNs.CellView): scala.Unit = js.native
    def destroySelectionBox(cellView: jointjsLib.jointjsMod.diaNs.CellView): scala.Unit = js.native
    def removeHandle(name: java.lang.String): scala.Unit = js.native
    def startSelecting(evt: js.Any): scala.Unit = js.native
  }
  
}

