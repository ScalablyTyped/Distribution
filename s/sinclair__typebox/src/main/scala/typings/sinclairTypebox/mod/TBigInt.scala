package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.BigInt
import typings.sinclairTypebox.sinclairTypeboxStrings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typings.sinclairTypebox.mod.SchemaOptions because Already inherited
- typings.sinclairTypebox.mod._TAnySchema because Already inherited
- typings.sinclairTypebox.mod.NumericOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined exclusiveMaximum, exclusiveMinimum, maximum, minimum, multipleOf */ @js.native
trait TBigInt
  extends StObject
     with TSchema
     with _TTemplateLiteralKind {
  
  var exclusiveMaximum: js.UndefOr[js.BigInt] = js.native
  
  var exclusiveMinimum: js.UndefOr[js.BigInt] = js.native
  
  var maximum: js.UndefOr[js.BigInt] = js.native
  
  var minimum: js.UndefOr[js.BigInt] = js.native
  
  var multipleOf: js.UndefOr[js.BigInt] = js.native
  
  @JSName("static")
  var static_TBigInt: js.BigInt = js.native
  
  var `type`: `null` = js.native
  
  var typeOf: BigInt = js.native
}
