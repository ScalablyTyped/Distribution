package typings.sinclairTypebox.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TEnum[T /* <: Record[String, String | Double] */]
  extends StObject
     with TSchema {
  
  var anyOf: js.Array[TLiteral[String | Double]] = js.native
  
  @JSName("static")
  var static_TEnum: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
}
