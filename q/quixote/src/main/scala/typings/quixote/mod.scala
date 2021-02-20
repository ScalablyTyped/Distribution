package typings.quixote

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quixote", JSImport.Namespace)
  @js.native
  class ^ ()
    extends typings.quixote.mod.Quixote
  
  @js.native
  trait Quixote extends StObject {
    
    def createFrame(
      options: QuixoteFrameOptions,
      callback: js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]
    ): QFrame = js.native
  }
  object Quixote {
    
    @scala.inline
    def apply(
      createFrame: (QuixoteFrameOptions, js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]) => QFrame
    ): typings.quixote.mod.Quixote = {
      val __obj = js.Dynamic.literal(createFrame = js.Any.fromFunction2(createFrame))
      __obj.asInstanceOf[typings.quixote.mod.Quixote]
    }
    
    @scala.inline
    implicit class QuixoteMutableBuilder[Self <: typings.quixote.mod.Quixote] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateFrame(
        value: (QuixoteFrameOptions, js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]) => QFrame
      ): Self = StObject.set(x, "createFrame", js.Any.fromFunction2(value))
    }
  }
}
