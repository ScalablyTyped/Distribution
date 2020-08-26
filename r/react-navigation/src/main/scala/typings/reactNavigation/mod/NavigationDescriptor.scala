package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationDescriptor[Params, Options, NavigationScreenPropType] extends js.Object {
  var key: String = js.native
  var navigation: NavigationScreenPropType = js.native
  var options: Options = js.native
  var state: NavigationLeafRoute[Params] | NavigationStateRoute[Params] = js.native
  def getComponent(): ComponentType[js.Object] = js.native
}

object NavigationDescriptor {
  @scala.inline
  def apply[Params, Options, NavigationScreenPropType](
    getComponent: () => ComponentType[js.Object],
    key: String,
    navigation: NavigationScreenPropType,
    options: Options,
    state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  ): NavigationDescriptor[Params, Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent), key = key.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDescriptor[Params, Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class NavigationDescriptorOps[Self <: NavigationDescriptor[_, _, _], Params, Options, NavigationScreenPropType] (val x: Self with (NavigationDescriptor[Params, Options, NavigationScreenPropType])) extends AnyVal {
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
    def setGetComponent(value: () => ComponentType[js.Object]): Self = this.set("getComponent", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: NavigationScreenPropType): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: NavigationLeafRoute[Params] | NavigationStateRoute[Params]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

