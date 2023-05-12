package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typings.sinclairTypebox.mod.SchemaOptions because Already inherited
- typings.sinclairTypebox.mod._TAnySchema because Already inherited
- typings.sinclairTypebox.mod.NumericOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined exclusiveMaximum, exclusiveMinimum, maximum, minimum, multipleOf */ @js.native
trait TInteger
  extends StObject
     with TSchema
     with _RecordKey
     with _TTemplateLiteralKind {
  
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  
  var maximum: js.UndefOr[Double] = js.native
  
  var minimum: js.UndefOr[Double] = js.native
  
  var multipleOf: js.UndefOr[Double] = js.native
  
  @JSName("static")
  var static_TInteger: Double = js.native
  
  var `type`: integer = js.native
}
