package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.`7bit`
import typings.sinclairTypebox.sinclairTypeboxStrings.`8bit`
import typings.sinclairTypebox.sinclairTypeboxStrings.`quoted-printable`
import typings.sinclairTypebox.sinclairTypeboxStrings.base64
import typings.sinclairTypebox.sinclairTypeboxStrings.binary
import typings.sinclairTypebox.sinclairTypeboxStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typings.sinclairTypebox.mod.SchemaOptions because Already inherited
- typings.sinclairTypebox.mod.StringOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined minLength, maxLength, pattern, format, contentEncoding, contentMediaType */ @js.native
trait TString[Format /* <: String */]
  extends StObject
     with TSchema {
  
  var contentEncoding: js.UndefOr[`7bit` | `8bit` | binary | `quoted-printable` | base64] = js.native
  
  var contentMediaType: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[Format] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  @JSName("static")
  var static_TString: String = js.native
  
  var `type`: string = js.native
}
