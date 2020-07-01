package typings.reactCytoscapejs.mod

import typings.cytoscape.mod.ElementDefinition
import typings.react.mod.Component
import typings.reactCytoscapejs.anon.Edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-cytoscapejs", JSImport.Default)
@js.native
class default ()
  extends Component[CytoscapeComponentProps, js.Object, js.Any]

/* static members */
@JSImport("react-cytoscapejs", JSImport.Default)
@js.native
object default extends js.Object {
  def normalizeElements(data: js.Array[ElementDefinition]): js.Array[ElementDefinition] = js.native
  def normalizeElements(data: Edges): js.Array[ElementDefinition] = js.native
}

