package typings.reactSpringCore.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This error is thrown to signal an interrupted async animation. */
@JSImport("@react-spring/core", "BailSignal")
@js.native
open class BailSignal ()
  extends StObject
     with Error {
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var result: AnimationResult[scala.Any] = js.native
}
