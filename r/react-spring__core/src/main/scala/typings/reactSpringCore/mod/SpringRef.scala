package typings.reactSpringCore.mod

import typings.reactSpringTypes.mod.Falsy
import typings.reactSpringTypes.mod.Lookup
import typings.reactSpringTypes.mod.OneOrMore
import typings.reactSpringTypes.mod.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpringRef[State /* <: Lookup[scala.Any] */] extends StObject {
  
  def apply(): js.Array[js.Promise[AnimationResult[Controller[State]]]] = js.native
  def apply(props: ControllerUpdate[State, Unit]): js.Array[js.Promise[AnimationResult[Controller[State]]]] = js.native
  def apply(props: ControllerUpdateFn[State]): js.Array[js.Promise[AnimationResult[Controller[State]]]] = js.native
  
  def _getProps(arg: ControllerUpdateFn[State], ctrl: Controller[State], index: Double): (ControllerUpdate[State, Unit]) | Falsy = js.native
  def _getProps(arg: ControllerUpdate[State, Unit], ctrl: Controller[State], index: Double): (ControllerUpdate[State, Unit]) | Falsy = js.native
  
  /** Add a controller to this ref */
  def add(ctrl: Controller[State]): Unit = js.native
  
  var current: js.Array[Controller[State]] = js.native
  
  /** Remove a controller from this ref */
  def delete(ctrl: Controller[State]): Unit = js.native
  
  /** Pause all animations. */
  def pause(): this.type = js.native
  /** Pause animations for the given keys. */
  def pause(keys: OneOrMore[String]): this.type = js.native
  
  /** Resume all animations. */
  def resume(): this.type = js.native
  /** Resume animations for the given keys. */
  def resume(keys: OneOrMore[String]): this.type = js.native
  
  /** Update the state of each controller without animating based on their passed state. */
  def set(values: js.Function2[/* index */ Double, /* ctrl */ Controller[State], Partial[State]]): Unit = js.native
  /** Update the state of each controller without animating. */
  def set(values: Partial[State]): Unit = js.native
  
  /** Start the queued animations of each controller. */
  def start(): js.Array[js.Promise[AnimationResult[Controller[State]]]] = js.native
  /** Update every controller with the same props. */
  def start(props: ControllerUpdate[State, Unit]): js.Array[js.Promise[AnimationResult[Controller[State]]]] = js.native
  /** Update controllers based on their state. */
  def start(props: ControllerUpdateFn[State]): js.Array[js.Promise[AnimationResult[Controller[State]]]] = js.native
  
  /** Stop all animations. */
  def stop(): this.type = js.native
  /** Cancel all animations. */
  def stop(cancel: Boolean): this.type = js.native
  /** Cancel animations for the given keys. */
  def stop(cancel: Boolean, keys: OneOrMore[String]): this.type = js.native
  /** Stop animations for the given keys. */
  def stop(keys: OneOrMore[String]): this.type = js.native
  
  /** Add the same props to each controller's update queue. */
  def update(props: ControllerUpdate[State, Unit]): this.type = js.native
  /** Generate separate props for each controller's update queue. */
  def update(props: ControllerUpdateFn[State]): this.type = js.native
}
object SpringRef {
  
  @JSImport("@react-spring/core", "SpringRef")
  @js.native
  def apply[State /* <: Lookup[scala.Any] */](): SpringRef[State] = js.native
}
