package typings.reactTransitionGroup.transitionGroupMod

import typings.react.mod.Component
import typings.reactTransitionGroup.reactTransitionGroupStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `<TransitionGroup>` component manages a set of `<Transition>` components
  * in a list. Like with the `<Transition>` component, `<TransitionGroup>`, is a
  * state machine for managing the mounting and unmounting of components over
  * time.
  *
  * Consider the example below using the `Fade` CSS transition from before.
  * As items are removed or added to the TodoList the `in` prop is toggled
  * automatically by the `<TransitionGroup>`. You can use _any_ `<Transition>`
  * component in a `<TransitionGroup>`, not just css.
  *
  * ```jsx
  * import TransitionGroup from 'react-transition-group/TransitionGroup';
  *
  * class TodoList extends React.Component {
  *   constructor(props) {
  *     super(props)
  *     this.state = {items: ['hello', 'world', 'click', 'me']}
  *   }
  *   handleAdd() {
  *     const newItems = this.state.items.concat([
  *       prompt('Enter some text')
  *     ]);
  *     this.setState({ items: newItems });
  *   }
  *   handleRemove(i) {
  *     let newItems = this.state.items.slice();
  *     newItems.splice(i, 1);
  *     this.setState({items: newItems});
  *   }
  *   render() {
  *     return (
  *       <div>
  *         <button onClick={() => this.handleAdd()}>Add Item</button>
  *         <TransitionGroup>
  *           {this.state.items.map((item, i) => (
  *             <FadeTransition key={item}>
  *               <div>
  *                 {item}{' '}
  *                 <button onClick={() => this.handleRemove(i)}>
  *                   remove
  *                 </button>
  *               </div>
  *             </FadeTransition>
  *           ))}
  *         </TransitionGroup>
  *       </div>
  *     );
  *   }
  * }
  * ```
  *
  * Note that `<TransitionGroup>`  does not define any animation behavior!
  * Exactly _how_ a list item animates is up to the individual `<Transition>`
  * components. This means you can mix and match animations across different
  * list items.
  */
@JSImport("react-transition-group/TransitionGroup", JSImport.Default)
@js.native
class default ()
  extends Component[TransitionGroupProps[div, js.Any], js.Object, js.Any]

