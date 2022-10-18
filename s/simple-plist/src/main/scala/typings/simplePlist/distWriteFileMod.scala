package typings.simplePlist

import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.WriteFileOptions
import typings.simplePlist.distTypesMod.PlistJsObj
import typings.simplePlist.distTypesMod.callbackFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWriteFileMod {
  
  @JSImport("simple-plist/dist/writeFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeFile(
    aFile: PathOrFileDescriptor,
    anObject: PlistJsObj,
    options: WriteFileOptions,
    callback: callbackFn[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(aFile: PathOrFileDescriptor, anObject: PlistJsObj, options: callbackFn[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
