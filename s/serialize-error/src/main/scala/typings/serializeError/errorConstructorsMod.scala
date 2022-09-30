package typings.serializeError

import org.scalablytyped.runtime.Shortcut
import typings.std.ErrorConstructor
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorConstructorsMod extends Shortcut {
  
  @JSImport("serialize-error/error-constructors", JSImport.Default)
  @js.native
  val default: Map[String, ErrorConstructor] = js.native
  
  type _To = Map[String, ErrorConstructor]
  
  /* This means you don't have to write `default`, but can instead just say `errorConstructorsMod.foo` */
  override def _to: Map[String, ErrorConstructor] = default
}
