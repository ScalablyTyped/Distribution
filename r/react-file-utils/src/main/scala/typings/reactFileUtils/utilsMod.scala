package typings.reactFileUtils

import typings.react.mod.ChangeEvent
import typings.reactFileUtils.typesMod.FileLike
import typings.std.DataTransferItem
import typings.std.File
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-file-utils/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dataTransferItemsHaveFiles(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")().asInstanceOf[Boolean]
  inline def dataTransferItemsHaveFiles(items: js.Array[DataTransferItem]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")(items.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def dataTransferItemsToFiles(): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")().asInstanceOf[js.Promise[js.Array[FileLike]]]
  inline def dataTransferItemsToFiles(items: js.Array[DataTransferItem]): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")(items.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileLike]]]
  
  inline def generateRandomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomId")().asInstanceOf[String]
  
  inline def useHandleFileChangeWrapper(): js.Function1[/* hasCurrentTarget */ ChangeEvent[HTMLInputElement], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHandleFileChangeWrapper")().asInstanceOf[js.Function1[/* hasCurrentTarget */ ChangeEvent[HTMLInputElement], Unit]]
  inline def useHandleFileChangeWrapper(resetOnChange: Boolean): js.Function1[/* hasCurrentTarget */ ChangeEvent[HTMLInputElement], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHandleFileChangeWrapper")(resetOnChange.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasCurrentTarget */ ChangeEvent[HTMLInputElement], Unit]]
  inline def useHandleFileChangeWrapper(resetOnChange: Boolean, handler: js.Function1[/* files */ js.Array[File], Unit]): js.Function1[/* hasCurrentTarget */ ChangeEvent[HTMLInputElement], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandleFileChangeWrapper")(resetOnChange.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* hasCurrentTarget */ ChangeEvent[HTMLInputElement], Unit]]
  inline def useHandleFileChangeWrapper(resetOnChange: Unit, handler: js.Function1[/* files */ js.Array[File], Unit]): js.Function1[/* hasCurrentTarget */ ChangeEvent[HTMLInputElement], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandleFileChangeWrapper")(resetOnChange.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* hasCurrentTarget */ ChangeEvent[HTMLInputElement], Unit]]
}
