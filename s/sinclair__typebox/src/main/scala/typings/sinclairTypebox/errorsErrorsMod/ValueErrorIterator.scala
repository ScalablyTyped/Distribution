package typings.sinclairTypebox.errorsErrorsMod

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sinclair/typebox/errors/errors", "ValueErrorIterator")
@js.native
open class ValueErrorIterator protected () extends StObject {
  def this(iterator: IterableIterator[ValueError]) = this()
  
  /** Returns the first value error or undefined if no errors */
  def First(): js.UndefOr[ValueError] = js.native
  
  /* private */ val iterator: Any | js.Function0[IterableIterator[ValueError]] = js.native
}
