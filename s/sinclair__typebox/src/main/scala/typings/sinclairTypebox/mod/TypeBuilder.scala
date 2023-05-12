package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.params
import typings.sinclairTypebox.sinclairTypeboxStrings.static
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sinclair/typebox", "TypeBuilder")
@js.native
open class TypeBuilder () extends StObject {
  
  /** `[Utility]` Creates a schema without `static` and `params` types */
  /* protected */ def Create[T](schema: Omit[T, static | params]): T = js.native
  
  /** `[Standard]` Omits compositing symbols from this schema */
  def Strict[T /* <: TSchema */](schema: T): T = js.native
}
