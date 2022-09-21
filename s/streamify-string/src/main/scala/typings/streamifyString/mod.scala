package typings.streamifyString

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("streamify-string", JSImport.Namespace)
  @js.native
  val ^ : js.Object & StreamifyConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("streamify-string", JSImport.Namespace)
  @js.native
  open class Class protected () extends Readable {
    def this(str: String) = this()
    def this(str: String, options: Any) = this()
  }
  
  // tslint:disable-next-line:no-empty-interface
  type Streamify = Readable
  
  @js.native
  trait StreamifyConstructor
    extends StObject
       with Instantiable1[/* str */ String, Streamify]
       with Instantiable2[/* str */ String, /* options */ Any, Streamify] {
    
    def apply(str: String): Streamify = js.native
    def apply(str: String, options: Any): Streamify = js.native
  }
  
  type _To = js.Object & StreamifyConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & StreamifyConstructor = ^
}
