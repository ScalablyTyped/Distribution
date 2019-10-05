package typings.reactDashRedux.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", "connectAdvanced")
@js.native
object connectAdvanced extends js.Object {
  def apply[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions]
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  def apply[S, TProps, TOwnProps, TFactoryOptions](
    // tslint:disable-next-line no-unnecessary-generics
  selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions],
    connectOptions: ConnectOptions with TFactoryOptions
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
}

