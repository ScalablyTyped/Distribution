package typings.scrivito.mod

import typings.scrivito.anon.ContentType
import typings.scrivito.anon.Filename
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrivito", "Binary")
@js.native
class Binary protected () extends StObject {
  
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
  
  @JSImport("scrivito", "Binary.uplload")
  @js.native
  def uplload(source: File): FutureBinary = js.native
  @JSImport("scrivito", "Binary.uplload")
  @js.native
  def uplload(source: File, options: Filename): FutureBinary = js.native
  
  @JSImport("scrivito", "Binary.upload")
  @js.native
  def upload(source: Blob, options: ContentType): FutureBinary = js.native
  @JSImport("scrivito", "Binary.upload")
  @js.native
  def upload(source: File, options: ContentType): FutureBinary = js.native
}
