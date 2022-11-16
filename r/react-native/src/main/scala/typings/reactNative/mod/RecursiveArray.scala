package typings.reactNative.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type RecursiveArray = std.Array<T | std.ReadonlyArray<T> | react-native.react-native.RecursiveArray<T>>
}}}
to avoid circular code involving: 
- react-native.react-native.RecursiveArray
*/
@js.native
trait RecursiveArray[T]
  extends StObject
     with Array[T | js.Array[T] | RecursiveArray[T]]
