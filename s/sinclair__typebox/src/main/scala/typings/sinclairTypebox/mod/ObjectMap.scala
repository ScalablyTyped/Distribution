package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObjectMap {
  
  @JSImport("@sinclair/typebox", "ObjectMap")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Map[T](
    schema: TSchema,
    callback: js.Function1[/* object */ TObject[TProperties], TObject[TProperties]],
    options: SchemaOptions
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Map")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
