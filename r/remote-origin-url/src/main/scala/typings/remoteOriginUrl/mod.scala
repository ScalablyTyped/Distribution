package typings.remoteOriginUrl

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remote-origin-url", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("remote-origin-url", JSImport.Namespace)
  @js.native
  def apply(callback: Callback): Unit = js.native
  @JSImport("remote-origin-url", JSImport.Namespace)
  @js.native
  def apply(options: String): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("remote-origin-url", JSImport.Namespace)
  @js.native
  def apply(options: String, callback: Callback): Unit = js.native
  @JSImport("remote-origin-url", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("remote-origin-url", JSImport.Namespace)
  @js.native
  def apply(options: Options, callback: Callback): Unit = js.native
  
  @JSImport("remote-origin-url", "promise")
  @js.native
  def promise(): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("remote-origin-url", "promise")
  @js.native
  def promise(options: String): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("remote-origin-url", "promise")
  @js.native
  def promise(options: Options): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("remote-origin-url", "sync")
  @js.native
  def sync(): js.UndefOr[String] = js.native
  @JSImport("remote-origin-url", "sync")
  @js.native
  def sync(options: String): js.UndefOr[String] = js.native
  @JSImport("remote-origin-url", "sync")
  @js.native
  def sync(options: Options): js.UndefOr[String] = js.native
  
  type Callback = js.Function2[/* error */ Error | Null, /* url */ js.UndefOr[String], Unit]
  
  @js.native
  trait Options extends StObject {
    
    var path: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
