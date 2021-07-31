package typings.prettyFormat

import org.scalablytyped.runtime.Shortcut
import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.NewPlugin
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.prettyFormat.typesMod.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immutableMod extends Shortcut {
  
  @JSImport("pretty-format/build/plugins/Immutable", JSImport.Default)
  @js.native
  val default: NewPlugin = js.native
  
  @JSImport("pretty-format/build/plugins/Immutable", "serialize")
  @js.native
  val serialize: js.Function6[
    /* val */ js.Any, 
    /* config */ Config, 
    /* indentation */ String, 
    /* depth */ Double, 
    /* refs */ Refs, 
    /* printer */ Printer, 
    String
  ] = js.native
  
  @JSImport("pretty-format/build/plugins/Immutable", "test")
  @js.native
  val test: Test = js.native
  
  type _To = NewPlugin
  
  /* This means you don't have to write `default`, but can instead just say `immutableMod.foo` */
  override def _to: NewPlugin = default
}
