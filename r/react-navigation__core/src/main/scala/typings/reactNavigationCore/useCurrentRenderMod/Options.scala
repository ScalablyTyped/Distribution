package typings.reactNavigationCore.useCurrentRenderMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigationCore.typesMod.Descriptor
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var descriptors: StringDictionary[
    Descriptor[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]
  ] = js.native
  
  var navigation: NavigationHelpers[ParamListBase, js.Object] = js.native
  
  var state: NavigationState[ParamListBase] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    descriptors: StringDictionary[
      Descriptor[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]
    ],
    navigation: NavigationHelpers[ParamListBase, js.Object],
    state: NavigationState[ParamListBase]
  ): Options = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
          Descriptor[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]
        ]
    ): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationHelpers[ParamListBase, js.Object]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: NavigationState[ParamListBase]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
