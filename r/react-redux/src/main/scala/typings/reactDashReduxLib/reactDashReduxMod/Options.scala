package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options[State, TStateProps, TOwnProps, TMergedProps] extends ConnectOptions {
  /**
       * When pure, compares the result of mergeProps to its previous value.
       * @default shallowEqual
       */
  var areMergedPropsEqual: js.UndefOr[
    js.Function2[
      /* nextMergedProps */ TMergedProps, 
      /* prevMergedProps */ TMergedProps, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
       * When pure, compares incoming props to its previous value.
       * @default shallowEqual
       */
  var areOwnPropsEqual: js.UndefOr[
    js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, scala.Boolean]
  ] = js.undefined
  /**
       * When pure, compares the result of mapStateToProps to its previous value.
       * @default shallowEqual
       */
  var areStatePropsEqual: js.UndefOr[
    js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, scala.Boolean]
  ] = js.undefined
  /**
       * When pure, compares incoming store state to its previous value.
       * @default strictEqual
       */
  var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, scala.Boolean]] = js.undefined
  /**
       * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
       * preventing unnecessary updates, assuming that the component is a “pure” component
       * and does not rely on any input or state other than its props and the selected Redux store’s state.
       * Defaults to true.
       * @default true
       */
  var pure: js.UndefOr[scala.Boolean] = js.undefined
}

