package typings.qrcodeTerminal

import typings.qrcodeTerminal.anon.Small
import typings.qrcodeTerminal.qrcodeTerminalNumbers.`0`
import typings.qrcodeTerminal.qrcodeTerminalNumbers.`1`
import typings.qrcodeTerminal.qrcodeTerminalNumbers.`2`
import typings.qrcodeTerminal.qrcodeTerminalNumbers.`3`
import typings.qrcodeTerminal.qrcodeTerminalStrings.H
import typings.qrcodeTerminal.qrcodeTerminalStrings.L
import typings.qrcodeTerminal.qrcodeTerminalStrings.M
import typings.qrcodeTerminal.qrcodeTerminalStrings.Q
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qrcode-terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("qrcode-terminal", "error")
  @js.native
  val error: `0` | `1` | `2` | `3` = js.native
  
  inline def generate(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generate(input: String, opts: Unit, callback: js.Function1[/* qrcode */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generate(input: String, opts: Small): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generate(input: String, opts: Small, callback: js.Function1[/* qrcode */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setErrorLevel(error: L | M | Q | H): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setErrorLevel")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
