package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexedAccessor {
  
  @JSImport("@sinclair/typebox", "IndexedAccessor")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Resolve(schema: TSchema, keys: js.Array[Key]): TSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("Resolve")(schema.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[TSchema]
  inline def Resolve(schema: TSchema, keys: js.Array[Key], options: SchemaOptions): TSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("Resolve")(schema.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TSchema]
}
