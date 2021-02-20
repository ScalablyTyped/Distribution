package typings.rcUpload

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Abort extends StObject {
    
    def abort(): Unit = js.native
  }
  object Abort {
    
    @scala.inline
    def apply(abort: () => Unit): Abort = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
      __obj.asInstanceOf[Abort]
    }
    
    @scala.inline
    implicit class AbortMutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined rc-upload.rc-upload/es/interface.RcFile & {  webkitRelativePath :string | undefined} */
  @js.native
  trait RcFilewebkitRelativePaths extends StObject {
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    val lastModified: Double = js.native
    
    val name: String = js.native
    
    val size: Double = js.native
    
    def slice(): Blob = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double, contentType: String): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, contentType: String): Blob = js.native
    
    def stream(): ReadableStream[_] = js.native
    
    def text(): js.Promise[String] = js.native
    
    val `type`: String = js.native
    
    var uid: String = js.native
    
    var webkitRelativePath: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Uid extends StObject {
    
    var uid: String = js.native
  }
  object Uid {
    
    @scala.inline
    def apply(uid: String): Uid = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uid]
    }
    
    @scala.inline
    implicit class UidMutableBuilder[Self <: Uid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
