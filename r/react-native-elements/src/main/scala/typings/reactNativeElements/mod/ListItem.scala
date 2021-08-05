package typings.reactNativeElements.mod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactNativeElements.anon.PartialIconProps
import typings.reactNativeElements.anon.TextPropsrightbooleanunde
import typings.reactNativeElements.anon.ViewPropertiesrightboolea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "ListItem")
@js.native
class ListItem protected ()
  extends Component[ListItemProps, js.Any, js.Any] {
  def this(props: ListItemProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ListItemProps, context: js.Any) = this()
}
/* static members */
object ListItem {
  
  @JSImport("react-native-elements", "ListItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements", "ListItem.ButtonGroup")
  @js.native
  def ButtonGroup: ComponentType[ButtonGroupProps] = js.native
  inline def ButtonGroup_=(x: ComponentType[ButtonGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonGroup")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "ListItem.CheckBox")
  @js.native
  def CheckBox: ComponentType[CheckBoxProps] = js.native
  inline def CheckBox_=(x: ComponentType[CheckBoxProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckBox")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "ListItem.Chevron")
  @js.native
  def Chevron: ComponentType[PartialIconProps] = js.native
  inline def Chevron_=(x: ComponentType[PartialIconProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Chevron")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "ListItem.Content")
  @js.native
  def Content: ComponentType[ViewPropertiesrightboolea] = js.native
  inline def Content_=(x: ComponentType[ViewPropertiesrightboolea]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "ListItem.Input")
  @js.native
  def Input: ComponentType[InputProps] = js.native
  inline def Input_=(x: ComponentType[InputProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "ListItem.Subtitle")
  @js.native
  def Subtitle: ComponentType[TextPropsrightbooleanunde] = js.native
  inline def Subtitle_=(x: ComponentType[TextPropsrightbooleanunde]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subtitle")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "ListItem.Title")
  @js.native
  def Title: ComponentType[TextPropsrightbooleanunde] = js.native
  inline def Title_=(x: ComponentType[TextPropsrightbooleanunde]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
}
