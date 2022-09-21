package typings.sinclairTypebox.errorsErrorsMod

import typings.sinclairTypebox.mod.TSchema
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValueErrors {
  
  @JSImport("@sinclair/typebox/errors/errors", "ValueErrors")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Errors[T /* <: TSchema */](schema: T, references: js.Array[TSchema], value: Any): IterableIterator[ValueError] = (^.asInstanceOf[js.Dynamic].applyDynamic("Errors")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[ValueError]]
}
