package typings.quixote

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quixote extends StObject {
  
  // Create a test iframe. This is a slow operation, so once you have a frame, it's best to use QFrame.reset() on it rather than creating a new frame for each test
  def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame
}
object Quixote {
  
  @scala.inline
  def apply(
    createFrame: (QuixoteFrameOptions, js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]) => QFrame
  ): Quixote = {
    val __obj = js.Dynamic.literal(createFrame = js.Any.fromFunction2(createFrame))
    __obj.asInstanceOf[Quixote]
  }
  
  @scala.inline
  implicit class QuixoteMutableBuilder[Self <: Quixote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateFrame(
      value: (QuixoteFrameOptions, js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]) => QFrame
    ): Self = StObject.set(x, "createFrame", js.Any.fromFunction2(value))
  }
}
