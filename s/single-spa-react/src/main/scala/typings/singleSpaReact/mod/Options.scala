package typings.singleSpaReact.mod

import typings.react.mod.ComponentClass
import typings.react.mod.FunctionComponent
import typings.singleSpaReact.anon.TypeofReact
import typings.singleSpaReact.anon.TypeofReactDOM
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var React: TypeofReact = js.native
  var ReactDOM: TypeofReactDOM = js.native
  var domElementGetter: js.UndefOr[js.Function0[Element]] = js.native
  var loadRootComponent: js.UndefOr[js.Function0[js.Promise[(ComponentClass[_, _]) | FunctionComponent[_]]]] = js.native
  var parcelCanUpdate: js.UndefOr[Boolean] = js.native
  var rootComponent: js.UndefOr[(ComponentClass[_, _]) | FunctionComponent[_]] = js.native
  var suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(React: TypeofReact, ReactDOM: TypeofReactDOM): Options = {
    val __obj = js.Dynamic.literal(React = React.asInstanceOf[js.Any], ReactDOM = ReactDOM.asInstanceOf[js.Any])
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
    def setReact(value: TypeofReact): Self = this.set("React", value.asInstanceOf[js.Any])
    @scala.inline
    def setReactDOM(value: TypeofReactDOM): Self = this.set("ReactDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomElementGetter(value: () => Element): Self = this.set("domElementGetter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDomElementGetter: Self = this.set("domElementGetter", js.undefined)
    @scala.inline
    def setLoadRootComponent(value: () => js.Promise[(ComponentClass[_, _]) | FunctionComponent[_]]): Self = this.set("loadRootComponent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLoadRootComponent: Self = this.set("loadRootComponent", js.undefined)
    @scala.inline
    def setParcelCanUpdate(value: Boolean): Self = this.set("parcelCanUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParcelCanUpdate: Self = this.set("parcelCanUpdate", js.undefined)
    @scala.inline
    def setRootComponent(value: (ComponentClass[_, _]) | FunctionComponent[_]): Self = this.set("rootComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootComponent: Self = this.set("rootComponent", js.undefined)
    @scala.inline
    def setSuppressComponentDidCatchWarning(value: Boolean): Self = this.set("suppressComponentDidCatchWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressComponentDidCatchWarning: Self = this.set("suppressComponentDidCatchWarning", js.undefined)
  }
  
}

