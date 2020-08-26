package typings.reactNavigationMaterialBottomTabs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactNavigation.mod.NavigationDescriptor
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Descriptors extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      _, 
      Options, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ] = js.native
  var navigation: NavigationProp[_] = js.native
  var screenProps: js.UndefOr[js.Any] = js.native
  def renderIcon(options: TintColor): ReactNode = js.native
}

object Descriptors {
  @scala.inline
  def apply(
    descriptors: StringDictionary[
      NavigationDescriptor[
        _, 
        Options, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigation: NavigationProp[_],
    renderIcon: TintColor => ReactNode
  ): Descriptors = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], renderIcon = js.Any.fromFunction1(renderIcon))
    __obj.asInstanceOf[Descriptors]
  }
  @scala.inline
  implicit class DescriptorsOps[Self <: Descriptors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescriptors(
      value: StringDictionary[
          NavigationDescriptor[
            _, 
            Options, 
            NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ]
    ): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: NavigationProp[_]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderIcon(value: TintColor => ReactNode): Self = this.set("renderIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenProps: Self = this.set("screenProps", js.undefined)
  }
  
}

