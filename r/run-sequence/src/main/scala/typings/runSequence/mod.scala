package typings.runSequence

import org.scalablytyped.runtime.Shortcut
import typings.gulp.mod.Gulp
import typings.gulp.mod.TaskCallback
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("run-sequence", JSImport.Namespace)
  @js.native
  val ^ : IRunSequence = js.native
  
  @js.native
  trait IRunSequence extends StObject {
    
    def apply(streams: (String | js.Array[String] | TaskCallback)*): ReadWriteStream = js.native
    
    def use(gulp: Gulp): IRunSequence = js.native
  }
  
  type _To = IRunSequence
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IRunSequence = ^
}
