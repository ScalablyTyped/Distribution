package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.Uint8Array
import typings.sinclairTypebox.sinclairTypeboxStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typings.sinclairTypebox.mod.SchemaOptions because Already inherited
- typings.sinclairTypebox.mod._TAnySchema because Already inherited
- typings.sinclairTypebox.mod.Uint8ArrayOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined maxByteLength, minByteLength */ @js.native
trait TUint8Array
  extends StObject
     with TSchema {
  
  var instanceOf: Uint8Array = js.native
  
  var maxByteLength: js.UndefOr[Double] = js.native
  
  var minByteLength: js.UndefOr[Double] = js.native
  
  @JSName("static")
  var static_TUint8Array: js.typedarray.Uint8Array = js.native
  
  var `type`: `object` = js.native
}
