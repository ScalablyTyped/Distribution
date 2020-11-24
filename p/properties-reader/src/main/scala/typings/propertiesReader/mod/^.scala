package typings.propertiesReader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("properties-reader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(path: String): Reader = js.native
  def apply(path: String, encoding: js.UndefOr[scala.Nothing], options: AppenderOptions): Reader = js.native
  def apply(path: String, encoding: js.UndefOr[scala.Nothing], options: FullOptions): Reader = js.native
  def apply(path: String, encoding: js.UndefOr[scala.Nothing], options: WriterOptions): Reader = js.native
  def apply(path: String, encoding: String): Reader = js.native
  def apply(path: String, encoding: String, options: AppenderOptions): Reader = js.native
  def apply(path: String, encoding: String, options: FullOptions): Reader = js.native
  def apply(path: String, encoding: String, options: WriterOptions): Reader = js.native
}
