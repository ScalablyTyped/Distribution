package typings.qrcode

import org.scalablytyped.runtime.Shortcut
import typings.qrcode.mod.QRCodeToSJISFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toSjisMod extends Shortcut {
  
  @JSImport("qrcode/helper/to-sjis", JSImport.Namespace)
  @js.native
  val ^ : QRCodeToSJISFunc = js.native
  
  type _To = QRCodeToSJISFunc
  
  /* This means you don't have to write `^`, but can instead just say `toSjisMod.foo` */
  override def _to: QRCodeToSJISFunc = ^
}
