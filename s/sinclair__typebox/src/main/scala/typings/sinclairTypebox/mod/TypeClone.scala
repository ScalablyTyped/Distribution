package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeClone {
  
  @JSImport("@sinclair/typebox", "TypeClone")
  @js.native
  val ^ : js.Any = js.native
  
  /** Clones a type. */
  inline def Clone[T /* <: TSchema */](schema: T, options: SchemaOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
