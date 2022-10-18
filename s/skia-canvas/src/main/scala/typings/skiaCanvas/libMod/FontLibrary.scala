package typings.skiaCanvas.libMod

import typings.skiaCanvas.libMod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontLibrary extends StObject {
  
  var families: js.Array[String] = js.native
  
  def family(name: String): js.UndefOr[FontFamily] = js.native
  
  def has(familyName: String): Boolean = js.native
  
  def reset(): Unit = js.native
  
  def use(families: Record[String, js.Array[String] | String]): Record[String, js.Array[Font] | Font] = js.native
  def use(familyName: String): js.Array[Font] = js.native
  def use(familyName: String, fontPaths: String): js.Array[Font] = js.native
  def use(familyName: String, fontPaths: js.Array[String]): js.Array[Font] = js.native
  def use(fontPaths: js.Array[String]): js.Array[Font] = js.native
}
object FontLibrary {
  
  inline def apply: FontLibrary = ^.asInstanceOf[js.Dynamic].selectDynamic("FontLibrary").asInstanceOf[FontLibrary]
}
