package typings.reactNativeElements.mod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "Card")
@js.native
class Card protected ()
  extends Component[CardProps, js.Object, js.Any] {
  def this(props: CardProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: CardProps, context: js.Any) = this()
}
/* static members */
object Card {
  
  @JSImport("react-native-elements", "Card")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements", "Card.Divider")
  @js.native
  def Divider: ComponentType[DividerProps] = js.native
  @scala.inline
  def Divider_=(x: ComponentType[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "Card.FeaturedSubtitle")
  @js.native
  def FeaturedSubtitle: ComponentType[TextProps] = js.native
  @scala.inline
  def FeaturedSubtitle_=(x: ComponentType[TextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FeaturedSubtitle")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "Card.FeaturedTitle")
  @js.native
  def FeaturedTitle: ComponentType[TextProps] = js.native
  @scala.inline
  def FeaturedTitle_=(x: ComponentType[TextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FeaturedTitle")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "Card.Image")
  @js.native
  def Image: ComponentType[ImageProps] = js.native
  @scala.inline
  def Image_=(x: ComponentType[ImageProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "Card.Title")
  @js.native
  def Title: ComponentType[TextProps] = js.native
  @scala.inline
  def Title_=(x: ComponentType[TextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
}
