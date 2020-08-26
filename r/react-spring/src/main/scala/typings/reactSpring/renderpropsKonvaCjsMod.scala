package typings.reactSpring

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactSpring.anon.FnCall
import typings.reactSpring.reactSpringStrings.after
import typings.reactSpring.reactSpringStrings.children
import typings.reactSpring.reactSpringStrings.config
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
import typings.reactSpring.renderpropsKonvaMod.KonvaComponents
import typings.reactSpring.renderpropsUniversalMod.SpringConfig
import typings.reactSpring.renderpropsUniversalMod.SpringProps
import typings.reactSpring.renderpropsUniversalMod.TrailProps
import typings.reactSpring.renderpropsUniversalMod.TransitionProps
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spring/renderprops-konva.cjs", JSImport.Namespace)
@js.native
object renderpropsKonvaCjsMod extends js.Object {
  @js.native
  class Keyframes[S /* <: js.Object */, DS /* <: js.Object */] ()
    extends typings.reactSpring.renderpropsKonvaMod.Keyframes[S, DS]
  
  @js.native
  class Spring[DS /* <: js.Object */] ()
    extends Component[SpringProps[DS], js.Object, js.Any]
  
  @js.native
  class Trail[TItem, DS /* <: js.Object */] ()
    extends Component[TrailProps[TItem, DS], js.Object, js.Any]
  
  @js.native
  class Transition[TItem, TInit /* <: js.Object */, TFrom /* <: js.Object */, TEnter /* <: js.Object */, TLeave /* <: js.Object */, TUpdate /* <: js.Object */] ()
    extends Component[
          TransitionProps[TItem, TInit, TFrom, TEnter, TLeave, TUpdate, js.Object, js.Object], 
          js.Object, 
          js.Any
        ]
  
  val animated: FnCall with typings.reactSpring.reactSpringStrings.animated with TopLevel[KonvaComponents] = js.native
  def interpolate(parent: js.Array[Double], config: js.Function1[/* repeated */ Double, _]): js.Any = js.native
  /* static members */
  @js.native
  object Keyframes extends js.Object {
    def Spring[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typings.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            SpringProps[DS], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.SpringProps<DS> */ from | to | onRest | onFrame | children | inject | after | force | config | native | reset | immediate | delay | reverse | onStart, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    def Trail[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typings.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            TrailProps[DS, js.Object], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.TrailProps<DS, {}> */ from | to | items | keys | children | onRest | onFrame | inject | after | force | config | native | reset | immediate | delay | reverse | onStart, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    def Transition[S /* <: js.Object */, DS /* <: js.Object */](states: js.Object): js.Function1[
        /* props */ js.Object, 
        typings.reactSpring.renderpropsUniversalMod.Keyframes[
          S | (Pick[
            TransitionProps[S, DS, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object], 
            Exclude[
              /* keyof react-spring.react-spring/renderprops-universal.TransitionProps<DS, {}, {}, {}, {}, {}, {}, {}> */ config | initial | from | enter | leave | onRest | update | keys | items | children | onDestroyed | reset | trail | unique | native | reverse | onStart | immediate | delay, 
              to
            ]
          ]), 
          DS
        ]
      ] = js.native
    def create[S /* <: js.Object */, DS /* <: js.Object */](primitive: ComponentType[js.Object]): js.Function1[
        /* states */ js.Object, 
        js.Function1[
          /* props */ js.Object, 
          typings.reactSpring.renderpropsUniversalMod.Keyframes[S, DS]
        ]
      ] = js.native
  }
  
  @js.native
  object config extends js.Object {
    /** default: { tension: 170, friction: 26 } */
    var default: SpringConfig = js.native
    /** gentle: { tension: 120, friction: 14 } */
    var gentle: SpringConfig = js.native
    /** molasses: { tension: 280, friction: 120 } */
    var molasses: SpringConfig = js.native
    /** slow: { tension: 280, friction: 60 } */
    var slow: SpringConfig = js.native
    /** stiff: { tension: 210, friction: 20 } */
    var stiff: SpringConfig = js.native
    /** wobbly: { tension: 180, friction: 12 } */
    var wobbly: SpringConfig = js.native
  }
  
}

