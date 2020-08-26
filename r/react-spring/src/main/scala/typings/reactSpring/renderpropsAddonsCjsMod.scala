package typings.reactSpring

import typings.react.mod.Component
import typings.reactSpring.renderpropsAddonsMod.ParallaxLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spring/renderprops-addons.cjs", JSImport.Namespace)
@js.native
object renderpropsAddonsCjsMod extends js.Object {
  @js.native
  class Parallax ()
    extends typings.reactSpring.renderpropsAddonsMod.Parallax
  
  @js.native
  class ParallaxLayer ()
    extends Component[ParallaxLayerProps, js.Object, js.Any]
  
}

