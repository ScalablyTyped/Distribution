package typings.scrivito.mod

import typings.scrivito.anon.ContentType
import typings.scrivito.anon.Filename
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrivito", "Binary")
@js.native
/* private */ class Binary () extends StObject {
  
  def contentLength(): Double = js.native
  
  def contentType(): String = js.native
  
  def copy(): FutureBinary = js.native
  def copy(options: Filename): FutureBinary = js.native
  
  def filename(): String = js.native
  
  def isPrivate(): Boolean = js.native
  
  def metadata(): MetadataCollection = js.native
  
  def optimizeFor(definition: OptimizeDefinition): Binary = js.native
  
  def original(): Binary = js.native
  
  def raw(): Binary = js.native
  
  def url(): String = js.native
}
/* static members */
object Binary {
  
  @JSImport("scrivito", "Binary")
  @js.native
  val ^ : js.Any = js.native
  
  inline def uplload(source: File): FutureBinary = ^.asInstanceOf[js.Dynamic].applyDynamic("uplload")(source.asInstanceOf[js.Any]).asInstanceOf[FutureBinary]
  inline def uplload(source: File, options: Filename): FutureBinary = (^.asInstanceOf[js.Dynamic].applyDynamic("uplload")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FutureBinary]
  
  inline def upload(source: Blob, options: ContentType): FutureBinary = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FutureBinary]
  inline def upload(source: File, options: ContentType): FutureBinary = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FutureBinary]
}
