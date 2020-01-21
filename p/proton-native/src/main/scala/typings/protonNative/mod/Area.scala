package typings.protonNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proton-native", "Area")
@js.native
class Area ()
  extends Component[AreaProps, js.Object, js.Any]

/* static members */
@JSImport("proton-native", "Area")
@js.native
object Area extends js.Object {
  /**
    * A Bezier curve to be displayed in an Area component.
    */
  var Bezier: Instantiable0[AreaBezier] = js.native
  /**
    * A circle to be displayed in an Area component.
    */
  var Circle: Instantiable0[AreaCircle] = js.native
  /**
    * A component to apply props to all it's children in an Area component.
    *
    * To be able to use percentage values in transforms, the props `width` and `height` need to be specified (they have no graphical effect).
    */
  var Group: Instantiable0[AreaGroup] = js.native
  /**
    * A straigt line to be displayed in an Area component.
    */
  var Line: Instantiable0[AreaLine] = js.native
  /**
    * A component describing a path to be displayed in an Area component.
    *
    * To be able to use percentage values in transforms, the props `width` and `height` need to be specified (they have no graphical effect).
    */
  var Path: Instantiable0[AreaPath] = js.native
  /**
    * A rectangle to be displayed in an Area component.
    */
  var Rectangle: Instantiable0[AreaRectangle] = js.native
  /**
    * A (possibly styled) text to be displayed in an Area component. Nested `Area.Text` components inheirit the parent's style.
    */
  var Text: Instantiable0[AreaText] = js.native
}

