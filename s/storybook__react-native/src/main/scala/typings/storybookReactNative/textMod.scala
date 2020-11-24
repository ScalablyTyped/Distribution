package typings.storybookReactNative

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.Text
import typings.reactNative.mod.TextProps
import typings.storybookReactNative.anon.BackgroundColor
import typings.storybookReactNative.anon.PickTextPropsRefAttribute
import typings.storybookReactNative.anon.Selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/react-native/dist/preview/components/Shared/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  val Header: StyledComponent[TextProps with RefAttributes[Text], Selected, BackgroundColor] = js.native
  
  val Label: StyledComponent[TextProps with RefAttributes[Text], PickTextPropsRefAttribute, BackgroundColor] = js.native
  
  val Name: StyledComponent[TextProps with RefAttributes[Text], Selected, BackgroundColor] = js.native
}
