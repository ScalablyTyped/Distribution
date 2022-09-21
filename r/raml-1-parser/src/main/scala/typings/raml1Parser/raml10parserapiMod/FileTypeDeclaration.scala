package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * A list of valid content-type strings for the file. The file type * / * should be a valid value.
    **/
  def fileTypes(): js.Array[ContentType] = js.native
  
  /**
    * The maxLength attribute specifies the parameter value's maximum number of bytes.
    **/
  def maxLength(): Double = js.native
  
  /**
    * The minLength attribute specifies the parameter value's minimum number of bytes.
    **/
  def minLength(): Double = js.native
}
