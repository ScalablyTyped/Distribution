package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashReduxLib {
  // Applies LibraryManagedAttributes (proper handling of defaultProps
  // and propTypes), as well as defines WrappedComponent.
  type ConnectedComponentClass[C, P] = js.Any with Anon_WrappedComponent[C]
  // Infers prop type from component C
  type GetProps[C] = js.Any
  type MapDispatchToProps[TDispatchProps, TOwnProps] = js.Any | TDispatchProps
  type MapDispatchToPropsParam[TDispatchProps, TOwnProps] = js.Any | (MapDispatchToProps[TDispatchProps, TOwnProps])
  type MapStateToPropsParam[TStateProps, TOwnProps, State] = js.UndefOr[js.Any | scala.Null]
  /**
   * A property P will be present if:
   * - it is present in DecorationTargetProps
   *
   * Its value will be dependent on the following conditions
   * - if property P is present in InjectedProps and its definition extends the definition
   *   in DecorationTargetProps, then its definition will be that of DecorationTargetProps[P]
   * - if property P is not present in InjectedProps then its definition will be that of
   *   DecorationTargetProps[P]
   * - if property P is present in InjectedProps but does not extend the
   *   DecorationTargetProps[P] definition, its definition will be that of InjectedProps[P]
   */
  type Matching[InjectedProps, DecorationTargetProps] = reactDashReduxLib.reactDashReduxLibStrings.Matching with DecorationTargetProps
  // Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  /**
   * a property P will be present if :
   * - it is present in both DecorationTargetProps and InjectedProps
   * - InjectedProps[P] can satisfy DecorationTargetProps[P]
   * ie: decorated component can accept more types than decorator is injecting
   *
   * For decoration, inject props or ownProps are all optionally
   * required by the decorated (right hand side) component.
   * But any property required by the decorated component must be satisfied by the injected property.
   */
  type Shared[InjectedProps, DecorationTargetProps /* <: js.Object */] = reactDashReduxLib.reactDashReduxLibStrings.Shared with DecorationTargetProps
}
