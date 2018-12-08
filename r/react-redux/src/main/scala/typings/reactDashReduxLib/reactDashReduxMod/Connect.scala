package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connect extends js.Object {
  // tslint:disable:no-unnecessary-generics
  def apply(): InferableComponentEnhancer[DispatchProp[reduxLib.reduxMod.AnyAction]] = js.native
  def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: js.UndefOr[scala.Nothing], mapDispatchToProps: TDispatchProps): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: TDispatchProps,
    mergeProps: js.UndefOr[scala.Nothing],
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: TDispatchProps,
    mergeProps: scala.Null,
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
  def apply[no_state, TDispatchProps, TOwnProps](
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]
  ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
    mergeProps: js.UndefOr[scala.Nothing],
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
    mergeProps: scala.Null,
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
  def apply[no_state, TDispatchProps, TOwnProps](mapStateToProps: scala.Null, mapDispatchToProps: TDispatchProps): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: scala.Null,
    mapDispatchToProps: TDispatchProps,
    mergeProps: js.UndefOr[scala.Nothing],
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: scala.Null,
    mapDispatchToProps: TDispatchProps,
    mergeProps: scala.Null,
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[ResolveThunks[TDispatchProps], TOwnProps] = js.native
  def apply[no_state, TDispatchProps, TOwnProps](
    mapStateToProps: scala.Null,
    mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]
  ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: scala.Null,
    mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
    mergeProps: js.UndefOr[scala.Nothing],
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps](
    mapStateToProps: scala.Null,
    mapDispatchToProps: MapDispatchToPropsNonObject[TDispatchProps, TOwnProps],
    mergeProps: scala.Null,
    options: Options[js.Object, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[TDispatchProps, TOwnProps] = js.native
  def apply[no_state, TDispatchProps, TOwnProps, TMergedProps](
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
    mergeProps: MergeProps[js.UndefOr[scala.Nothing], TDispatchProps, TOwnProps, TMergedProps]
  ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
  def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
    mapStateToProps: js.UndefOr[scala.Nothing],
    mapDispatchToProps: scala.Null,
    mergeProps: MergeProps[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing], TOwnProps, TMergedProps]
  ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
  def apply[TStateProps, no_dispatch, TOwnProps, State](mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State]): InferableComponentEnhancerWithProps[TStateProps with DispatchProp[reduxLib.reduxMod.AnyAction], TOwnProps] = js.native
  def apply[TStateProps, no_dispatch, TOwnProps, State](
    mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
    mapDispatchToProps: scala.Null,
    mergeProps: js.UndefOr[scala.Nothing],
    options: Options[State, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[DispatchProp[reduxLib.reduxMod.AnyAction] with TStateProps, TOwnProps] = js.native
  def apply[TStateProps, no_dispatch, TOwnProps, State](
    mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
    mapDispatchToProps: scala.Null,
    mergeProps: scala.Null,
    options: Options[State, TStateProps, TOwnProps, js.Object]
  ): InferableComponentEnhancerWithProps[DispatchProp[reduxLib.reduxMod.AnyAction] with TStateProps, TOwnProps] = js.native
  def apply[no_state, TDispatchProps, TOwnProps, TMergedProps](
    mapStateToProps: scala.Null,
    mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
    mergeProps: MergeProps[js.UndefOr[scala.Nothing], TDispatchProps, TOwnProps, TMergedProps]
  ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
  def apply[no_state, no_dispatch, TOwnProps, TMergedProps](
    mapStateToProps: scala.Null,
    mapDispatchToProps: scala.Null,
    mergeProps: MergeProps[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing], TOwnProps, TMergedProps]
  ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
  def apply[TStateProps, TDispatchProps, TOwnProps, TMergedProps, State](
    mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State],
    mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps],
    mergeProps: MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps],
    options: Options[State, TStateProps, TOwnProps, TMergedProps]
  ): InferableComponentEnhancerWithProps[TMergedProps, TOwnProps] = js.native
}

