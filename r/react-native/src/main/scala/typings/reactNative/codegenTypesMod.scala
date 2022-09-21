package typings.reactNative

import typings.reactNative.mod.NativeSyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codegenTypesMod {
  
  type BubblingEventHandler[T, PaperName /* <: String | scala.Nothing */] = js.Function1[/* event */ NativeSyntheticEvent[T], Unit | js.Promise[Unit]]
  
  type DefaultTypes = scala.Double | Boolean | String | js.Array[String]
  
  type DirectEventHandler[T, PaperName /* <: String | scala.Nothing */] = js.Function1[/* event */ NativeSyntheticEvent[T], Unit | js.Promise[Unit]]
  
  type Double = scala.Double
  
  type Float = scala.Double
  
  type Int32 = scala.Double
  
  type UnsafeObject = js.Object
  
  type WithDefault[Type /* <: DefaultTypes */, Value /* <: js.UndefOr[Type | String | Null] */] = js.UndefOr[Type | Null]
}
