package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import typings.puppeteerCore.jshandleMod.ElementHandle
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileChooserMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FileChooser", "FileChooser")
  @js.native
  class FileChooser protected () extends StObject {
    /**
      * @internal
      */
    def this(element: ElementHandle[Element], event: FileChooserOpenedEvent) = this()
    
    /* private */ var _element: js.Any = js.native
    
    /* private */ var _handled: js.Any = js.native
    
    /* private */ var _multiple: js.Any = js.native
    
    /**
      * Accept the file chooser request with given paths.
      * @param filePaths - If some of the  `filePaths` are relative paths,
      * then they are resolved relative to the {@link https://nodejs.org/api/process.html#process_process_cwd | current working directory}.
      */
    def accept(filePaths: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Closes the file chooser without selecting any files.
      */
    def cancel(): js.Promise[Unit] = js.native
    
    /**
      * Whether file chooser allow for {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file#attr-multiple | multiple} file selection.
      */
    def isMultiple(): Boolean = js.native
  }
}
