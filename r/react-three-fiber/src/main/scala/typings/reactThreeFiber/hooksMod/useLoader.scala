package typings.reactThreeFiber.hooksMod

import org.scalablytyped.runtime.Instantiable0
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-three-fiber/hooks", "useLoader")
@js.native
object useLoader extends js.Object {
  
  def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String]): T = js.native
  def apply[T](
    Proto: Instantiable0[LoaderResult[T]],
    input: String | js.Array[String],
    extensions: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): T = js.native
  def apply[T](Proto: Instantiable0[LoaderResult[T]], input: String | js.Array[String], extensions: Extensions): T = js.native
  def apply[T](
    Proto: Instantiable0[LoaderResult[T]],
    input: String | js.Array[String],
    extensions: Extensions,
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): T = js.native
  
  var preload: js.Function3[
    /* Proto */ Instantiable0[LoaderResult[js.Any]], 
    /* url */ String | js.Array[String], 
    /* extensions */ js.UndefOr[Extensions], 
    js.UndefOr[scala.Nothing]
  ] = js.native
}
