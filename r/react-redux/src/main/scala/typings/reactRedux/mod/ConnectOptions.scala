package typings.reactRedux.mod

import typings.react.mod.Context
import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends js.Object {
  /**
    * The react context to get the store from.
    *
    * @default ReactReduxContext
    */
  var context: js.UndefOr[Context[ReactReduxContextValue[_, AnyAction]]] = js.native
  /**
    * Computes the connector component's displayName property relative to that of the wrapped component. Usually
    * overridden by wrapper functions.
    *
    * @default name => 'ConnectAdvanced('+name+')'
    * @param componentName
    */
  var getDisplayName: js.UndefOr[js.Function1[/* componentName */ String, String]] = js.native
  /**
    * Shown in error messages. Usually overridden by wrapper functions.
    *
    * @default 'connectAdvanced'
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * If defined, a property named this value will be added to the props passed to the wrapped component. Its value
    * will be the number of times the component has been rendered, which can be useful for tracking down unnecessary
    * re-renders.
    *
    * @default undefined
    */
  var renderCountProp: js.UndefOr[String] = js.native
  /**
    * Controls whether the connector component subscribes to redux store state changes. If set to false, it will only
    * re-render on <code>componentWillReceiveProps</code>.
    *
    * @default true
    */
  var shouldHandleStateChanges: js.UndefOr[Boolean] = js.native
  /**
    * The key of props/context to get the store. You probably only need this if you are in the inadvisable position of
    * having multiple stores.
    *
    * @default 'store'
    */
  var storeKey: js.UndefOr[String] = js.native
  /**
    * @deprecated Use forwardRef
    *
    * @default false
    */
  var withRef: js.UndefOr[Boolean] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: Context[ReactReduxContextValue[_, AnyAction]]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setGetDisplayName(value: /* componentName */ String => String): Self = this.set("getDisplayName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDisplayName: Self = this.set("getDisplayName", js.undefined)
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
    @scala.inline
    def setRenderCountProp(value: String): Self = this.set("renderCountProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderCountProp: Self = this.set("renderCountProp", js.undefined)
    @scala.inline
    def setShouldHandleStateChanges(value: Boolean): Self = this.set("shouldHandleStateChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldHandleStateChanges: Self = this.set("shouldHandleStateChanges", js.undefined)
    @scala.inline
    def setStoreKey(value: String): Self = this.set("storeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreKey: Self = this.set("storeKey", js.undefined)
    @scala.inline
    def setWithRef(value: Boolean): Self = this.set("withRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithRef: Self = this.set("withRef", js.undefined)
  }
  
}

