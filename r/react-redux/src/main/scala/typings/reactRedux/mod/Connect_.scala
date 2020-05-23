package typings.reactRedux.mod

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connect_ extends js.Object {
  // tslint:disable:no-unnecessary-generics
  def apply(): InferableComponentEnhancer[DispatchProp[AnyAction]] = js.native
  def apply[no_state, TDispatchProps, TOwnProps](
    mapStateToProps: js.UndefOr[Null],
    mapDispatchToProps: (MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]) | (MapDispatchToPropsParam[TDispatchProps, TOwnProps])
  ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: js.UndefOr[Null],
    mapDispatchToProps: (MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]) | (MapDispatchToPropsParam[TDispatchProps, TOwnProps]),
    mergeProps: js.UndefOr[Null],
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
  def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
    mapStateToProps: js.UndefOr[Null],
    mapDispatchToProps: js.UndefOr[Null],
    mergeProps: MergeProps[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing], TOwnProps, TMergedProps]
  ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
  def apply[TStateProps, no_dispatch, TOwnProps, State](mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State]): InferableComponentEnhancerWithProps[TStateProps with DispatchProp[AnyAction], TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps, TMergedProps, State](
    mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
    mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
    mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps],
    options: Options[State, TStateProps, TOwnProps, TMergedProps]
  ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
}

