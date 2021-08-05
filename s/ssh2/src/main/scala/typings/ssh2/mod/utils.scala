package typings.ssh2.mod

import typings.node.Buffer
import typings.ssh2Streams.mod.ParsedKey
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("ssh2", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseKey(keyData: String): ParsedKey | js.Array[ParsedKey] | Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(keyData.asInstanceOf[js.Any]).asInstanceOf[ParsedKey | js.Array[ParsedKey] | Error | Null]
  inline def parseKey(keyData: String, passphrase: String): ParsedKey | js.Array[ParsedKey] | Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(keyData.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[ParsedKey | js.Array[ParsedKey] | Error | Null]
  inline def parseKey(keyData: Buffer): ParsedKey | js.Array[ParsedKey] | Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(keyData.asInstanceOf[js.Any]).asInstanceOf[ParsedKey | js.Array[ParsedKey] | Error | Null]
  inline def parseKey(keyData: Buffer, passphrase: String): ParsedKey | js.Array[ParsedKey] | Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(keyData.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[ParsedKey | js.Array[ParsedKey] | Error | Null]
}
