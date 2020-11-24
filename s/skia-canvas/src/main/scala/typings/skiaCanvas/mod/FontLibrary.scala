package typings.skiaCanvas.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontLibrary extends js.Object {
  
  var families: js.Array[String] = js.native
  
  def family(name: String): js.UndefOr[FontFamily] = js.native
  
  def has(familyName: String): Boolean = js.native
  
  def use(families: Record[String, js.Array[String] | String]): Record[String, js.Array[FontVariant] | FontVariant] = js.native
  def use(familyName: String, fontPaths: js.Array[String]): js.Array[FontVariant] = js.native
  def use(fontPaths: js.Array[String]): js.Array[FontVariant] = js.native
}
@JSImport("skia-canvas", "FontLibrary")
@js.native
object FontLibrary extends TopLevel[FontLibrary]
