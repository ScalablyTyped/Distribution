package typings.puppeteerCore

import typings.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonFrameTreeMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FrameTree", "FrameTree")
  @js.native
  open class FrameTree () extends StObject {
    
    def addFrame(frame: Frame): Unit = js.native
    
    def childFrames(frameId: String): js.Array[Frame] = js.native
    
    def frames(): js.Array[Frame] = js.native
    
    def getById(frameId: String): js.UndefOr[Frame] = js.native
    
    def getMainFrame(): js.UndefOr[Frame] = js.native
    
    def parentFrame(frameId: String): js.UndefOr[Frame] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeFrame(frame: Frame): Unit = js.native
    
    /**
      * Returns a promise that is resolved once the frame with
      * the given ID is added to the tree.
      */
    def waitForFrame(frameId: String): js.Promise[Frame] = js.native
  }
}
