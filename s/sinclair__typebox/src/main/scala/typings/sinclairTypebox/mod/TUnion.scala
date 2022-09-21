package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TUnion[T /* <: js.Array[TSchema] */]
  extends StObject
     with TSchema {
  
  var anyOf: T = js.native
  
  @JSName("static")
  var static_TUnion: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TSchema? @sinclair/typebox.@sinclair/typebox.Static<T[K], this['params']> : never}[number] */ js.Any = js.native
}
