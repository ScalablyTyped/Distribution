package typings.protonNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proton-native", "Area")
@js.native
class Area protected ()
  extends Component[AreaProps, js.Object, js.Any] {
  def this(props: AreaProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: AreaProps, context: js.Any) = this()
}
/* static members */
object Area {
  
  @JSImport("proton-native", "Area")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Bezier curve to be displayed in an Area component.
    */
  @JSImport("proton-native", "Area.Bezier")
  @js.native
  def Bezier: Instantiable0[AreaBezier] = js.native
  inline def Bezier_=(x: Instantiable0[AreaBezier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bezier")(x.asInstanceOf[js.Any])
  
  /**
    * A circle to be displayed in an Area component.
    */
  @JSImport("proton-native", "Area.Circle")
  @js.native
  def Circle: Instantiable0[AreaCircle] = js.native
  inline def Circle_=(x: Instantiable0[AreaCircle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
  
  /**
    * A component to apply props to all it's children in an Area component.
    *
    * To be able to use percentage values in transforms, the props `width` and `height` need to be specified (they have no graphical effect).
    */
  @JSImport("proton-native", "Area.Group")
  @js.native
  def Group: Instantiable0[AreaGroup] = js.native
  inline def Group_=(x: Instantiable0[AreaGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  /**
    * A straigt line to be displayed in an Area component.
    */
  @JSImport("proton-native", "Area.Line")
  @js.native
  def Line: Instantiable0[AreaLine] = js.native
  inline def Line_=(x: Instantiable0[AreaLine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  /**
    * A component describing a path to be displayed in an Area component.
    *
    * To be able to use percentage values in transforms, the props `width` and `height` need to be specified (they have no graphical effect).
    */
  @JSImport("proton-native", "Area.Path")
  @js.native
  def Path: Instantiable0[AreaPath] = js.native
  inline def Path_=(x: Instantiable0[AreaPath]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  /**
    * A rectangle to be displayed in an Area component.
    */
  @JSImport("proton-native", "Area.Rectangle")
  @js.native
  def Rectangle: Instantiable0[AreaRectangle] = js.native
  inline def Rectangle_=(x: Instantiable0[AreaRectangle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rectangle")(x.asInstanceOf[js.Any])
  
  /**
    * A (possibly styled) text to be displayed in an Area component. Nested `Area.Text` components inheirit the parent's style.
    */
  @JSImport("proton-native", "Area.Text")
  @js.native
  def Text: Instantiable0[AreaText] = js.native
  inline def Text_=(x: Instantiable0[AreaText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
}
