package typings.protocolBuffersSchema

import typings.protocolBuffersSchema.typesMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  inline def apply(schema: Schema): String = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("protocol-buffers-schema/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
