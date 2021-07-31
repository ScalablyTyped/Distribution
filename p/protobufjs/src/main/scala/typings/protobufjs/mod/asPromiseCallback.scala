package typings.protobufjs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback as used by {@link util.asPromise}.
  * @param error Error, if any
  * @param params Additional arguments
  */
@js.native
trait asPromiseCallback extends StObject {
  
  def apply(error: Null, params: js.Any*): Unit = js.native
  def apply(error: Error, params: js.Any*): Unit = js.native
}
