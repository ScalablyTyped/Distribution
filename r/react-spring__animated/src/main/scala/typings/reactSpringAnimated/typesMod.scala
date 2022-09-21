package typings.reactSpringAnimated

import typings.reactSpringAnimated.animatedArrayMod.AnimatedArray
import typings.reactSpringAnimated.animatedValueMod.AnimatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait AnimatedType[T]
    extends js.Function {
    
    def create(from: Any): AnimatedValue[T] | AnimatedArray[T] = js.native
    def create(from: Any, goal: Any): AnimatedValue[T] | AnimatedArray[T] = js.native
  }
}
