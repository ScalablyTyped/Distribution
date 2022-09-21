package typings.reactFileUtils

import typings.react.mod.global.JSX.Element
import typings.reactFileUtils.fileIconFileIconMod.FileIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileIconMod {
  
  @JSImport("react-file-utils/dist/components/FileIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FileIcon(props: FileIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
