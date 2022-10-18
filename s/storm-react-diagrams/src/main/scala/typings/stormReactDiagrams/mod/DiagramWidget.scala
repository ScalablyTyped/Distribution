package typings.stormReactDiagrams.mod

import typings.stormReactDiagrams.distSrcWidgetsDiagramWidgetMod.DiagramProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams", "DiagramWidget")
@js.native
open class DiagramWidget protected ()
  extends typings.stormReactDiagrams.distSrcWidgetsDiagramWidgetMod.DiagramWidget {
  def this(props: DiagramProps) = this()
}
/* static members */
object DiagramWidget {
  
  @JSImport("storm-react-diagrams", "DiagramWidget")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("storm-react-diagrams", "DiagramWidget.defaultProps")
  @js.native
  def defaultProps: DiagramProps = js.native
  inline def defaultProps_=(x: DiagramProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
