package typings.simplePlist

import typings.node.fsMod.PathOrFileDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readFileSyncMod {
  
  @JSImport("simple-plist/dist/readFileSync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFileSync[T](aFile: PathOrFileDescriptor): T = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(aFile.asInstanceOf[js.Any]).asInstanceOf[T]
}
