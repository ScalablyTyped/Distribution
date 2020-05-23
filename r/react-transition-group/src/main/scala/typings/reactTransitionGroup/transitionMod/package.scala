package typings.reactTransitionGroup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionMod {
  type EndHandler[RefElement /* <: js.UndefOr[typings.std.HTMLElement] */] = typings.reactTransitionGroup.transitionMod.RefHandler[
    RefElement, 
    js.Function2[/* node */ typings.std.HTMLElement, /* done */ js.Function0[scala.Unit], scala.Unit], 
    js.Function1[/* done */ js.Function0[scala.Unit], scala.Unit]
  ]
  type EnterHandler[RefElement /* <: js.UndefOr[typings.std.HTMLElement] */] = typings.reactTransitionGroup.transitionMod.RefHandler[
    RefElement, 
    js.Function2[/* node */ typings.std.HTMLElement, /* isAppearing */ scala.Boolean, scala.Unit], 
    js.Function1[/* isAppearing */ scala.Boolean, scala.Unit]
  ]
  type ExitHandler[E /* <: js.UndefOr[typings.std.HTMLElement] */] = typings.reactTransitionGroup.transitionMod.RefHandler[
    E, 
    js.Function1[/* node */ typings.std.HTMLElement, scala.Unit], 
    js.Function0[scala.Unit]
  ]
  type RefHandler[RefElement /* <: js.UndefOr[typings.std.HTMLElement] */, ImplicitRefHandler /* <: js.Function2[/* node */ typings.std.HTMLElement, /* repeated */ js.Any, scala.Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ js.Any, scala.Unit] */] = /* import warning: importer.ImportType#apply Failed type conversion: react-transition-group.anon.Explicit<ImplicitRefHandler, ExplicitRefHandler>[RefElement extends undefined ? 'implicit' : 'explicit'] */ js.Any
  /**
    * The Transition component lets you describe a transition from one component
    * state to another _over time_ with a simple declarative API. Most commonly
    * It's used to animate the mounting and unmounting of Component, but can also
    * be used to describe in-place transition states as well.
    *
    * By default the `Transition` component does not alter the behavior of the
    * component it renders, it only tracks "enter" and "exit" states for the components.
    * It's up to you to give meaning and effect to those states. For example we can
    * add styles to a component when it enters or exits:
    *
    * ```jsx
    * import Transition from 'react-transition-group/Transition';
    *
    * const duration = 300;
    *
    * const defaultStyle = {
    *   transition: `opacity ${duration}ms ease-in-out`,
    *   opacity: 0,
    * }
    *
    * const transitionStyles = {
    *   entering: { opacity: 1 },
    *   entered:  { opacity: 1 },
    * };
    *
    * const Fade = ({ in: inProp }) => (
    *   <Transition in={inProp} timeout={duration}>
    *     {(state) => (
    *       <div style={{
    *         ...defaultStyle,
    *         ...transitionStyles[state]
    *       }}>
    *         I'm A fade Transition!
    *       </div>
    *     )}
    *   </Transition>
    * );
    * ```
    *
    */
  type Transition[RefElement /* <: js.UndefOr[typings.std.HTMLElement] */] = typings.react.mod.Component[
    typings.reactTransitionGroup.transitionMod.TransitionProps[RefElement], 
    js.Object, 
    js.Any
  ]
  type TransitionChildren = typings.react.mod.ReactNode | (js.Function1[
    /* status */ typings.reactTransitionGroup.transitionMod.TransitionStatus, 
    typings.react.mod.ReactNode
  ])
  type TransitionStatus = /* "entering" */ java.lang.String
}
