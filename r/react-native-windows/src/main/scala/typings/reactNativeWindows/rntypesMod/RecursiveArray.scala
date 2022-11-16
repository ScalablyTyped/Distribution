package typings.reactNativeWindows.rntypesMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type RecursiveArray = std.Array<T | std.ReadonlyArray<T> | react-native-windows.react-native-windows/rntypes.RecursiveArray<T>>
}}}
to avoid circular code involving: 
- react-native-windows.react-native-windows/rntypes.RecursiveArray
*/
@js.native
trait RecursiveArray[T]
  extends StObject
     with Array[T | js.Array[T] | RecursiveArray[T]]
