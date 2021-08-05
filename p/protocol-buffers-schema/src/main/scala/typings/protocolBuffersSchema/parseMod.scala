package typings.protocolBuffersSchema

import typings.node.Buffer
import typings.protocolBuffersSchema.typesMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  inline def apply(buffer: String): Schema = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Schema]
  inline def apply(buffer: Buffer): Schema = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Schema]
  
  @JSImport("protocol-buffers-schema/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(buffer: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[Schema]
  inline def parse(buffer: Buffer): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buffer.asInstanceOf[js.Any]).asInstanceOf[Schema]
  
  inline def stringify(schema: Schema): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(schema.asInstanceOf[js.Any]).asInstanceOf[String]
}
