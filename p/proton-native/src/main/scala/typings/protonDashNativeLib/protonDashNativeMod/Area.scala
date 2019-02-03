package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proton-native", "Area")
@js.native
class Area ()
  extends reactLib.reactMod.Component[AreaProps, js.Object, js.Any]

/* static members */
@JSImport("proton-native", "Area")
@js.native
object Area extends js.Object {
  /**
    * A Bezier curve to be displayed in an Area component.
    */
  var Bezier: org.scalablytyped.runtime.Instantiable0[protonDashNativeLib.protonDashNativeMod.AreaBezier] = js.native
  /**
    * A circle to be displayed in an Area component.
    */
  var Circle: org.scalablytyped.runtime.Instantiable0[protonDashNativeLib.protonDashNativeMod.AreaCircle] = js.native
  /**
    * A component to apply props to all it's children in an Area component.
    *
    * To be able to use percentage values in transforms, the props `width` and `height` need to be specified (they have no graphical effect).
    */
  var Group: org.scalablytyped.runtime.Instantiable0[protonDashNativeLib.protonDashNativeMod.AreaGroup] = js.native
  /**
    * A straigt line to be displayed in an Area component.
    */
  var Line: org.scalablytyped.runtime.Instantiable0[protonDashNativeLib.protonDashNativeMod.AreaLine] = js.native
  /**
    * A component describing a path to be displayed in an Area component.
    *
    * To be able to use percentage values in transforms, the props `width` and `height` need to be specified (they have no graphical effect).
    */
  var Path: org.scalablytyped.runtime.Instantiable0[protonDashNativeLib.protonDashNativeMod.AreaPath] = js.native
  /**
    * A rectangle to be displayed in an Area component.
    */
  var Rectangle: org.scalablytyped.runtime.Instantiable0[protonDashNativeLib.protonDashNativeMod.AreaRectangle] = js.native
  /**
    * A (possibly styled) text to be displayed in an Area component. Nested `Area.Text` components inheirit the parent's style.
    */
  var Text: org.scalablytyped.runtime.Instantiable0[protonDashNativeLib.protonDashNativeMod.AreaText] = js.native
}

