package typings.std

import typings.std.stdBooleans.`false`
import typings.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.std.ReadableStreamReadValueResult[T]
  - typings.std.ReadableStreamReadDoneResult[T]
*/
trait ReadableStreamReadResult[T] extends StObject
object ReadableStreamReadResult {
  
  @scala.inline
  def ReadableStreamReadDoneResult[T](done: `true`): typings.std.ReadableStreamReadDoneResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.std.ReadableStreamReadDoneResult[T]]
  }
  
  @scala.inline
  def ReadableStreamReadValueResult[T](done: `false`, value: T): typings.std.ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.std.ReadableStreamReadValueResult[T]]
  }
}
