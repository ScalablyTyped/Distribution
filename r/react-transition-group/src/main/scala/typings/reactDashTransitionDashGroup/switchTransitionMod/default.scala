package typings.reactDashTransitionDashGroup.switchTransitionMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transition component inspired by the [vue transition modes](https://vuejs.org/v2/guide/transitions.html#Transition-Modes).
  * You can use it when you want to control the render between state transitions.
  * Based on the selected mode and the child's key which is the `Transition` or `CSSTransition` component, the `SwitchTransition` makes a consistent transition between them.
  *
  * If the `out-in` mode is selected, the `SwitchTransition` waits until the old child leaves and then inserts a new child.
  * If the `in-out` mode is selected, the `SwitchTransition` inserts a new child first, waits for the new child to enter and then removes the old child
  *
  * ```jsx
  * function App() {
  *  const [state, setState] = useState(false);
  *  return (
  *    <SwitchTransition>
  *      <FadeTransition key={state ? "Goodbye, world!" : "Hello, world!"}
  *        addEndListener={(node, done) => node.addEventListener("transitionend", done, false)}
  *        classNames='fade' >
  *        <button onClick={() => setState(state => !state)}>
  *          {state ? "Goodbye, world!" : "Hello, world!"}
  *        </button>
  *      </FadeTransition>
  *    </SwitchTransition>
  *  )
  * }
  * ```
  */
@JSImport("react-transition-group/SwitchTransition", JSImport.Default)
@js.native
class default ()
  extends Component[SwitchTransitionProps, js.Object, js.Any]

