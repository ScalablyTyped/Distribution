package typings.simplePlist

import typings.bplistCreator.mod.BPlistCreator
import typings.bplistCreator.mod.PlistJsObj
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.WriteFileOptions
import typings.simplePlist.anon.FnCall
import typings.simplePlist.anon.FnCallAFile
import typings.simplePlist.anon.FnCallAFileAnObjectOptionsCallback
import typings.simplePlist.anon.FnCallAFileCallback
import typings.simplePlist.typesMod.StringOrBuffer
import typings.simplePlist.typesMod.callbackFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("simple-plist", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("simple-plist", "default.bplistCreator")
    @js.native
    def bplistCreator: BPlistCreator = js.native
    inline def bplistCreator(`object`: PlistJsObj): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bplistCreator")(`object`.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def bplistCreator_=(x: BPlistCreator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bplistCreator")(x.asInstanceOf[js.Any])
    
    @JSImport("simple-plist", "default.bplistParser")
    @js.native
    def bplistParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify bplistParser */ Any = js.native
    inline def bplistParser_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify bplistParser */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bplistParser")(x.asInstanceOf[js.Any])
    
    @JSImport("simple-plist", "default.parse")
    @js.native
    def parse: FnCall = js.native
    inline def parse[T](aStringOrBuffer: StringOrBuffer): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(aStringOrBuffer.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def parse[T](aStringOrBuffer: StringOrBuffer, aFile: PathOrFileDescriptor): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(aStringOrBuffer.asInstanceOf[js.Any], aFile.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def parse_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("simple-plist", "default.readFile")
    @js.native
    def readFile: FnCallAFileCallback = js.native
    inline def readFile[T](aFile: PathOrFileDescriptor, callback: callbackFn[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(aFile.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("simple-plist", "default.readFileSync")
    @js.native
    def readFileSync: FnCallAFile = js.native
    inline def readFileSync[T](aFile: PathOrFileDescriptor): T = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(aFile.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def readFileSync_=(x: FnCallAFile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFileSync")(x.asInstanceOf[js.Any])
    
    inline def readFile_=(x: FnCallAFileCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFile")(x.asInstanceOf[js.Any])
    
    @JSImport("simple-plist", "default.stringify")
    @js.native
    def stringify: js.Function1[/* anObject */ typings.simplePlist.typesMod.PlistJsObj, String] = js.native
    inline def stringify(anObject: typings.simplePlist.typesMod.PlistJsObj): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(anObject.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify_=(x: js.Function1[/* anObject */ typings.simplePlist.typesMod.PlistJsObj, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
    
    @JSImport("simple-plist", "default.writeBinaryFile")
    @js.native
    def writeBinaryFile: FnCallAFileAnObjectOptionsCallback = js.native
    inline def writeBinaryFile(
      aFile: PathOrFileDescriptor,
      anObject: typings.simplePlist.typesMod.PlistJsObj,
      options: WriteFileOptions,
      callback: callbackFn[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryFile")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeBinaryFile(
      aFile: PathOrFileDescriptor,
      anObject: typings.simplePlist.typesMod.PlistJsObj,
      options: callbackFn[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryFile")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("simple-plist", "default.writeBinaryFileSync")
    @js.native
    def writeBinaryFileSync: js.Function3[
        /* aFile */ PathOrFileDescriptor, 
        /* anObject */ typings.simplePlist.typesMod.PlistJsObj, 
        /* options */ js.UndefOr[WriteFileOptions], 
        Unit
      ] = js.native
    inline def writeBinaryFileSync(aFile: PathOrFileDescriptor, anObject: typings.simplePlist.typesMod.PlistJsObj): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryFileSync")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeBinaryFileSync(
      aFile: PathOrFileDescriptor,
      anObject: typings.simplePlist.typesMod.PlistJsObj,
      options: WriteFileOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryFileSync")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeBinaryFileSync_=(
      x: js.Function3[
          /* aFile */ PathOrFileDescriptor, 
          /* anObject */ typings.simplePlist.typesMod.PlistJsObj, 
          /* options */ js.UndefOr[WriteFileOptions], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeBinaryFileSync")(x.asInstanceOf[js.Any])
    
    inline def writeBinaryFile_=(x: FnCallAFileAnObjectOptionsCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeBinaryFile")(x.asInstanceOf[js.Any])
    
    @JSImport("simple-plist", "default.writeFile")
    @js.native
    def writeFile: FnCallAFileAnObjectOptionsCallback = js.native
    inline def writeFile(
      aFile: PathOrFileDescriptor,
      anObject: typings.simplePlist.typesMod.PlistJsObj,
      options: WriteFileOptions,
      callback: callbackFn[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFile(
      aFile: PathOrFileDescriptor,
      anObject: typings.simplePlist.typesMod.PlistJsObj,
      options: callbackFn[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("simple-plist", "default.writeFileSync")
    @js.native
    def writeFileSync: js.Function3[
        /* aFile */ PathOrFileDescriptor, 
        /* anObject */ typings.simplePlist.typesMod.PlistJsObj, 
        /* options */ js.UndefOr[WriteFileOptions], 
        Unit
      ] = js.native
    inline def writeFileSync(aFile: PathOrFileDescriptor, anObject: typings.simplePlist.typesMod.PlistJsObj): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync(
      aFile: PathOrFileDescriptor,
      anObject: typings.simplePlist.typesMod.PlistJsObj,
      options: WriteFileOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(aFile.asInstanceOf[js.Any], anObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync_=(
      x: js.Function3[
          /* aFile */ PathOrFileDescriptor, 
          /* anObject */ typings.simplePlist.typesMod.PlistJsObj, 
          /* options */ js.UndefOr[WriteFileOptions], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeFileSync")(x.asInstanceOf[js.Any])
    
    inline def writeFile_=(x: FnCallAFileAnObjectOptionsCallback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(x.asInstanceOf[js.Any])
  }
}
