package typings.simplePlist

import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.WriteFileOptions
import typings.simplePlist.distTypesMod.PlistJsObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWriteBinaryFileSyncMod {
  
  @JSImport("simple-plist/dist/writeBinaryFileSync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeBinaryFileSync(aFile: PathOrFileDescriptor, anObject: PlistJsObj): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryFileSync")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeBinaryFileSync(aFile: PathOrFileDescriptor, anObject: PlistJsObj, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryFileSync")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
