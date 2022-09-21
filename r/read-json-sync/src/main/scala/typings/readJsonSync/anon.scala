package typings.readJsonSync

import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.PathOrFileDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathOrFileDescriptor): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: EncodingFlag): String = js.native
    def apply(path: PathOrFileDescriptor, options: Flag): Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: BufferEncoding): String = js.native
  }
}
