package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typings.sinclairTypebox.mod.SchemaOptions because Already inherited
- typings.sinclairTypebox.mod.IntersectOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined unevaluatedProperties */ @js.native
trait TIntersect[T /* <: js.Array[TSchema] */]
  extends StObject
     with TSchema {
  
  var allOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T] = js.native
  
  @JSName("static")
  var static_TIntersect: TupleToIntersect[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, this['params']>} */ js.Any
  ] = js.native
  
  var `type`: js.UndefOr[`object`] = js.native
  
  var unevaluatedProperties: js.UndefOr[TUnevaluatedProperties] = js.native
}
