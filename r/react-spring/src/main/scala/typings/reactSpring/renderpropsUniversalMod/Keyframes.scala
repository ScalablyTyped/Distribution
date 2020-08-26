package typings.reactSpring.renderpropsUniversalMod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactSpring.reactSpringStrings.after
import typings.reactSpring.reactSpringStrings.children
import typings.reactSpring.reactSpringStrings.delay
import typings.reactSpring.reactSpringStrings.enter
import typings.reactSpring.reactSpringStrings.force
import typings.reactSpring.reactSpringStrings.from
import typings.reactSpring.reactSpringStrings.immediate
import typings.reactSpring.reactSpringStrings.initial
import typings.reactSpring.reactSpringStrings.inject
import typings.reactSpring.reactSpringStrings.items
import typings.reactSpring.reactSpringStrings.keys
import typings.reactSpring.reactSpringStrings.leave
import typings.reactSpring.reactSpringStrings.native
import typings.reactSpring.reactSpringStrings.onDestroyed
import typings.reactSpring.reactSpringStrings.onFrame
import typings.reactSpring.reactSpringStrings.onRest
import typings.reactSpring.reactSpringStrings.onStart
import typings.reactSpring.reactSpringStrings.reset
import typings.reactSpring.reactSpringStrings.reverse
import typings.reactSpring.reactSpringStrings.to
import typings.reactSpring.reactSpringStrings.trail
import typings.reactSpring.reactSpringStrings.unique
import typings.reactSpring.reactSpringStrings.update
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spring/renderprops-universal", "Keyframes")
@js.native
class Keyframes[S /* <: js.Object */, DS /* <: js.Object */] ()
  extends Component[KeyframesProps[DS] with S, js.Object, js.Any]

/* static members */
@JSImport("react-spring/renderprops-universal", "Keyframes")
@js.native
object Keyframes extends js.Object {
  def Spring[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
    /* props */ js.Object, 
    Keyframes[
      S | (Pick[
        SpringProps[DS], 
        Exclude[
          /* keyof react-spring.react-spring/renderprops-universal.SpringProps<DS> */ from | to | onRest | onFrame | children | inject | after | force | typings.reactSpring.reactSpringStrings.config | native | reset | immediate | delay | reverse | onStart, 
          to
        ]
      ]), 
      DS
    ]
  ] = js.native
  def Trail[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
    /* props */ js.Object, 
    Keyframes[
      S | (Pick[
        TrailProps[DS, js.Object], 
        Exclude[
          /* keyof react-spring.react-spring/renderprops-universal.TrailProps<DS, {}> */ from | to | items | keys | children | onRest | onFrame | inject | after | force | typings.reactSpring.reactSpringStrings.config | native | reset | immediate | delay | reverse | onStart, 
          to
        ]
      ]), 
      DS
    ]
  ] = js.native
  def Transition[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
    /* props */ js.Object, 
    Keyframes[
      S | (Pick[
        TransitionProps[S, DS, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object], 
        Exclude[
          /* keyof react-spring.react-spring/renderprops-universal.TransitionProps<DS, {}, {}, {}, {}, {}, {}, {}> */ typings.reactSpring.reactSpringStrings.config | initial | from | enter | leave | onRest | update | keys | items | children | onDestroyed | reset | trail | unique | native | reverse | onStart | immediate | delay, 
          to
        ]
      ]), 
      DS
    ]
  ] = js.native
  def create[S /* <: js.Object */, DS /* <: js.Object */](primitive: ComponentType[js.Object]): js.Function1[/* states */ js.Object, js.Function1[/* props */ js.Object, Keyframes[S, DS]]] = js.native
}

