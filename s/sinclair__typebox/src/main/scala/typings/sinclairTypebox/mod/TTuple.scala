package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxBooleans.`false`
import typings.sinclairTypebox.sinclairTypeboxStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TTuple[T /* <: js.Array[TSchema] */]
  extends StObject
     with TSchema {
  
  var additionalItems: js.UndefOr[`false`] = js.native
  
  var items: js.UndefOr[T] = js.native
  
  var maxItems: Double = js.native
  
  var minItems: Double = js.native
  
  @JSName("static")
  var static_TTuple: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TSchema? @sinclair/typebox.@sinclair/typebox.Static<T[K], this['params']> : T[K]} */ js.Any = js.native
  
  var `type`: array = js.native
}
