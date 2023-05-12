package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyArrayResolver {
  
  @JSImport("@sinclair/typebox", "KeyArrayResolver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Resolve(schema: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("Resolve")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  /** Resolves an array of string[] keys from the given schema or array type. */
  inline def Resolve(schema: TSchema): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("Resolve")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
