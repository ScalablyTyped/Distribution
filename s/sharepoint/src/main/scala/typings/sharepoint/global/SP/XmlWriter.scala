package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.StringBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a writer that provides a set of methods to append text in XML format. Use the static SP.XmlWriter.create(sb) Method to create an SP.XmlWriter object with the Sys.StringBuilder object you pass in. */
@JSGlobal("SP.XmlWriter")
@js.native
class XmlWriter ()
  extends typings.sharepoint.SP.XmlWriter
object XmlWriter {
  
  /** Creates a new instance of the XmlWriter class with the specified string builder. */
  /* static member */
  @JSGlobal("SP.XmlWriter.create")
  @js.native
  def create(sb: StringBuilder): typings.sharepoint.SP.XmlWriter = js.native
}
