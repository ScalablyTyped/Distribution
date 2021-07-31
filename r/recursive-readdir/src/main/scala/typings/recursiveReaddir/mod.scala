package typings.recursiveReaddir

import org.scalablytyped.runtime.Shortcut
import typings.node.fsMod.Stats
import typings.recursiveReaddir.mod.RecursiveReaddir.readDir
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("recursive-readdir", JSImport.Namespace)
  @js.native
  val ^ : readDir = js.native
  
  object RecursiveReaddir {
    
    type Callback = js.Function2[/* error */ Error, /* files */ js.Array[String], Unit]
    
    type IgnoreFunction = js.Function2[/* file */ String, /* stats */ Stats, Boolean]
    
    type Ignores = js.Array[String | IgnoreFunction]
    
    @js.native
    trait readDir extends StObject {
      
      def apply(path: String): js.Promise[js.Array[String]] = js.native
      def apply(path: String, callback: Callback): Unit = js.native
      def apply(path: String, ignores: Ignores): js.Promise[js.Array[String]] = js.native
      def apply(path: String, ignores: Ignores, callback: Callback): Unit = js.native
    }
  }
  
  type _To = readDir
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: readDir = ^
}
