package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyResolver {
  
  @JSImport("@sinclair/typebox", "KeyResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /** Resolves an array of keys in this schema */
  inline def ResolveKeys(schema: TSchema, options: KeyResolverOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ResolveKeys")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /** Resolves a regular expression pattern matching all keys in this schema */
  inline def ResolvePattern(schema: TSchema): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ResolvePattern")(schema.asInstanceOf[js.Any]).asInstanceOf[String]
}
