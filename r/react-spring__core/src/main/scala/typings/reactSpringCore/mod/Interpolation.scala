package typings.reactSpringCore.mod

import typings.reactSpringShared.mod.FluidValue
import typings.reactSpringTypes.mod.InterpolatorArgs
import typings.reactSpringTypes.mod.InterpolatorFn
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `Interpolation` is a memoized value that's computed whenever one of its
  * `FluidValue` dependencies has its value changed.
  *
  * Other `FrameValue` objects can depend on this. For example, passing an
  * `Interpolation` as the `to` prop of a `useSpring` call will trigger an
  * animation toward the memoized value.
  */
@JSImport("@react-spring/core", "Interpolation")
@js.native
open class Interpolation[Input, Output] protected () extends FrameValue[Output] {
  def this(/** The source of input values */
  source: scala.Any, args: InterpolatorArgs[Input, Output]) = this()
  
  /** The inputs which are currently animating */
  /* protected */ var _active: Set[FluidValue[scala.Any, scala.Any]] = js.native
  
  /* protected */ def _get(): Output = js.native
  
  /* protected */ def _start(): Unit = js.native
  
  def advance(): Unit = js.native
  
  /** The function that maps inputs values to output */
  val calc: InterpolatorFn[Input, Output] = js.native
  
  /** Equals false when in the frameloop */
  @JSName("idle")
  var idle_FInterpolation: Boolean = js.native
  
  /** The source of input values */
  val source: scala.Any = js.native
}
