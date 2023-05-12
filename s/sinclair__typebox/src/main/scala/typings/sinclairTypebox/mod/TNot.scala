package typings.sinclairTypebox.mod

import typings.sinclairTypebox.anon.NotNot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TNot[Not /* <: TSchema */, T /* <: TSchema */]
  extends StObject
     with TSchema {
  
  var allOf: js.Tuple2[NotNot[Not], T] = js.native
  
  @JSName("static")
  var static_TNot: Static[T, js.Array[Any]] = js.native
}
